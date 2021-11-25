package com.azure.maps.search.models;

import java.util.List;

public class SearchStructuredAddressOptions extends BaseSearchOptions<SearchStructuredAddressOptions> {
    private GeographicEntityType entityType;
    private List<SearchIndexes> extendedPostalCodesFor;

    public GeographicEntityType getEntityType() {
        return entityType;
    }

    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    public SearchStructuredAddressOptions entityType(GeographicEntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    public SearchStructuredAddressOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }
}
