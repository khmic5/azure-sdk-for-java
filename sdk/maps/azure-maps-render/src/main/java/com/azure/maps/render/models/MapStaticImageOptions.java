package com.azure.maps.render.models;

import java.util.List;

import com.azure.maps.render.models.LocalizedMapView;
import com.azure.maps.render.models.MapImageStyle;
import com.azure.maps.render.models.RasterTileFormat;
import com.azure.maps.render.models.StaticMapLayer;

public class MapStaticImageOptions {
    private RasterTileFormat format;
    private StaticMapLayer layer;
    private MapImageStyle style;
    private Integer zoom;
    private Center center;
    private BoundingBox boundingBox;
    private Integer height;
    private Integer width;
    private String language;
    private LocalizedMapView localizedMapView;
    private List<String> pins;
    private List<String> path;

    public RasterTileFormat getRasterTileFormat() {
        return format;
    }

    public MapStaticImageOptions setRasterTileFormat(RasterTileFormat rasterTileFormat) {
        this.format = rasterTileFormat;
        return this;
    }

    public StaticMapLayer getStaticMapLayer() {
        return layer;
    }

    public MapStaticImageOptions setStaticMapLayer(StaticMapLayer staticMapLayer) {
        this.layer = staticMapLayer;
        return this;
    }

    public MapImageStyle getMapImageStyle() {
        return style;
    }

    public MapStaticImageOptions setMapImageStyle(MapImageStyle mapImageStyle) {
        this.style = mapImageStyle;
        return this;
    }

    public Integer getZoom() {
        return zoom;
    }

    public MapStaticImageOptions setZoom(Integer zoom) {
        this.zoom = zoom;
        return this;
    }

    public Center getCenter() {
        return center;
    }

    public MapStaticImageOptions setCenter(Center center) {
        this.center = center;
        return this;
    }

    public BoundingBox getBoundingBox() {
        return boundingBox;
    }

    public MapStaticImageOptions setMapImageStyle(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    public Integer getHeight() {
        return height;
    }

    public MapStaticImageOptions setHeight(Integer height) {
        this.height = height;
        return this;
    }

    public Integer getWidth() {
        return width;
    }

    public MapStaticImageOptions setWidth(Integer width) {
        this.width = width;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public MapStaticImageOptions setHeight(String language) {
        this.language = language;
        return this;
    }

    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    public MapStaticImageOptions setHeight(LocalizedMapView localizedMapView) {
        this.localizedMapView = localizedMapView;
        return this;
    }

    public List<String> getPins() {
        return pins;
    }

    public MapStaticImageOptions setPins(List<String> pins) {
        this.pins = pins;
        return this;
    }

    public List<String> getPath() {
        return path;
    }

    public MapStaticImageOptions setPath(List<String> path) {
        this.path = path;
        return this;
    }
}