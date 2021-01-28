package com.classicmodels.repository;

import java.math.BigDecimal;
import java.util.List;
import static jooq.generated.tables.Customer.CUSTOMER;
import static jooq.generated.tables.Orderdetail.ORDERDETAIL;
import jooq.generated.tables.records.CustomerRecord;
import org.jooq.Cursor;
import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.RecordMapper;
import org.jooq.ResultQuery;
import org.jooq.conf.Settings;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public class ClassicModelsRepository {

    private final DSLContext ctx;

    public ClassicModelsRepository(DSLContext ctx) {
        this.ctx = ctx;
    }

    public void fetchCustomerLazyOneByOne() {

        // By default, Oracle JDBC retrieves a result set of 10 rows at a time from the database cursor. 
        // Next, jOOQ scans the fetched ResultSet record by record via fetchNext()
        System.out.println("Example 1:\n");
        try ( Cursor<CustomerRecord> cursor = ctx.selectFrom(CUSTOMER).fetchLazy()) {

            while (cursor.hasNext()) {
                CustomerRecord customer = cursor.fetchNext();

                System.out.println("Customer:\n" + customer);
            }
        }
    }

    public void fetchCustomerLazyFiveByFive() {

        // By default, Oracle JDBC retrieves a result set of 10 rows at a time from the database cursor. 
        // Next, jOOQ scans the fetched ResultSet via fetchNext(int number) - here, 5 records at a time
        System.out.println("\nExample 2:\n");
        try ( Cursor<CustomerRecord> cursor = ctx.selectFrom(CUSTOMER).fetchLazy()) {

            while (cursor.hasNext()) {
                List<CustomerRecord> customers = cursor.fetchNext(5);

                System.out.println("Customers:\n" + customers);
            }
        }
    }
    
    public void fetchCustomerLazyAndUpdate() {
        
        // By default, Oracle JDBC retrieves a result set of 10 rows at a time from the database cursor. 
        // Next, jOOQ scans the fetched ResultSet record by record via fetchNext() and update it based on a condition.
        System.out.println("\nExample 3:\n");
        try ( Cursor<CustomerRecord> cursor = ctx.selectFrom(CUSTOMER).fetchLazy()) {

            while (cursor.hasNext()) {
                CustomerRecord customer = cursor.fetchNext();

                System.out.println("Customer:\n" + customer);
                if (customer.getValue(CUSTOMER.CREDIT_LIMIT).floatValue() > 0.00f) {
                    customer.set(CUSTOMER.CREDIT_LIMIT, BigDecimal.ZERO);
                    customer.store();
                }
            }
        }
    }
    
    public void fetchCustomerLazyAndRecordMapper() {

        // By default, Oracle JDBC retrieves a result set of 10 rows at a time from the database cursor. 
        // Next, jOOQ scans the fetched ResultSet record by record via fetchNext() and apply a RecordMapper
        System.out.println("\nExample 4:\n");
        try ( Cursor<Record2<BigDecimal, Long>> cursor
                = ctx.select(ORDERDETAIL.PRICE_EACH, ORDERDETAIL.QUANTITY_ORDERED)
                        .from(ORDERDETAIL).fetchLazy()) {

                    while (cursor.hasNext()) {

                        double result = cursor.fetchNext(
                                new RecordMapper<Record2<BigDecimal, Long>, Double>() {

                            final List<Integer> tax = List.of(1, 2, 3, 4, 5);

                            @Override
                            public Double map(Record2<BigDecimal, Long> record) {

                                double total = record.get(ORDERDETAIL.PRICE_EACH).doubleValue()
                                        * record.get(ORDERDETAIL.QUANTITY_ORDERED);

                                return total - tax.get((int) (total % 5));
                            }
                        });

                        System.out.println("Result:" + result);
                    }
                }
    }
    
    public void fetchExactlyOneRow() {

        // Instruct Oracle JDBC to retrieve a result set of 1 row at a time from the database cursor. 
        // Instruct jOOQ to scan a result set of 1 row at a time from the ResultSet. 
        // So, both Oracle and jOOQ will fetch exactly one row at a time.
        System.out.println("\nExample 5.1:\n");
        try ( Cursor<CustomerRecord> cursor = ctx.selectFrom(CUSTOMER).fetchSize(1).fetchLazy()) {

            while (cursor.hasNext()) {
                CustomerRecord customer = cursor.fetchNext();

                System.out.println("Customer:\n" + customer);
            }
        }
        
        // same thing but using explicitly ResultQuery
        System.out.println("\nExample 5.2:\n");
        ResultQuery<CustomerRecord> resultQuery = ctx.selectFrom(CUSTOMER).fetchSize(1);        
        Cursor<CustomerRecord> cursor = resultQuery.fetchLazy();
        
        try (cursor) {
            
            while (cursor.hasNext()) {
                CustomerRecord customer = cursor.fetchNext();

                System.out.println("Customer:\n" + customer);
            }
        }        
    }
    
    public void fetchExactlyOneRowGlobal() {

        // Instruct Oracle JDBC to retrieve a result set of 1 row at a time from the database cursor. 
        // Instruct jOOQ to scan a result set of 1 row at a time from the ResultSet. 
        // So, both Oracle and jOOQ will fetch exactly one row at a time.
        // Global fetchSize() (of course. you can do this setting via @Bean as well).
        System.out.println("Example 6:\n");
        try ( Cursor<CustomerRecord> cursor = ctx.configuration().set(
                new Settings().withFetchSize(1)).dsl()
                .selectFrom(CUSTOMER).fetchLazy()) {

            while (cursor.hasNext()) {
                CustomerRecord customer = cursor.fetchNext();

                System.out.println("Customer:\n" + customer);
            }
        }
    }
}