// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DrivingSide. */
public final class DrivingSide extends ExpandableStringEnum<DrivingSide> {
    /** Static value LEFT for DrivingSide. */
    public static final DrivingSide LEFT = fromString("LEFT");

    /** Static value RIGHT for DrivingSide. */
    public static final DrivingSide RIGHT = fromString("RIGHT");

    /**
     * Creates or finds a DrivingSide from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DrivingSide.
     */
    @JsonCreator
    public static DrivingSide fromString(String name) {
        return fromString(name, DrivingSide.class);
    }

    /** @return known DrivingSide values. */
    public static Collection<DrivingSide> values() {
        return values(DrivingSide.class);
    }
}
