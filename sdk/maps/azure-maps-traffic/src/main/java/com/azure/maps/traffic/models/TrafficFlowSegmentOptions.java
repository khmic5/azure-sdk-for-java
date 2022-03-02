package com.azure.maps.traffic.models;

import java.util.List;

public class TrafficFlowSegmentOptions {
    private ResponseFormat format;
    private TrafficFlowSegmentStyle style;
    private int zoom;
    private List<Double> coordinates;
    private SpeedUnit unit;
    private Integer thickness;
    private Boolean openLr;

    public TrafficFlowSegmentOptions() {
    }

    public ResponseFormat getFormat() {
        return format;
    }

    public TrafficFlowSegmentOptions setFormat(ResponseFormat responseFormat) {
        this.format = responseFormat;
        return this;
    }

    public TrafficFlowSegmentStyle getTrafficFlowSegmentStyle() {
        return style;
    }

    public TrafficFlowSegmentOptions setTrafficFlowTileStyle(TrafficFlowSegmentStyle trafficFlowSegmentStyle) {
        this.style = trafficFlowSegmentStyle;
        return this;
    }

    public int getZoom() {
        return zoom;
    }

    public TrafficFlowSegmentOptions setZoom(int zoom) {
        this.zoom = zoom;
        return this;
    }
    
    public List<Double> getCoordinates() {
        return coordinates;
    }

    public TrafficFlowSegmentOptions setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public SpeedUnit getUnit() {
        return unit;
    }

    public TrafficFlowSegmentOptions setUnit(SpeedUnit unit) {
        this.unit = unit;
        return this;
    }

    public Integer getThickness() {
        return thickness;
    }

    public TrafficFlowSegmentOptions setThickness(Integer thickness) {
        this.thickness = thickness;
        return this;
    }

    public Boolean getOpenLr() {
        return openLr;
    }

    public TrafficFlowSegmentOptions setOpenLr(Boolean openLr) {
        this.openLr = openLr;
        return this;
    }
}
