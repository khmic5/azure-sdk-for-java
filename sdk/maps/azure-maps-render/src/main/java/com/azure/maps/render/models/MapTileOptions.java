package com.azure.maps.render.models;

import java.time.OffsetDateTime;

public class MapTileOptions {
    private TilesetID tilesetId;
    private TileIndex tileIndex;
    private OffsetDateTime timeStamp;
    private MapTileSize tileSize;
    private String language;
    private LocalizedMapView localizedMapView;

    public MapTileOptions() {
    }

    public TilesetID getTilesetID() {
        return tilesetId;
    }

    public MapTileOptions setTilesetId(TilesetID tilesetID) {
        this.tilesetId = tilesetID;
        return this;
    }

    public TileIndex getTileIndex() {
        return tileIndex;
    }

    public MapTileOptions setTileIndex(TileIndex tileIndex) {
        this.tileIndex = tileIndex;
        return this;
    }

    public OffsetDateTime getTimeStamp() {
        return timeStamp;
    }

    public MapTileOptions setOffsetDateTime(OffsetDateTime offsetDateTime) {
        this.timeStamp = offsetDateTime;
        return this;
    }
    
    public MapTileSize getMapTileSize() {
        return tileSize;
    }

    public MapTileOptions setMapTileSize(MapTileSize mapTileSize) {
        this.tileSize = mapTileSize;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public MapTileOptions setLanguage(String language) {
        this.language = language;
        return this;
    }

    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    public MapTileOptions setLocalizedMapView(LocalizedMapView localizedMapView) {
        this.localizedMapView = localizedMapView;
        return this;
    }
}