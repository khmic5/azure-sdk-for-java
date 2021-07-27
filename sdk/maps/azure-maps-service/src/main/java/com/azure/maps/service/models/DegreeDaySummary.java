// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DegreeDaySummary model. */
@Fluent
public final class DegreeDaySummary {
    /*
     * Number of degrees that the mean temperature is below 65 degrees F/ 18
     * degree C.
     */
    @JsonProperty(value = "heating")
    private WeatherUnit heating;

    /*
     * Number of degrees that the mean temperature is above 65 degrees F/ 18
     * degree C.
     */
    @JsonProperty(value = "cooling")
    private WeatherUnit cooling;

    /**
     * Get the heating property: Number of degrees that the mean temperature is below 65 degrees F/ 18 degree C.
     *
     * @return the heating value.
     */
    public WeatherUnit getHeating() {
        return this.heating;
    }

    /**
     * Set the heating property: Number of degrees that the mean temperature is below 65 degrees F/ 18 degree C.
     *
     * @param heating the heating value to set.
     * @return the DegreeDaySummary object itself.
     */
    public DegreeDaySummary setHeating(WeatherUnit heating) {
        this.heating = heating;
        return this;
    }

    /**
     * Get the cooling property: Number of degrees that the mean temperature is above 65 degrees F/ 18 degree C.
     *
     * @return the cooling value.
     */
    public WeatherUnit getCooling() {
        return this.cooling;
    }

    /**
     * Set the cooling property: Number of degrees that the mean temperature is above 65 degrees F/ 18 degree C.
     *
     * @param cooling the cooling value to set.
     * @return the DegreeDaySummary object itself.
     */
    public DegreeDaySummary setCooling(WeatherUnit cooling) {
        this.cooling = cooling;
        return this;
    }
}
