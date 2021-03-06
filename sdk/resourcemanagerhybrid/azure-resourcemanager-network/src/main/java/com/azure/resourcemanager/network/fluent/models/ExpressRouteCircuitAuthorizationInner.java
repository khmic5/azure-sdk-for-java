// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.AuthorizationUseStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authorization in an ExpressRouteCircuit resource. */
@Fluent
public final class ExpressRouteCircuitAuthorizationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitAuthorizationInner.class);

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private AuthorizationPropertiesFormat innerProperties;

    /*
     * Gets name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: The properties property.
     *
     * @return the innerProperties value.
     */
    private AuthorizationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteCircuitAuthorizationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the authorizationKey property: The authorization key.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationKey();
    }

    /**
     * Set the authorizationKey property: The authorization key.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationKey(String authorizationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationPropertiesFormat();
        }
        this.innerProperties().withAuthorizationKey(authorizationKey);
        return this;
    }

    /**
     * Get the authorizationUseStatus property: AuthorizationUseStatus. Possible values are: 'Available' and 'InUse'.
     *
     * @return the authorizationUseStatus value.
     */
    public AuthorizationUseStatus authorizationUseStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationUseStatus();
    }

    /**
     * Set the authorizationUseStatus property: AuthorizationUseStatus. Possible values are: 'Available' and 'InUse'.
     *
     * @param authorizationUseStatus the authorizationUseStatus value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withAuthorizationUseStatus(
        AuthorizationUseStatus authorizationUseStatus) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationPropertiesFormat();
        }
        this.innerProperties().withAuthorizationUseStatus(authorizationUseStatus);
        return this;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: Gets the provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ExpressRouteCircuitAuthorizationInner object itself.
     */
    public ExpressRouteCircuitAuthorizationInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AuthorizationPropertiesFormat();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
