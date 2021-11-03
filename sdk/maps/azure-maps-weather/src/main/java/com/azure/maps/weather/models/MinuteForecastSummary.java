// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Phrase summaries for the entire forecast period. */
@Fluent
public final class MinuteForecastSummary {
    /*
     * Summary phrase for the next 60 minutes. Phrase length is approximately
     * 60 characters.
     */
    @JsonProperty(value = "briefPhrase60")
    private String briefPhrase60;

    /*
     * Short summary phrase for the next 120 minutes. Phrase length is
     * approximately 25 characters.
     */
    @JsonProperty(value = "shortPhrase")
    private String shortDescription;

    /*
     * Summary phrase for the next 120 minutes. Phrase length is approximately
     * 60 characters.
     */
    @JsonProperty(value = "briefPhrase")
    private String briefDescription;

    /*
     * Long summary phrase for the next 120 minutes. Phrase length is 60+
     * characters.
     */
    @JsonProperty(value = "longPhrase")
    private String longPhrase;

    /*
     * Numeric value representing an image that displays the `iconPhrase`.
     * Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     */
    @JsonProperty(value = "iconCode")
    private IconCode iconCode;

    /**
     * Get the briefPhrase60 property: Summary phrase for the next 60 minutes. Phrase length is approximately 60
     * characters.
     *
     * @return the briefPhrase60 value.
     */
    public String getBriefPhrase60() {
        return this.briefPhrase60;
    }

    /**
     * Set the briefPhrase60 property: Summary phrase for the next 60 minutes. Phrase length is approximately 60
     * characters.
     *
     * @param briefPhrase60 the briefPhrase60 value to set.
     * @return the MinuteForecastSummary object itself.
     */
    public MinuteForecastSummary setBriefPhrase60(String briefPhrase60) {
        this.briefPhrase60 = briefPhrase60;
        return this;
    }

    /**
     * Get the shortDescription property: Short summary phrase for the next 120 minutes. Phrase length is approximately
     * 25 characters.
     *
     * @return the shortDescription value.
     */
    public String getShortDescription() {
        return this.shortDescription;
    }

    /**
     * Set the shortDescription property: Short summary phrase for the next 120 minutes. Phrase length is approximately
     * 25 characters.
     *
     * @param shortDescription the shortDescription value to set.
     * @return the MinuteForecastSummary object itself.
     */
    public MinuteForecastSummary setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }

    /**
     * Get the briefDescription property: Summary phrase for the next 120 minutes. Phrase length is approximately 60
     * characters.
     *
     * @return the briefDescription value.
     */
    public String getBriefDescription() {
        return this.briefDescription;
    }

    /**
     * Set the briefDescription property: Summary phrase for the next 120 minutes. Phrase length is approximately 60
     * characters.
     *
     * @param briefDescription the briefDescription value to set.
     * @return the MinuteForecastSummary object itself.
     */
    public MinuteForecastSummary setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
        return this;
    }

    /**
     * Get the longPhrase property: Long summary phrase for the next 120 minutes. Phrase length is 60+ characters.
     *
     * @return the longPhrase value.
     */
    public String getLongPhrase() {
        return this.longPhrase;
    }

    /**
     * Set the longPhrase property: Long summary phrase for the next 120 minutes. Phrase length is 60+ characters.
     *
     * @param longPhrase the longPhrase value to set.
     * @return the MinuteForecastSummary object itself.
     */
    public MinuteForecastSummary setLongPhrase(String longPhrase) {
        this.longPhrase = longPhrase;
        return this;
    }

    /**
     * Get the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @return the iconCode value.
     */
    public IconCode getIconCode() {
        return this.iconCode;
    }

    /**
     * Set the iconCode property: Numeric value representing an image that displays the `iconPhrase`. Please refer to
     * [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     *
     * @param iconCode the iconCode value to set.
     * @return the MinuteForecastSummary object itself.
     */
    public MinuteForecastSummary setIconCode(IconCode iconCode) {
        this.iconCode = iconCode;
        return this;
    }
}
