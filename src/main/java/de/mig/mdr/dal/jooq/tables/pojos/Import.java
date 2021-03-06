/*
 * This file is generated by jOOQ.
 */
package de.mig.mdr.dal.jooq.tables.pojos;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.annotation.processing.Generated;


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
public class Import implements Serializable {

    private static final long serialVersionUID = -701147791;

    private Integer       id;
    private LocalDateTime createdAt;
    private Integer       createdBy;
    private Integer       namespaceId;
    private String        source;
    private String        label;
    private UUID          uuid;
    private LocalDateTime convertedAt;

    public Import() {}

    public Import(Import value) {
        this.id = value.id;
        this.createdAt = value.createdAt;
        this.createdBy = value.createdBy;
        this.namespaceId = value.namespaceId;
        this.source = value.source;
        this.label = value.label;
        this.uuid = value.uuid;
        this.convertedAt = value.convertedAt;
    }

    public Import(
        Integer       id,
        LocalDateTime createdAt,
        Integer       createdBy,
        Integer       namespaceId,
        String        source,
        String        label,
        UUID          uuid,
        LocalDateTime convertedAt
    ) {
        this.id = id;
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.namespaceId = namespaceId;
        this.source = source;
        this.label = label;
        this.uuid = uuid;
        this.convertedAt = convertedAt;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getNamespaceId() {
        return this.namespaceId;
    }

    public void setNamespaceId(Integer namespaceId) {
        this.namespaceId = namespaceId;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public LocalDateTime getConvertedAt() {
        return this.convertedAt;
    }

    public void setConvertedAt(LocalDateTime convertedAt) {
        this.convertedAt = convertedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Import (");

        sb.append(id);
        sb.append(", ").append(createdAt);
        sb.append(", ").append(createdBy);
        sb.append(", ").append(namespaceId);
        sb.append(", ").append(source);
        sb.append(", ").append(label);
        sb.append(", ").append(uuid);
        sb.append(", ").append(convertedAt);

        sb.append(")");
        return sb.toString();
    }
}
