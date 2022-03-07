// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Returned temperature values. */
@Fluent
public final class WeatherValueYearMaxMinAvg {
    /*
     * Maximum temperature for the time period.
     */
    @JsonProperty(value = "maximum")
    private WeatherValueYear maximum;

    /*
     * Minimum temperature for the time period.
     */
    @JsonProperty(value = "minimum")
    private WeatherValueYear minimum;

    /*
     * Average temperature for the time period.
     */
    @JsonProperty(value = "average")
    private WeatherValue average;

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
     * @return the WeatherValueYearMaxMinAvg object itself.
     */
    public WeatherValueYearMaxMinAvg setMaximum(WeatherValueYear maximum) {
        this.maximum = maximum;
        return this;
    }

    /**
     * Get the minimum property: Minimum temperature for the time period.
     *
     * @return the minimum value.
     */
    public WeatherValueYear getMinimum() {
        return this.minimum;
    }

    /**
     * Set the minimum property: Minimum temperature for the time period.
     *
     * @param minimum the minimum value to set.
     * @return the WeatherValueYearMaxMinAvg object itself.
     */
    public WeatherValueYearMaxMinAvg setMinimum(WeatherValueYear minimum) {
        this.minimum = minimum;
        return this;
    }

    /**
     * Get the average property: Average temperature for the time period.
     *
     * @return the average value.
     */
    public WeatherValue getAverage() {
        return this.average;
    }

    /**
     * Set the average property: Average temperature for the time period.
     *
     * @param average the average value to set.
     * @return the WeatherValueYearMaxMinAvg object itself.
     */
    public WeatherValueYearMaxMinAvg setAverage(WeatherValue average) {
        this.average = average;
        return this;
    }
}
