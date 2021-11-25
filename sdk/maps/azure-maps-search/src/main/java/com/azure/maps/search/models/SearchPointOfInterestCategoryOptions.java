package com.azure.maps.search.models;

import java.util.List;

public class SearchPointOfInterestCategoryOptions extends BaseSearchPointOfInterestOptions<SearchPointOfInterestCategoryOptions> {
    private Boolean isTypeAhead;
    private List<SearchIndexes> extendedPostalCodesFor;

    public Boolean isTypeAhead() {
        return isTypeAhead;
    }

    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
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
