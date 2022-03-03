package com.azure.maps.traffic.models;

public final class TrafficFlowSegmentOptions {
    private ResponseFormat format;
    private TrafficFlowSegmentStyle style;
    private int zoom;
    private GeoPosition coordinates;
    private SpeedUnit unit;
    private Integer thickness;
    private Boolean openLr;
/**
 * Coordinates of the point close to the road segment. This parameter is a list of four
     *     coordinates, containing two coordinate pairs (lat, long, lat, long), and calculated using EPSG4326
     *     projection. When this endpoint is called directly, coordinates are passed in as a single string containing
     *     four coordinates, separated by commas.
 */
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
    
    public GeoPosition getCoordinates() {
        return coordinates;
    }

    public TrafficFlowSegmentOptions setCoordinates(GeoPosition coordinates) {
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
