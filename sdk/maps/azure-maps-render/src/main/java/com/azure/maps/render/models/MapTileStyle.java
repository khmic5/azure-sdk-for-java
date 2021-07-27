// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MapTileStyle. */
public final class MapTileStyle extends ExpandableStringEnum<MapTileStyle> {
    /** Static value main for MapTileStyle. */
    public static final MapTileStyle MAIN = fromString("main");

    /** Static value dark for MapTileStyle. */
    public static final MapTileStyle DARK = fromString("dark");

    /** Static value shaded_relief for MapTileStyle. */
    public static final MapTileStyle SHADED_RELIEF = fromString("shaded_relief");

    /**
     * Creates or finds a MapTileStyle from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MapTileStyle.
     */
    @JsonCreator
    public static MapTileStyle fromString(String name) {
        return fromString(name, MapTileStyle.class);
    }

    /** @return known MapTileStyle values. */
    public static Collection<MapTileStyle> values() {
        return values(MapTileStyle.class);
    }
}
