// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.elevation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Geography. */
public final class Geography extends ExpandableStringEnum<Geography> {
    /** Static value us for Geography. */
    public static final Geography US = fromString("us");

    /** Static value eu for Geography. */
    public static final Geography EU = fromString("eu");

    /**
     * Creates or finds a Geography from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Geography.
     */
    @JsonCreator
    public static Geography fromString(String name) {
        return fromString(name, Geography.class);
    }

    /** @return known Geography values. */
    public static Collection<Geography> values() {
        return values(Geography.class);
    }
}
