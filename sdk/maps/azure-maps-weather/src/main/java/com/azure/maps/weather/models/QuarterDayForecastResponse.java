// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The QuarterDayForecastResponse model. */
@Fluent
public final class QuarterDayForecastResponse {
    /*
     * Forecast data for each quarter in the response.
     */
    @JsonProperty(value = "forecasts")
    private List<QuarterDayForecast> forecasts;

    /**
     * Get the forecasts property: Forecast data for each quarter in the response.
     *
     * @return the forecasts value.
     */
    public List<QuarterDayForecast> getForecasts() {
        return this.forecasts;
    }

    /**
     * Set the forecasts property: Forecast data for each quarter in the response.
     *
     * @param forecasts the forecasts value to set.
     * @return the QuarterDayForecastResponse object itself.
     */
    public QuarterDayForecastResponse setForecasts(List<QuarterDayForecast> forecasts) {
        this.forecasts = forecasts;
        return this;
    }
}
