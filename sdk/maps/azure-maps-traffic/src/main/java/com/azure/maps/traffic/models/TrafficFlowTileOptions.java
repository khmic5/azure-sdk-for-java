package com.azure.maps.traffic.models;

public final class TrafficFlowTileOptions {
    private TileFormat format;
    private TrafficFlowTileStyle style;
    private Integer zoom;
    private TileIndex tileIndex;
    private Integer thickness;

    /**
     * TrafficFlowTileOptions constructor
     */
    public TrafficFlowTileOptions() {
    }

    /**
     * gets format
     * @return TileFormat
     */
    public TileFormat getFormat() {
        return format;
    }

    /**
     * sets format
     * @param tileFormat
     * @return
     */
    public TrafficFlowTileOptions setFormat(TileFormat tileFormat) {
        this.format = tileFormat;
        return this;
    }

    /**
     * gets style
     * @return TrafficFlowTileStyle
     */
    public TrafficFlowTileStyle getTrafficFlowTileStyle() {
        return style;
    }

    /**
     * sets TrafficFlowTileStyle
     * @param trafficFlowTileStyle
     * @return
     */
    public TrafficFlowTileOptions setTrafficFlowTileStyle(TrafficFlowTileStyle trafficFlowTileStyle) {
        this.style = trafficFlowTileStyle;
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
    public TrafficFlowTileOptions setZoom(int zoom) {
        this.zoom = zoom;
        return this;
    }
    
    /**
     * gets tileindex
     * @return TileIndex
     */
    public TileIndex getTileIndex() {
        return tileIndex;
    }

    /**
     * sets tile index
     * @param tileIndex
     * @return
     */
    public TrafficFlowTileOptions setTileIndex(TileIndex tileIndex) {
        this.tileIndex = tileIndex;
        return this;
    }

    /**
     * gets thickness
     * @return Integer
     */
    public Integer getThickness() {
        return thickness;
    }

    /**
     * sets thickness
     * @param thickness
     * @return
     */
    public TrafficFlowTileOptions setThickness(Integer thickness) {
        this.thickness = thickness;
        return this;
    }
}