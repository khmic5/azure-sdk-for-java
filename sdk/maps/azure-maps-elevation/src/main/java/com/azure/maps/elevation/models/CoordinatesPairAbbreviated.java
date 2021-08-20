// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.elevation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A location represented as a latitude and longitude using short names 'lat' &amp; 'lon'. */
@Fluent
public final class CoordinatesPairAbbreviated {
    /*
     * Latitude property
     */
    @JsonProperty(value = "lat")
    private Double lat;

    /*
     * Longitude property
     */
    @JsonProperty(value = "lon")
    private Double lon;

    /**
     * Get the lat property: Latitude property.
     *
     * @return the lat value.
     */
    public Double getLat() {
        return this.lat;
    }

    /**
     * Set the lat property: Latitude property.
     *
     * @param lat the lat value to set.
     * @return the CoordinatesPairAbbreviated object itself.
     */
    public CoordinatesPairAbbreviated setLat(Double lat) {
        this.lat = lat;
        return this;
    }

    /**
     * Get the lon property: Longitude property.
     *
     * @return the lon value.
     */
    public Double getLon() {
        return this.lon;
    }

    /**
     * Set the lon property: Longitude property.
     *
     * @param lon the lon value to set.
     * @return the CoordinatesPairAbbreviated object itself.
     */
    public CoordinatesPairAbbreviated setLon(Double lon) {
        this.lon = lon;
        return this;
    }
}
