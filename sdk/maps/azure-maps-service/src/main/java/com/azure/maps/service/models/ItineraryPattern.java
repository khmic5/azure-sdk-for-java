// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Stop-shape-segments of the trip pattern, which are an ordered list of the stops and the shapes connecting them. */
@Fluent
public final class ItineraryPattern {
    /*
     * Pattern Id, for example, '3267995'.
     */
    @JsonProperty(value = "patternId")
    private String patternId;

    /*
     * Line Id.
     */
    @JsonProperty(value = "lineId")
    private String lineId;

    /*
     * Stops the line goes through.
     */
    @JsonProperty(value = "stopIds")
    private List<String> stopIds;

    /*
     * Stop sequence and shape per a line in GeoJSON format.
     */
    @JsonProperty(value = "geometry")
    private GeoJsonLineString geometry;

    /**
     * Get the patternId property: Pattern Id, for example, '3267995'.
     *
     * @return the patternId value.
     */
    public String getPatternId() {
        return this.patternId;
    }

    /**
     * Set the patternId property: Pattern Id, for example, '3267995'.
     *
     * @param patternId the patternId value to set.
     * @return the ItineraryPattern object itself.
     */
    public ItineraryPattern setPatternId(String patternId) {
        this.patternId = patternId;
        return this;
    }

    /**
     * Get the lineId property: Line Id.
     *
     * @return the lineId value.
     */
    public String getLineId() {
        return this.lineId;
    }

    /**
     * Set the lineId property: Line Id.
     *
     * @param lineId the lineId value to set.
     * @return the ItineraryPattern object itself.
     */
    public ItineraryPattern setLineId(String lineId) {
        this.lineId = lineId;
        return this;
    }

    /**
     * Get the stopIds property: Stops the line goes through.
     *
     * @return the stopIds value.
     */
    public List<String> getStopIds() {
        return this.stopIds;
    }

    /**
     * Set the stopIds property: Stops the line goes through.
     *
     * @param stopIds the stopIds value to set.
     * @return the ItineraryPattern object itself.
     */
    public ItineraryPattern setStopIds(List<String> stopIds) {
        this.stopIds = stopIds;
        return this;
    }

    /**
     * Get the geometry property: Stop sequence and shape per a line in GeoJSON format.
     *
     * @return the geometry value.
     */
    public GeoJsonLineString getGeometry() {
        return this.geometry;
    }

    /**
     * Set the geometry property: Stop sequence and shape per a line in GeoJSON format.
     *
     * @param geometry the geometry value to set.
     * @return the ItineraryPattern object itself.
     */
    public ItineraryPattern setGeometry(GeoJsonLineString geometry) {
        this.geometry = geometry;
        return this;
    }
}
