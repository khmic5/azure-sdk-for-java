// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.maps.creator.fluent.models.TilesetDetailInfoInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response model for the Tileset List API. Returns a list of all tilesets. */
@Immutable
public final class TilesetListResponse {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TilesetListResponse.class);

    /*
     * A list of all tilesets.
     */
    @JsonProperty(value = "tilesets", access = JsonProperty.Access.WRITE_ONLY)
    private List<TilesetDetailInfoInner> tilesets;

    /*
     * If present, the location of the next page of data.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the tilesets property: A list of all tilesets.
     *
     * @return the tilesets value.
     */
    public List<TilesetDetailInfoInner> tilesets() {
        return this.tilesets;
    }

    /**
     * Get the nextLink property: If present, the location of the next page of data.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tilesets() != null) {
            tilesets().forEach(e -> e.validate());
        }
    }
}
