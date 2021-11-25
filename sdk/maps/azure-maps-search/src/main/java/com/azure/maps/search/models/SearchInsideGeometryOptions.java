package com.azure.maps.search.models;

import java.util.List;

public class SearchInsideGeometryOptions extends BaseSearchGeometryOptions<SearchInsideGeometryOptions> {
    private String language;
    private List<SearchIndexes> extendedPostalCodesFor;
    private List<SearchIndexes> idxSet;

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return this.extendedPostalCodesFor;
    }

    public List<SearchIndexes> getIdxSet() {
        return this.idxSet;
    }

    public SearchInsideGeometryOptions language(String language) {
        this.language = language;
        return this;
    }

    public SearchInsideGeometryOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }

    public SearchInsideGeometryOptions idxSet(List<SearchIndexes> idxSet) {
        this.idxSet = idxSet;
        return this;
    }
}
