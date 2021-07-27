// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** POI category result. */
@Immutable
public final class PoiCategoryResult {
    /*
     * Unique ID for the category. ID can be used to restrict search results to
     * specific categories through other Search Service APIs, like [Get Search
     * POI](https://docs.microsoft.com/rest/api/maps/search/getsearchpoi).
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer id;

    /*
     * Name of the category
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Array of child category ids
     */
    @JsonProperty(value = "childCategoryIds", access = JsonProperty.Access.WRITE_ONLY)
    private List<Integer> childCategoryIds;

    /*
     * Array of alternative names of the category
     */
    @JsonProperty(value = "synonyms", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> synonyms;

    /**
     * Get the id property: Unique ID for the category. ID can be used to restrict search results to specific categories
     * through other Search Service APIs, like [Get Search
     * POI](https://docs.microsoft.com/rest/api/maps/search/getsearchpoi).
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Get the name property: Name of the category.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the childCategoryIds property: Array of child category ids.
     *
     * @return the childCategoryIds value.
     */
    public List<Integer> getChildCategoryIds() {
        return this.childCategoryIds;
    }

    /**
     * Get the synonyms property: Array of alternative names of the category.
     *
     * @return the synonyms value.
     */
    public List<String> getSynonyms() {
        return this.synonyms;
    }
}
