package com.azure.maps.search.models;

import java.util.List;

/**
 * Class holding parameters for a fuzzy search.
 */
public class FuzzySearchOptions extends BaseSearchPointOfInterestOptions<FuzzySearchOptions> {
    private Boolean isTypeAhead;
    private List<SearchIndexes> extendedPostalCodesFor;
    private Integer minFuzzyLevel;
    private Integer maxFuzzyLevel;
    private List<SearchIndexes> idxSet;
    private GeographicEntityType entityType;

    /**
     * Returns whether this is a typeahead search.
     * @return
     */
    public Boolean isTypeAhead() {
        return isTypeAhead;
    }

    /**
     * Returns the extended postal codes.
     * @return
     */
    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    /**
     * Returns the minimum fuzzy level.
     * @return
     */
    public Integer getMinFuzzyLevel() {
        return minFuzzyLevel;
    }

    /**
     * Returns the minimum fuzzy level.
     * @return
     */
    public Integer getMaxFuzzyLevel() {
        return maxFuzzyLevel;
    }

    /**
     * Returns the idx set.
     * @return
     */
    public List<SearchIndexes> getIdxSet() {
        return idxSet;
    }

    /**
     * Returns the entity type.
     * @return
     */
    public GeographicEntityType getEntityType() {
        return entityType;
    }

    /**
     * Sets whether this is a typeahead search.
     * @param isTypeAhead
     * @return
     */
    public FuzzySearchOptions isTypeAhead(Boolean isTypeAhead) {
        this.isTypeAhead = isTypeAhead;
        return this;
    }

    /**
     * Sets the extended postal codes.
     * @param extendedPostalCodesFor
     * @return
     */
    public FuzzySearchOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }

    /**
     * Sets the minimum fuzzy level.
     * @param minFuzzyLevel
     * @return
     */
    public FuzzySearchOptions minFuzzyLevel(Integer minFuzzyLevel) {
        this.minFuzzyLevel = minFuzzyLevel;
        return this;
    }

    /**
     * Sets the maximum fuzzy level.
     * @param maxFuzzyLevel
     * @return
     */
    public FuzzySearchOptions maxFuzzyLevel(Integer maxFuzzyLevel) {
        this.maxFuzzyLevel = maxFuzzyLevel;
        return this;
    }

    /**
     * Sets the idx set.
     * @param idxSet
     * @return
     */
    public FuzzySearchOptions idxSet(List<SearchIndexes> idxSet) {
        this.idxSet = idxSet;
        return this;
    }

    /**
     * Sets the entity type.
     * @param entityType
     * @return
     */
    public FuzzySearchOptions entityType(GeographicEntityType entityType) {
        this.entityType = entityType;
        return this;
    }
}
