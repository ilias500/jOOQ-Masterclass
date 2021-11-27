/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import javax.annotation.processing.Generated;

import jooq.generated.Public;
import jooq.generated.tables.records.ProductMasterRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
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
public class ProductMaster extends TableImpl<ProductMasterRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.product_master</code>
     */
    public static final ProductMaster PRODUCT_MASTER = new ProductMaster();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProductMasterRecord> getRecordType() {
        return ProductMasterRecord.class;
    }

    /**
     * The column <code>public.product_master.product_line</code>.
     */
    public final TableField<ProductMasterRecord, String> PRODUCT_LINE = createField(DSL.name("product_line"), SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>public.product_master.product_name</code>.
     */
    public final TableField<ProductMasterRecord, String> PRODUCT_NAME = createField(DSL.name("product_name"), SQLDataType.VARCHAR(70), this, "");

    /**
     * The column <code>public.product_master.product_scale</code>.
     */
    public final TableField<ProductMasterRecord, String> PRODUCT_SCALE = createField(DSL.name("product_scale"), SQLDataType.VARCHAR(10), this, "");

    private ProductMaster(Name alias, Table<ProductMasterRecord> aliased) {
        this(alias, aliased, null);
    }

    private ProductMaster(Name alias, Table<ProductMasterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("create view \"product_master\" as  SELECT product.product_line,\n    product.product_name,\n    product.product_scale\n   FROM product;"));
    }

    /**
     * Create an aliased <code>public.product_master</code> table reference
     */
    public ProductMaster(String alias) {
        this(DSL.name(alias), PRODUCT_MASTER);
    }

    /**
     * Create an aliased <code>public.product_master</code> table reference
     */
    public ProductMaster(Name alias) {
        this(alias, PRODUCT_MASTER);
    }

    /**
     * Create a <code>public.product_master</code> table reference
     */
    public ProductMaster() {
        this(DSL.name("product_master"), null);
    }

    public <O extends Record> ProductMaster(Table<O> child, ForeignKey<O, ProductMasterRecord> key) {
        super(child, key, PRODUCT_MASTER);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public ProductMaster as(String alias) {
        return new ProductMaster(DSL.name(alias), this);
    }

    @Override
    public ProductMaster as(Name alias) {
        return new ProductMaster(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductMaster rename(String name) {
        return new ProductMaster(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ProductMaster rename(Name name) {
        return new ProductMaster(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}
