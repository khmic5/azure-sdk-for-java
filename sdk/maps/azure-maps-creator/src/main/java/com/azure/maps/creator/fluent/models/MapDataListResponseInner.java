// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.maps.creator.models.MapDataDetailInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response model for the Data List API. Returns a list of all the previously uploaded data. */
@Immutable
public final class MapDataListResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MapDataListResponseInner.class);

    /*
     * A list of all the previously uploaded data.
     */
    @JsonProperty(value = "mapDataList", access = JsonProperty.Access.WRITE_ONLY)
    private List<MapDataDetailInfo> mapDataList;

    /**
     * Get the mapDataList property: A list of all the previously uploaded data.
     *
     * @return the mapDataList value.
     */
    public List<MapDataDetailInfo> mapDataList() {
        return this.mapDataList;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mapDataList() != null) {
            mapDataList().forEach(e -> e.validate());
        }
    }
}
