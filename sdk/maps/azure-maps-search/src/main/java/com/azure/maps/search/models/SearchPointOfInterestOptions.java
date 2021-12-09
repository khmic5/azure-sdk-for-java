package com.azure.maps.search.models;

import java.util.List;

/**
 * Options for searching points of interest.
 */
public final class SearchPointOfInterestOptions extends BaseSearchPointOfInterestOptions<SearchPointOfInterestOptions> {
    private Boolean isTypeAhead;
    private List<PointOfInterestExtendedPostalCodes> extendedPostalCodesFor;

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
    public SearchPointOfInterestOptions extendedPostalCodesFor(List<PointOfInterestExtendedPostalCodes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }
}
