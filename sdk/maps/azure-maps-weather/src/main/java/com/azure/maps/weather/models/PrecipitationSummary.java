// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PrecipitationSummary model. */
@Fluent
public final class PrecipitationSummary {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrecipitationSummary.class);

    /*
     * The amount of precipitation (liquid equivalent) that has fallen in the
     * past hour.
     */
    @JsonProperty(value = "pastHour")
    private WeatherUnit pastHour;

    /*
     * The amount of precipitation (liquid equivalent) that has fallen in the
     * past three hours.
     */
    @JsonProperty(value = "past3Hours")
    private WeatherUnit past3Hours;

    /*
     * The amount of precipitation (liquid equivalent) that has fallen in the
     * past six hours. Contains Metric and Imperial Values.
     */
    @JsonProperty(value = "past6Hours")
    private WeatherUnit past6Hours;

    /*
     * The amount of precipitation (liquid equivalent) that has fallen in the
     * past nine hours.
     */
    @JsonProperty(value = "past9Hours")
    private WeatherUnit past9Hours;

    /*
     * The amount of precipitation (liquid equivalent) that has fallen in the
     * past 12 hours.
     */
    @JsonProperty(value = "past12Hours")
    private WeatherUnit past12Hours;

    /*
     * The amount of precipitation (liquid equivalent) that has fallen in the
     * past 18 hours.
     */
    @JsonProperty(value = "past18Hours")
    private WeatherUnit past18Hours;

    /*
     * The amount of precipitation (liquid equivalent) that has fallen in the
     * past 24 hours.
     */
    @JsonProperty(value = "past24Hours")
    private WeatherUnit past24Hours;

    /**
     * Get the pastHour property: The amount of precipitation (liquid equivalent) that has fallen in the past hour.
     *
     * @return the pastHour value.
     */
    public WeatherUnit pastHour() {
        return this.pastHour;
    }

    /**
     * Set the pastHour property: The amount of precipitation (liquid equivalent) that has fallen in the past hour.
     *
     * @param pastHour the pastHour value to set.
     * @return the PrecipitationSummary object itself.
     */
    public PrecipitationSummary withPastHour(WeatherUnit pastHour) {
        this.pastHour = pastHour;
        return this;
    }

    /**
     * Get the past3Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past three
     * hours.
     *
     * @return the past3Hours value.
     */
    public WeatherUnit past3Hours() {
        return this.past3Hours;
    }

    /**
     * Set the past3Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past three
     * hours.
     *
     * @param past3Hours the past3Hours value to set.
     * @return the PrecipitationSummary object itself.
     */
    public PrecipitationSummary withPast3Hours(WeatherUnit past3Hours) {
        this.past3Hours = past3Hours;
        return this;
    }

    /**
     * Get the past6Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past six
     * hours. Contains Metric and Imperial Values.
     *
     * @return the past6Hours value.
     */
    public WeatherUnit past6Hours() {
        return this.past6Hours;
    }

    /**
     * Set the past6Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past six
     * hours. Contains Metric and Imperial Values.
     *
     * @param past6Hours the past6Hours value to set.
     * @return the PrecipitationSummary object itself.
     */
    public PrecipitationSummary withPast6Hours(WeatherUnit past6Hours) {
        this.past6Hours = past6Hours;
        return this;
    }

    /**
     * Get the past9Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past nine
     * hours.
     *
     * @return the past9Hours value.
     */
    public WeatherUnit past9Hours() {
        return this.past9Hours;
    }

    /**
     * Set the past9Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past nine
     * hours.
     *
     * @param past9Hours the past9Hours value to set.
     * @return the PrecipitationSummary object itself.
     */
    public PrecipitationSummary withPast9Hours(WeatherUnit past9Hours) {
        this.past9Hours = past9Hours;
        return this;
    }

    /**
     * Get the past12Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past 12
     * hours.
     *
     * @return the past12Hours value.
     */
    public WeatherUnit past12Hours() {
        return this.past12Hours;
    }

    /**
     * Set the past12Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past 12
     * hours.
     *
     * @param past12Hours the past12Hours value to set.
     * @return the PrecipitationSummary object itself.
     */
    public PrecipitationSummary withPast12Hours(WeatherUnit past12Hours) {
        this.past12Hours = past12Hours;
        return this;
    }

    /**
     * Get the past18Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past 18
     * hours.
     *
     * @return the past18Hours value.
     */
    public WeatherUnit past18Hours() {
        return this.past18Hours;
    }

    /**
     * Set the past18Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past 18
     * hours.
     *
     * @param past18Hours the past18Hours value to set.
     * @return the PrecipitationSummary object itself.
     */
    public PrecipitationSummary withPast18Hours(WeatherUnit past18Hours) {
        this.past18Hours = past18Hours;
        return this;
    }

    /**
     * Get the past24Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past 24
     * hours.
     *
     * @return the past24Hours value.
     */
    public WeatherUnit past24Hours() {
        return this.past24Hours;
    }

    /**
     * Set the past24Hours property: The amount of precipitation (liquid equivalent) that has fallen in the past 24
     * hours.
     *
     * @param past24Hours the past24Hours value to set.
     * @return the PrecipitationSummary object itself.
     */
    public PrecipitationSummary withPast24Hours(WeatherUnit past24Hours) {
        this.past24Hours = past24Hours;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (pastHour() != null) {
            pastHour().validate();
        }
        if (past3Hours() != null) {
            past3Hours().validate();
        }
        if (past6Hours() != null) {
            past6Hours().validate();
        }
        if (past9Hours() != null) {
            past9Hours().validate();
        }
        if (past12Hours() != null) {
            past12Hours().validate();
        }
        if (past18Hours() != null) {
            past18Hours().validate();
        }
        if (past24Hours() != null) {
            past24Hours().validate();
        }
    }
}
