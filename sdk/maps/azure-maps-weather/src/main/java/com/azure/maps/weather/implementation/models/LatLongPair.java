// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A location represented as a latitude and longitude. */
@Fluent
public final class LatLongPair {
    /*
     * Latitude property
     */
    @JsonProperty(value = "latitude")
    private Double latitude;

    /*
     * Longitude property
     */
    @JsonProperty(value = "longitude")
    private Double longitude;

    /**
     * Get the latitude property: Latitude property.
     *
     * @return the latitude value.
     */
    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * Set the latitude property: Latitude property.
     *
     * @param latitude the latitude value to set.
     * @return the LatLongPair object itself.
     */
    public LatLongPair setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    /**
     * Get the longitude property: Longitude property.
     *
     * @return the longitude value.
     */
    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * Set the longitude property: Longitude property.
     *
     * @param longitude the longitude value to set.
     * @return the LatLongPair object itself.
     */
    public LatLongPair setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }
}
