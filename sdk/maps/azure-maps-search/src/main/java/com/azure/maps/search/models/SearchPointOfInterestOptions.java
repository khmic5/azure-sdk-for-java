package com.azure.maps.search.models;

import java.util.List;

public class SearchPointOfInterestOptions extends BaseSearchPointOfInterestOptions<SearchPointOfInterestOptions> {
    private Boolean isTypeAhead;
    private List<PointOfInterestExtendedPostalCodes> extendedPostalCodesFor;

    public Boolean isTypeAhead() {
        return isTypeAhead;
    }

    public List<PointOfInterestExtendedPostalCodes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    public SearchPointOfInterestOptions isTypeAhead(Boolean isTypeAhead) {
        this.isTypeAhead = isTypeAhead;
        return this;
    }

    public SearchPointOfInterestOptions extendedPostalCodesFor(List<PointOfInterestExtendedPostalCodes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }
}
