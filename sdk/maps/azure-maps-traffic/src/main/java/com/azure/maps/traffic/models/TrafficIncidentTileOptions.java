package com.azure.maps.traffic.models;

public final class TrafficIncidentTileOptions {
    private TileFormat format;
    private TrafficIncidentTileStyle style;
    private Integer zoom;
    private TileIndex tileIndex;
    private String trafficState;

    /**
     * TrafficIncidentTileOptions constructor
     */
    public TrafficIncidentTileOptions() {
    }

    /**
     * get format
     * @return TileFormat
     */
    public TileFormat getFormat() {
        return format;
    }

    /**
     * set format
     * @param tileFormat
     * @return
     */
    public TrafficIncidentTileOptions setFormat(TileFormat tileFormat) {
        this.format = tileFormat;
        return this;
    }

    /**
     * get traffic incident tile style
     * @return TrafficIncidentTileStyle
     */
    public TrafficIncidentTileStyle getTrafficIncidentTileStyle() {
        return style;
    }

    /**
     * set traffic incident tile style
     * @param trafficIncidentTileStyle
     * @return
     */
    public TrafficIncidentTileOptions setTrafficIncidentTileStyle(TrafficIncidentTileStyle trafficIncidentTileStyle) {
        this.style = trafficIncidentTileStyle;
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
     * set zoom
     * @param zoom
     * @return
     */
    public TrafficIncidentTileOptions setZoom(int zoom) {
        this.zoom = zoom;
        return this;
    }
    
    /**
     * get tile index
     * @return TileIndex
     */
    public TileIndex getTileIndex() {
        return tileIndex;
    }

    /**
     * set tile index
     * @param tileIndex
     * @return
     */
    public TrafficIncidentTileOptions setTileIndex(TileIndex tileIndex) {
        this.tileIndex = tileIndex;
        return this;
    }

    /**
     * get traffic state
     * @return String
     */
    public String getTrafficState() {
        return trafficState;
    }

    /**
     * set traffic state
     * @param trafficState
     * @return
     */
    public TrafficIncidentTileOptions setTrafficState(String trafficState) {
        this.trafficState = trafficState;
        return this;
    }   
}