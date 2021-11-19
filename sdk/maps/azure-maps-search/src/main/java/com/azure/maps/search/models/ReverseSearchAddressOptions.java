package com.azure.maps.search.models;

import java.util.List;

import com.azure.maps.search.implementation.models.LatLongPairAbbreviated;

public class ReverseSearchAddressOptions {
    private LatLongPairAbbreviated coordinates;
    private String language;
    private Boolean includeSpeedLimit;
    private Integer heading;
    private Integer radiusInMeters;
    private String number;
    private Boolean includeRoadUse;
    private List<RoadUseType> roadUse;
    private Boolean allowFreeformNewline;
    private Boolean includeMatchType;
    private GeographicEntityType entityType;
    private LocalizedMapView localizedMapView;

    public ReverseSearchAddressOptions(LatLongPairAbbreviated coordinates) {
        this.coordinates = coordinates;
    }


    /**
     * @return LatLongPairAbbreviated return the coordinates
     */
    public LatLongPairAbbreviated getCoordinates() {
        return coordinates;
    }

    /**
     * @return String return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @return Boolean return the includeSpeedLimit
     */
    public Boolean includeSpeedLimit() {
        return includeSpeedLimit;
    }

    /**
     * @return Integer return the heading
     */
    public Integer getHeading() {
        return heading;
    }

    /**
     * @return Integer return the radiusInMeters
     */
    public Integer getRadiusInMeters() {
        return radiusInMeters;
    }

    /**
     * @return String return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @return Boolean return the includeRoadUse
     */
    public Boolean includeRoadUse() {
        return includeRoadUse;
    }

    /**
     * @return List<RoadUseType> return the roadUse
     */
    public List<RoadUseType> getRoadUse() {
        return roadUse;
    }

    /**
     * @return Boolean return the allowFreeformNewline
     */
    public Boolean allowFreeformNewline() {
        return allowFreeformNewline;
    }

    /**
     * @return Boolean return the includeMatchType
     */
    public Boolean includeMatchType() {
        return includeMatchType;
    }

    /**
     * @return GeographicEntityType return the entityType
     */
    public GeographicEntityType getEntityType() {
        return entityType;
    }

    /**
     * @return LocalizedMapView return the localizedMapView
     */
    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    public ReverseSearchAddressOptions coordinates(LatLongPairAbbreviated coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    public ReverseSearchAddressOptions language(String language) {
        this.language = language;
        return this;
    }

    public ReverseSearchAddressOptions includeSpeedLimit(Boolean includeSpeedLimit) {
        this.includeSpeedLimit = true;
        return this;
    }

    public ReverseSearchAddressOptions heading(Integer heading) {
        this.heading = heading;
        return this;
    }

    public ReverseSearchAddressOptions radiusInMeters(Integer radiusInMeters) {
        this.radiusInMeters = radiusInMeters;
        return this;
    }

    public ReverseSearchAddressOptions number(String number) {
        this.number = number;
        return this;
    }

    public ReverseSearchAddressOptions includeRoadUse(Boolean includeRoadUse) {
        this.includeRoadUse = includeRoadUse;
        return this;
    }

    public ReverseSearchAddressOptions roadUse(List<RoadUseType> roadUse) {
        this.roadUse = roadUse;
        return this;
    }

    public ReverseSearchAddressOptions allowFreeformNewline(Boolean allowFreeformNewline) {
        this.allowFreeformNewline = allowFreeformNewline;
        return this;
    }

    public ReverseSearchAddressOptions includeMatchType(Boolean includeMatchType) {
        this.includeMatchType = includeMatchType;
        return this;
    }

    public ReverseSearchAddressOptions entityType(GeographicEntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    public ReverseSearchAddressOptions localizedMapView(LocalizedMapView localizedMapView) {
        this.localizedMapView = localizedMapView;
        return this;
    }
}
