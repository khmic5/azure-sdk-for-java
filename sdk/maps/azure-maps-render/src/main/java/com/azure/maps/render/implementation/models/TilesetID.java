// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.implementation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TilesetID. */
public final class TilesetID extends ExpandableStringEnum<TilesetID> {
    /** Static value microsoft.base for TilesetID. */
    public static final TilesetID MICROSOFT_BASE = fromString("microsoft.base");

    /** Static value microsoft.base.labels for TilesetID. */
    public static final TilesetID MICROSOFT_BASE_LABELS = fromString("microsoft.base.labels");

    /** Static value microsoft.base.hybrid for TilesetID. */
    public static final TilesetID MICROSOFT_BASE_HYBRID = fromString("microsoft.base.hybrid");

    /** Static value microsoft.terra.main for TilesetID. */
    public static final TilesetID MICROSOFT_TERRA_MAIN = fromString("microsoft.terra.main");

    /** Static value microsoft.base.road for TilesetID. */
    public static final TilesetID MICROSOFT_BASE_ROAD = fromString("microsoft.base.road");

    /** Static value microsoft.base.darkgrey for TilesetID. */
    public static final TilesetID MICROSOFT_BASE_DARKGREY = fromString("microsoft.base.darkgrey");

    /** Static value microsoft.base.labels.road for TilesetID. */
    public static final TilesetID MICROSOFT_BASE_LABELS_ROAD = fromString("microsoft.base.labels.road");

    /** Static value microsoft.base.labels.darkgrey for TilesetID. */
    public static final TilesetID MICROSOFT_BASE_LABELS_DARKGREY = fromString("microsoft.base.labels.darkgrey");

    /** Static value microsoft.base.hybrid.road for TilesetID. */
    public static final TilesetID MICROSOFT_BASE_HYBRID_ROAD = fromString("microsoft.base.hybrid.road");

    /** Static value microsoft.base.hybrid.darkgrey for TilesetID. */
    public static final TilesetID MICROSOFT_BASE_HYBRID_DARKGREY = fromString("microsoft.base.hybrid.darkgrey");

    /** Static value microsoft.imagery for TilesetID. */
    public static final TilesetID MICROSOFT_IMAGERY = fromString("microsoft.imagery");

    /** Static value microsoft.weather.radar.main for TilesetID. */
    public static final TilesetID MICROSOFT_WEATHER_RADAR_MAIN = fromString("microsoft.weather.radar.main");

    /** Static value microsoft.weather.infrared.main for TilesetID. */
    public static final TilesetID MICROSOFT_WEATHER_INFRARED_MAIN = fromString("microsoft.weather.infrared.main");

    /** Static value microsoft.dem for TilesetID. */
    public static final TilesetID MICROSOFT_DEM = fromString("microsoft.dem");

    /** Static value microsoft.dem.contours for TilesetID. */
    public static final TilesetID MICROSOFT_DEM_CONTOURS = fromString("microsoft.dem.contours");

    /** Static value microsoft.traffic.absolute for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_ABSOLUTE = fromString("microsoft.traffic.absolute");

    /** Static value microsoft.traffic.absolute.main for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_ABSOLUTE_MAIN = fromString("microsoft.traffic.absolute.main");

    /** Static value microsoft.traffic.relative for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_RELATIVE = fromString("microsoft.traffic.relative");

    /** Static value microsoft.traffic.relative.main for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_RELATIVE_MAIN = fromString("microsoft.traffic.relative.main");

    /** Static value microsoft.traffic.relative.dark for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_RELATIVE_DARK = fromString("microsoft.traffic.relative.dark");

    /** Static value microsoft.traffic.delay for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_DELAY = fromString("microsoft.traffic.delay");

    /** Static value microsoft.traffic.delay.main for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_DELAY_MAIN = fromString("microsoft.traffic.delay.main");

    /** Static value microsoft.traffic.reduced.main for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_REDUCED_MAIN = fromString("microsoft.traffic.reduced.main");

    /** Static value microsoft.traffic.incident for TilesetID. */
    public static final TilesetID MICROSOFT_TRAFFIC_INCIDENT = fromString("microsoft.traffic.incident");

    /**
     * Creates or finds a TilesetID from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TilesetID.
     */
    @JsonCreator
    public static TilesetID fromString(String name) {
        return fromString(name, TilesetID.class);
    }

    /** @return known TilesetID values. */
    public static Collection<TilesetID> values() {
        return values(TilesetID.class);
    }
}
