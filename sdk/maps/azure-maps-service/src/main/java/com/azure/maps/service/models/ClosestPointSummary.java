// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Closest Point Summary object. */
@Fluent
public final class ClosestPointSummary {
    /*
     * A location represented as a latitude and longitude
     */
    @JsonProperty(value = "sourcePoint")
    private SpatialCoordinate sourcePoint;

    /*
     * A unique data id (udid) for the uploaded content
     */
    @JsonProperty(value = "udid", access = JsonProperty.Access.WRITE_ONLY)
    private String udid;

    /*
     * Processing information
     */
    @JsonProperty(value = "information", access = JsonProperty.Access.WRITE_ONLY)
    private String information;

    /**
     * Get the sourcePoint property: A location represented as a latitude and longitude.
     *
     * @return the sourcePoint value.
     */
    public SpatialCoordinate getSourcePoint() {
        return this.sourcePoint;
    }

    /**
     * Set the sourcePoint property: A location represented as a latitude and longitude.
     *
     * @param sourcePoint the sourcePoint value to set.
     * @return the ClosestPointSummary object itself.
     */
    public ClosestPointSummary setSourcePoint(SpatialCoordinate sourcePoint) {
        this.sourcePoint = sourcePoint;
        return this;
    }

    /**
     * Get the udid property: A unique data id (udid) for the uploaded content.
     *
     * @return the udid value.
     */
    public String getUdid() {
        return this.udid;
    }

    /**
     * Get the information property: Processing information.
     *
     * @return the information value.
     */
    public String getInformation() {
        return this.information;
    }
}
