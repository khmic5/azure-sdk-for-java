// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GuidanceManeuver. */
public final class GuidanceManeuver extends ExpandableStringEnum<GuidanceManeuver> {
    /** Static value ARRIVE for GuidanceManeuver. */
    public static final GuidanceManeuver ARRIVE = fromString("ARRIVE");

    /** Static value ARRIVE_LEFT for GuidanceManeuver. */
    public static final GuidanceManeuver ARRIVE_LEFT = fromString("ARRIVE_LEFT");

    /** Static value ARRIVE_RIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver ARRIVE_RIGHT = fromString("ARRIVE_RIGHT");

    /** Static value DEPART for GuidanceManeuver. */
    public static final GuidanceManeuver DEPART = fromString("DEPART");

    /** Static value STRAIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver STRAIGHT = fromString("STRAIGHT");

    /** Static value KEEP_RIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver KEEP_RIGHT = fromString("KEEP_RIGHT");

    /** Static value BEAR_RIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver BEAR_RIGHT = fromString("BEAR_RIGHT");

    /** Static value TURN_RIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver TURN_RIGHT = fromString("TURN_RIGHT");

    /** Static value SHARP_RIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver SHARP_RIGHT = fromString("SHARP_RIGHT");

    /** Static value KEEP_LEFT for GuidanceManeuver. */
    public static final GuidanceManeuver KEEP_LEFT = fromString("KEEP_LEFT");

    /** Static value BEAR_LEFT for GuidanceManeuver. */
    public static final GuidanceManeuver BEAR_LEFT = fromString("BEAR_LEFT");

    /** Static value TURN_LEFT for GuidanceManeuver. */
    public static final GuidanceManeuver TURN_LEFT = fromString("TURN_LEFT");

    /** Static value SHARP_LEFT for GuidanceManeuver. */
    public static final GuidanceManeuver SHARP_LEFT = fromString("SHARP_LEFT");

    /** Static value MAKE_UTURN for GuidanceManeuver. */
    public static final GuidanceManeuver MAKE_UTURN = fromString("MAKE_UTURN");

    /** Static value ENTER_MOTORWAY for GuidanceManeuver. */
    public static final GuidanceManeuver ENTER_MOTORWAY = fromString("ENTER_MOTORWAY");

    /** Static value ENTER_FREEWAY for GuidanceManeuver. */
    public static final GuidanceManeuver ENTER_FREEWAY = fromString("ENTER_FREEWAY");

    /** Static value ENTER_HIGHWAY for GuidanceManeuver. */
    public static final GuidanceManeuver ENTER_HIGHWAY = fromString("ENTER_HIGHWAY");

    /** Static value TAKE_EXIT for GuidanceManeuver. */
    public static final GuidanceManeuver TAKE_EXIT = fromString("TAKE_EXIT");

    /** Static value MOTORWAY_EXIT_LEFT for GuidanceManeuver. */
    public static final GuidanceManeuver MOTORWAY_EXIT_LEFT = fromString("MOTORWAY_EXIT_LEFT");

    /** Static value MOTORWAY_EXIT_RIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver MOTORWAY_EXIT_RIGHT = fromString("MOTORWAY_EXIT_RIGHT");

    /** Static value TAKE_FERRY for GuidanceManeuver. */
    public static final GuidanceManeuver TAKE_FERRY = fromString("TAKE_FERRY");

    /** Static value ROUNDABOUT_CROSS for GuidanceManeuver. */
    public static final GuidanceManeuver ROUNDABOUT_CROSS = fromString("ROUNDABOUT_CROSS");

    /** Static value ROUNDABOUT_RIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver ROUNDABOUT_RIGHT = fromString("ROUNDABOUT_RIGHT");

    /** Static value ROUNDABOUT_LEFT for GuidanceManeuver. */
    public static final GuidanceManeuver ROUNDABOUT_LEFT = fromString("ROUNDABOUT_LEFT");

    /** Static value ROUNDABOUT_BACK for GuidanceManeuver. */
    public static final GuidanceManeuver ROUNDABOUT_BACK = fromString("ROUNDABOUT_BACK");

    /** Static value TRY_MAKE_UTURN for GuidanceManeuver. */
    public static final GuidanceManeuver TRYMAKE_UTURN = fromString("TRY_MAKE_UTURN");

    /** Static value FOLLOW for GuidanceManeuver. */
    public static final GuidanceManeuver FOLLOW = fromString("FOLLOW");

    /** Static value SWITCH_PARALLEL_ROAD for GuidanceManeuver. */
    public static final GuidanceManeuver SWITCH_PARALLEL_ROAD = fromString("SWITCH_PARALLEL_ROAD");

    /** Static value SWITCH_MAIN_ROAD for GuidanceManeuver. */
    public static final GuidanceManeuver SWITCH_MAIN_ROAD = fromString("SWITCH_MAIN_ROAD");

    /** Static value ENTRANCE_RAMP for GuidanceManeuver. */
    public static final GuidanceManeuver ENTRANCE_RAMP = fromString("ENTRANCE_RAMP");

    /** Static value WAYPOINT_LEFT for GuidanceManeuver. */
    public static final GuidanceManeuver WAYPOINT_LEFT = fromString("WAYPOINT_LEFT");

    /** Static value WAYPOINT_RIGHT for GuidanceManeuver. */
    public static final GuidanceManeuver WAYPOINT_RIGHT = fromString("WAYPOINT_RIGHT");

    /** Static value WAYPOINT_REACHED for GuidanceManeuver. */
    public static final GuidanceManeuver WAYPOINT_REACHED = fromString("WAYPOINT_REACHED");

    /**
     * Creates or finds a GuidanceManeuver from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GuidanceManeuver.
     */
    @JsonCreator
    public static GuidanceManeuver fromString(String name) {
        return fromString(name, GuidanceManeuver.class);
    }

    /** @return known GuidanceManeuver values. */
    public static Collection<GuidanceManeuver> values() {
        return values(GuidanceManeuver.class);
    }
}
