/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.Keys;
import jooq.generated.Public;
import jooq.generated.tables.records.OfficeFlightsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class OfficeFlights extends TableImpl<OfficeFlightsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.office_flights</code>
     */
    public static final OfficeFlights OFFICE_FLIGHTS = new OfficeFlights();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OfficeFlightsRecord> getRecordType() {
        return OfficeFlightsRecord.class;
    }

    /**
     * The column <code>public.office_flights.depart_town</code>.
     */
    public final TableField<OfficeFlightsRecord, String> DEPART_TOWN = createField(DSL.name("depart_town"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>public.office_flights.arrival_town</code>.
     */
    public final TableField<OfficeFlightsRecord, String> ARRIVAL_TOWN = createField(DSL.name("arrival_town"), SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>public.office_flights.distance_km</code>.
     */
    public final TableField<OfficeFlightsRecord, Integer> DISTANCE_KM = createField(DSL.name("distance_km"), SQLDataType.INTEGER.nullable(false), this, "");

    private OfficeFlights(Name alias, Table<OfficeFlightsRecord> aliased) {
        this(alias, aliased, null);
    }

    private OfficeFlights(Name alias, Table<OfficeFlightsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.office_flights</code> table reference
     */
    public OfficeFlights(String alias) {
        this(DSL.name(alias), OFFICE_FLIGHTS);
    }

    /**
     * Create an aliased <code>public.office_flights</code> table reference
     */
    public OfficeFlights(Name alias) {
        this(alias, OFFICE_FLIGHTS);
    }

    /**
     * Create a <code>public.office_flights</code> table reference
     */
    public OfficeFlights() {
        this(DSL.name("office_flights"), null);
    }

    public <O extends Record> OfficeFlights(Table<O> child, ForeignKey<O, OfficeFlightsRecord> key) {
        super(child, key, OFFICE_FLIGHTS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<OfficeFlightsRecord> getPrimaryKey() {
        return Keys.OFFICE_FLIGHTS_PK;
    }

    @Override
    public List<UniqueKey<OfficeFlightsRecord>> getKeys() {
        return Arrays.<UniqueKey<OfficeFlightsRecord>>asList(Keys.OFFICE_FLIGHTS_PK);
    }

    @Override
    public OfficeFlights as(String alias) {
        return new OfficeFlights(DSL.name(alias), this);
    }

    @Override
    public OfficeFlights as(Name alias) {
        return new OfficeFlights(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OfficeFlights rename(String name) {
        return new OfficeFlights(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OfficeFlights rename(Name name) {
        return new OfficeFlights(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}