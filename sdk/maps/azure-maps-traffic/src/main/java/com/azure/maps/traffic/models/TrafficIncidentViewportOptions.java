package com.azure.maps.traffic.models;

import java.util.List;

public class TrafficIncidentViewportOptions {
    private ResponseFormat format;
    private List<Double> boundingbox;
    private int boundingzoom;
    private List<Double> overviewbox;
    private int overviewzoom;
    private Boolean copyright;

    public TrafficIncidentViewportOptions() {
    }

    public ResponseFormat getFormat() {
        return format;
    }

    public List<Double> getBoundingBox() {
        return boundingbox;
    }

    public TrafficIncidentViewportOptions setBoundingBox(List<Double> boundingbox) {
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

    public List<Double> getOverviewBox() {
        return overviewbox;
    }

    public TrafficIncidentViewportOptions setOverviewBox(List<Double> overviewBox) {
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