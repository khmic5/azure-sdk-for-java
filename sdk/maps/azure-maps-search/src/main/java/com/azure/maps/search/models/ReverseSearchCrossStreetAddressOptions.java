package com.azure.maps.search.models;

/**
 * Class holding optional parameters for Search.
 */
public final class ReverseSearchCrossStreetAddressOptions extends BaseReverseSearchOptions<ReverseSearchCrossStreetAddressOptions> {
    private Integer top;

    /**
     * Builds reverse cross street search options with coordinates.
     * @param query
     * @param countryFilter
     */
    public ReverseSearchCrossStreetAddressOptions(LatLong coordinates) {
        this.setCoordinates(coordinates);
    }

    /**
     * Returns the top value.
     * @return
     */
    public Integer getTop() {
        return top;
    }

    /**
     * Sets the top value.
     * @param top
     * @return
     */
    public ReverseSearchCrossStreetAddressOptions setTop(Integer top) {
        this.top = top;
        return this;
    }
}
