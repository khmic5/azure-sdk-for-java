// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Salesforce Service Cloud object dataset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("SalesforceServiceCloudObject")
@JsonFlatten
@Fluent
public class SalesforceServiceCloudObjectDataset extends Dataset {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SalesforceServiceCloudObjectDataset.class);

    /*
     * The Salesforce Service Cloud object API name. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.objectApiName")
    private Object objectApiName;

    /**
     * Get the objectApiName property: The Salesforce Service Cloud object API name. Type: string (or Expression with
     * resultType string).
     *
     * @return the objectApiName value.
     */
    public Object objectApiName() {
        return this.objectApiName;
    }

    /**
     * Set the objectApiName property: The Salesforce Service Cloud object API name. Type: string (or Expression with
     * resultType string).
     *
     * @param objectApiName the objectApiName value to set.
     * @return the SalesforceServiceCloudObjectDataset object itself.
     */
    public SalesforceServiceCloudObjectDataset withObjectApiName(Object objectApiName) {
        this.objectApiName = objectApiName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SalesforceServiceCloudObjectDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}