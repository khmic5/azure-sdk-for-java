// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Speed of wind in specified unit. */
@Fluent
public final class WindSpeed {
    /*
     * Rounded value of the speed.
     */
    @JsonProperty(value = "value")
    private Float value;

    /*
     * Type of unit for the speed value.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * Numeric ID value associated with the type of unit being displayed. Can
     * be used for unit translation. Please refer to [Weather Service
     * Concepts](https://aka.ms/AzureMapsWeatherConcepts) for details.
     */
    @JsonProperty(value = "unitType")
    private Integer unitType;

    /**
     * Get the value property: Rounded value of the speed.
     *
     * @return the value value.
     */
    public Float getValue() {
        return this.value;
    }

    /**
     * Set the value property: Rounded value of the speed.
     *
     * @param value the value value to set.
     * @return the WindSpeed object itself.
     */
    public WindSpeed setValue(Float value) {
        this.value = value;
        return this;
    }

    /**
     * Get the unit property: Type of unit for the speed value.
     *
     * @return the unit value.
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: Type of unit for the speed value.
     *
     * @param unit the unit value to set.
     * @return the WindSpeed object itself.
     */
    public WindSpeed setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the unitType property: Numeric ID value associated with the type of unit being displayed. Can be used for
     * unit translation. Please refer to [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for
     * details.
     *
     * @return the unitType value.
     */
    public Integer getUnitType() {
        return this.unitType;
    }

    /**
     * Set the unitType property: Numeric ID value associated with the type of unit being displayed. Can be used for
     * unit translation. Please refer to [Weather Service Concepts](https://aka.ms/AzureMapsWeatherConcepts) for
     * details.
     *
     * @param unitType the unitType value to set.
     * @return the WindSpeed object itself.
     */
    public WindSpeed setUnitType(Integer unitType) {
        this.unitType = unitType;
        return this;
    }
}
