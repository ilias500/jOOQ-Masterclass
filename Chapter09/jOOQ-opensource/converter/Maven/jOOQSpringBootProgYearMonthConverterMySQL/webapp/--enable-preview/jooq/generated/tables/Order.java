/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Classicmodels;
import jooq.generated.Indexes;
import jooq.generated.Keys;
import jooq.generated.tables.records.OrderRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
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
public class Order extends TableImpl<OrderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>classicmodels.order</code>
     */
    public static final Order ORDER = new Order();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderRecord> getRecordType() {
        return OrderRecord.class;
    }

    /**
     * The column <code>classicmodels.order.order_id</code>.
     */
    public final TableField<OrderRecord, Long> ORDER_ID = createField(DSL.name("order_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>classicmodels.order.order_date</code>.
     */
    public final TableField<OrderRecord, LocalDate> ORDER_DATE = createField(DSL.name("order_date"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>classicmodels.order.required_date</code>.
     */
    public final TableField<OrderRecord, LocalDate> REQUIRED_DATE = createField(DSL.name("required_date"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column <code>classicmodels.order.shipped_date</code>.
     */
    public final TableField<OrderRecord, LocalDate> SHIPPED_DATE = createField(DSL.name("shipped_date"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column <code>classicmodels.order.status</code>.
     */
    public final TableField<OrderRecord, String> STATUS = createField(DSL.name("status"), SQLDataType.VARCHAR(15).nullable(false), this, "");

    /**
     * The column <code>classicmodels.order.comments</code>.
     */
    public final TableField<OrderRecord, String> COMMENTS = createField(DSL.name("comments"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>classicmodels.order.customer_number</code>.
     */
    public final TableField<OrderRecord, Long> CUSTOMER_NUMBER = createField(DSL.name("customer_number"), SQLDataType.BIGINT.nullable(false), this, "");

    private Order(Name alias, Table<OrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private Order(Name alias, Table<OrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>classicmodels.order</code> table reference
     */
    public Order(String alias) {
        this(DSL.name(alias), ORDER);
    }

    /**
     * Create an aliased <code>classicmodels.order</code> table reference
     */
    public Order(Name alias) {
        this(alias, ORDER);
    }

    /**
     * Create a <code>classicmodels.order</code> table reference
     */
    public Order() {
        this(DSL.name("order"), null);
    }

    public <O extends Record> Order(Table<O> child, ForeignKey<O, OrderRecord> key) {
        super(child, key, ORDER);
    }

    @Override
    public Schema getSchema() {
        return Classicmodels.CLASSICMODELS;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ORDER_CUSTOMER_NUMBER);
    }

    @Override
    public Identity<OrderRecord, Long> getIdentity() {
        return (Identity<OrderRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<OrderRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrderRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderRecord>>asList(Keys.KEY_ORDER_PRIMARY);
    }

    @Override
    public List<ForeignKey<OrderRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<OrderRecord, ?>>asList(Keys.ORDERS_IBFK_1);
    }

    public Customer customer() {
        return new Customer(this, Keys.ORDERS_IBFK_1);
    }

    @Override
    public Order as(String alias) {
        return new Order(DSL.name(alias), this);
    }

    @Override
    public Order as(Name alias) {
        return new Order(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(String name) {
        return new Order(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Order rename(Name name) {
        return new Order(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, LocalDate, LocalDate, LocalDate, String, String, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
