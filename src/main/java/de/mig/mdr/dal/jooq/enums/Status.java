/*
 * This file is generated by jOOQ.
 */
package de.mig.mdr.dal.jooq.enums;


import de.mig.mdr.dal.jooq.Public;

import javax.annotation.processing.Generated;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


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
public enum Status implements EnumType {

    DRAFT("DRAFT"),

    RELEASED("RELEASED"),

    OUTDATED("OUTDATED"),

    STAGED("STAGED");

    private final String literal;

    private Status(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public String getName() {
        return "status";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}