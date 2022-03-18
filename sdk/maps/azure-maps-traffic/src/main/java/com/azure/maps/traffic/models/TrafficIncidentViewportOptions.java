package com.azure.maps.traffic.models;

import com.azure.core.models.GeoBoundingBox;

public final class TrafficIncidentViewportOptions {
    private GeoBoundingBox boundingbox;
    private Integer boundingzoom;
    private GeoBoundingBox overviewbox;
    private Integer overviewzoom;
    private Boolean copyright;
    
    /**
     * TrafficIncidentViewportOptions constructor
     */
    public TrafficIncidentViewportOptions() {
    }

    /**
     * get bounding box
     * @return GeoBoundingBox
     */
    public GeoBoundingBox getBoundingBox() {
        return boundingbox;
    }

    /**
     * set bounding box
     * @param boundingbox
     * @return
     */
    public TrafficIncidentViewportOptions setBoundingBox(GeoBoundingBox boundingbox) {
        this.boundingbox = boundingbox;
        return this;
    }

    /**
     * get bounding xoom
     * @return int
     */
    public int getBoundingZoom() {
        return boundingzoom;
    }

    /**
     * set bounding zoom
     * @param boundingZoom
     * @return
     */
    public TrafficIncidentViewportOptions setBoundingZoom(int boundingZoom) {
        this.boundingzoom = boundingZoom;
        return this;
    }

    /**
     * get overviewbox
     * @return GeoBoundingBox
     */
    public GeoBoundingBox getOverviewBox() {
        return overviewbox;
    }

    /**
     * set overview
     * @param overviewBox
     * @return
     */
    public TrafficIncidentViewportOptions setOverview(GeoBoundingBox overviewBox) {
        this.overviewbox = overviewBox;
        return this;
    }

    /**
     * get overview zoom
     * @return int
     */
    public int getOverviewZoom() {
        return overviewzoom;
    }

    /**
     * set overview zoom
     * @param overviewZoom
     * @return
     */
    public TrafficIncidentViewportOptions setOverviewZoom(int overviewZoom) {
        this.overviewzoom = overviewZoom;
        return this;
    }

    /**
     * get copyright
     * @return boolean
     */
    public Boolean getCopyright() {
        return copyright;
    }

    /**
     * set copyright
     * @param copyright
     * @return
     */
    public TrafficIncidentViewportOptions setCopyright(Boolean copyright) {
        this.copyright = copyright;
        return this;
    }
}