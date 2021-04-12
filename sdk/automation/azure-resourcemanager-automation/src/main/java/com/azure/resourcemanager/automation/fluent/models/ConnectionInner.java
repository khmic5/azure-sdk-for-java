// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.ConnectionTypeAssociationProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Definition of the connection. */
@JsonFlatten
@Fluent
public class ConnectionInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionInner.class);

    /*
     * Gets or sets the connectionType of the connection.
     */
    @JsonProperty(value = "properties.connectionType")
    private ConnectionTypeAssociationProperty connectionType;

    /*
     * Gets the field definition values of the connection.
     */
    @JsonProperty(value = "properties.fieldDefinitionValues", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, String> fieldDefinitionValues;

    /*
     * Gets the creation time.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Gets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the connectionType property: Gets or sets the connectionType of the connection.
     *
     * @return the connectionType value.
     */
    public ConnectionTypeAssociationProperty connectionType() {
        return this.connectionType;
    }

    /**
     * Set the connectionType property: Gets or sets the connectionType of the connection.
     *
     * @param connectionType the connectionType value to set.
     * @return the ConnectionInner object itself.
     */
    public ConnectionInner withConnectionType(ConnectionTypeAssociationProperty connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    /**
     * Get the fieldDefinitionValues property: Gets the field definition values of the connection.
     *
     * @return the fieldDefinitionValues value.
     */
    public Map<String, String> fieldDefinitionValues() {
        return this.fieldDefinitionValues;
    }

    /**
     * Get the creationTime property: Gets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Gets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the ConnectionInner object itself.
     */
    public ConnectionInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connectionType() != null) {
            connectionType().validate();
        }
    }
}