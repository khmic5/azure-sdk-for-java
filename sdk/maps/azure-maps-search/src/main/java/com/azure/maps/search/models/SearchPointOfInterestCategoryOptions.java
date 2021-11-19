package com.azure.maps.search.models;

import java.util.List;

public class SearchPointOfInterestCategoryOptions extends BaseSearchPointOfInterestOptions<SearchPointOfInterestCategoryOptions> {
    private String query;
    private Boolean isTypeAhead;
    private List<SearchIndexes> extendedPostalCodesFor;

    /**
     *
     * @param query
     */

    public SearchPointOfInterestCategoryOptions(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }

    public Boolean isTypeAhead() {
        return isTypeAhead;
    }

    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    public SearchPointOfInterestCategoryOptions query(String query) {
        this.query = query;
        return this;
    }

    public SearchPointOfInterestCategoryOptions isTypeAhead(Boolean isTypeAhead) {
        this.isTypeAhead = isTypeAhead;
        return this;
    }

    public SearchPointOfInterestCategoryOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }
}
