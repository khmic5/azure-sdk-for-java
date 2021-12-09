package com.azure.maps.search.models;

import java.util.List;

/**
 * Class holding optional parameters for Geometry Search.
 */
public final class SearchInsideGeometryOptions extends BaseSearchGeometryOptions<SearchInsideGeometryOptions> {
    private String language;
    private List<SearchIndexes> extendedPostalCodesFor;
    private List<SearchIndexes> idxSet;

    /**
     * Returns the language.
     * @return
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Returns the extended postal codes.
     * @return
     */
    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return this.extendedPostalCodesFor;
    }

    /**
     * Returns the index set.
     * @return
     */
    public List<SearchIndexes> getIdxSet() {
        return this.idxSet;
    }

    /**
     * Sets the language.
     * @param language
     * @return
     */
    public SearchInsideGeometryOptions language(String language) {
        this.language = language;
        return this;
    }

    /**
     * Sets the extended postal codes.
     * @param extendedPostalCodesFor
     * @return
     */
    public SearchInsideGeometryOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }

    /**
     * Sets the idx set.
     * @param idxSet
     * @return
     */
    public SearchInsideGeometryOptions idxSet(List<SearchIndexes> idxSet) {
        this.idxSet = idxSet;
        return this;
    }
}
