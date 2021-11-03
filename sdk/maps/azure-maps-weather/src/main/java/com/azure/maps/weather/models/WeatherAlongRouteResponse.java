// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Weather Along Route. */
@Immutable
public final class WeatherAlongRouteResponse {
    /*
     * Short summary of the weather along the route.
     */
    @JsonProperty(value = "summary", access = JsonProperty.Access.WRITE_ONLY)
    private WeatherAlongRouteSummary summary;

    /*
     * Data for each waypoint returned in the same order as specified in the
     * request.
     */
    @JsonProperty(value = "waypoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<WaypointForecast> waypoints;

    /**
     * Get the summary property: Short summary of the weather along the route.
     *
     * @return the summary value.
     */
    public WeatherAlongRouteSummary getSummary() {
        return this.summary;
    }

    /**
     * Get the waypoints property: Data for each waypoint returned in the same order as specified in the request.
     *
     * @return the waypoints value.
     */
    public List<WaypointForecast> getWaypoints() {
        return this.waypoints;
    }
}
