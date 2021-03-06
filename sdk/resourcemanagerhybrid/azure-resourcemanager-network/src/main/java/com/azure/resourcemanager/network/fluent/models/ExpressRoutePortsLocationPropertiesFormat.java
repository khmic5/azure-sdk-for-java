// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ExpressRoutePortsLocationBandwidths;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ExpressRoutePorts Location Properties Properties specific to ExpressRoutePorts peering location resources. */
@Fluent
public final class ExpressRoutePortsLocationPropertiesFormat {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRoutePortsLocationPropertiesFormat.class);

    /*
     * Address of peering location.
     */
    @JsonProperty(value = "address", access = JsonProperty.Access.WRITE_ONLY)
    private String address;

    /*
     * Contact details of peering locations.
     */
    @JsonProperty(value = "contact", access = JsonProperty.Access.WRITE_ONLY)
    private String contact;

    /*
     * The inventory of available ExpressRoutePort bandwidths.
     */
    @JsonProperty(value = "availableBandwidths")
    private List<ExpressRoutePortsLocationBandwidths> availableBandwidths;

    /*
     * The provisioning state of the ExpressRoutePortLocation resource.
     * Possible values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the address property: Address of peering location.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Get the contact property: Contact details of peering locations.
     *
     * @return the contact value.
     */
    public String contact() {
        return this.contact;
    }

    /**
     * Get the availableBandwidths property: The inventory of available ExpressRoutePort bandwidths.
     *
     * @return the availableBandwidths value.
     */
    public List<ExpressRoutePortsLocationBandwidths> availableBandwidths() {
        return this.availableBandwidths;
    }

    /**
     * Set the availableBandwidths property: The inventory of available ExpressRoutePort bandwidths.
     *
     * @param availableBandwidths the availableBandwidths value to set.
     * @return the ExpressRoutePortsLocationPropertiesFormat object itself.
     */
    public ExpressRoutePortsLocationPropertiesFormat withAvailableBandwidths(
        List<ExpressRoutePortsLocationBandwidths> availableBandwidths) {
        this.availableBandwidths = availableBandwidths;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the ExpressRoutePortLocation resource. Possible
     * values are: 'Succeeded', 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (availableBandwidths() != null) {
            availableBandwidths().forEach(e -> e.validate());
        }
    }
}
