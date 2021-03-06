/*
 * This file is generated by jOOQ.
 */
package de.mig.mdr.dal.jooq;


import de.mig.mdr.dal.jooq.tables.ConceptElementAssociations;
import de.mig.mdr.dal.jooq.tables.Concepts;
import de.mig.mdr.dal.jooq.tables.Config;
import de.mig.mdr.dal.jooq.tables.Definition;
import de.mig.mdr.dal.jooq.tables.Element;
import de.mig.mdr.dal.jooq.tables.GetDefinitionByUrn;
import de.mig.mdr.dal.jooq.tables.GetSlotByUrn;
import de.mig.mdr.dal.jooq.tables.GetValueDomainByUrn;
import de.mig.mdr.dal.jooq.tables.Hierarchy;
import de.mig.mdr.dal.jooq.tables.IdentifiedElement;
import de.mig.mdr.dal.jooq.tables.Import;
import de.mig.mdr.dal.jooq.tables.MdrUser;
import de.mig.mdr.dal.jooq.tables.PermissibleCode;
import de.mig.mdr.dal.jooq.tables.ScopedIdentifier;
import de.mig.mdr.dal.jooq.tables.ScopedIdentifierHierarchy;
import de.mig.mdr.dal.jooq.tables.ScopedIdentifierRelation;
import de.mig.mdr.dal.jooq.tables.Slot;
import de.mig.mdr.dal.jooq.tables.Source;
import de.mig.mdr.dal.jooq.tables.Staging;
import de.mig.mdr.dal.jooq.tables.UserNamespaceGrants;
import de.mig.mdr.dal.jooq.tables.UserSourceCredentials;
import de.mig.mdr.dal.jooq.tables.records.GetDefinitionByUrnRecord;
import de.mig.mdr.dal.jooq.tables.records.GetSlotByUrnRecord;
import de.mig.mdr.dal.jooq.tables.records.GetValueDomainByUrnRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.Configuration;
import org.jooq.Field;
import org.jooq.Result;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 533439000;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.concept_element_associations</code>.
     */
    public final ConceptElementAssociations CONCEPT_ELEMENT_ASSOCIATIONS = ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS;

    /**
     * The table <code>public.concepts</code>.
     */
    public final Concepts CONCEPTS = Concepts.CONCEPTS;

    /**
     * The table <code>public.config</code>.
     */
    public final Config CONFIG = Config.CONFIG;

    /**
     * The table <code>public.definition</code>.
     */
    public final Definition DEFINITION = Definition.DEFINITION;

    /**
     * The table <code>public.element</code>.
     */
    public final Element ELEMENT = Element.ELEMENT;

    /**
     * The table <code>public.get_definition_by_urn</code>.
     */
    public final GetDefinitionByUrn GET_DEFINITION_BY_URN = GetDefinitionByUrn.GET_DEFINITION_BY_URN;

    /**
     * Call <code>public.get_definition_by_urn</code>.
     */
    public static Result<GetDefinitionByUrnRecord> GET_DEFINITION_BY_URN(Configuration configuration, String urn) {
        return configuration.dsl().selectFrom(de.mig.mdr.dal.jooq.tables.GetDefinitionByUrn.GET_DEFINITION_BY_URN.call(urn)).fetch();
    }

    /**
     * Get <code>public.get_definition_by_urn</code> as a table.
     */
    public static GetDefinitionByUrn GET_DEFINITION_BY_URN(String urn) {
        return de.mig.mdr.dal.jooq.tables.GetDefinitionByUrn.GET_DEFINITION_BY_URN.call(urn);
    }

    /**
     * Get <code>public.get_definition_by_urn</code> as a table.
     */
    public static GetDefinitionByUrn GET_DEFINITION_BY_URN(Field<String> urn) {
        return de.mig.mdr.dal.jooq.tables.GetDefinitionByUrn.GET_DEFINITION_BY_URN.call(urn);
    }

    /**
     * The table <code>public.get_slot_by_urn</code>.
     */
    public final GetSlotByUrn GET_SLOT_BY_URN = GetSlotByUrn.GET_SLOT_BY_URN;

    /**
     * Call <code>public.get_slot_by_urn</code>.
     */
    public static Result<GetSlotByUrnRecord> GET_SLOT_BY_URN(Configuration configuration, String urn) {
        return configuration.dsl().selectFrom(de.mig.mdr.dal.jooq.tables.GetSlotByUrn.GET_SLOT_BY_URN.call(urn)).fetch();
    }

    /**
     * Get <code>public.get_slot_by_urn</code> as a table.
     */
    public static GetSlotByUrn GET_SLOT_BY_URN(String urn) {
        return de.mig.mdr.dal.jooq.tables.GetSlotByUrn.GET_SLOT_BY_URN.call(urn);
    }

    /**
     * Get <code>public.get_slot_by_urn</code> as a table.
     */
    public static GetSlotByUrn GET_SLOT_BY_URN(Field<String> urn) {
        return de.mig.mdr.dal.jooq.tables.GetSlotByUrn.GET_SLOT_BY_URN.call(urn);
    }

    /**
     * The table <code>public.get_value_domain_by_urn</code>.
     */
    public final GetValueDomainByUrn GET_VALUE_DOMAIN_BY_URN = GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN;

    /**
     * Call <code>public.get_value_domain_by_urn</code>.
     */
    public static Result<GetValueDomainByUrnRecord> GET_VALUE_DOMAIN_BY_URN(Configuration configuration, String urn) {
        return configuration.dsl().selectFrom(de.mig.mdr.dal.jooq.tables.GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN.call(urn)).fetch();
    }

    /**
     * Get <code>public.get_value_domain_by_urn</code> as a table.
     */
    public static GetValueDomainByUrn GET_VALUE_DOMAIN_BY_URN(String urn) {
        return de.mig.mdr.dal.jooq.tables.GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN.call(urn);
    }

    /**
     * Get <code>public.get_value_domain_by_urn</code> as a table.
     */
    public static GetValueDomainByUrn GET_VALUE_DOMAIN_BY_URN(Field<String> urn) {
        return de.mig.mdr.dal.jooq.tables.GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN.call(urn);
    }

    /**
     * The table <code>public.hierarchy</code>.
     */
    public final Hierarchy HIERARCHY = Hierarchy.HIERARCHY;

    /**
     * The table <code>public.identified_element</code>.
     */
    public final IdentifiedElement IDENTIFIED_ELEMENT = IdentifiedElement.IDENTIFIED_ELEMENT;

    /**
     * The table <code>public.import</code>.
     */
    public final Import IMPORT = Import.IMPORT;

    /**
     * The table <code>public.mdr_user</code>.
     */
    public final MdrUser MDR_USER = MdrUser.MDR_USER;

    /**
     * The table <code>public.permissible_code</code>.
     */
    public final PermissibleCode PERMISSIBLE_CODE = PermissibleCode.PERMISSIBLE_CODE;

    /**
     * The table <code>public.scoped_identifier</code>.
     */
    public final ScopedIdentifier SCOPED_IDENTIFIER = ScopedIdentifier.SCOPED_IDENTIFIER;

    /**
     * The table <code>public.scoped_identifier_hierarchy</code>.
     */
    public final ScopedIdentifierHierarchy SCOPED_IDENTIFIER_HIERARCHY = ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY;

    /**
     * The table <code>public.scoped_identifier_relation</code>.
     */
    public final ScopedIdentifierRelation SCOPED_IDENTIFIER_RELATION = ScopedIdentifierRelation.SCOPED_IDENTIFIER_RELATION;

    /**
     * The table <code>public.slot</code>.
     */
    public final Slot SLOT = Slot.SLOT;

    /**
     * The table <code>public.source</code>.
     */
    public final Source SOURCE = Source.SOURCE;

    /**
     * The table <code>public.staging</code>.
     */
    public final Staging STAGING = Staging.STAGING;

    /**
     * The table <code>public.user_namespace_grants</code>.
     */
    public final UserNamespaceGrants USER_NAMESPACE_GRANTS = UserNamespaceGrants.USER_NAMESPACE_GRANTS;

    /**
     * The table <code>public.user_source_credentials</code>.
     */
    public final UserSourceCredentials USER_SOURCE_CREDENTIALS = UserSourceCredentials.USER_SOURCE_CREDENTIALS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.<Sequence<?>>asList(
            Sequences.CONCEPTS_ID_SEQ,
            Sequences.CONFIG_ID_SEQ,
            Sequences.DEFINITION_ID_SEQ,
            Sequences.ELEMENT_ID_SEQ,
            Sequences.IMPORT_ID_SEQ,
            Sequences.MDR_USER_ID_SEQ,
            Sequences.SCOPED_IDENTIFIER_ID_SEQ,
            Sequences.SLOT_ID_SEQ,
            Sequences.SOURCE_ID_SEQ,
            Sequences.STAGING_ID_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            ConceptElementAssociations.CONCEPT_ELEMENT_ASSOCIATIONS,
            Concepts.CONCEPTS,
            Config.CONFIG,
            Definition.DEFINITION,
            Element.ELEMENT,
            GetDefinitionByUrn.GET_DEFINITION_BY_URN,
            GetSlotByUrn.GET_SLOT_BY_URN,
            GetValueDomainByUrn.GET_VALUE_DOMAIN_BY_URN,
            Hierarchy.HIERARCHY,
            IdentifiedElement.IDENTIFIED_ELEMENT,
            Import.IMPORT,
            MdrUser.MDR_USER,
            PermissibleCode.PERMISSIBLE_CODE,
            ScopedIdentifier.SCOPED_IDENTIFIER,
            ScopedIdentifierHierarchy.SCOPED_IDENTIFIER_HIERARCHY,
            ScopedIdentifierRelation.SCOPED_IDENTIFIER_RELATION,
            Slot.SLOT,
            Source.SOURCE,
            Staging.STAGING,
            UserNamespaceGrants.USER_NAMESPACE_GRANTS,
            UserSourceCredentials.USER_SOURCE_CREDENTIALS);
    }
}
