// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WeatherDataUnit. */
public final class WeatherDataUnit extends ExpandableStringEnum<WeatherDataUnit> {
    /** Static value metric for WeatherDataUnit. */
    public static final WeatherDataUnit METRIC = fromString("metric");

    /** Static value imperial for WeatherDataUnit. */
    public static final WeatherDataUnit IMPERIAL = fromString("imperial");

    /**
     * Creates or finds a WeatherDataUnit from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WeatherDataUnit.
     */
    @JsonCreator
    public static WeatherDataUnit fromString(String name) {
        return fromString(name, WeatherDataUnit.class);
    }

    /** @return known WeatherDataUnit values. */
    public static Collection<WeatherDataUnit> values() {
        return values(WeatherDataUnit.class);
    }
}
