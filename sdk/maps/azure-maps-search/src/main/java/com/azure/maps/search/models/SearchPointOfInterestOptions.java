package com.azure.maps.search.models;

import java.util.List;

public class SearchPointOfInterestOptions extends BaseSearchPointOfInterestOptions<SearchPointOfInterestOptions> {
    private String query;
    private Boolean isTypeAhead;
    private List<PointOfInterestExtendedPostalCodes> extendedPostalCodesFor;

    public String getQuery() {
        return query;
    }

    public Boolean isTypeAhead() {
        return isTypeAhead;
    }

    public List<PointOfInterestExtendedPostalCodes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    public SearchPointOfInterestOptions query(String query) {
        this.query = query;
        return this;
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
