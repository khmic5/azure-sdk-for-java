package com.azure.maps.search.models;

import java.util.List;

import com.azure.maps.search.implementation.models.LatLongPairAbbreviated;

public class SearchNearbyPointsOfInterestOptions extends BaseSearchPointOfInterestOptions<SearchNearbyPointsOfInterestOptions> {
    private List<SearchIndexes> extendedPostalCodesFor;

    public SearchNearbyPointsOfInterestOptions(LatLongPairAbbreviated coordinates) {
        this.coordinates(coordinates);
    }

    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    public SearchNearbyPointsOfInterestOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }
}
