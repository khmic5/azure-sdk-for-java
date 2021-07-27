// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Top right coordinate of the cluster in the projection of the request. */
@Immutable
public final class TrafficIncidentPoiCtr {
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
    public Float getX() {
        return this.x;
    }

    /**
     * Get the y property: y coordinate.
     *
     * @return the y value.
     */
    public Float getY() {
        return this.y;
    }
}
