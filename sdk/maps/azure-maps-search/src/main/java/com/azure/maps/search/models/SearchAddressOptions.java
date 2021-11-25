package com.azure.maps.search.models;

import java.util.List;
import java.util.Optional;

public class SearchAddressOptions extends BaseSearchOptions<SearchAddressOptions> {
    private LatLong coordinates;
    private Boolean isTypeAhead;
    private List<SearchIndexes> extendedPostalCodesFor;
    private GeographicEntityType entityType;

    public Optional<LatLong> getCoordinates() {
        return Optional.ofNullable(coordinates);
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

    public SearchAddressOptions coordinates(LatLong coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
