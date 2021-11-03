// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for JsonFormat. */
public final class JsonFormat extends ExpandableStringEnum<JsonFormat> {
    /** Static value json for JsonFormat. */
    public static final JsonFormat JSON = fromString("json");

    /**
     * Creates or finds a JsonFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding JsonFormat.
     */
    @JsonCreator
    public static JsonFormat fromString(String name) {
        return fromString(name, JsonFormat.class);
    }

    /** @return known JsonFormat values. */
    public static Collection<JsonFormat> values() {
        return values(JsonFormat.class);
    }
}
