// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.models.AdministratorType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.UUID;

/** The ServerAzureADAdministrator model. */
@JsonFlatten
@Fluent
public class ServerAzureADAdministratorInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerAzureADAdministratorInner.class);

    /*
     * Type of the sever administrator.
     */
    @JsonProperty(value = "properties.administratorType")
    private AdministratorType administratorType;

    /*
     * Login name of the server administrator.
     */
    @JsonProperty(value = "properties.login")
    private String login;

    /*
     * SID (object ID) of the server administrator.
     */
    @JsonProperty(value = "properties.sid")
    private UUID sid;

    /*
     * Tenant ID of the administrator.
     */
    @JsonProperty(value = "properties.tenantId")
    private UUID tenantId;

    /*
     * Azure Active Directory only Authentication enabled.
     */
    @JsonProperty(value = "properties.azureADOnlyAuthentication")
    private Boolean azureADOnlyAuthentication;

    /**
     * Get the administratorType property: Type of the sever administrator.
     *
     * @return the administratorType value.
     */
    public AdministratorType administratorType() {
        return this.administratorType;
    }

    /**
     * Set the administratorType property: Type of the sever administrator.
     *
     * @param administratorType the administratorType value to set.
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withAdministratorType(AdministratorType administratorType) {
        this.administratorType = administratorType;
        return this;
    }

    /**
     * Get the login property: Login name of the server administrator.
     *
     * @return the login value.
     */
    public String login() {
        return this.login;
    }

    /**
     * Set the login property: Login name of the server administrator.
     *
     * @param login the login value to set.
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withLogin(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get the sid property: SID (object ID) of the server administrator.
     *
     * @return the sid value.
     */
    public UUID sid() {
        return this.sid;
    }

    /**
     * Set the sid property: SID (object ID) of the server administrator.
     *
     * @param sid the sid value to set.
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withSid(UUID sid) {
        this.sid = sid;
        return this;
    }

    /**
     * Get the tenantId property: Tenant ID of the administrator.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant ID of the administrator.
     *
     * @param tenantId the tenantId value to set.
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @return the azureADOnlyAuthentication value.
     */
    public Boolean azureADOnlyAuthentication() {
        return this.azureADOnlyAuthentication;
    }

    /**
     * Set the azureADOnlyAuthentication property: Azure Active Directory only Authentication enabled.
     *
     * @param azureADOnlyAuthentication the azureADOnlyAuthentication value to set.
     * @return the ServerAzureADAdministratorInner object itself.
     */
    public ServerAzureADAdministratorInner withAzureADOnlyAuthentication(Boolean azureADOnlyAuthentication) {
        this.azureADOnlyAuthentication = azureADOnlyAuthentication;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
