// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** POI category. */
@Immutable
public final class SearchResultPoiCategorySet {
    /*
     * Category ID
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private Integer id;

    /**
     * Get the id property: Category ID.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }
}
