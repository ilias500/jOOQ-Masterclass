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
import jooq.generated.tables.records.DepartmentRecord;

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
        "schema version:1.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Department extends TableImpl<DepartmentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>classicmodels.dbo.department</code>
     */
    public static final Department DEPARTMENT = new Department();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DepartmentRecord> getRecordType() {
        return DepartmentRecord.class;
    }

    /**
     * The column <code>classicmodels.dbo.department.department_id</code>.
     */
    public final TableField<DepartmentRecord, Long> DEPARTMENT_ID = createField(DSL.name("department_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>classicmodels.dbo.department.name</code>.
     */
    public final TableField<DepartmentRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.dbo.department.phone</code>.
     */
    public final TableField<DepartmentRecord, String> PHONE = createField(DSL.name("phone"), SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>classicmodels.dbo.department.code</code>.
     */
    public final TableField<DepartmentRecord, Short> CODE = createField(DSL.name("code"), SQLDataType.SMALLINT.defaultValue(DSL.field("((1))", SQLDataType.SMALLINT)), this, "");

    /**
     * The column <code>classicmodels.dbo.department.office_code</code>.
     */
    public final TableField<DepartmentRecord, String> OFFICE_CODE = createField(DSL.name("office_code"), SQLDataType.VARCHAR(10).nullable(false), this, "");

    /**
     * The column <code>classicmodels.dbo.department.topic</code>.
     */
    public final TableField<DepartmentRecord, String> TOPIC = createField(DSL.name("topic"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>classicmodels.dbo.department.dep_net_ipv4</code>.
     */
    public final TableField<DepartmentRecord, String> DEP_NET_IPV4 = createField(DSL.name("dep_net_ipv4"), SQLDataType.VARCHAR(16).defaultValue(DSL.field("(NULL)", SQLDataType.VARCHAR)), this, "");

    private Department(Name alias, Table<DepartmentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Department(Name alias, Table<DepartmentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>classicmodels.dbo.department</code> table reference
     */
    public Department(String alias) {
        this(DSL.name(alias), DEPARTMENT);
    }

    /**
     * Create an aliased <code>classicmodels.dbo.department</code> table reference
     */
    public Department(Name alias) {
        this(alias, DEPARTMENT);
    }

    /**
     * Create a <code>classicmodels.dbo.department</code> table reference
     */
    public Department() {
        this(DSL.name("department"), null);
    }

    public <O extends Record> Department(Table<O> child, ForeignKey<O, DepartmentRecord> key) {
        super(child, key, DEPARTMENT);
    }

    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.DEPARTMENT_DEPARTMENT_ID);
    }

    @Override
    public Identity<DepartmentRecord, Long> getIdentity() {
        return (Identity<DepartmentRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<DepartmentRecord> getPrimaryKey() {
        return Keys.DEPARTMENT__PK__DEPARTME__C223242278CE6AC8;
    }

    @Override
    public List<UniqueKey<DepartmentRecord>> getKeys() {
        return Arrays.<UniqueKey<DepartmentRecord>>asList(Keys.DEPARTMENT__PK__DEPARTME__C223242278CE6AC8);
    }

    @Override
    public List<ForeignKey<DepartmentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<DepartmentRecord, ?>>asList(Keys.DEPARTMENT_IBFK_1);
    }

    public Office office() {
        return new Office(this, Keys.DEPARTMENT_IBFK_1);
    }

    @Override
    public Department as(String alias) {
        return new Department(DSL.name(alias), this);
    }

    @Override
    public Department as(Name alias) {
        return new Department(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Department rename(String name) {
        return new Department(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Department rename(Name name) {
        return new Department(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, Short, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
