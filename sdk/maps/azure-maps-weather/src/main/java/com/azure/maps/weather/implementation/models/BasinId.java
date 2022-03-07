// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for BasinId. */
public final class BasinId extends ExpandableStringEnum<BasinId> {
    /** Static value AL for BasinId. */
    public static final BasinId AL = fromString("AL");

    /** Static value EP for BasinId. */
    public static final BasinId EP = fromString("EP");

    /** Static value SI for BasinId. */
    public static final BasinId SI = fromString("SI");

    /** Static value NI for BasinId. */
    public static final BasinId NI = fromString("NI");

    /** Static value CP for BasinId. */
    public static final BasinId CP = fromString("CP");

    /** Static value NP for BasinId. */
    public static final BasinId NP = fromString("NP");

    /** Static value SP for BasinId. */
    public static final BasinId SP = fromString("SP");

    /**
     * Creates or finds a BasinId from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BasinId.
     */
    @JsonCreator
    public static BasinId fromString(String name) {
        return fromString(name, BasinId.class);
    }

    /** @return known BasinId values. */
    public static Collection<BasinId> values() {
        return values(BasinId.class);
    }
}
