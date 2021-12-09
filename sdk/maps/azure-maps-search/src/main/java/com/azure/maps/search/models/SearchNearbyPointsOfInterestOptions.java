package com.azure.maps.search.models;

import java.util.List;

/**
 * Options for searching nearby points of interest.
 */
public final class SearchNearbyPointsOfInterestOptions extends BaseSearchPointOfInterestOptions<SearchNearbyPointsOfInterestOptions> {
    private List<SearchIndexes> extendedPostalCodesFor;

    /**
     * Returns the extended postal codes for.
     * @return
     */
    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    /**
     * Sets the extended postal codes for.
     * @param extendedPostalCodesFor
     * @return
     */
    public SearchNearbyPointsOfInterestOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }
}
