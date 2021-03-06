/*
 * This file is generated by jOOQ.
 */
package de.mig.mdr.dal.jooq.tables.pojos;


import java.io.Serializable;

import javax.annotation.processing.Generated;

import org.jooq.JSON;


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
public class Config implements Serializable {

    private static final long serialVersionUID = -957293535;

    private Integer id;
    private String  name;
    private JSON    value;

    public Config() {}

    public Config(Config value) {
        this.id = value.id;
        this.name = value.name;
        this.value = value.value;
    }

    public Config(
        Integer id,
        String  name,
        JSON    value
    ) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JSON getValue() {
        return this.value;
    }

    public void setValue(JSON value) {
        this.value = value;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Config (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(value);

        sb.append(")");
        return sb.toString();
    }
}
