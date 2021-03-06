// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VnetParameters resource specific properties. */
@Fluent
public final class VnetParametersProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VnetParametersProperties.class);

    /*
     * The Resource Group of the VNET to be validated
     */
    @JsonProperty(value = "vnetResourceGroup")
    private String vnetResourceGroup;

    /*
     * The name of the VNET to be validated
     */
    @JsonProperty(value = "vnetName")
    private String vnetName;

    /*
     * The subnet name to be validated
     */
    @JsonProperty(value = "vnetSubnetName")
    private String vnetSubnetName;

    /**
     * Get the vnetResourceGroup property: The Resource Group of the VNET to be validated.
     *
     * @return the vnetResourceGroup value.
     */
    public String vnetResourceGroup() {
        return this.vnetResourceGroup;
    }

    /**
     * Set the vnetResourceGroup property: The Resource Group of the VNET to be validated.
     *
     * @param vnetResourceGroup the vnetResourceGroup value to set.
     * @return the VnetParametersProperties object itself.
     */
    public VnetParametersProperties withVnetResourceGroup(String vnetResourceGroup) {
        this.vnetResourceGroup = vnetResourceGroup;
        return this;
    }

    /**
     * Get the vnetName property: The name of the VNET to be validated.
     *
     * @return the vnetName value.
     */
    public String vnetName() {
        return this.vnetName;
    }

    /**
     * Set the vnetName property: The name of the VNET to be validated.
     *
     * @param vnetName the vnetName value to set.
     * @return the VnetParametersProperties object itself.
     */
    public VnetParametersProperties withVnetName(String vnetName) {
        this.vnetName = vnetName;
        return this;
    }

    /**
     * Get the vnetSubnetName property: The subnet name to be validated.
     *
     * @return the vnetSubnetName value.
     */
    public String vnetSubnetName() {
        return this.vnetSubnetName;
    }

    /**
     * Set the vnetSubnetName property: The subnet name to be validated.
     *
     * @param vnetSubnetName the vnetSubnetName value to set.
     * @return the VnetParametersProperties object itself.
     */
    public VnetParametersProperties withVnetSubnetName(String vnetSubnetName) {
        this.vnetSubnetName = vnetSubnetName;
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
