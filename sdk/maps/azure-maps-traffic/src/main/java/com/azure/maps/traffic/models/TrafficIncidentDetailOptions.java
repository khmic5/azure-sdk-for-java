package com.azure.maps.traffic.models;

import com.azure.core.models.GeoBoundingBox;

public final class TrafficIncidentDetailOptions {
    private IncidentDetailStyle style;
    private GeoBoundingBox boundingbox;
    private Integer boundingZoom;
    private String trafficmodelid;
    private String language;
    private ProjectionStandard projection;
    private IncidentGeometryType geometries;
    private Boolean expandCluster;
    private Boolean originalPosition;

    /**
     * TrafficIncidentDetailOptions constructor
     */
    public TrafficIncidentDetailOptions() {
    }

    /**
     * get incident detail style
     * @return IncidentDetailStyle
     */
    public IncidentDetailStyle getIncidentDetailStyle() {
        return style;
    }

    /**
     * sets incident detail style
     * @param incidentDetailStyle
     * @return
     */
    public TrafficIncidentDetailOptions setIncidentDetailStyle(IncidentDetailStyle incidentDetailStyle) {
        this.style = incidentDetailStyle;
        return this;
    }

    /**
     * get bounding box
     * @return GeoBoundingBox
     */
    public GeoBoundingBox getBoundingBox() {
        return boundingbox;
    }

    /**
     * sets bounding box
     * @param boundingbox
     * @return
     */
    public TrafficIncidentDetailOptions setBoundingBox(GeoBoundingBox boundingbox) {
        this.boundingbox = boundingbox;
        return this;
    }
    
    /**
     * get bounding zoom
     * @return int
     */
    public int getBoundingZoom() {
        return boundingZoom;
    }

    /**
     * set bounding zoom
     * @param boundingZoom
     * @return
     */
    public TrafficIncidentDetailOptions setBoundingZoom(int boundingZoom) {
        this.boundingZoom = boundingZoom;
        return this;
    }

    /**
     * get traffic model id
     * @return String
     */
    public String getTrafficmodelid() {
        return trafficmodelid;
    }

    /**
     * sets traffic model id
     * @param trafficmodelid
     * @return
     */
    public TrafficIncidentDetailOptions setTrafficmodelid(String trafficmodelid) {
        this.trafficmodelid = trafficmodelid;
        return this;
    }

    /**
     * get language
     * @return String
     */
    public String getLanguage() {
        return language;
    }

    /**
     * sets language
     * @param language
     * @return
     */
    public TrafficIncidentDetailOptions setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * get projection standard
     * @return ProjectionStandard
     */
    public ProjectionStandard getProjectionStandard() {
        return projection;
    }

    /**
     * set projection standard
     * @param projectionStandard
     * @return
     */
    public TrafficIncidentDetailOptions setProjectionStandard(ProjectionStandard projectionStandard) {
        this.projection = projectionStandard;
        return this;
    }

    /**
     * get incident geometry type
     * @return IncidentGeometryType
     */
    public IncidentGeometryType getIncidentGeometryType() {
        return geometries;
    }

    /**
     * set incident geometry type
     * @param incidentGeometryType
     * @return
     */
    public TrafficIncidentDetailOptions setIncidentGeometryType(IncidentGeometryType incidentGeometryType) {
        this.geometries = incidentGeometryType;
        return this;
    }

    /**
     * get expand cluster
     * @return boolean
     */
    public Boolean getExpandCluster() {
        return expandCluster;
    }

    /**
     * set expand cluster
     * @param expandCluster
     * @return
     */
    public TrafficIncidentDetailOptions setExpandCluster(Boolean expandCluster) {
        this.expandCluster = expandCluster;
        return this;
    }

    /**
     * get original position
     * @return boolean
     */
    public Boolean getOriginalPosition() {
        return originalPosition;
    }

    /**
     * set original position
     * @param originalPosition
     * @return 
     */
    public TrafficIncidentDetailOptions setOriginalPosition(Boolean originalPosition) {
        this.originalPosition = originalPosition;
        return this;
    }
}