package com.azure.maps.search.models;

import java.util.List;

public class FuzzySearchOptions extends BaseSearchPointOfInterestOptions<FuzzySearchOptions> {
    private String query;
    private Boolean isTypeAhead;
    private List<SearchIndexes> extendedPostalCodesFor;
    private Integer minFuzzyLevel;
    private Integer maxFuzzyLevel;
    private List<SearchIndexes> idxSet;
    private GeographicEntityType entityType;

    /**
     *
     * @param query
     */

    public FuzzySearchOptions(String query) {
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

    public Integer getMinFuzzyLevel() {
        return minFuzzyLevel;
    }

    public Integer getMaxFuzzyLevel() {
        return maxFuzzyLevel;
    }

    public List<SearchIndexes> getIdxSet() {
        return idxSet;
    }

    public GeographicEntityType getEntityType() {
        return entityType;
    }

    public FuzzySearchOptions query(String query) {
        this.query = query;
        return this;
    }

    public FuzzySearchOptions isTypeAhead(Boolean isTypeAhead) {
        this.isTypeAhead = isTypeAhead;
        return this;
    }

    public FuzzySearchOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }

    public FuzzySearchOptions minFuzzyLevel(Integer minFuzzyLevel) {
        this.minFuzzyLevel = minFuzzyLevel;
        return this;
    }

    public FuzzySearchOptions maxFuzzyLevel(Integer maxFuzzyLevel) {
        this.maxFuzzyLevel = maxFuzzyLevel;
        return this;
    }

    public FuzzySearchOptions idxSet(List<SearchIndexes> idxSet) {
        this.idxSet = idxSet;
        return this;
    }

    public FuzzySearchOptions entityType(GeographicEntityType entityType) {
        this.entityType = entityType;
        return this;
    }
}
