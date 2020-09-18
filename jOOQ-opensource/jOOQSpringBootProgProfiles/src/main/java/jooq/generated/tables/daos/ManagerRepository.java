/*
 * This file is generated by jOOQ.
 */
package jooq.generated.tables.daos;


import java.util.List;

import javax.annotation.processing.Generated;

import jooq.generated.tables.Manager;
import jooq.generated.tables.records.ManagerRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


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
@Repository
public class ManagerRepository extends DAOImpl<ManagerRecord, jooq.generated.tables.pojos.Manager, Long> {

    /**
     * Create a new ManagerRepository without any configuration
     */
    public ManagerRepository() {
        super(Manager.MANAGER, jooq.generated.tables.pojos.Manager.class);
    }

    /**
     * Create a new ManagerRepository with an attached configuration
     */
    @Autowired
    public ManagerRepository(Configuration configuration) {
        super(Manager.MANAGER, jooq.generated.tables.pojos.Manager.class, configuration);
    }

    @Override
    public Long getId(jooq.generated.tables.pojos.Manager object) {
        return object.getManagerId();
    }

    /**
     * Fetch records that have <code>manager_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<jooq.generated.tables.pojos.Manager> fetchRangeOfManagerId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(Manager.MANAGER.MANAGER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>manager_id IN (values)</code>
     */
    public List<jooq.generated.tables.pojos.Manager> fetchByManagerId(Long... values) {
        return fetch(Manager.MANAGER.MANAGER_ID, values);
    }

    /**
     * Fetch a unique record that has <code>manager_id = value</code>
     */
    public jooq.generated.tables.pojos.Manager fetchOneByManagerId(Long value) {
        return fetchOne(Manager.MANAGER.MANAGER_ID, value);
    }

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<jooq.generated.tables.pojos.Manager> fetchRangeOfName(String lowerInclusive, String upperInclusive) {
        return fetchRange(Manager.MANAGER.NAME, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.generated.tables.pojos.Manager> fetchByName(String... values) {
        return fetch(Manager.MANAGER.NAME, values);
    }
}
