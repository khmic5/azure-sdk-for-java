// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.maps.render.fluent.models.MapTilesetResultV2Inner;
import java.util.List;

/** An immutable client-side representation of MapTilesetResultV2. */
public interface MapTilesetResultV2 {
    /**
     * Gets the tilejson property: Version of the TileJSON spec.
     *
     * @return the tilejson value.
     */
    String tilejson();

    /**
     * Gets the name property: Name of the tileset.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the description property: Text description of the tileset.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the version property: A semver.org style version number for the tiles contained within the tileset.
     *
     * @return the version value.
     */
    String version();

    /**
     * Gets the attribution property: Copyright attribution to be displayed on the map.
     *
     * @return the attribution value.
     */
    String attribution();

    /**
     * Gets the template property: A mustache template to be used to format data from grids for interaction.
     *
     * @return the template value.
     */
    String template();

    /**
     * Gets the legend property: A legend to be displayed with the map.
     *
     * @return the legend value.
     */
    String legend();

    /**
     * Gets the scheme property: Default: "xyz". Either "xyz" or "tms". Influences the y direction of the tile
     * coordinates.
     *
     * @return the scheme value.
     */
    String scheme();

    /**
     * Gets the tiles property: An array of tile endpoints.
     *
     * @return the tiles value.
     */
    List<String> tiles();

    /**
     * Gets the grids property: An array of interactivity endpoints.
     *
     * @return the grids value.
     */
    List<String> grids();

    /**
     * Gets the data property: An array of data files in GeoJSON format.
     *
     * @return the data value.
     */
    List<String> data();

    /**
     * Gets the minzoom property: The minimum zoom level.
     *
     * @return the minzoom value.
     */
    Integer minzoom();

    /**
     * Gets the maxzoom property: The maximum zoom level.
     *
     * @return the maxzoom value.
     */
    Integer maxzoom();

    /**
     * Gets the bounds property: The WGS84 bounds of the tileset.
     *
     * @return the bounds value.
     */
    List<Float> bounds();

    /**
     * Gets the center property: The default location of the tileset in the form [longitude, latitude, zoom].
     *
     * @return the center value.
     */
    List<Float> center();

    /**
     * Gets the inner com.azure.maps.render.fluent.models.MapTilesetResultV2Inner object.
     *
     * @return the inner object.
     */
    MapTilesetResultV2Inner innerModel();
}
