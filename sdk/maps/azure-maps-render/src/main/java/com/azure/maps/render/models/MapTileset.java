// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Metadata for a tileset in the TileJSON format.
 */
@Fluent
public final class MapTileset {
    /*
     * Describes the version of the TileJSON spec that is implemented by this
     * JSON object.
     */
    @JsonProperty(value = "tilejson")
    private String tilejson;

    /*
     * A name describing the tileset. The name can contain any legal character.
     * Implementations SHOULD NOT interpret the name as HTML.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Text description of the tileset. The description can contain any legal
     * character. Implementations SHOULD NOT interpret the description as HTML.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * A semver.org style version number for the tiles contained within the
     * tileset. When changes across tiles are introduced, the minor version
     * MUST change.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Copyright attribution to be displayed on the map. Implementations MAY
     * decide to treat this as HTML or literal text. For security reasons, make
     * absolutely sure that this field can't be abused as a vector for XSS or
     * beacon tracking.
     */
    @JsonProperty(value = "attribution")
    private String attribution;

    /*
     * A mustache template to be used to format data from grids for
     * interaction.
     */
    @JsonProperty(value = "template")
    private String template;

    /*
     * A legend to be displayed with the map. Implementations MAY decide to
     * treat this as HTML or literal text. For security reasons, make
     * absolutely sure that this field can't be abused as a vector for XSS or
     * beacon tracking.
     */
    @JsonProperty(value = "legend")
    private String legend;

    /*
     * Default: "xyz". Either "xyz" or "tms". Influences the y direction of the
     * tile coordinates. The global-mercator (aka Spherical Mercator) profile
     * is assumed.
     */
    @JsonProperty(value = "scheme")
    private String scheme;

    /*
     * An array of tile endpoints. If multiple endpoints are specified, clients
     * may use any combination of endpoints. All endpoints MUST return the same
     * content for the same URL. The array MUST contain at least one endpoint.
     */
    @JsonProperty(value = "tiles")
    private List<String> tiles;

    /*
     * An array of interactivity endpoints.
     */
    @JsonProperty(value = "grids")
    private List<String> grids;

    /*
     * An array of data files in GeoJSON format.
     */
    @JsonProperty(value = "data")
    private List<String> data;

    /*
     * The minimum zoom level.
     */
    @JsonProperty(value = "minzoom")
    private Integer minZoom;

    /*
     * The maximum zoom level.
     */
    @JsonProperty(value = "maxzoom")
    private Integer maxZoom;

    /*
     * The maximum extent of available map tiles. Bounds MUST define an area
     * covered by all zoom levels. The bounds are represented in WGS:84
     * latitude and longitude values, in the order left, bottom, right, top.
     * Values may be integers or floating point numbers.
     */
    @JsonProperty(value = "bounds")
    private List<Float> bounds;

    /*
     * The default location of the tileset in the form [longitude, latitude,
     * zoom]. The zoom level MUST be between minzoom and maxzoom.
     * Implementations can use this value to set the default location.
     */
    @JsonProperty(value = "center")
    private List<Float> center;

    /**
     * Get the tilejson property: Describes the version of the TileJSON spec
     * that is implemented by this JSON object.
     * 
     * @return the tilejson value.
     */
    public String getTilejson() {
        return this.tilejson;
    }

    /**
     * Set the tilejson property: Describes the version of the TileJSON spec
     * that is implemented by this JSON object.
     * 
     * @param tilejson the tilejson value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setTilejson(String tilejson) {
        this.tilejson = tilejson;
        return this;
    }

    /**
     * Get the name property: A name describing the tileset. The name can
     * contain any legal character. Implementations SHOULD NOT interpret the
     * name as HTML.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: A name describing the tileset. The name can
     * contain any legal character. Implementations SHOULD NOT interpret the
     * name as HTML.
     * 
     * @param name the name value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Text description of the tileset. The
     * description can contain any legal character. Implementations SHOULD NOT
     * interpret the description as HTML.
     * 
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: Text description of the tileset. The
     * description can contain any legal character. Implementations SHOULD NOT
     * interpret the description as HTML.
     * 
     * @param description the description value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the version property: A semver.org style version number for the
     * tiles contained within the tileset. When changes across tiles are
     * introduced, the minor version MUST change.
     * 
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: A semver.org style version number for the
     * tiles contained within the tileset. When changes across tiles are
     * introduced, the minor version MUST change.
     * 
     * @param version the version value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the attribution property: Copyright attribution to be displayed on
     * the map. Implementations MAY decide to treat this as HTML or literal
     * text. For security reasons, make absolutely sure that this field can't
     * be abused as a vector for XSS or beacon tracking.
     * 
     * @return the attribution value.
     */
    public String getAttribution() {
        return this.attribution;
    }

    /**
     * Set the attribution property: Copyright attribution to be displayed on
     * the map. Implementations MAY decide to treat this as HTML or literal
     * text. For security reasons, make absolutely sure that this field can't
     * be abused as a vector for XSS or beacon tracking.
     * 
     * @param attribution the attribution value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setAttribution(String attribution) {
        this.attribution = attribution;
        return this;
    }

    /**
     * Get the template property: A mustache template to be used to format data
     * from grids for interaction.
     * 
     * @return the template value.
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * Set the template property: A mustache template to be used to format data
     * from grids for interaction.
     * 
     * @param template the template value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * Get the legend property: A legend to be displayed with the map.
     * Implementations MAY decide to treat this as HTML or literal text. For
     * security reasons, make absolutely sure that this field can't be abused
     * as a vector for XSS or beacon tracking.
     * 
     * @return the legend value.
     */
    public String getLegend() {
        return this.legend;
    }

    /**
     * Set the legend property: A legend to be displayed with the map.
     * Implementations MAY decide to treat this as HTML or literal text. For
     * security reasons, make absolutely sure that this field can't be abused
     * as a vector for XSS or beacon tracking.
     * 
     * @param legend the legend value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setLegend(String legend) {
        this.legend = legend;
        return this;
    }

    /**
     * Get the scheme property: Default: "xyz". Either "xyz" or "tms".
     * Influences the y direction of the tile coordinates. The global-mercator
     * (aka Spherical Mercator) profile is assumed.
     * 
     * @return the scheme value.
     */
    public String getScheme() {
        return this.scheme;
    }

    /**
     * Set the scheme property: Default: "xyz". Either "xyz" or "tms".
     * Influences the y direction of the tile coordinates. The global-mercator
     * (aka Spherical Mercator) profile is assumed.
     * 
     * @param scheme the scheme value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    /**
     * Get the tiles property: An array of tile endpoints. If multiple
     * endpoints are specified, clients may use any combination of endpoints.
     * All endpoints MUST return the same content for the same URL. The array
     * MUST contain at least one endpoint.
     * 
     * @return the tiles value.
     */
    public List<String> getTiles() {
        return this.tiles;
    }

    /**
     * Set the tiles property: An array of tile endpoints. If multiple
     * endpoints are specified, clients may use any combination of endpoints.
     * All endpoints MUST return the same content for the same URL. The array
     * MUST contain at least one endpoint.
     * 
     * @param tiles the tiles value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setTiles(List<String> tiles) {
        this.tiles = tiles;
        return this;
    }

    /**
     * Get the grids property: An array of interactivity endpoints.
     * 
     * @return the grids value.
     */
    public List<String> getGrids() {
        return this.grids;
    }

    /**
     * Set the grids property: An array of interactivity endpoints.
     * 
     * @param grids the grids value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setGrids(List<String> grids) {
        this.grids = grids;
        return this;
    }

    /**
     * Get the data property: An array of data files in GeoJSON format.
     * 
     * @return the data value.
     */
    public List<String> getData() {
        return this.data;
    }

    /**
     * Set the data property: An array of data files in GeoJSON format.
     * 
     * @param data the data value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setData(List<String> data) {
        this.data = data;
        return this;
    }

    /**
     * Get the minZoom property: The minimum zoom level.
     * 
     * @return the minZoom value.
     */
    public Integer getMinZoom() {
        return this.minZoom;
    }

    /**
     * Set the minZoom property: The minimum zoom level.
     * 
     * @param minZoom the minZoom value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setMinZoom(Integer minZoom) {
        this.minZoom = minZoom;
        return this;
    }

    /**
     * Get the maxZoom property: The maximum zoom level.
     * 
     * @return the maxZoom value.
     */
    public Integer getMaxZoom() {
        return this.maxZoom;
    }

    /**
     * Set the maxZoom property: The maximum zoom level.
     * 
     * @param maxZoom the maxZoom value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setMaxZoom(Integer maxZoom) {
        this.maxZoom = maxZoom;
        return this;
    }

    /**
     * Get the bounds property: The maximum extent of available map tiles.
     * Bounds MUST define an area covered by all zoom levels. The bounds are
     * represented in WGS:84 latitude and longitude values, in the order left,
     * bottom, right, top. Values may be integers or floating point numbers.
     * 
     * @return the bounds value.
     */
    public List<Float> getBounds() {
        return this.bounds;
    }

    /**
     * Set the bounds property: The maximum extent of available map tiles.
     * Bounds MUST define an area covered by all zoom levels. The bounds are
     * represented in WGS:84 latitude and longitude values, in the order left,
     * bottom, right, top. Values may be integers or floating point numbers.
     * 
     * @param bounds the bounds value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setBounds(List<Float> bounds) {
        this.bounds = bounds;
        return this;
    }

    /**
     * Get the center property: The default location of the tileset in the form
     * [longitude, latitude, zoom]. The zoom level MUST be between minzoom and
     * maxzoom. Implementations can use this value to set the default location.
     * 
     * @return the center value.
     */
    public List<Float> getCenter() {
        return this.center;
    }

    /**
     * Set the center property: The default location of the tileset in the form
     * [longitude, latitude, zoom]. The zoom level MUST be between minzoom and
     * maxzoom. Implementations can use this value to set the default location.
     * 
     * @param center the center value to set.
     * @return the MapTileset object itself.
     */
    public MapTileset setCenter(List<Float> center) {
        this.center = center;
        return this;
    }
}
