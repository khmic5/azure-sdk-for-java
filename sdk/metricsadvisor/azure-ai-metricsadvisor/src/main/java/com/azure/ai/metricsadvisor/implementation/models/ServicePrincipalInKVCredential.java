// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The ServicePrincipalInKVCredential model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "dataSourceCredentialType")
@JsonTypeName("ServicePrincipalInKV")
@Fluent
public final class ServicePrincipalInKVCredential extends DataSourceCredential {
    /*
     * The parameters property.
     */
    @JsonProperty(value = "parameters")
    private ServicePrincipalInKVParam parameters;

    /**
     * Get the parameters property: The parameters property.
     *
     * @return the parameters value.
     */
    public ServicePrincipalInKVParam getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     *
     * @param parameters the parameters value to set.
     * @return the ServicePrincipalInKVCredential object itself.
     */
    public ServicePrincipalInKVCredential setParameters(ServicePrincipalInKVParam parameters) {
        this.parameters = parameters;
        return this;
    }
}