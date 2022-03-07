// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Returned temperature values. */
@Fluent
public final class WeatherValueYearMax {
    /*
     * Maximum temperature for the time period.
     */
    @JsonProperty(value = "maximum")
    private WeatherValueYear maximum;

    /**
     * Get the maximum property: Maximum temperature for the time period.
     *
     * @return the maximum value.
     */
    public WeatherValueYear getMaximum() {
        return this.maximum;
    }

    /**
     * Set the maximum property: Maximum temperature for the time period.
     *
     * @param maximum the maximum value to set.
     * @return the WeatherValueYearMax object itself.
     */
    public WeatherValueYearMax setMaximum(WeatherValueYear maximum) {
        this.maximum = maximum;
        return this;
    }
}
