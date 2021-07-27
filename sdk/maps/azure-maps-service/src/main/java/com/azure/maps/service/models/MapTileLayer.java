// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MapTileLayer. */
public final class MapTileLayer extends ExpandableStringEnum<MapTileLayer> {
    /** Static value basic for MapTileLayer. */
    public static final MapTileLayer BASIC = fromString("basic");

    /** Static value hybrid for MapTileLayer. */
    public static final MapTileLayer HYBRID = fromString("hybrid");

    /** Static value labels for MapTileLayer. */
    public static final MapTileLayer LABELS = fromString("labels");

    /** Static value terra for MapTileLayer. */
    public static final MapTileLayer TERRA = fromString("terra");

    /**
     * Creates or finds a MapTileLayer from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MapTileLayer.
     */
    @JsonCreator
    public static MapTileLayer fromString(String name) {
        return fromString(name, MapTileLayer.class);
    }

    /** @return known MapTileLayer values. */
    public static Collection<MapTileLayer> values() {
        return values(MapTileLayer.class);
    }
}
