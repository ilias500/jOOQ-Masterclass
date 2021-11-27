/*
 * This file is generated by jOOQ.
 */
package jooq.generated.embeddables.records;


import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.tables.Office;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.EmbeddableRecordImpl;
import org.jooq.impl.Internal;


/**
 * The embeddable <code>public.OFFICE_FULL_ADDRESS</code>.
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
public class OfficeFullAddressRecord extends EmbeddableRecordImpl<OfficeFullAddressRecord> implements Record5<String, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.OFFICE_FULL_ADDRESS.city</code>.
     */
    public void setCity(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.OFFICE_FULL_ADDRESS.city</code>.
     */
    @Size(max = 50)
    public String getCity() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.OFFICE_FULL_ADDRESS.address_line_first</code>.
     */
    public void setAddressLineFirst(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.OFFICE_FULL_ADDRESS.address_line_first</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getAddressLineFirst() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.OFFICE_FULL_ADDRESS.state</code>.
     */
    public void setState(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.OFFICE_FULL_ADDRESS.state</code>.
     */
    @Size(max = 50)
    public String getState() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.OFFICE_FULL_ADDRESS.country</code>.
     */
    public void setCountry(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.OFFICE_FULL_ADDRESS.country</code>.
     */
    @Size(max = 50)
    public String getCountry() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.OFFICE_FULL_ADDRESS.territory</code>.
     */
    public void setTerritory(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.OFFICE_FULL_ADDRESS.territory</code>.
     */
    @NotNull
    @Size(max = 10)
    public String getTerritory() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row5<String, String, String, String, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    public Row5<String, String, String, String, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return (Field<String>) field(0);
    }

    @Override
    public Field<String> field2() {
        return (Field<String>) field(1);
    }

    @Override
    public Field<String> field3() {
        return (Field<String>) field(2);
    }

    @Override
    public Field<String> field4() {
        return (Field<String>) field(3);
    }

    @Override
    public Field<String> field5() {
        return (Field<String>) field(4);
    }

    @Override
    public String component1() {
        return getCity();
    }

    @Override
    public String component2() {
        return getAddressLineFirst();
    }

    @Override
    public String component3() {
        return getState();
    }

    @Override
    public String component4() {
        return getCountry();
    }

    @Override
    public String component5() {
        return getTerritory();
    }

    @Override
    public String value1() {
        return getCity();
    }

    @Override
    public String value2() {
        return getAddressLineFirst();
    }

    @Override
    public String value3() {
        return getState();
    }

    @Override
    public String value4() {
        return getCountry();
    }

    @Override
    public String value5() {
        return getTerritory();
    }

    @Override
    public OfficeFullAddressRecord value1(String value) {
        setCity(value);
        return this;
    }

    @Override
    public OfficeFullAddressRecord value2(String value) {
        setAddressLineFirst(value);
        return this;
    }

    @Override
    public OfficeFullAddressRecord value3(String value) {
        setState(value);
        return this;
    }

    @Override
    public OfficeFullAddressRecord value4(String value) {
        setCountry(value);
        return this;
    }

    @Override
    public OfficeFullAddressRecord value5(String value) {
        setTerritory(value);
        return this;
    }

    @Override
    public OfficeFullAddressRecord values(String value1, String value2, String value3, String value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OfficeFullAddressRecord
     */
    public OfficeFullAddressRecord() {
        super(Internal.fields(Office.OFFICE.OFFICE_FULL_ADDRESS));
    }

    /**
     * Create a detached, initialised OfficeFullAddressRecord
     */
    public OfficeFullAddressRecord(String city, String addressLineFirst, String state, String country, String territory) {
        this();

        setCity(city);
        setAddressLineFirst(addressLineFirst);
        setState(state);
        setCountry(country);
        setTerritory(territory);
    }
}
