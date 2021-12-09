package com.azure.maps.search.models;

import java.util.List;
import java.util.Optional;

/**
 * Class holding optional parameters for Search.
 */
public final class SearchAddressOptions extends BaseSearchOptions<SearchAddressOptions> {
    private LatLong coordinates;
    private Boolean isTypeAhead;
    private List<SearchIndexes> extendedPostalCodesFor;
    private GeographicEntityType entityType;

    /**
     * Returns the coordinates.
     * @return
     */
    public Optional<LatLong> getCoordinates() {
        return Optional.ofNullable(coordinates);
    }

    /**
     * Returns whether this is a typeahead search.
     * @return
     */
    public Boolean isTypeAhead() {
        return isTypeAhead;
    }

    /**
     * Returns the extended postal codes.
     * @return
     */
    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    /**
     * Returns the entity type.
     * @return
     */
    public GeographicEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets whether this is a typeahead search.
     * @param isTypeAhead
     * @return
     */
    public SearchAddressOptions isTypeAhead(Boolean isTypeAhead) {
        this.isTypeAhead = isTypeAhead;
        return this;
    }

    /**
     * Sets the extended postal codes.
     * @param extendedPostalCodesFor
     * @return
     */
    public SearchAddressOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }

    /**
     * Sets the entity type.
     * @param entityType
     * @return
     */
    public SearchAddressOptions entityType(GeographicEntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    /**
     * Sets the coordinates.
     * @param coordinates
     * @return
     */
    public SearchAddressOptions coordinates(LatLong coordinates) {
        this.coordinates = coordinates;
        return this;
    }
}
