// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingProperties;
import com.azure.resourcemanager.customerinsights.models.ConnectorMappingStates;
import com.azure.resourcemanager.customerinsights.models.ConnectorTypes;
import com.azure.resourcemanager.customerinsights.models.EntityTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The connector mapping resource format. */
@JsonFlatten
@Fluent
public class ConnectorMappingResourceFormatInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectorMappingResourceFormatInner.class);

    /*
     * The connector name.
     */
    @JsonProperty(value = "properties.connectorName", access = JsonProperty.Access.WRITE_ONLY)
    private String connectorName;

    /*
     * Type of connector.
     */
    @JsonProperty(value = "properties.connectorType")
    private ConnectorTypes connectorType;

    /*
     * The created time.
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The last modified time.
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * Defines which entity type the file should map to.
     */
    @JsonProperty(value = "properties.entityType")
    private EntityTypes entityType;

    /*
     * The mapping entity name.
     */
    @JsonProperty(value = "properties.entityTypeName")
    private String entityTypeName;

    /*
     * The connector mapping name
     */
    @JsonProperty(value = "properties.connectorMappingName", access = JsonProperty.Access.WRITE_ONLY)
    private String connectorMappingName;

    /*
     * Display name for the connector mapping.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * The description of the connector mapping.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The DataFormat ID.
     */
    @JsonProperty(value = "properties.dataFormatId", access = JsonProperty.Access.WRITE_ONLY)
    private String dataFormatId;

    /*
     * The properties of the mapping.
     */
    @JsonProperty(value = "properties.mappingProperties")
    private ConnectorMappingProperties mappingProperties;

    /*
     * The next run time based on customer's settings.
     */
    @JsonProperty(value = "properties.nextRunTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime nextRunTime;

    /*
     * The RunId.
     */
    @JsonProperty(value = "properties.runId", access = JsonProperty.Access.WRITE_ONLY)
    private String runId;

    /*
     * State of connector mapping.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ConnectorMappingStates state;

    /*
     * The hub name.
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Get the connectorName property: The connector name.
     *
     * @return the connectorName value.
     */
    public String connectorName() {
        return this.connectorName;
    }

    /**
     * Get the connectorType property: Type of connector.
     *
     * @return the connectorType value.
     */
    public ConnectorTypes connectorType() {
        return this.connectorType;
    }

    /**
     * Set the connectorType property: Type of connector.
     *
     * @param connectorType the connectorType value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withConnectorType(ConnectorTypes connectorType) {
        this.connectorType = connectorType;
        return this;
    }

    /**
     * Get the created property: The created time.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified property: The last modified time.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the entityType property: Defines which entity type the file should map to.
     *
     * @return the entityType value.
     */
    public EntityTypes entityType() {
        return this.entityType;
    }

    /**
     * Set the entityType property: Defines which entity type the file should map to.
     *
     * @param entityType the entityType value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withEntityType(EntityTypes entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Get the entityTypeName property: The mapping entity name.
     *
     * @return the entityTypeName value.
     */
    public String entityTypeName() {
        return this.entityTypeName;
    }

    /**
     * Set the entityTypeName property: The mapping entity name.
     *
     * @param entityTypeName the entityTypeName value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withEntityTypeName(String entityTypeName) {
        this.entityTypeName = entityTypeName;
        return this;
    }

    /**
     * Get the connectorMappingName property: The connector mapping name.
     *
     * @return the connectorMappingName value.
     */
    public String connectorMappingName() {
        return this.connectorMappingName;
    }

    /**
     * Get the displayName property: Display name for the connector mapping.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name for the connector mapping.
     *
     * @param displayName the displayName value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: The description of the connector mapping.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the connector mapping.
     *
     * @param description the description value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the dataFormatId property: The DataFormat ID.
     *
     * @return the dataFormatId value.
     */
    public String dataFormatId() {
        return this.dataFormatId;
    }

    /**
     * Get the mappingProperties property: The properties of the mapping.
     *
     * @return the mappingProperties value.
     */
    public ConnectorMappingProperties mappingProperties() {
        return this.mappingProperties;
    }

    /**
     * Set the mappingProperties property: The properties of the mapping.
     *
     * @param mappingProperties the mappingProperties value to set.
     * @return the ConnectorMappingResourceFormatInner object itself.
     */
    public ConnectorMappingResourceFormatInner withMappingProperties(ConnectorMappingProperties mappingProperties) {
        this.mappingProperties = mappingProperties;
        return this;
    }

    /**
     * Get the nextRunTime property: The next run time based on customer's settings.
     *
     * @return the nextRunTime value.
     */
    public OffsetDateTime nextRunTime() {
        return this.nextRunTime;
    }

    /**
     * Get the runId property: The RunId.
     *
     * @return the runId value.
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Get the state property: State of connector mapping.
     *
     * @return the state value.
     */
    public ConnectorMappingStates state() {
        return this.state;
    }

    /**
     * Get the tenantId property: The hub name.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mappingProperties() != null) {
            mappingProperties().validate();
        }
    }
}