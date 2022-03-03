package com.azure.maps.traffic.models;

public final class TrafficFlowTileOptions {
    private TileFormat format;
    private TrafficFlowTileStyle style;
    private int zoom;
    private TileIndex tileIndex;
    private Integer thickness;

    public TrafficFlowTileOptions() {
    }

    public TileFormat getFormat() {
        return format;
    }

    public TrafficFlowTileOptions setFormat(TileFormat tileFormat) {
        this.format = tileFormat;
        return this;
    }

    public TrafficFlowTileStyle getTrafficFlowTileStyle() {
        return style;
    }

    public TrafficFlowTileOptions setTrafficFlowTileStyle(TrafficFlowTileStyle trafficFlowTileStyle) {
        this.style = trafficFlowTileStyle;
        return this;
    }

    public int getZoom() {
        return zoom;
    }

    public TrafficFlowTileOptions setZoom(int zoom) {
        this.zoom = zoom;
        return this;
    }
    
    public TileIndex getTileIndex() {
        return tileIndex;
    }

    public TrafficFlowTileOptions setTileIndex(TileIndex tileIndex) {
        this.tileIndex = tileIndex;
        return this;
    }

    public Integer getThickness() {
        return thickness;
    }

    public TrafficFlowTileOptions setThickness(Integer thickness) {
        this.thickness = thickness;
        return this;
    }
}