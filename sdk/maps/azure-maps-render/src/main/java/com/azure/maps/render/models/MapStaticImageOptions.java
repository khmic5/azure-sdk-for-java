package com.azure.maps.render.models;

import java.util.List;

import com.azure.maps.render.implementation.models.LocalizedMapView;
import com.azure.maps.render.implementation.models.MapImageStyle;
import com.azure.maps.render.implementation.models.RasterTileFormat;
import com.azure.maps.render.implementation.models.StaticMapLayer;

public class MapStaticImageOptions {
    private RasterTileFormat format;
    private StaticMapLayer layer;
    private MapImageStyle style;
    private Integer zoom;
    private List<Double> center;
    private List<Double> boundingBox;
    private Integer height;
    private Integer width;
    private String language;
    private LocalizedMapView localizedMapView;
    private List<String> pins;
    private List<String> path;

    public RasterTileFormat getRasterTileFormat() {
        return format;
    }

    public StaticMapLayer getStaticMapLayer() {
        return layer;
    }

    public MapImageStyle getMapImageStyle() {
        return style;
    }

    public Integer getZoom() {
        return zoom;
    }

    public List<Double> getCenter() {
        return center;
    }

    public List<Double> getBoundingBox() {
        return boundingBox;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getWidth() {
        return width;
    }

    public String getLanguage() {
        return language;
    }

    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    public List<String> getPins() {
        return pins;
    }

    public List<String> getPath() {
        return path;
    }
}