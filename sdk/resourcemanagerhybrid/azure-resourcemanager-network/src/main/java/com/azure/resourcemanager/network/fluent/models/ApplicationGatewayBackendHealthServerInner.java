// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendHealthServerHealth;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Application gateway backendhealth http settings. */
@Fluent
public final class ApplicationGatewayBackendHealthServerInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayBackendHealthServerInner.class);

    /*
     * IP address or FQDN of backend server.
     */
    @JsonProperty(value = "address")
    private String address;

    /*
     * Reference of IP configuration of backend server.
     */
    @JsonProperty(value = "ipConfiguration")
    private NetworkInterfaceIpConfigurationInner ipConfiguration;

    /*
     * Health of backend server.
     */
    @JsonProperty(value = "health")
    private ApplicationGatewayBackendHealthServerHealth health;

    /**
     * Get the address property: IP address or FQDN of backend server.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: IP address or FQDN of backend server.
     *
     * @param address the address value to set.
     * @return the ApplicationGatewayBackendHealthServerInner object itself.
     */
    public ApplicationGatewayBackendHealthServerInner withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get the ipConfiguration property: Reference of IP configuration of backend server.
     *
     * @return the ipConfiguration value.
     */
    public NetworkInterfaceIpConfigurationInner ipConfiguration() {
        return this.ipConfiguration;
    }

    /**
     * Set the ipConfiguration property: Reference of IP configuration of backend server.
     *
     * @param ipConfiguration the ipConfiguration value to set.
     * @return the ApplicationGatewayBackendHealthServerInner object itself.
     */
    public ApplicationGatewayBackendHealthServerInner withIpConfiguration(
        NetworkInterfaceIpConfigurationInner ipConfiguration) {
        this.ipConfiguration = ipConfiguration;
        return this;
    }

    /**
     * Get the health property: Health of backend server.
     *
     * @return the health value.
     */
    public ApplicationGatewayBackendHealthServerHealth health() {
        return this.health;
    }

    /**
     * Set the health property: Health of backend server.
     *
     * @param health the health value to set.
     * @return the ApplicationGatewayBackendHealthServerInner object itself.
     */
    public ApplicationGatewayBackendHealthServerInner withHealth(ApplicationGatewayBackendHealthServerHealth health) {
        this.health = health;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipConfiguration() != null) {
            ipConfiguration().validate();
        }
    }
}
