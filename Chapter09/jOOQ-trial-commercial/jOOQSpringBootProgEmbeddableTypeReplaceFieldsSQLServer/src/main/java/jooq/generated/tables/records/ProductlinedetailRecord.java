/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.tables.Productlinedetail;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ProductlinedetailRecord extends UpdatableRecordImpl<ProductlinedetailRecord> implements Record4<String, Long, String, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>classicmodels.dbo.productlinedetail.product_line</code>.
     */
    public void setProductLine(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>classicmodels.dbo.productlinedetail.product_line</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getProductLine() {
        return (String) get(0);
    }

    /**
     * Setter for <code>classicmodels.dbo.productlinedetail.code</code>.
     */
    public void setCode(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>classicmodels.dbo.productlinedetail.code</code>.
     */
    @NotNull
    public Long getCode() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>classicmodels.dbo.productlinedetail.line_capacity</code>.
     */
    public void setLineCapacity(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>classicmodels.dbo.productlinedetail.line_capacity</code>.
     */
    @NotNull
    @Size(max = 20)
    public String getLineCapacity() {
        return (String) get(2);
    }

    /**
     * Setter for <code>classicmodels.dbo.productlinedetail.line_type</code>.
     */
    public void setLineType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>classicmodels.dbo.productlinedetail.line_type</code>.
     */
    public Integer getLineType() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, Long, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, Long, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Productlinedetail.PRODUCTLINEDETAIL.PRODUCT_LINE;
    }

    @Override
    public Field<Long> field2() {
        return Productlinedetail.PRODUCTLINEDETAIL.CODE;
    }

    @Override
    public Field<String> field3() {
        return Productlinedetail.PRODUCTLINEDETAIL.LINE_CAPACITY;
    }

    @Override
    public Field<Integer> field4() {
        return Productlinedetail.PRODUCTLINEDETAIL.LINE_TYPE;
    }

    @Override
    public String component1() {
        return getProductLine();
    }

    @Override
    public Long component2() {
        return getCode();
    }

    @Override
    public String component3() {
        return getLineCapacity();
    }

    @Override
    public Integer component4() {
        return getLineType();
    }

    @Override
    public String value1() {
        return getProductLine();
    }

    @Override
    public Long value2() {
        return getCode();
    }

    @Override
    public String value3() {
        return getLineCapacity();
    }

    @Override
    public Integer value4() {
        return getLineType();
    }

    @Override
    public ProductlinedetailRecord value1(String value) {
        setProductLine(value);
        return this;
    }

    @Override
    public ProductlinedetailRecord value2(Long value) {
        setCode(value);
        return this;
    }

    @Override
    public ProductlinedetailRecord value3(String value) {
        setLineCapacity(value);
        return this;
    }

    @Override
    public ProductlinedetailRecord value4(Integer value) {
        setLineType(value);
        return this;
    }

    @Override
    public ProductlinedetailRecord values(String value1, Long value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProductlinedetailRecord
     */
    public ProductlinedetailRecord() {
        super(Productlinedetail.PRODUCTLINEDETAIL);
    }

    /**
     * Create a detached, initialised ProductlinedetailRecord
     */
    public ProductlinedetailRecord(String productLine, Long code, String lineCapacity, Integer lineType) {
        super(Productlinedetail.PRODUCTLINEDETAIL);

        setProductLine(productLine);
        setCode(code);
        setLineCapacity(lineCapacity);
        setLineType(lineType);
    }
}
