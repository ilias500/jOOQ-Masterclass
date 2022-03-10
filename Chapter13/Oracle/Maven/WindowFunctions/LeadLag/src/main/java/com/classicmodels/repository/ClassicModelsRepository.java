package com.classicmodels.repository;

import java.math.BigInteger;
import java.time.LocalDateTime;
import static jooq.generated.tables.BankTransaction.BANK_TRANSACTION;
import static jooq.generated.tables.Employee.EMPLOYEE;
import static jooq.generated.tables.EmployeeStatus.EMPLOYEE_STATUS;
import static jooq.generated.tables.Office.OFFICE;
import static jooq.generated.tables.Order.ORDER;
import static jooq.generated.tables.Sale.SALE;
import org.jooq.DSLContext;
import static org.jooq.impl.DSL.count;
import static org.jooq.impl.DSL.field;
import static org.jooq.impl.DSL.lag;
import static org.jooq.impl.DSL.lead;
import static org.jooq.impl.DSL.max;
import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.round;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.sum;
import static org.jooq.impl.DSL.table;
import static org.jooq.impl.DSL.val;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ClassicModelsRepository {

    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    /*  - The LEAD() function allows you to look forward a number of rows and access data 
          of that row from the current row. 
        - The LAG() function allows you to look back a number of rows and access data 
          of that row from the current row.*/
    
    public void leadLagOrder() {

        ctx.select(ORDER.ORDER_ID, ORDER.STATUS, ORDER.ORDER_DATE,
                lead(ORDER.ORDER_DATE, 1).over().orderBy(ORDER.ORDER_DATE).as("next_order"),
                lag(ORDER.ORDER_DATE, 1).over().orderBy(ORDER.ORDER_DATE).as("prev_order"))
                .from(ORDER)
                .fetch();                
        
        // or, we can ommit "1", but I prefer to add it
        ctx.select(ORDER.ORDER_ID, ORDER.STATUS, ORDER.ORDER_DATE,
                lead(ORDER.ORDER_DATE).over().orderBy(ORDER.ORDER_DATE).as("next_order"),
                lag(ORDER.ORDER_DATE).over().orderBy(ORDER.ORDER_DATE).as("prev_order"))
                .from(ORDER)
                .fetch(); 
    }

    public void leadSalaryByOffice() {

        ctx.select(OFFICE.OFFICE_CODE, OFFICE.CITY, OFFICE.COUNTRY,
                EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME, EMPLOYEE.SALARY,
                lead(EMPLOYEE.SALARY, 1, 0).over().partitionBy(OFFICE.OFFICE_CODE)
                        .orderBy(EMPLOYEE.SALARY).as("next_salary"))
                .from(OFFICE)
                .innerJoin(EMPLOYEE)
                .on(OFFICE.OFFICE_CODE.eq(EMPLOYEE.OFFICE_CODE))
                .fetch();
    }

    public void lagYOY() { // YOY: year-over-year

        ctx.select(table(name("t")).asterisk(), round(field(name("t", "sale"), Double.class)
                .minus(field(name("t", "prev_sale"), Double.class)).mul(100d)
                .divide(field(name("t", "prev_sale"), Double.class)), 1)
                .concat("%").as("YOY"))
                .from(
                        select(SALE.SALE_ID, SALE.EMPLOYEE_NUMBER, SALE.FISCAL_YEAR, round(SALE.SALE_, 1),
                                round(lag(SALE.SALE_, 1).over().partitionBy(SALE.EMPLOYEE_NUMBER)
                                        .orderBy(SALE.FISCAL_YEAR, SALE.SALE_), 1))
                                .from(SALE)
                                .asTable("t", "sid", "sen", "fy", "sale", "prev_sale"))
                .fetch();
    }

    // Calculating Month-Over-Month Growth Rate 
    public void monthOverMonthGrowthRateSale() {
        
        ctx.select(SALE.FISCAL_MONTH,
                val(100).mul((SALE.SALE_.minus(lag(SALE.SALE_, 1).over().orderBy(SALE.FISCAL_MONTH)))
                        .divide(lag(SALE.SALE_, 1).over().orderBy(SALE.FISCAL_MONTH))).concat("%").as("MOM"))
                .from(SALE)
                .where(SALE.FISCAL_YEAR.eq(2004)) 
                .orderBy(SALE.FISCAL_MONTH)
                .fetch();
    }
    
    public void leadLagSalary() {

        ctx.select(OFFICE.OFFICE_CODE, OFFICE.CITY, OFFICE.COUNTRY,
                EMPLOYEE.FIRST_NAME, EMPLOYEE.LAST_NAME, EMPLOYEE.SALARY,
                lead(EMPLOYEE.SALARY, 1, 0).over().partitionBy(OFFICE.OFFICE_CODE)
                        .orderBy(EMPLOYEE.SALARY.desc().nullsLast()).as("next_salary"),
                lag(EMPLOYEE.SALARY, 1, 0).over().partitionBy(OFFICE.OFFICE_CODE)
                        .orderBy(EMPLOYEE.SALARY.desc().nullsLast()).as("prev_salary"))
                .from(OFFICE)
                .innerJoin(EMPLOYEE)
                .on(OFFICE.OFFICE_CODE.eq(EMPLOYEE.OFFICE_CODE))
                .fetch();
    }
    
    // First row in the last group of consecutive rows
    public void firstRowInLastGroup() {

        ctx.select().from(
                select(ORDER.CUSTOMER_NUMBER, ORDER.ORDER_DATE, ORDER.REQUIRED_DATE, ORDER.STATUS,                        
                        field(lead(ORDER.STATUS).over().orderBy(ORDER.REQUIRED_DATE.desc())
                        .isDistinctFrom(ORDER.STATUS)).as("FIRST_IN_GROUP"))
                        .from(ORDER).asTable("T")
        ).where(field(name("T", "FIRST_IN_GROUP")).isTrue())
                .orderBy(field(name("T", "REQUIRED_DATE")).desc())
                .limit(1)
                .fetchOne();
        
        var firstInGroup = field(lead(ORDER.STATUS).over().orderBy(ORDER.REQUIRED_DATE.desc())
                        .isDistinctFrom(ORDER.STATUS));
        ctx.select(ORDER.CUSTOMER_NUMBER, ORDER.ORDER_DATE, ORDER.REQUIRED_DATE, ORDER.STATUS,
                firstInGroup.as("FIRST_IN_GROUP"))
                .from(ORDER)
                .qualify(firstInGroup.isTrue())
                .orderBy(field(name("REQUIRED_DATE")).desc())
                .limit(1)
                .fetchOne();
    }
    
    // Calculating Funnel drop-off metrics
    // Determine the percentage of employees that advanced from REGULAR to AVERAGE to GOOD to EXCELLENT
    @Transactional
    public void employeeFunnel() {

        ctx.with(name("grouped_status")).as(
                select(EMPLOYEE_STATUS.STATUS.as("status"), count().as("status_count"))
                        .from(EMPLOYEE_STATUS)
                        .groupBy(EMPLOYEE_STATUS.STATUS)
                        .orderBy(count()))
                .select(field(name("status")), field(name("status_count")),
                        field(name("status_count"))
                                .divide(field(select(max(
                                        field(name("status_count"), Integer.class)))
                                        .from(name("grouped_status")))).as("total_percentage"),
                        field(name("status_count")).divide(lag(field(name("status_count"), Integer.class)).over()
                                .orderBy(field(name("status_count")).desc())).as("percentage_survival_by_step"))
                .from(name("grouped_status"))
                .orderBy(field(name("status_count")).desc())
                .fetch();
    }
    
    // Time Series Analysis
    public void timeSeriesAnalysis() {

        ctx.select(BANK_TRANSACTION.CACHING_DATE,
                sum(BANK_TRANSACTION.TRANSFER_AMOUNT).as("daily_sum"),
                sum(BANK_TRANSACTION.TRANSFER_AMOUNT)
                        .minus(lag(sum(BANK_TRANSACTION.TRANSFER_AMOUNT))
                                .over().orderBy(BANK_TRANSACTION.CACHING_DATE)).as("daily_difference"))
                .from(BANK_TRANSACTION)
                .where(BANK_TRANSACTION.CACHING_DATE
                        .between(LocalDateTime.of(2005, 3, 1, 0, 0, 0),
                                LocalDateTime.of(2005, 3, 31, 0, 0, 0))
                        .and(BANK_TRANSACTION.BANK_NAME.eq("Optimus Bank")))
                .groupBy(BANK_TRANSACTION.CACHING_DATE)
                .fetch();
    }
}
