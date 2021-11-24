package com.azure.maps.search.models;

import java.util.List;

public class ReverseSearchAddressOptions extends BaseReverseSearchOptions<ReverseSearchAddressOptions> {
    private Boolean includeSpeedLimit;
    private String number;
    private Boolean includeRoadUse;
    private List<RoadUseType> roadUse;
    private Boolean allowFreeformNewline;
    private Boolean includeMatchType;
    private GeographicEntityType entityType;

    public Boolean includeSpeedLimit() {
        return includeSpeedLimit;
    }

    public String getNumber() {
        return number;
    }

    public Boolean includeRoadUse() {
        return includeRoadUse;
    }

    public List<RoadUseType> getRoadUse() {
        return roadUse;
    }

    public Boolean allowFreeformNewline() {
        return allowFreeformNewline;
    }

    public Boolean includeMatchType() {
        return includeMatchType;
    }

    public GeographicEntityType getEntityType() {
        return entityType;
    }

    public ReverseSearchAddressOptions includeSpeedLimit(Boolean includeSpeedLimit) {
        this.includeSpeedLimit = true;
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
}
