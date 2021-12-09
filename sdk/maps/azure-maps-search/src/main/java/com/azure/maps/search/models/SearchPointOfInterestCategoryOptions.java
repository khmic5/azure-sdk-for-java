package com.azure.maps.search.models;

import java.util.List;

/**
 * Options for searching point of interest category.
 */
public final class SearchPointOfInterestCategoryOptions extends BaseSearchPointOfInterestOptions<SearchPointOfInterestCategoryOptions> {
    private Boolean isTypeAhead;
    private List<SearchIndexes> extendedPostalCodesFor;

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
    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    /**
     * Sets whether this is a typeahead search.
     * @param isTypeAhead
     * @return
     */
    public SearchPointOfInterestCategoryOptions isTypeAhead(Boolean isTypeAhead) {
        this.isTypeAhead = isTypeAhead;
        return this;
    }

    /**
     * Sets the extended postal codes for.
     * @param extendedPostalCodesFor
     * @return
     */
    public SearchPointOfInterestCategoryOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }
}
