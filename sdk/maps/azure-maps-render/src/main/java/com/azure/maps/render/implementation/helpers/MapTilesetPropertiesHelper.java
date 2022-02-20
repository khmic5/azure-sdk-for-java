package com.azure.maps.render.implementation.helpers;

import com.azure.maps.render.implementation.models.MapTilesetPrivate;
import com.azure.maps.render.models.MapTileset;

public final class MapTilesetPropertiesHelper {
    private static MapTileSetAccessor accessor;

    public interface MapTileSetAccessor {
        void setToMapTileset(MapTileset mapTileset, MapTilesetPrivate mapTilesetPrivate);
    }

    public static void setAccessor(final MapTileSetAccessor mapTileSetAccessor) {
        accessor = mapTileSetAccessor;
    }

    public static void setToMapTileset(MapTileset mapTileset, MapTilesetPrivate mapTilesetPrivate) {
        accessor.setToMapTileset(mapTileset, mapTilesetPrivate);
    }
}