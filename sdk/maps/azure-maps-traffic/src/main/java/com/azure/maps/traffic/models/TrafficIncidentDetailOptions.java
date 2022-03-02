package com.azure.maps.traffic.models;

import java.util.List;

import com.azure.maps.traffic.implementation.models.IncidentDetailStyle;
import com.azure.maps.traffic.implementation.models.IncidentGeometryType;
import com.azure.maps.traffic.implementation.models.ProjectionStandard;
import com.azure.maps.traffic.implementation.models.ResponseFormat;

public class TrafficIncidentDetailOptions {
    private ResponseFormat format;
    private IncidentDetailStyle style;
    private List<Double> boundingbox;
    private int boundingZoom;
    private String trafficmodelid;
    private String language;
    private ProjectionStandard projection;
    private IncidentGeometryType geometries;
    private Boolean expandCluster;
    private Boolean originalPosition;

    public TrafficIncidentDetailOptions() {
    }

    public ResponseFormat getFormat() {
        return format;
    }

    public TrafficIncidentDetailOptions setFormat(ResponseFormat responseFormat) {
        this.format = responseFormat;
        return this;
    }

    public IncidentDetailStyle getIncidentDetailStyle() {
        return style;
    }

    public TrafficIncidentDetailOptions setIncidentDetailStyle(IncidentDetailStyle incidentDetailStyle) {
        this.style = incidentDetailStyle;
        return this;
    }

    public List<Double> getBoundingBox() {
        return boundingbox;
    }

    public TrafficIncidentDetailOptions setBoundingBox(List<Double> boundingbox) {
        this.boundingbox = boundingbox;
        return this;
    }
    
    public int getBoundingZoom() {
        return boundingZoom;
    }

    public TrafficIncidentDetailOptions setBoundingZoom(int boundingZoom) {
        this.boundingZoom = boundingZoom;
        return this;
    }

    public String getTrafficmodelid() {
        return trafficmodelid;
    }

    public TrafficIncidentDetailOptions setTrafficmodelid(String trafficmodelid) {
        this.trafficmodelid = trafficmodelid;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public TrafficIncidentDetailOptions setLanguage(String language) {
        this.language = language;
        return this;
    }

    public ProjectionStandard getProjectionStandard() {
        return projection;
    }

    public TrafficIncidentDetailOptions setProjectionStandard(ProjectionStandard projectionStandard) {
        this.projection = projectionStandard;
        return this;
    }

    public IncidentGeometryType getIncidentGeometryType() {
        return geometries;
    }

    public TrafficIncidentDetailOptions setIncidentGeometryType(IncidentGeometryType incidentGeometryType) {
        this.geometries = incidentGeometryType;
        return this;
    }

    public Boolean getExpandCluster() {
        return expandCluster;
    }

    public TrafficIncidentDetailOptions setExpandCluster(Boolean expandCluster) {
        this.expandCluster = expandCluster;
        return this;
    }

    public Boolean getOriginalPosition() {
        return originalPosition;
    }

    public TrafficIncidentDetailOptions setOriginalPosition(Boolean originalPosition) {
        this.originalPosition = originalPosition;
        return this;
    }
}