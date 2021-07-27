// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.maps.search.fluent.models.SearchPolygonResponseInner;
import java.util.List;

/** An immutable client-side representation of SearchPolygonResponse. */
public interface SearchPolygonResponse {
    /**
     * Gets the additionalData property: Results array.
     *
     * @return the additionalData value.
     */
    List<SearchPolygonResult> additionalData();

    /**
     * Gets the inner com.azure.maps.search.fluent.models.SearchPolygonResponseInner object.
     *
     * @return the inner object.
     */
    SearchPolygonResponseInner innerModel();
}
