package com.azure.maps.traffic.models;

import com.azure.core.models.GeoPosition;
import com.azure.maps.traffic.implementation.models.ResponseFormat;

public final class TrafficFlowSegmentOptions {
    private ResponseFormat format;
    private TrafficFlowSegmentStyle style;
    private Integer zoom;
    private GeoPosition coordinates;
    private SpeedUnit unit;
    private Integer thickness;
    private Boolean openLr;

    /**
     * Constructor for TrafficFlowSegmentOptions
     */
    public TrafficFlowSegmentOptions() {
    }

    /**
     * Get response format
     * @return ResponseFormat
     */
    public ResponseFormat getFormat() {
        return format;
    }

    /**
     * Sets response format
     * @param responseFormat
     * @return
     */
    public TrafficFlowSegmentOptions setFormat(ResponseFormat responseFormat) {
        this.format = responseFormat;
        return this;
    }

    /**
     * get TrafficFlowSegmentStyle
     * @return TrafficFlowSegmentStyle
     */
    public TrafficFlowSegmentStyle getTrafficFlowSegmentStyle() {
        return style;
    }
 
    /**
     * Sets TrafficFlowTileStyle
     * @param trafficFlowSegmentStyle
     * @return
     */
    public TrafficFlowSegmentOptions setTrafficFlowSegmentStyle(TrafficFlowSegmentStyle trafficFlowSegmentStyle) {
        this.style = trafficFlowSegmentStyle;
        return this;
    }

    /**
     * get zoom
     * @return int
     */
    public int getZoom() {
        return zoom;
    }

    /**
     * sets zoom
     * @param zoom
     * @return
     */
    public TrafficFlowSegmentOptions setZoom(int zoom) {
        this.zoom = zoom;
        return this;
    }
    
    /**
     * get coordinates
     * @return GeoPosition
     */
    public GeoPosition getCoordinates() {
        return coordinates;
    }

    /**
     * sets coordinates
     * @param coordinates
     * @return
     */
    public TrafficFlowSegmentOptions setCoordinates(GeoPosition coordinates) {
        this.coordinates = coordinates;
        return this;
    }
 
    /**
     * gets unit
     * @return SpeedUnit
     */
    public SpeedUnit getUnit() {
        return unit;
    }

    /**
     * sets unit
     * @param unit
     * @return
     */
    public TrafficFlowSegmentOptions setUnit(SpeedUnit unit) {
        this.unit = unit;
        return this;
    }

    /**
     * gets thickness
     * @return integer
     */
    public Integer getThickness() {
        return thickness;
    }

    /**
     * sets thickness
     * @param thickness
     * @return
     */
    public TrafficFlowSegmentOptions setThickness(Integer thickness) {
        this.thickness = thickness;
        return this;
    }

    /**
     * gets openLr
     * @return boolean
     */
    public Boolean getOpenLr() {
        return openLr;
    }

    /**
     * sets openLr
     * @param openLr
     * @return
     */
    public TrafficFlowSegmentOptions setOpenLr(Boolean openLr) {
        this.openLr = openLr;
        return this;
    }
}