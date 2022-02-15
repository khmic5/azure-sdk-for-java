package com.azure.maps.render.models;

import java.util.List;

import com.azure.maps.render.implementation.models.TilesetID;

public class MapAttributionOptions {
    private TilesetID tilesetId;
    private int zoom;
    private List<Double> bounds;

    public TilesetID getTilesetId() {
        return tilesetId;
    }

    public int getZoom() {
        return zoom;
    }

    public List<Double> getBounds() {
        return bounds;
    }
}