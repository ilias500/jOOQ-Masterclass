/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.records;


import javax.annotation.processing.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import jooq.generated.tables.Manager;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.2",
        "schema version:1.1"
    },
    date = "2020-07-04T08:58:29.902Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ManagerRecord extends UpdatableRecordImpl<ManagerRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = 1403184948;

    /**
     * Setter for <code>public.manager.manager_id</code>.
     */
    public void setManagerId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.manager.manager_id</code>.
     */
    public Long getManagerId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.manager.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.manager.name</code>.
     */
    @NotNull
    @Size(max = 50)
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Manager.MANAGER.MANAGER_ID;
    }

    @Override
    public Field<String> field2() {
        return Manager.MANAGER.NAME;
    }

    @Override
    public Long component1() {
        return getManagerId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long value1() {
        return getManagerId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public ManagerRecord value1(Long value) {
        setManagerId(value);
        return this;
    }

    @Override
    public ManagerRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public ManagerRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ManagerRecord
     */
    public ManagerRecord() {
        super(Manager.MANAGER);
    }

    /**
     * Create a detached, initialised ManagerRecord
     */
    public ManagerRecord(Long managerId, String name) {
        super(Manager.MANAGER);

        set(0, managerId);
        set(1, name);
    }
}
