package com.azure.maps.search.models;

import java.util.List;

public class SearchNearbyPointsOfInterestOptions extends BaseSearchPointOfInterestOptions<SearchNearbyPointsOfInterestOptions> {
    private List<SearchIndexes> extendedPostalCodesFor;

    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    public SearchNearbyPointsOfInterestOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }
}
