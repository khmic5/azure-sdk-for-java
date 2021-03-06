// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains stats associated with the peering. */
@Fluent
public final class ExpressRouteCircuitStatsInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCircuitStatsInner.class);

    /*
     * Gets BytesIn of the peering.
     */
    @JsonProperty(value = "primarybytesIn")
    private Long primarybytesIn;

    /*
     * Gets BytesOut of the peering.
     */
    @JsonProperty(value = "primarybytesOut")
    private Long primarybytesOut;

    /*
     * Gets BytesIn of the peering.
     */
    @JsonProperty(value = "secondarybytesIn")
    private Long secondarybytesIn;

    /*
     * Gets BytesOut of the peering.
     */
    @JsonProperty(value = "secondarybytesOut")
    private Long secondarybytesOut;

    /**
     * Get the primarybytesIn property: Gets BytesIn of the peering.
     *
     * @return the primarybytesIn value.
     */
    public Long primarybytesIn() {
        return this.primarybytesIn;
    }

    /**
     * Set the primarybytesIn property: Gets BytesIn of the peering.
     *
     * @param primarybytesIn the primarybytesIn value to set.
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withPrimarybytesIn(Long primarybytesIn) {
        this.primarybytesIn = primarybytesIn;
        return this;
    }

    /**
     * Get the primarybytesOut property: Gets BytesOut of the peering.
     *
     * @return the primarybytesOut value.
     */
    public Long primarybytesOut() {
        return this.primarybytesOut;
    }

    /**
     * Set the primarybytesOut property: Gets BytesOut of the peering.
     *
     * @param primarybytesOut the primarybytesOut value to set.
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withPrimarybytesOut(Long primarybytesOut) {
        this.primarybytesOut = primarybytesOut;
        return this;
    }

    /**
     * Get the secondarybytesIn property: Gets BytesIn of the peering.
     *
     * @return the secondarybytesIn value.
     */
    public Long secondarybytesIn() {
        return this.secondarybytesIn;
    }

    /**
     * Set the secondarybytesIn property: Gets BytesIn of the peering.
     *
     * @param secondarybytesIn the secondarybytesIn value to set.
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withSecondarybytesIn(Long secondarybytesIn) {
        this.secondarybytesIn = secondarybytesIn;
        return this;
    }

    /**
     * Get the secondarybytesOut property: Gets BytesOut of the peering.
     *
     * @return the secondarybytesOut value.
     */
    public Long secondarybytesOut() {
        return this.secondarybytesOut;
    }

    /**
     * Set the secondarybytesOut property: Gets BytesOut of the peering.
     *
     * @param secondarybytesOut the secondarybytesOut value to set.
     * @return the ExpressRouteCircuitStatsInner object itself.
     */
    public ExpressRouteCircuitStatsInner withSecondarybytesOut(Long secondarybytesOut) {
        this.secondarybytesOut = secondarybytesOut;
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
