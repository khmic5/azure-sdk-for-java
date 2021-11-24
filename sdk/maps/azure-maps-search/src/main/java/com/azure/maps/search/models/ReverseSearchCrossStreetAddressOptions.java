package com.azure.maps.search.models;

public class ReverseSearchCrossStreetAddressOptions extends BaseReverseSearchOptions<ReverseSearchCrossStreetAddressOptions> {
    private Integer top;

    public Integer getTop() {
        return top;
    }

    public ReverseSearchCrossStreetAddressOptions top(Integer top) {
        this.top = top;
        return this;
    }
}
