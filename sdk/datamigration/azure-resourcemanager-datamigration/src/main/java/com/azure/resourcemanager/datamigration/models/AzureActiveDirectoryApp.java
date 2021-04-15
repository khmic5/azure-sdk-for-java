// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Active Directory Application. */
@Fluent
public final class AzureActiveDirectoryApp {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureActiveDirectoryApp.class);

    /*
     * Application ID of the Azure Active Directory Application
     */
    @JsonProperty(value = "applicationId", required = true)
    private String applicationId;

    /*
     * Key used to authenticate to the Azure Active Directory Application
     */
    @JsonProperty(value = "appKey", required = true)
    private String appKey;

    /*
     * Tenant id of the customer
     */
    @JsonProperty(value = "tenantId", required = true)
    private String tenantId;

    /**
     * Get the applicationId property: Application ID of the Azure Active Directory Application.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: Application ID of the Azure Active Directory Application.
     *
     * @param applicationId the applicationId value to set.
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the appKey property: Key used to authenticate to the Azure Active Directory Application.
     *
     * @return the appKey value.
     */
    public String appKey() {
        return this.appKey;
    }

    /**
     * Set the appKey property: Key used to authenticate to the Azure Active Directory Application.
     *
     * @param appKey the appKey value to set.
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * Get the tenantId property: Tenant id of the customer.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant id of the customer.
     *
     * @param tenantId the tenantId value to set.
     * @return the AzureActiveDirectoryApp object itself.
     */
    public AzureActiveDirectoryApp withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (applicationId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property applicationId in model AzureActiveDirectoryApp"));
        }
        if (appKey() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property appKey in model AzureActiveDirectoryApp"));
        }
        if (tenantId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property tenantId in model AzureActiveDirectoryApp"));
        }
    }
}