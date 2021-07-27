// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OpeningHours. */
public final class OpeningHours extends ExpandableStringEnum<OpeningHours> {
    /** Static value nextSevenDays for OpeningHours. */
    public static final OpeningHours NEXT_SEVEN_DAYS = fromString("nextSevenDays");

    /**
     * Creates or finds a OpeningHours from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OpeningHours.
     */
    @JsonCreator
    public static OpeningHours fromString(String name) {
        return fromString(name, OpeningHours.class);
    }

    /** @return known OpeningHours values. */
    public static Collection<OpeningHours> values() {
        return values(OpeningHours.class);
    }
}
