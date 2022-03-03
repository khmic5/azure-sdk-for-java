package com.azure.maps.render.models;

import java.util.List;

import com.azure.maps.render.implementation.helpers.MapTilesetPropertiesHelper;
import com.azure.maps.render.implementation.models.MapTilesetPrivate;

/**
 * Public map tileset class
 */
public final class MapTileset {
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
            public void setFromMapTilesetPrivate(MapTileset mapTileset, MapTilesetPrivate mapTilesetPrivate) {
                mapTileset.setFromMapTilesetPrivate(mapTilesetPrivate);
            }
            @Override
            public void setBounds(MapTileset mapTileset, BoundingBox bounds) {
                mapTileset.setBounds(bounds);
                
            }
            @Override
            public void setCenter(MapTileset mapTileset, Center center) {
                mapTileset.setCenter(center);
            }
        });
    }

    /**
     * get tile json
     * @return
     */
    public String getTileJson() {
        return this.tilejson;
    }

    /**
     * get name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * get description
     */
    public String getDescription() {
        return description;
    }

    /**
     * get version
     * @return
     */
    public String getVersion() {
        return version;
    }

    /**
     * get attribution
     * @return
     */
    public String getAttribution() {
        return attribution;
    }

    /**
     * get template
     * @return
     */
    public String getTemplate() {
        return template;
    }

    /**
     * get legend
     * @return
     */
    public String getLegend() {
        return legend;
    }

    /**
     * get scheme
     */
    public String getScheme() {
        return scheme;
    }

    /**
     * get tiles
     * @return
     */
    public List<String> getTiles() {
        return tiles;
    }

    /**
     * get grids
     */
    public List<String> getGrids() {
        return grids;
    }

    /**
     * get data
     * @return
     */
    public List<String> getData() {
        return data;
    }

    /**
     * get min zoom
     * @return
     */
    public Integer getMinZoom() {
        return minZoom;
    }

    /**
     * get max zoom
     * @return
     */
    public Integer getMaxZoom() {
        return maxZoom;
    }

    /**
     * get bounds
     */
    public BoundingBox getBounds() {
        return bounds;
    }

    /**
     * get center
     * @return
     */
    public Center getCenter() {
        return center;
    }   

    private void setBounds(BoundingBox bounds) {
        this.bounds = bounds;
    }

    private void setCenter(Center center) {
        this.center = center;
    }
    
    private void setFromMapTilesetPrivate(MapTilesetPrivate mapTilesetPrivate) {
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