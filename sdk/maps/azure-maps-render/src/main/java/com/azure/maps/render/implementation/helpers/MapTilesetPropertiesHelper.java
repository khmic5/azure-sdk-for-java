package com.azure.maps.render.implementation.helpers;

import com.azure.maps.render.implementation.models.MapTilesetPrivate;
import com.azure.maps.render.models.BoundingBox;
import com.azure.maps.render.models.Center;
import com.azure.maps.render.models.MapTileset;

public final class MapTilesetPropertiesHelper {
    private static MapTileSetAccessor accessor;

    public interface MapTileSetAccessor {
        void setFromMapTilesetPrivate(MapTileset mapTileset, MapTilesetPrivate mapTilesetPrivate);
        void setBounds(MapTileset mapTileset, BoundingBox bounds);
        void setCenter(MapTileset mapTileset, Center center);
    }

    public static void setAccessor(final MapTileSetAccessor mapTileSetAccessor) {
        accessor = mapTileSetAccessor;
    }

    public static void setFromMapTilesetPrivate(MapTileset mapTileset, MapTilesetPrivate mapTilesetPrivate) {
        accessor.setFromMapTilesetPrivate(mapTileset, mapTilesetPrivate);
    }

    public static void setBounds(MapTileset mapTileset, BoundingBox bounds) {
        accessor.setBounds(mapTileset, bounds);
    }

    public static void setCenter(MapTileset mapTileset, Center center) {
        accessor.setCenter(mapTileset, center);
    }
}