package com.azure.maps.search.models;

import java.util.List;

public class SearchAddressOptions extends BaseSearchOptions<SearchAddressOptions> {
    private String query;
    private Boolean isTypeAhead;
    private List<SearchIndexes> extendedPostalCodesFor;
    private GeographicEntityType entityType;

    public SearchAddressOptions(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public Boolean isTypeAhead() {
        return isTypeAhead;
    }
    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    public GeographicEntityType getEntityType() {
        return entityType;
    }

    public SearchAddressOptions query(String query) {
        this.query = query;
        return this;
    }

    public SearchAddressOptions isTypeAhead(Boolean isTypeAhead) {
        this.isTypeAhead = isTypeAhead;
        return this;
    }

    public SearchAddressOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }

    public SearchAddressOptions entityType(GeographicEntityType entityType) {
        this.entityType = entityType;
        return this;
    }
}
