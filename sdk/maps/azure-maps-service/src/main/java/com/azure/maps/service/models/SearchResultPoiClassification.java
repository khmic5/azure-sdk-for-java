// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The classification for the POI being returned. */
@Immutable
public final class SearchResultPoiClassification {
    /*
     * Code property
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private String code;

    /*
     * Names array
     */
    @JsonProperty(value = "names", access = JsonProperty.Access.WRITE_ONLY)
    private List<SearchResultPoiClassificationName> names;

    /**
     * Get the code property: Code property.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Get the names property: Names array.
     *
     * @return the names value.
     */
    public List<SearchResultPoiClassificationName> getNames() {
        return this.names;
    }
}
