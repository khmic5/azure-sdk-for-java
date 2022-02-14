package com.azure.maps.render.models;

import java.time.OffsetDateTime;

public class MapTileV2Options {
    private TilesetID tilesetId;
    private TileIndex tileIndex;
    private OffsetDateTime timeStamp;
    private MapTileSize tileSize;
    private String language;
    private LocalizedMapView localizedMapView;
    private String query;

    public MapTileV2Options(String query) {
        this.query = query;
    }

    public TilesetID getTilesetID() {
        return tilesetId;
    }

    public TileIndex getTileIndex() {
        return tileIndex;
    }

    public OffsetDateTime getTimeStamp() {
        return timeStamp;
    }
    
    public MapTileSize getMapTileSize() {
        return tileSize;
    }

    public String getLanguage() {
        return language;
    }

    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    public String getQuery() {
        return query;
    }
    
}
