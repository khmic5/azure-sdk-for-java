// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The response model for the Dataset List API. The response body will contain a list of all the previously created
 * datasets.
 */
@Immutable
public final class DatasetListResponse {
    /*
     * A list of all the previously created datasets.
     */
    @JsonProperty(value = "datasets", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatasetDetailInfo> datasets;

    /*
     * If present, the location of the next page of data.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the datasets property: A list of all the previously created datasets.
     *
     * @return the datasets value.
     */
    public List<DatasetDetailInfo> getDatasets() {
        return this.datasets;
    }

    /**
     * Get the nextLink property: If present, the location of the next page of data.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }
}
