// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary object. */
@Immutable
public final class RouteDirectionsSummary {
    /*
     * Length In Meters property
     */
    @JsonProperty(value = "lengthInMeters", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lengthInMeters;

    /*
     * Estimated travel time in seconds property that includes the delay due to
     * real-time traffic. Note that even when traffic=false travelTimeInSeconds
     * still includes the delay due to traffic. If DepartAt is in the future,
     * travel time is calculated using time-dependent historic traffic data.
     */
    @JsonProperty(value = "travelTimeInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer travelTimeInSeconds;

    /*
     * Estimated delay in seconds caused by the real-time incident(s) according
     * to traffic information. For routes planned with departure time in the
     * future, delays is always 0. To return additional travel times using
     * different types of traffic information, parameter
     * computeTravelTimeFor=all needs to be added.
     */
    @JsonProperty(value = "trafficDelayInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer trafficDelayInSeconds;

    /*
     * Departure Time property
     */
    @JsonProperty(value = "departureTime", access = JsonProperty.Access.WRITE_ONLY)
    private String departureTime;

    /*
     * Arrival Time property
     */
    @JsonProperty(value = "arrivalTime", access = JsonProperty.Access.WRITE_ONLY)
    private String arrivalTime;

    /**
     * Get the lengthInMeters property: Length In Meters property.
     *
     * @return the lengthInMeters value.
     */
    public Integer getLengthInMeters() {
        return this.lengthInMeters;
    }

    /**
     * Get the travelTimeInSeconds property: Estimated travel time in seconds property that includes the delay due to
     * real-time traffic. Note that even when traffic=false travelTimeInSeconds still includes the delay due to traffic.
     * If DepartAt is in the future, travel time is calculated using time-dependent historic traffic data.
     *
     * @return the travelTimeInSeconds value.
     */
    public Integer getTravelTimeInSeconds() {
        return this.travelTimeInSeconds;
    }

    /**
     * Get the trafficDelayInSeconds property: Estimated delay in seconds caused by the real-time incident(s) according
     * to traffic information. For routes planned with departure time in the future, delays is always 0. To return
     * additional travel times using different types of traffic information, parameter computeTravelTimeFor=all needs to
     * be added.
     *
     * @return the trafficDelayInSeconds value.
     */
    public Integer getTrafficDelayInSeconds() {
        return this.trafficDelayInSeconds;
    }

    /**
     * Get the departureTime property: Departure Time property.
     *
     * @return the departureTime value.
     */
    public String getDepartureTime() {
        return this.departureTime;
    }

    /**
     * Get the arrivalTime property: Arrival Time property.
     *
     * @return the arrivalTime value.
     */
    public String getArrivalTime() {
        return this.arrivalTime;
    }
}
