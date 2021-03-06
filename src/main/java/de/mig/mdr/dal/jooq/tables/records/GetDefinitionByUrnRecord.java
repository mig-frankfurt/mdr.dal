/*
 * This file is generated by jOOQ.
 */
package de.mig.mdr.dal.jooq.tables.records;


import de.mig.mdr.dal.jooq.tables.GetDefinitionByUrn;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


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
public class GetDefinitionByUrnRecord extends TableRecordImpl<GetDefinitionByUrnRecord> implements Record6<Integer, Integer, String, String, String, Integer> {

    private static final long serialVersionUID = 1220200093;

    /**
     * Setter for <code>public.get_definition_by_urn.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.get_definition_by_urn.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.get_definition_by_urn.scoped_identifier_id</code>.
     */
    public void setScopedIdentifierId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.get_definition_by_urn.scoped_identifier_id</code>.
     */
    public Integer getScopedIdentifierId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.get_definition_by_urn.designation</code>.
     */
    public void setDesignation(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.get_definition_by_urn.designation</code>.
     */
    public String getDesignation() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.get_definition_by_urn.definition</code>.
     */
    public void setDefinition(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.get_definition_by_urn.definition</code>.
     */
    public String getDefinition() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.get_definition_by_urn.language</code>.
     */
    public void setLanguage(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.get_definition_by_urn.language</code>.
     */
    public String getLanguage() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.get_definition_by_urn.element_id</code>.
     */
    public void setElementId(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.get_definition_by_urn.element_id</code>.
     */
    public Integer getElementId() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Integer, Integer, String, String, String, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Integer, Integer, String, String, String, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return GetDefinitionByUrn.GET_DEFINITION_BY_URN.ID;
    }

    @Override
    public Field<Integer> field2() {
        return GetDefinitionByUrn.GET_DEFINITION_BY_URN.SCOPED_IDENTIFIER_ID;
    }

    @Override
    public Field<String> field3() {
        return GetDefinitionByUrn.GET_DEFINITION_BY_URN.DESIGNATION;
    }

    @Override
    public Field<String> field4() {
        return GetDefinitionByUrn.GET_DEFINITION_BY_URN.DEFINITION;
    }

    @Override
    public Field<String> field5() {
        return GetDefinitionByUrn.GET_DEFINITION_BY_URN.LANGUAGE;
    }

    @Override
    public Field<Integer> field6() {
        return GetDefinitionByUrn.GET_DEFINITION_BY_URN.ELEMENT_ID;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Integer component2() {
        return getScopedIdentifierId();
    }

    @Override
    public String component3() {
        return getDesignation();
    }

    @Override
    public String component4() {
        return getDefinition();
    }

    @Override
    public String component5() {
        return getLanguage();
    }

    @Override
    public Integer component6() {
        return getElementId();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Integer value2() {
        return getScopedIdentifierId();
    }

    @Override
    public String value3() {
        return getDesignation();
    }

    @Override
    public String value4() {
        return getDefinition();
    }

    @Override
    public String value5() {
        return getLanguage();
    }

    @Override
    public Integer value6() {
        return getElementId();
    }

    @Override
    public GetDefinitionByUrnRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public GetDefinitionByUrnRecord value2(Integer value) {
        setScopedIdentifierId(value);
        return this;
    }

    @Override
    public GetDefinitionByUrnRecord value3(String value) {
        setDesignation(value);
        return this;
    }

    @Override
    public GetDefinitionByUrnRecord value4(String value) {
        setDefinition(value);
        return this;
    }

    @Override
    public GetDefinitionByUrnRecord value5(String value) {
        setLanguage(value);
        return this;
    }

    @Override
    public GetDefinitionByUrnRecord value6(Integer value) {
        setElementId(value);
        return this;
    }

    @Override
    public GetDefinitionByUrnRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GetDefinitionByUrnRecord
     */
    public GetDefinitionByUrnRecord() {
        super(GetDefinitionByUrn.GET_DEFINITION_BY_URN);
    }

    /**
     * Create a detached, initialised GetDefinitionByUrnRecord
     */
    public GetDefinitionByUrnRecord(Integer id, Integer scopedIdentifierId, String designation, String definition, String language, Integer elementId) {
        super(GetDefinitionByUrn.GET_DEFINITION_BY_URN);

        set(0, id);
        set(1, scopedIdentifierId);
        set(2, designation);
        set(3, definition);
        set(4, language);
        set(5, elementId);
    }
}
