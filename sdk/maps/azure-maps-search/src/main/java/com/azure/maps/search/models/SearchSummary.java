// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.LatLongPairAbbreviated;
import com.azure.maps.search.implementation.models.QueryType;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary object for a Search API response. */
@Immutable
public final class SearchSummary {
    /*
     * The query parameter that was used to produce these search results.
     */
    @JsonProperty(value = "query", access = JsonProperty.Access.WRITE_ONLY)
    private String query;

    /*
     * The type of query being returned: NEARBY or NON_NEAR.
     */
    @JsonProperty(value = "queryType", access = JsonProperty.Access.WRITE_ONLY)
    private QueryType queryType;

    /*
     * Time spent resolving the query, in milliseconds.
     */
    @JsonProperty(value = "queryTime", access = JsonProperty.Access.WRITE_ONLY)
    private Integer queryTime;

    /*
     * Number of results in the response.
     */
    @JsonProperty(value = "numResults", access = JsonProperty.Access.WRITE_ONLY)
    private Integer numResults;

    /*
     * Maximum number of responses that will be returned
     */
    @JsonProperty(value = "limit", access = JsonProperty.Access.WRITE_ONLY)
    private Integer top;

    /*
     * The starting offset of the returned Results within the full Result set.
     */
    @JsonProperty(value = "offset", access = JsonProperty.Access.WRITE_ONLY)
    private Integer skip;

    /*
     * The total number of Results found.
     */
    @JsonProperty(value = "totalResults", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalResults;

    /*
     * The maximum fuzzy level required to provide Results.
     */
    @JsonProperty(value = "fuzzyLevel", access = JsonProperty.Access.WRITE_ONLY)
    private Integer fuzzyLevel;

    /*
     * Indication when the internal search engine has applied a geospatial bias
     * to improve the ranking of results.  In  some methods, this can be
     * affected by setting the lat and lon parameters where available.  In
     * other cases it is  purely internal.
     */
    @JsonProperty(value = "geoBias", access = JsonProperty.Access.WRITE_ONLY)
    private LatLongPairAbbreviated geoBias;

    /**
     * Get the query property: The query parameter that was used to produce these search results.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Get the queryType property: The type of query being returned: NEARBY or NON_NEAR.
     *
     * @return the queryType value.
     */
    public QueryType getQueryType() {
        return this.queryType;
    }

    /**
     * Get the queryTime property: Time spent resolving the query, in milliseconds.
     *
     * @return the queryTime value.
     */
    public Integer getQueryTime() {
        return this.queryTime;
    }

    /**
     * Get the numResults property: Number of results in the response.
     *
     * @return the numResults value.
     */
    public Integer getNumResults() {
        return this.numResults;
    }

    /**
     * Get the top property: Maximum number of responses that will be returned.
     *
     * @return the top value.
     */
    public Integer getTop() {
        return this.top;
    }

    /**
     * Get the skip property: The starting offset of the returned Results within the full Result set.
     *
     * @return the skip value.
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * Get the totalResults property: The total number of Results found.
     *
     * @return the totalResults value.
     */
    public Integer getTotalResults() {
        return this.totalResults;
    }

    /**
     * Get the fuzzyLevel property: The maximum fuzzy level required to provide Results.
     *
     * @return the fuzzyLevel value.
     */
    public Integer getFuzzyLevel() {
        return this.fuzzyLevel;
    }

    /**
     * Get the geoBias property: Indication when the internal search engine has applied a geospatial bias to improve the
     * ranking of results. In some methods, this can be affected by setting the lat and lon parameters where available.
     * In other cases it is purely internal.
     *
     * @return the geoBias value.
     */
    public LatLongPairAbbreviated getGeoBias() {
        return this.geoBias;
    }
}
