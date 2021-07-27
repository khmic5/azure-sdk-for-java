// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResponseFormat. */
public final class ResponseFormat extends ExpandableStringEnum<ResponseFormat> {
    /** Static value json for ResponseFormat. */
    public static final ResponseFormat JSON = fromString("json");

    /**
     * Creates or finds a ResponseFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResponseFormat.
     */
    @JsonCreator
    public static ResponseFormat fromString(String name) {
        return fromString(name, ResponseFormat.class);
    }

    /** @return known ResponseFormat values. */
    public static Collection<ResponseFormat> values() {
        return values(ResponseFormat.class);
    }
}
