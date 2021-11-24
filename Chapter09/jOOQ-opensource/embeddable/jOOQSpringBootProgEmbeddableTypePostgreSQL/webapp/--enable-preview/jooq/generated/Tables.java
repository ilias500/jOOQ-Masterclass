/*
 * This file is generated by jOOQ.
 */
package jooq.generated;


import javax.annotation.processing.Generated;

import jooq.generated.tables.BankTransaction;
import jooq.generated.tables.Customer;
import jooq.generated.tables.CustomerMaster;
import jooq.generated.tables.Customerdetail;
import jooq.generated.tables.DailyActivity;
import jooq.generated.tables.Department;
import jooq.generated.tables.Each;
import jooq.generated.tables.Employee;
import jooq.generated.tables.EmployeeStatus;
import jooq.generated.tables.GetOfficesMultiple;
import jooq.generated.tables.Manager;
import jooq.generated.tables.Office;
import jooq.generated.tables.OfficeFlights;
import jooq.generated.tables.OfficeHasManager;
import jooq.generated.tables.OfficeMaster;
import jooq.generated.tables.Order;
import jooq.generated.tables.Orderdetail;
import jooq.generated.tables.Payment;
import jooq.generated.tables.Product;
import jooq.generated.tables.ProductMaster;
import jooq.generated.tables.ProductOfProductLine;
import jooq.generated.tables.Productline;
import jooq.generated.tables.Productlinedetail;
import jooq.generated.tables.Sale;
import jooq.generated.tables.Skeys;
import jooq.generated.tables.Svals;
import jooq.generated.tables.Token;
import jooq.generated.tables.Top3product;
import jooq.generated.tables.TopThreeSalesPerEmployee;
import jooq.generated.tables.records.EachRecord;
import jooq.generated.tables.records.GetOfficesMultipleRecord;
import jooq.generated.tables.records.ProductOfProductLineRecord;
import jooq.generated.tables.records.SkeysRecord;
import jooq.generated.tables.records.SvalsRecord;
import jooq.generated.tables.records.TopThreeSalesPerEmployeeRecord;

import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;


/**
 * Convenience access to all tables in public.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.4",
        "schema version:1.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.bank_transaction</code>.
     */
    public static final BankTransaction BANK_TRANSACTION = BankTransaction.BANK_TRANSACTION;

    /**
     * The table <code>public.customer</code>.
     */
    public static final Customer CUSTOMER = Customer.CUSTOMER;

    /**
     * The table <code>public.customer_master</code>.
     */
    public static final CustomerMaster CUSTOMER_MASTER = CustomerMaster.CUSTOMER_MASTER;

    /**
     * The table <code>public.customerdetail</code>.
     */
    public static final Customerdetail CUSTOMERDETAIL = Customerdetail.CUSTOMERDETAIL;

    /**
     * The table <code>public.daily_activity</code>.
     */
    public static final DailyActivity DAILY_ACTIVITY = DailyActivity.DAILY_ACTIVITY;

    /**
     * The table <code>public.department</code>.
     */
    public static final Department DEPARTMENT = Department.DEPARTMENT;

    /**
     * The table <code>public.each</code>.
     */
    public static final Each EACH = Each.EACH;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<EachRecord> EACH(
          Configuration configuration
        , Object hs
    ) {
        return configuration.dsl().selectFrom(jooq.generated.tables.Each.EACH.call(
              hs
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Each EACH(
          Object hs
    ) {
        return jooq.generated.tables.Each.EACH.call(
              hs
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Each EACH(
          Field<Object> hs
    ) {
        return jooq.generated.tables.Each.EACH.call(
              hs
        );
    }

    /**
     * The table <code>public.employee</code>.
     */
    public static final Employee EMPLOYEE = Employee.EMPLOYEE;

    /**
     * The table <code>public.employee_status</code>.
     */
    public static final EmployeeStatus EMPLOYEE_STATUS = EmployeeStatus.EMPLOYEE_STATUS;

    /**
     * The table <code>public.get_offices_multiple</code>.
     */
    public static final GetOfficesMultiple GET_OFFICES_MULTIPLE = GetOfficesMultiple.GET_OFFICES_MULTIPLE;

    /**
     * Call <code>public.get_offices_multiple</code>.
     */
    public static Result<GetOfficesMultipleRecord> GET_OFFICES_MULTIPLE(
          Configuration configuration
    ) {
        return configuration.dsl().selectFrom(jooq.generated.tables.GetOfficesMultiple.GET_OFFICES_MULTIPLE.call(
        )).fetch();
    }

    /**
     * Get <code>public.get_offices_multiple</code> as a table.
     */
    public static GetOfficesMultiple GET_OFFICES_MULTIPLE() {
        return jooq.generated.tables.GetOfficesMultiple.GET_OFFICES_MULTIPLE.call(
        );
    }

    /**
     * The table <code>public.manager</code>.
     */
    public static final Manager MANAGER = Manager.MANAGER;

    /**
     * The table <code>public.office</code>.
     */
    public static final Office OFFICE = Office.OFFICE;

    /**
     * The table <code>public.office_flights</code>.
     */
    public static final OfficeFlights OFFICE_FLIGHTS = OfficeFlights.OFFICE_FLIGHTS;

    /**
     * The table <code>public.office_has_manager</code>.
     */
    public static final OfficeHasManager OFFICE_HAS_MANAGER = OfficeHasManager.OFFICE_HAS_MANAGER;

    /**
     * The table <code>public.office_master</code>.
     */
    public static final OfficeMaster OFFICE_MASTER = OfficeMaster.OFFICE_MASTER;

    /**
     * The table <code>public.order</code>.
     */
    public static final Order ORDER = Order.ORDER;

    /**
     * The table <code>public.orderdetail</code>.
     */
    public static final Orderdetail ORDERDETAIL = Orderdetail.ORDERDETAIL;

    /**
     * The table <code>public.payment</code>.
     */
    public static final Payment PAYMENT = Payment.PAYMENT;

    /**
     * The table <code>public.product</code>.
     */
    public static final Product PRODUCT = Product.PRODUCT;

    /**
     * The table <code>public.product_master</code>.
     */
    public static final ProductMaster PRODUCT_MASTER = ProductMaster.PRODUCT_MASTER;

    /**
     * The table <code>public.product_of_product_line</code>.
     */
    public static final ProductOfProductLine PRODUCT_OF_PRODUCT_LINE = ProductOfProductLine.PRODUCT_OF_PRODUCT_LINE;

    /**
     * Call <code>public.product_of_product_line</code>.
     */
    public static Result<ProductOfProductLineRecord> PRODUCT_OF_PRODUCT_LINE(
          Configuration configuration
        , String pLineIn
    ) {
        return configuration.dsl().selectFrom(jooq.generated.tables.ProductOfProductLine.PRODUCT_OF_PRODUCT_LINE.call(
              pLineIn
        )).fetch();
    }

    /**
     * Get <code>public.product_of_product_line</code> as a table.
     */
    public static ProductOfProductLine PRODUCT_OF_PRODUCT_LINE(
          String pLineIn
    ) {
        return jooq.generated.tables.ProductOfProductLine.PRODUCT_OF_PRODUCT_LINE.call(
              pLineIn
        );
    }

    /**
     * Get <code>public.product_of_product_line</code> as a table.
     */
    public static ProductOfProductLine PRODUCT_OF_PRODUCT_LINE(
          Field<String> pLineIn
    ) {
        return jooq.generated.tables.ProductOfProductLine.PRODUCT_OF_PRODUCT_LINE.call(
              pLineIn
        );
    }

    /**
     * The table <code>public.productline</code>.
     */
    public static final Productline PRODUCTLINE = Productline.PRODUCTLINE;

    /**
     * The table <code>public.productlinedetail</code>.
     */
    public static final Productlinedetail PRODUCTLINEDETAIL = Productlinedetail.PRODUCTLINEDETAIL;

    /**
     * The table <code>public.sale</code>.
     */
    public static final Sale SALE = Sale.SALE;

    /**
     * The table <code>public.skeys</code>.
     */
    public static final Skeys SKEYS = Skeys.SKEYS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<SkeysRecord> SKEYS(
          Configuration configuration
        , Object __1
    ) {
        return configuration.dsl().selectFrom(jooq.generated.tables.Skeys.SKEYS.call(
              __1
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Skeys SKEYS(
          Object __1
    ) {
        return jooq.generated.tables.Skeys.SKEYS.call(
              __1
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Skeys SKEYS(
          Field<Object> __1
    ) {
        return jooq.generated.tables.Skeys.SKEYS.call(
              __1
        );
    }

    /**
     * The table <code>public.svals</code>.
     */
    public static final Svals SVALS = Svals.SVALS;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Result<SvalsRecord> SVALS(
          Configuration configuration
        , Object __1
    ) {
        return configuration.dsl().selectFrom(jooq.generated.tables.Svals.SVALS.call(
              __1
        )).fetch();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Svals SVALS(
          Object __1
    ) {
        return jooq.generated.tables.Svals.SVALS.call(
              __1
        );
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public static Svals SVALS(
          Field<Object> __1
    ) {
        return jooq.generated.tables.Svals.SVALS.call(
              __1
        );
    }

    /**
     * The table <code>public.token</code>.
     */
    public static final Token TOKEN = Token.TOKEN;

    /**
     * The table <code>public.top3product</code>.
     */
    public static final Top3product TOP3PRODUCT = Top3product.TOP3PRODUCT;

    /**
     * The table <code>public.top_three_sales_per_employee</code>.
     */
    public static final TopThreeSalesPerEmployee TOP_THREE_SALES_PER_EMPLOYEE = TopThreeSalesPerEmployee.TOP_THREE_SALES_PER_EMPLOYEE;

    /**
     * Call <code>public.top_three_sales_per_employee</code>.
     */
    public static Result<TopThreeSalesPerEmployeeRecord> TOP_THREE_SALES_PER_EMPLOYEE(
          Configuration configuration
        , Long employeeNr
    ) {
        return configuration.dsl().selectFrom(jooq.generated.tables.TopThreeSalesPerEmployee.TOP_THREE_SALES_PER_EMPLOYEE.call(
              employeeNr
        )).fetch();
    }

    /**
     * Get <code>public.top_three_sales_per_employee</code> as a table.
     */
    public static TopThreeSalesPerEmployee TOP_THREE_SALES_PER_EMPLOYEE(
          Long employeeNr
    ) {
        return jooq.generated.tables.TopThreeSalesPerEmployee.TOP_THREE_SALES_PER_EMPLOYEE.call(
              employeeNr
        );
    }

    /**
     * Get <code>public.top_three_sales_per_employee</code> as a table.
     */
    public static TopThreeSalesPerEmployee TOP_THREE_SALES_PER_EMPLOYEE(
          Field<Long> employeeNr
    ) {
        return jooq.generated.tables.TopThreeSalesPerEmployee.TOP_THREE_SALES_PER_EMPLOYEE.call(
              employeeNr
        );
    }
}