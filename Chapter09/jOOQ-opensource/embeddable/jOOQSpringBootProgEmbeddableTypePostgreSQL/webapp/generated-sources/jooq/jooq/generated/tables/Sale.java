/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.enums.RateType;
import jooq.generated.enums.VatType;
import jooq.generated.tables.records.SaleRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
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
public class Sale extends TableImpl<SaleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.sale</code>
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
     * The column <code>public.sale.sale_id</code>.
     */
    public final TableField<SaleRecord, Long> SALE_ID = createField(DSL.name("sale_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>public.sale.fiscal_year</code>.
     */
    public final TableField<SaleRecord, Integer> FISCAL_YEAR = createField(DSL.name("fiscal_year"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sale.sale</code>.
     */
    public final TableField<SaleRecord, Double> SALE_ = createField(DSL.name("sale"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.sale.employee_number</code>.
     */
    public final TableField<SaleRecord, Long> EMPLOYEE_NUMBER = createField(DSL.name("employee_number"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.sale.hot</code>.
     */
    public final TableField<SaleRecord, Boolean> HOT = createField(DSL.name("hot"), SQLDataType.BOOLEAN.defaultValue(DSL.field("false", SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.sale.rate</code>.
     */
    public final TableField<SaleRecord, RateType> RATE = createField(DSL.name("rate"), SQLDataType.VARCHAR.asEnumDataType(jooq.generated.enums.RateType.class), this, "");

    /**
     * The column <code>public.sale.vat</code>.
     */
    public final TableField<SaleRecord, VatType> VAT = createField(DSL.name("vat"), SQLDataType.VARCHAR.asEnumDataType(jooq.generated.enums.VatType.class), this, "");

    /**
     * The column <code>public.sale.fiscal_month</code>.
     */
    public final TableField<SaleRecord, Integer> FISCAL_MONTH = createField(DSL.name("fiscal_month"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.sale.revenue_growth</code>.
     */
    public final TableField<SaleRecord, Double> REVENUE_GROWTH = createField(DSL.name("revenue_growth"), SQLDataType.DOUBLE.nullable(false), this, "");

    /**
     * The column <code>public.sale.trend</code>.
     */
    public final TableField<SaleRecord, String> TREND = createField(DSL.name("trend"), SQLDataType.VARCHAR(10).defaultValue(DSL.field("NULL::character varying", SQLDataType.VARCHAR)), this, "");

    private Sale(Name alias, Table<SaleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sale(Name alias, Table<SaleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.sale</code> table reference
     */
    public Sale(String alias) {
        this(DSL.name(alias), SALE);
    }

    /**
     * Create an aliased <code>public.sale</code> table reference
     */
    public Sale(Name alias) {
        this(alias, SALE);
    }

    /**
     * Create a <code>public.sale</code> table reference
     */
    public Sale() {
        this(DSL.name("sale"), null);
    }

    public <O extends Record> Sale(Table<O> child, ForeignKey<O, SaleRecord> key) {
        super(child, key, SALE);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public Identity<SaleRecord, Long> getIdentity() {
        return (Identity<SaleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SaleRecord> getPrimaryKey() {
        return Keys.SALE_PK;
    }

    @Override
    public List<UniqueKey<SaleRecord>> getKeys() {
        return Arrays.<UniqueKey<SaleRecord>>asList(Keys.SALE_PK);
    }

    @Override
    public List<ForeignKey<SaleRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<SaleRecord, ?>>asList(Keys.SALE__SALE_EMPLOYEE_FK);
    }

    public Employee employee() {
        return new Employee(this, Keys.SALE__SALE_EMPLOYEE_FK);
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
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Integer, Double, Long, Boolean, RateType, VatType, Integer, Double, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}
