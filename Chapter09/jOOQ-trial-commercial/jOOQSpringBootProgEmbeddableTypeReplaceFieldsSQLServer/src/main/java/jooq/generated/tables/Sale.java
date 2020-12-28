/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Dbo;
import jooq.generated.Indexes;
import jooq.generated.Keys;
import jooq.generated.tables.records.SaleRecord;

import org.jooq.Check;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.14.4",
        "schema version:1.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sale extends TableImpl<SaleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>classicmodels.dbo.sale</code>
     */
    public static final Sale SALE = new Sale();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SaleRecord> getRecordType() {
        return SaleRecord.class;
    }

    /**
     * The column <code>classicmodels.dbo.sale.sale_id</code>.
     */
    public final TableField<SaleRecord, Long> SALE_ID = createField(DSL.name("sale_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>classicmodels.dbo.sale.fiscal_year</code>.
     */
    public final TableField<SaleRecord, Integer> FISCAL_YEAR = createField(DSL.name("fiscal_year"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>classicmodels.dbo.sale.sale</code>.
     */
    public final TableField<SaleRecord, Double> SALE_ = createField(DSL.name("sale"), SQLDataType.FLOAT.nullable(false), this, "");

    /**
     * The column <code>classicmodels.dbo.sale.employee_number</code>.
     */
    public final TableField<SaleRecord, Long> EMPLOYEE_NUMBER = createField(DSL.name("employee_number"), SQLDataType.BIGINT.defaultValue(DSL.field("(NULL)", SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>classicmodels.dbo.sale.hot</code>.
     */
    public final TableField<SaleRecord, Boolean> HOT = createField(DSL.name("hot"), SQLDataType.BIT.defaultValue(DSL.field("((0))", SQLDataType.BIT)), this, "");

    /**
     * The column <code>classicmodels.dbo.sale.rate</code>.
     */
    public final TableField<SaleRecord, String> RATE = createField(DSL.name("rate"), SQLDataType.VARCHAR(10).defaultValue(DSL.field("(NULL)", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>classicmodels.dbo.sale.vat</code>.
     */
    public final TableField<SaleRecord, String> VAT = createField(DSL.name("vat"), SQLDataType.VARCHAR(10).defaultValue(DSL.field("(NULL)", SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>classicmodels.dbo.sale.trend</code>.
     */
    public final TableField<SaleRecord, String> TREND = createField(DSL.name("trend"), SQLDataType.VARCHAR(10).defaultValue(DSL.field("(NULL)", SQLDataType.VARCHAR)), this, "");

    private Sale(Name alias, Table<SaleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sale(Name alias, Table<SaleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>classicmodels.dbo.sale</code> table reference
     */
    public Sale(String alias) {
        this(DSL.name(alias), SALE);
    }

    /**
     * Create an aliased <code>classicmodels.dbo.sale</code> table reference
     */
    public Sale(Name alias) {
        this(alias, SALE);
    }

    /**
     * Create a <code>classicmodels.dbo.sale</code> table reference
     */
    public Sale() {
        this(DSL.name("sale"), null);
    }

    public <O extends Record> Sale(Table<O> child, ForeignKey<O, SaleRecord> key) {
        super(child, key, SALE);
    }

    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.SALE_EMPLOYEE_NUMBER);
    }

    @Override
    public Identity<SaleRecord, Long> getIdentity() {
        return (Identity<SaleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SaleRecord> getPrimaryKey() {
        return Keys.SALE__PK__SALE__E1EB00B274D75B63;
    }

    @Override
    public List<UniqueKey<SaleRecord>> getKeys() {
        return Arrays.<UniqueKey<SaleRecord>>asList(Keys.SALE__PK__SALE__E1EB00B274D75B63);
    }

    @Override
    public List<ForeignKey<SaleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SaleRecord, ?>>asList(Keys.SALES_IBFK_1);
    }

    public Employee employee() {
        return new Employee(this, Keys.SALES_IBFK_1);
    }

    @Override
    public List<Check<SaleRecord>> getChecks() {
        return Arrays.<Check<SaleRecord>>asList(
              Internal.createCheck(this, DSL.name("CK__sale__rate__3A81B327"), "([rate]='PLATINUM' OR [rate]='GOLD' OR [rate]='SILVER')", true)
            , Internal.createCheck(this, DSL.name("CK__sale__vat__3C69FB99"), "([vat]='MAX' OR [vat]='MIN' OR [vat]='NONE')", true)
        );
    }

    @Override
    public Sale as(String alias) {
        return new Sale(DSL.name(alias), this);
    }

    @Override
    public Sale as(Name alias) {
        return new Sale(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sale rename(String name) {
        return new Sale(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sale rename(Name name) {
        return new Sale(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Integer, Double, Long, Boolean, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
