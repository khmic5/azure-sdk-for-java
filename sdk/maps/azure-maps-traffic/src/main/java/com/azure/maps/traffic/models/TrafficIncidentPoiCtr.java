// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Top right coordinate of the cluster in the projection of the request. */
@Immutable
public final class TrafficIncidentPoiCtr {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TrafficIncidentPoiCtr.class);

    /*
     * x coordinate
     */
    @JsonProperty(value = "x", access = JsonProperty.Access.WRITE_ONLY)
    private Float x;

    /*
     * y coordinate
     */
    @JsonProperty(value = "y", access = JsonProperty.Access.WRITE_ONLY)
    private Float y;

    /**
     * Get the x property: x coordinate.
     *
     * @return the x value.
     */
    public Float x() {
        return this.x;
    }

    /**
     * Get the y property: y coordinate.
     *
     * @return the y value.
     */
    public Float y() {
        return this.y;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
