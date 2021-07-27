// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TileFormat. */
public final class TileFormat extends ExpandableStringEnum<TileFormat> {
    /** Static value png for TileFormat. */
    public static final TileFormat PNG = fromString("png");

    /** Static value pbf for TileFormat. */
    public static final TileFormat PBF = fromString("pbf");

    /**
     * Creates or finds a TileFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TileFormat.
     */
    @JsonCreator
    public static TileFormat fromString(String name) {
        return fromString(name, TileFormat.class);
    }

    /** @return known TileFormat values. */
    public static Collection<TileFormat> values() {
        return values(TileFormat.class);
    }
}
