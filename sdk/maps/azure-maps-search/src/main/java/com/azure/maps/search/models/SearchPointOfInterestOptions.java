package com.azure.maps.search.models;

import java.util.List;

/**
 * Options for searching points of interest.
 */
public final class SearchPointOfInterestOptions extends BaseSearchPointOfInterestOptions<SearchPointOfInterestOptions> {
    private Boolean isTypeAhead;
    private List<PointOfInterestExtendedPostalCodes> extendedPostalCodesFor;
    private String query;

    /**
     * Builds fuzzy search options with query string and coordinates.
     * @param query
     * @param countryFilter
     */
    public SearchPointOfInterestOptions(String query, LatLong coordinates) {
        this.query = query;
        this.setCoordinates(coordinates);
    }

    /**
     * Builds fuzzy search options with query string and country filter.
     * @param query
     * @param countryFilter
     */
    public SearchPointOfInterestOptions(String query, List<String> countryFilter) {
        this.query = query;
        this.setCountryFilter(countryFilter);
    }

    /**
     * Returns whether this is a typeahead search.
     * @return
     */
    public Boolean isTypeAhead() {
        return isTypeAhead;
    }

    /**
     * Returns the extended postal codes for.
     * @return
     */
    public List<PointOfInterestExtendedPostalCodes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    /**
     * Returns the query string.
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets whether this is a typeahead search.
     * @param isTypeAhead
     * @return
     */
    public SearchPointOfInterestOptions isTypeAhead(Boolean isTypeAhead) {
        this.isTypeAhead = isTypeAhead;
        return this;
    }

    /**
     * Sets the extended postal codes for.
     * @param extendedPostalCodesFor
     * @return
     */
    public SearchPointOfInterestOptions setExtendedPostalCodesFor(List<PointOfInterestExtendedPostalCodes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }

    /**
     * Sets the query string.
     */
    public SearchPointOfInterestOptions setQuery(String query) {
        this.query = query;
        return this;
    }
}
