package com.azure.maps.search.models;

/**
 * Class holding optional parameters for Search.
 */
public final class ReverseSearchCrossStreetAddressOptions extends BaseReverseSearchOptions<ReverseSearchCrossStreetAddressOptions> {
    private Integer top;

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
