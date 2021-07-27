// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ItineraryLeg model. */
@Fluent
public final class ItineraryLeg {
    /*
     * The travel mode of the leg.
     */
    @JsonProperty(value = "legType")
    private LegType legType;

    /*
     * Start time for the leg.
     */
    @JsonProperty(value = "legStartTime")
    private String legStartTime;

    /*
     * End time for the leg.
     */
    @JsonProperty(value = "legEndTime")
    private String legEndTime;

    /*
     * In case of walk or bike leg, the directions.
     */
    @JsonProperty(value = "steps")
    private List<ItineraryStep> steps;

    /*
     * The walk/bike leg’s origin.
     */
    @JsonProperty(value = "origin")
    private LegPoint origin;

    /*
     * The walk/bike leg’s destination.
     */
    @JsonProperty(value = "destination")
    private LegPoint destination;

    /*
     * A valid `GeoJSON LineString` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.4) for details.
     */
    @JsonProperty(value = "geometry")
    private GeoJsonLineString geometry;

    /*
     * In case of a public transit leg, the line group serving this leg.
     */
    @JsonProperty(value = "lineGroup")
    private ItineraryLineGroup lineGroup;

    /*
     * In case of a public transit leg, the line serving this leg.
     */
    @JsonProperty(value = "line")
    private ItineraryLine line;

    /*
     * List of stops comprising the line’s route within the leg (e.g. the stops
     * the leg passes through).
     */
    @JsonProperty(value = "stops")
    private List<LegStop> stops;

    /*
     * Relevant for Public Transit and Wait legs only
     */
    @JsonProperty(value = "departures")
    private List<LineArrival> departures;

    /*
     * Leg level public transit fare information. Returned only if fare
     * information is available for the entire itinerary.
     */
    @JsonProperty(value = "legFare")
    private LegFare legFare;

    /*
     * Indicates whether it’s necessary to wait for the next leg on the same
     * vehicle (i.e. the bus will only change its line number).
     */
    @JsonProperty(value = "waitOnVehicle")
    private String waitOnVehicle;

    /**
     * Get the legType property: The travel mode of the leg.
     *
     * @return the legType value.
     */
    public LegType getLegType() {
        return this.legType;
    }

    /**
     * Set the legType property: The travel mode of the leg.
     *
     * @param legType the legType value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setLegType(LegType legType) {
        this.legType = legType;
        return this;
    }

    /**
     * Get the legStartTime property: Start time for the leg.
     *
     * @return the legStartTime value.
     */
    public String getLegStartTime() {
        return this.legStartTime;
    }

    /**
     * Set the legStartTime property: Start time for the leg.
     *
     * @param legStartTime the legStartTime value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setLegStartTime(String legStartTime) {
        this.legStartTime = legStartTime;
        return this;
    }

    /**
     * Get the legEndTime property: End time for the leg.
     *
     * @return the legEndTime value.
     */
    public String getLegEndTime() {
        return this.legEndTime;
    }

    /**
     * Set the legEndTime property: End time for the leg.
     *
     * @param legEndTime the legEndTime value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setLegEndTime(String legEndTime) {
        this.legEndTime = legEndTime;
        return this;
    }

    /**
     * Get the steps property: In case of walk or bike leg, the directions.
     *
     * @return the steps value.
     */
    public List<ItineraryStep> getSteps() {
        return this.steps;
    }

    /**
     * Set the steps property: In case of walk or bike leg, the directions.
     *
     * @param steps the steps value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setSteps(List<ItineraryStep> steps) {
        this.steps = steps;
        return this;
    }

    /**
     * Get the origin property: The walk/bike leg’s origin.
     *
     * @return the origin value.
     */
    public LegPoint getOrigin() {
        return this.origin;
    }

    /**
     * Set the origin property: The walk/bike leg’s origin.
     *
     * @param origin the origin value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setOrigin(LegPoint origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the destination property: The walk/bike leg’s destination.
     *
     * @return the destination value.
     */
    public LegPoint getDestination() {
        return this.destination;
    }

    /**
     * Set the destination property: The walk/bike leg’s destination.
     *
     * @param destination the destination value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setDestination(LegPoint destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the geometry property: A valid `GeoJSON LineString` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.4) for details.
     *
     * @return the geometry value.
     */
    public GeoJsonLineString getGeometry() {
        return this.geometry;
    }

    /**
     * Set the geometry property: A valid `GeoJSON LineString` geometry type. Please refer to [RFC
     * 7946](https://tools.ietf.org/html/rfc7946#section-3.1.4) for details.
     *
     * @param geometry the geometry value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setGeometry(GeoJsonLineString geometry) {
        this.geometry = geometry;
        return this;
    }

    /**
     * Get the lineGroup property: In case of a public transit leg, the line group serving this leg.
     *
     * @return the lineGroup value.
     */
    public ItineraryLineGroup getLineGroup() {
        return this.lineGroup;
    }

    /**
     * Set the lineGroup property: In case of a public transit leg, the line group serving this leg.
     *
     * @param lineGroup the lineGroup value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setLineGroup(ItineraryLineGroup lineGroup) {
        this.lineGroup = lineGroup;
        return this;
    }

    /**
     * Get the line property: In case of a public transit leg, the line serving this leg.
     *
     * @return the line value.
     */
    public ItineraryLine getLine() {
        return this.line;
    }

    /**
     * Set the line property: In case of a public transit leg, the line serving this leg.
     *
     * @param line the line value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setLine(ItineraryLine line) {
        this.line = line;
        return this;
    }

    /**
     * Get the stops property: List of stops comprising the line’s route within the leg (e.g. the stops the leg passes
     * through).
     *
     * @return the stops value.
     */
    public List<LegStop> getStops() {
        return this.stops;
    }

    /**
     * Set the stops property: List of stops comprising the line’s route within the leg (e.g. the stops the leg passes
     * through).
     *
     * @param stops the stops value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setStops(List<LegStop> stops) {
        this.stops = stops;
        return this;
    }

    /**
     * Get the departures property: Relevant for Public Transit and Wait legs only.
     *
     * @return the departures value.
     */
    public List<LineArrival> getDepartures() {
        return this.departures;
    }

    /**
     * Set the departures property: Relevant for Public Transit and Wait legs only.
     *
     * @param departures the departures value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setDepartures(List<LineArrival> departures) {
        this.departures = departures;
        return this;
    }

    /**
     * Get the legFare property: Leg level public transit fare information. Returned only if fare information is
     * available for the entire itinerary.
     *
     * @return the legFare value.
     */
    public LegFare getLegFare() {
        return this.legFare;
    }

    /**
     * Set the legFare property: Leg level public transit fare information. Returned only if fare information is
     * available for the entire itinerary.
     *
     * @param legFare the legFare value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setLegFare(LegFare legFare) {
        this.legFare = legFare;
        return this;
    }

    /**
     * Get the waitOnVehicle property: Indicates whether it’s necessary to wait for the next leg on the same vehicle
     * (i.e. the bus will only change its line number).
     *
     * @return the waitOnVehicle value.
     */
    public String getWaitOnVehicle() {
        return this.waitOnVehicle;
    }

    /**
     * Set the waitOnVehicle property: Indicates whether it’s necessary to wait for the next leg on the same vehicle
     * (i.e. the bus will only change its line number).
     *
     * @param waitOnVehicle the waitOnVehicle value to set.
     * @return the ItineraryLeg object itself.
     */
    public ItineraryLeg setWaitOnVehicle(String waitOnVehicle) {
        this.waitOnVehicle = waitOnVehicle;
        return this;
    }
}
