package com.azure.maps.traffic.models;

public final class TrafficIncidentTileOptions {
    private TileFormat format;
    private TrafficIncidentTileStyle style;
    private int zoom;
    private TileIndex tileIndex;
    private String trafficState;

    public TrafficIncidentTileOptions() {
    }

    public TileFormat getFormat() {
        return format;
    }

    public TrafficIncidentTileOptions setFormat(TileFormat tileFormat) {
        this.format = tileFormat;
        return this;
    }

    public TrafficIncidentTileStyle getTrafficIncidentTileStyle() {
        return style;
    }

    public TrafficIncidentTileOptions setTrafficIncidentTileStyle(TrafficIncidentTileStyle trafficIncidentTileStyle) {
        this.style = trafficIncidentTileStyle;
        return this;
    }

    public int getZoom() {
        return zoom;
    }

    public TrafficIncidentTileOptions setZoom(int zoom) {
        this.zoom = zoom;
        return this;
    }
    
    public TileIndex getTileIndex() {
        return tileIndex;
    }

    public TrafficIncidentTileOptions setTileIndex(TileIndex tileIndex) {
        this.tileIndex = tileIndex;
        return this;
    }

    public String getTrafficState() {
        return trafficState;
    }

    public TrafficIncidentTileOptions setTrafficState(String trafficState) {
        this.trafficState = trafficState;
        return this;
    }   
}