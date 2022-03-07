// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Forecast window for the storm. */
@Fluent
public final class WeatherWindow {
    /*
     * Location of the point on the left side of the window at the time of the
     * timeframe.
     */
    @JsonProperty(value = "left")
    private LatLongPair topLeft;

    /*
     * Location of the point on the right side of the window at the end of the
     * timeframe.
     */
    @JsonProperty(value = "right")
    private LatLongPair bottomRight;

    /*
     * DateTime of the beginning of the window of movement, displayed in
     * ISO8601 format.
     */
    @JsonProperty(value = "beginDateTime")
    private OffsetDateTime beginTimestamp;

    /*
     * DateTime of the end of the window of movement, displayed in ISO8601
     * format.
     */
    @JsonProperty(value = "endDateTime")
    private OffsetDateTime endTimestamp;

    /*
     * Storm status at the beginning of the window.
     */
    @JsonProperty(value = "beginStatus")
    private String beginStatus;

    /*
     * Storm status at the end of the window.
     */
    @JsonProperty(value = "endStatus")
    private String endStatus;

    /*
     * Displayed when windowGeometry=true in request. GeoJSON object containing
     * coordinates describing the window of movement during the specified
     * timeframe.
     */
    @JsonProperty(value = "geometry")
    private GeoJsonGeometry geometry;

    /**
     * Get the topLeft property: Location of the point on the left side of the window at the time of the timeframe.
     *
     * @return the topLeft value.
     */
    public LatLongPair getTopLeft() {
        return this.topLeft;
    }

    /**
     * Set the topLeft property: Location of the point on the left side of the window at the time of the timeframe.
     *
     * @param topLeft the topLeft value to set.
     * @return the WeatherWindow object itself.
     */
    public WeatherWindow setTopLeft(LatLongPair topLeft) {
        this.topLeft = topLeft;
        return this;
    }

    /**
     * Get the bottomRight property: Location of the point on the right side of the window at the end of the timeframe.
     *
     * @return the bottomRight value.
     */
    public LatLongPair getBottomRight() {
        return this.bottomRight;
    }

    /**
     * Set the bottomRight property: Location of the point on the right side of the window at the end of the timeframe.
     *
     * @param bottomRight the bottomRight value to set.
     * @return the WeatherWindow object itself.
     */
    public WeatherWindow setBottomRight(LatLongPair bottomRight) {
        this.bottomRight = bottomRight;
        return this;
    }

    /**
     * Get the beginTimestamp property: DateTime of the beginning of the window of movement, displayed in ISO8601
     * format.
     *
     * @return the beginTimestamp value.
     */
    public OffsetDateTime getBeginTimestamp() {
        return this.beginTimestamp;
    }

    /**
     * Set the beginTimestamp property: DateTime of the beginning of the window of movement, displayed in ISO8601
     * format.
     *
     * @param beginTimestamp the beginTimestamp value to set.
     * @return the WeatherWindow object itself.
     */
    public WeatherWindow setBeginTimestamp(OffsetDateTime beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
        return this;
    }

    /**
     * Get the endTimestamp property: DateTime of the end of the window of movement, displayed in ISO8601 format.
     *
     * @return the endTimestamp value.
     */
    public OffsetDateTime getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * Set the endTimestamp property: DateTime of the end of the window of movement, displayed in ISO8601 format.
     *
     * @param endTimestamp the endTimestamp value to set.
     * @return the WeatherWindow object itself.
     */
    public WeatherWindow setEndTimestamp(OffsetDateTime endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }

    /**
     * Get the beginStatus property: Storm status at the beginning of the window.
     *
     * @return the beginStatus value.
     */
    public String getBeginStatus() {
        return this.beginStatus;
    }

    /**
     * Set the beginStatus property: Storm status at the beginning of the window.
     *
     * @param beginStatus the beginStatus value to set.
     * @return the WeatherWindow object itself.
     */
    public WeatherWindow setBeginStatus(String beginStatus) {
        this.beginStatus = beginStatus;
        return this;
    }

    /**
     * Get the endStatus property: Storm status at the end of the window.
     *
     * @return the endStatus value.
     */
    public String getEndStatus() {
        return this.endStatus;
    }

    /**
     * Set the endStatus property: Storm status at the end of the window.
     *
     * @param endStatus the endStatus value to set.
     * @return the WeatherWindow object itself.
     */
    public WeatherWindow setEndStatus(String endStatus) {
        this.endStatus = endStatus;
        return this;
    }

    /**
     * Get the geometry property: Displayed when windowGeometry=true in request. GeoJSON object containing coordinates
     * describing the window of movement during the specified timeframe.
     *
     * @return the geometry value.
     */
    public GeoJsonGeometry getGeometry() {
        return this.geometry;
    }

    /**
     * Set the geometry property: Displayed when windowGeometry=true in request. GeoJSON object containing coordinates
     * describing the window of movement during the specified timeframe.
     *
     * @param geometry the geometry value to set.
     * @return the WeatherWindow object itself.
     */
    public WeatherWindow setGeometry(GeoJsonGeometry geometry) {
        this.geometry = geometry;
        return this;
    }
}
