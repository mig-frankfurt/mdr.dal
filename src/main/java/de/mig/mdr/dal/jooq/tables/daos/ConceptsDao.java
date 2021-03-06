/*
 * This file is generated by jOOQ.
 */
package de.mig.mdr.dal.jooq.tables.daos;


import de.mig.mdr.dal.jooq.tables.Concepts;
import de.mig.mdr.dal.jooq.tables.records.ConceptsRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.13.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConceptsDao extends DAOImpl<ConceptsRecord, de.mig.mdr.dal.jooq.tables.pojos.Concepts, Integer> {

    /**
     * Create a new ConceptsDao without any configuration
     */
    public ConceptsDao() {
        super(Concepts.CONCEPTS, de.mig.mdr.dal.jooq.tables.pojos.Concepts.class);
    }

    /**
     * Create a new ConceptsDao with an attached configuration
     */
    public ConceptsDao(Configuration configuration) {
        super(Concepts.CONCEPTS, de.mig.mdr.dal.jooq.tables.pojos.Concepts.class, configuration);
    }

    @Override
    public Integer getId(de.mig.mdr.dal.jooq.tables.pojos.Concepts object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchRangeOfId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Concepts.CONCEPTS.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchById(Integer... values) {
        return fetch(Concepts.CONCEPTS.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public de.mig.mdr.dal.jooq.tables.pojos.Concepts fetchOneById(Integer value) {
        return fetchOne(Concepts.CONCEPTS.ID, value);
    }

    /**
     * Fetch records that have <code>system BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchRangeOfSystem(String lowerInclusive, String upperInclusive) {
        return fetchRange(Concepts.CONCEPTS.SYSTEM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>system IN (values)</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchBySystem(String... values) {
        return fetch(Concepts.CONCEPTS.SYSTEM, values);
    }

    /**
     * Fetch records that have <code>version BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchRangeOfVersion(String lowerInclusive, String upperInclusive) {
        return fetchRange(Concepts.CONCEPTS.VERSION, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchByVersion(String... values) {
        return fetch(Concepts.CONCEPTS.VERSION, values);
    }

    /**
     * Fetch records that have <code>term BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchRangeOfTerm(String lowerInclusive, String upperInclusive) {
        return fetchRange(Concepts.CONCEPTS.TERM, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>term IN (values)</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchByTerm(String... values) {
        return fetch(Concepts.CONCEPTS.TERM, values);
    }

    /**
     * Fetch records that have <code>text BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchRangeOfText(String lowerInclusive, String upperInclusive) {
        return fetchRange(Concepts.CONCEPTS.TEXT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>text IN (values)</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchByText(String... values) {
        return fetch(Concepts.CONCEPTS.TEXT, values);
    }

    /**
     * Fetch records that have <code>source_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchRangeOfSourceId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Concepts.CONCEPTS.SOURCE_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>source_id IN (values)</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchBySourceId(Integer... values) {
        return fetch(Concepts.CONCEPTS.SOURCE_ID, values);
    }

    /**
     * Fetch records that have <code>created_by BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchRangeOfCreatedBy(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(Concepts.CONCEPTS.CREATED_BY, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchByCreatedBy(Integer... values) {
        return fetch(Concepts.CONCEPTS.CREATED_BY, values);
    }

    /**
     * Fetch records that have <code>created_at BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchRangeOfCreatedAt(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Concepts.CONCEPTS.CREATED_AT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>created_at IN (values)</code>
     */
    public List<de.mig.mdr.dal.jooq.tables.pojos.Concepts> fetchByCreatedAt(LocalDateTime... values) {
        return fetch(Concepts.CONCEPTS.CREATED_AT, values);
    }
}
