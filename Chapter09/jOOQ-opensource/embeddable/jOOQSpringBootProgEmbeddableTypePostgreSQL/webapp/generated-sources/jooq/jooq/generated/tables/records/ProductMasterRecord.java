/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import javax.annotation.processing.Generated;
import javax.validation.constraints.Size;

import jooq.generated.tables.ProductMaster;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.TableRecordImpl;


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
public class ProductMasterRecord extends TableRecordImpl<ProductMasterRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.product_master.product_line</code>.
     */
    public void setProductLine(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.product_master.product_line</code>.
     */
    @Size(max = 50)
    public String getProductLine() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.product_master.product_name</code>.
     */
    public void setProductName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.product_master.product_name</code>.
     */
    @Size(max = 70)
    public String getProductName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.product_master.product_scale</code>.
     */
    public void setProductScale(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.product_master.product_scale</code>.
     */
    @Size(max = 10)
    public String getProductScale() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ProductMaster.PRODUCT_MASTER.PRODUCT_LINE;
    }

    @Override
    public Field<String> field2() {
        return ProductMaster.PRODUCT_MASTER.PRODUCT_NAME;
    }

    @Override
    public Field<String> field3() {
        return ProductMaster.PRODUCT_MASTER.PRODUCT_SCALE;
    }

    @Override
    public String component1() {
        return getProductLine();
    }

    @Override
    public String component2() {
        return getProductName();
    }

    @Override
    public String component3() {
        return getProductScale();
    }

    @Override
    public String value1() {
        return getProductLine();
    }

    @Override
    public String value2() {
        return getProductName();
    }

    @Override
    public String value3() {
        return getProductScale();
    }

    @Override
    public ProductMasterRecord value1(String value) {
        setProductLine(value);
        return this;
    }

    @Override
    public ProductMasterRecord value2(String value) {
        setProductName(value);
        return this;
    }

    @Override
    public ProductMasterRecord value3(String value) {
        setProductScale(value);
        return this;
    }

    @Override
    public ProductMasterRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductMasterRecord
     */
    public ProductMasterRecord() {
        super(ProductMaster.PRODUCT_MASTER);
    }

    /**
     * Create a detached, initialised ProductMasterRecord
     */
    public ProductMasterRecord(String productLine, String productName, String productScale) {
        super(ProductMaster.PRODUCT_MASTER);

        setProductLine(productLine);
        setProductName(productName);
        setProductScale(productScale);
    }
}
