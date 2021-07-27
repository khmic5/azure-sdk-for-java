// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TilesetId. */
public final class TilesetId extends ExpandableStringEnum<TilesetId> {
    /** Static value microsoft.base for TilesetId. */
    public static final TilesetId MICROSOFT_BASE = fromString("microsoft.base");

    /** Static value microsoft.base.labels for TilesetId. */
    public static final TilesetId MICROSOFT_BASE_LABELS = fromString("microsoft.base.labels");

    /** Static value microsoft.base.hybrid for TilesetId. */
    public static final TilesetId MICROSOFT_BASE_HYBRID = fromString("microsoft.base.hybrid");

    /** Static value microsoft.terra.main for TilesetId. */
    public static final TilesetId MICROSOFT_TERRA_MAIN = fromString("microsoft.terra.main");

    /** Static value microsoft.base.road for TilesetId. */
    public static final TilesetId MICROSOFT_BASE_ROAD = fromString("microsoft.base.road");

    /** Static value microsoft.base.darkgrey for TilesetId. */
    public static final TilesetId MICROSOFT_BASE_DARKGREY = fromString("microsoft.base.darkgrey");

    /** Static value microsoft.base.labels.road for TilesetId. */
    public static final TilesetId MICROSOFT_BASE_LABELS_ROAD = fromString("microsoft.base.labels.road");

    /** Static value microsoft.base.hybrid.road for TilesetId. */
    public static final TilesetId MICROSOFT_BASE_HYBRID_ROAD = fromString("microsoft.base.hybrid.road");

    /** Static value microsoft.imagery for TilesetId. */
    public static final TilesetId MICROSOFT_IMAGERY = fromString("microsoft.imagery");

    /** Static value microsoft.weather.radar.main for TilesetId. */
    public static final TilesetId MICROSOFT_WEATHER_RADAR_MAIN = fromString("microsoft.weather.radar.main");

    /** Static value microsoft.weather.infrared.main for TilesetId. */
    public static final TilesetId MICROSOFT_WEATHER_INFRARED_MAIN = fromString("microsoft.weather.infrared.main");

    /** Static value microsoft.dem for TilesetId. */
    public static final TilesetId MICROSOFT_DEM = fromString("microsoft.dem");

    /**
     * Creates or finds a TilesetId from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TilesetId.
     */
    @JsonCreator
    public static TilesetId fromString(String name) {
        return fromString(name, TilesetId.class);
    }

    /** @return known TilesetId values. */
    public static Collection<TilesetId> values() {
        return values(TilesetId.class);
    }
}
