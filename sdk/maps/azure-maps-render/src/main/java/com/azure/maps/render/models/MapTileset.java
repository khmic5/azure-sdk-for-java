package com.azure.maps.render.models;

import java.util.Arrays;
import java.util.List;

import com.azure.maps.render.implementation.helpers.MapTilesetPropertiesHelper;
import com.azure.maps.render.implementation.helpers.MapTilesetPropertiesHelper.MapTileSetAccessor;
import com.azure.maps.render.implementation.models.MapTilesetPrivate;

public class MapTileset {
    private String tilejson;
    private String name;
    private String description;
    private String version;
    private String attribution;
    private String template;
    private String legend;
    private String scheme;
    private List<String> tiles;
    private List<String> grids;
    private List<String> data;
    private Integer minZoom;
    private Integer maxZoom;
    private BoundingBox bounds;
    private Center center;

    static {
        MapTilesetPropertiesHelper.setAccessor(new MapTilesetPropertiesHelper.MapTileSetAccessor() {
            @Override
            public void setToMapTileset(MapTileset mapTileset, MapTilesetPrivate mapTilesetPrivate) {
                mapTileset.setToMapTileset(mapTilesetPrivate);
            }
        });
    }

    public String getTileJson() {
        return this.tilejson;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getVersion() {
        return version;
    }

    public String getAttribution() {
        return attribution;
    }

    public String getTemplate() {
        return template;
    }

    public String getLegend() {
        return legend;
    }

    public String getScheme() {
        return scheme;
    }

    public List<String> getTiles() {
        return tiles;
    }

    public List<String> getGrids() {
        return grids;
    }

    public List<String> getData() {
        return data;
    }

    public Integer getMinZoom() {
        return minZoom;
    }

    public Integer getMaxZoom() {
        return maxZoom;
    }

    public BoundingBox getBounds() {
        return bounds;
    }

    public Center getCenter() {
        return center;
    }   
    
    private void setToMapTileset(MapTilesetPrivate mapTilesetPrivate) {
        this.tilejson = mapTilesetPrivate.getTilejson();
        this.name = mapTilesetPrivate.getName();
        this.description = mapTilesetPrivate.getDescription();
        this.version = mapTilesetPrivate.getVersion();
        this.attribution = mapTilesetPrivate.getAttribution();
        this.template = mapTilesetPrivate.getTemplate();
        this.legend = mapTilesetPrivate.getLegend();
        this.scheme = mapTilesetPrivate.getScheme();
        this.tiles = mapTilesetPrivate.getTiles();
        this.grids = mapTilesetPrivate.getGrids();
        this.data = mapTilesetPrivate.getData();
        this.minZoom = mapTilesetPrivate.getMinZoom();
        this.maxZoom = mapTilesetPrivate.getMaxZoom();

        // transform bounds
        if (mapTilesetPrivate.getBounds() != null) {
            this.bounds = new BoundingBox(mapTilesetPrivate.getBounds());
        }

        // transform center
        if (mapTilesetPrivate.getCenter() != null) {
            this.center = new Center(mapTilesetPrivate.getCenter());
        }
    }
}