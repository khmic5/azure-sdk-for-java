// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** This object is returned from a successful Get Daily Indices call. */
@Fluent
public final class DailyIndicesResponse {
    /*
     * A list of all daily indices for the queried location.
     */
    @JsonProperty(value = "results")
    private List<DailyIndex> results;

    /**
     * Get the results property: A list of all daily indices for the queried location.
     *
     * @return the results value.
     */
    public List<DailyIndex> getResults() {
        return this.results;
    }

    /**
     * Set the results property: A list of all daily indices for the queried location.
     *
     * @param results the results value to set.
     * @return the DailyIndicesResponse object itself.
     */
    public DailyIndicesResponse setResults(List<DailyIndex> results) {
        this.results = results;
        return this;
    }
}
