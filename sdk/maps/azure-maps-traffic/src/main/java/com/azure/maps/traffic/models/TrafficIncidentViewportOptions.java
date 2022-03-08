package com.azure.maps.traffic.models;

import com.azure.core.models.GeoBoundingBox;

public final class TrafficIncidentViewportOptions {
    private ResponseFormat format;
    private GeoBoundingBox boundingbox;
    private int boundingzoom;
    private GeoBoundingBox overviewbox;
    private int overviewzoom;
    private Boolean copyright;

    public TrafficIncidentViewportOptions() {
    }

    public ResponseFormat getFormat() {
        return format;
    }

    public GeoBoundingBox getBoundingBox() {
        return boundingbox;
    }

    public TrafficIncidentViewportOptions setBoundingBox(GeoBoundingBox boundingbox) {
        this.boundingbox = boundingbox;
        return this;
    }

    public int getBoundingZoom() {
        return boundingzoom;
    }

    public TrafficIncidentViewportOptions setBoundingZoom(int boundingZoom) {
        this.boundingzoom = boundingZoom;
        return this;
    }

    public GeoBoundingBox getOverviewBox() {
        return overviewbox;
    }

    public TrafficIncidentViewportOptions setOverview(GeoBoundingBox overviewBox) {
        this.overviewbox = overviewBox;
        return this;
    }

    public int getOverviewZoom() {
        return overviewzoom;
    }

    public TrafficIncidentViewportOptions setOverviewZoom(int overviewZoom) {
        this.overviewzoom = overviewZoom;
        return this;
    }

    public Boolean getCopyright() {
        return copyright;
    }

    public TrafficIncidentViewportOptions getCopyright(Boolean copyright) {
        this.copyright = copyright;
        return this;
    }
}