package com.azure.maps.render.models;

import com.azure.maps.render.implementation.models.TileIndex;

public class MapStateTileOptions {
    private String statesetId;
    private TileIndex tileIndex;

    public String getStatesetId() {
        return statesetId;
    }

    public TileIndex getTileIndex() {
        return tileIndex;
    }
}
