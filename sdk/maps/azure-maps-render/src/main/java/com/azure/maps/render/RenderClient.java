// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.StreamResponse;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.maps.render.models.Copyright;
import com.azure.maps.render.models.CopyrightCaption;
import com.azure.maps.render.models.MapAttribution;
import com.azure.maps.render.models.BoundingBox;
import com.azure.maps.render.models.MapStaticImageOptions;
import com.azure.maps.render.models.MapTileOptions;
import com.azure.maps.render.models.MapTileset;
import com.azure.maps.render.models.TileIndex;
import com.azure.maps.render.models.TilesetID;

import reactor.core.publisher.Mono;

/** Initializes a new instance of the synchronous RenderClient type. */
@ServiceClient(builder = RenderClientBuilder.class)
public final class RenderClient {
    /**
     * Initializes an instance of RenderClient client.
     *
     * @param serviceClient the service client implementation.
     */

    private final RenderAsyncClient asyncClient;

    /**
     * Initializes an instance of Searches client.
     *
     * @param serviceClient the service client implementation.
     */
    RenderClient(RenderAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>The Get Map Tiles API allows users to request map tiles in vector or raster formats typically to be integrated
     * into a map control or SDK. Some example tiles that can be requested are Azure Maps road tiles, real-time Weather
     * Radar tiles or the map tiles created using [Azure Maps Creator](https://aka.ms/amcreator). By default, Azure Maps
     * uses vector tiles for its web map control (Web SDK) and Android SDK.
     *
     * @param tilesetId A tileset is a collection of raster or vector data broken up into a uniform grid of square tiles
     *     at preset zoom levels. Every tileset has a **tilesetId** to use when making requests. The **tilesetId** for
     *     tilesets created using [Azure Maps Creator](https://aka.ms/amcreator) are generated through the [Tileset
     *     Create API](https://docs.microsoft.com/en-us/rest/api/maps/tileset). The ready-to-use tilesets supplied by
     *     Azure Maps are listed below. For example, microsoft.base.
     * @param tileIndex Parameter group.
     * @param timeStamp The desired date and time of the requested tile. This parameter must be specified in the
     *     standard date-time format (e.g. 2019-11-14T16:03:00-08:00), as defined by [ISO
     *     8601](https://en.wikipedia.org/wiki/ISO_8601). This parameter is only supported when tilesetId parameter is
     *     set to one of the values below.
     *     <p>* microsoft.weather.infrared.main: We provide tiles up to 3 hours in the past. Tiles are available in
     *     10-minute intervals. We round the timeStamp value to the nearest 10-minute time frame. *
     *     microsoft.weather.radar.main: We provide tiles up to 1.5 hours in the past and up to 2 hours in the future.
     *     Tiles are available in 5-minute intervals. We round the timeStamp value to the nearest 5-minute time frame.
     * @param tileSize The size of the returned map tile in pixels.
     * @param language Language in which search results should be returned. Should be one of supported IETF language
     *     tags, case insensitive. When data in specified language is not available for a specific field, default
     *     language is used.
     *     <p>Please refer to [Supported Languages](https://docs.microsoft.com/azure/azure-maps/supported-languages) for
     *     details.
     * @param localizedMapView The View parameter (also called the "user region" parameter) allows you to show the
     *     correct maps for a certain country/region for geopolitically disputed regions. Different countries have
     *     different views of such regions, and the View parameter allows your application to comply with the view
     *     required by the country your application will be serving. By default, the View parameter is set to “Unified”
     *     even if you haven’t defined it in the request. It is your responsibility to determine the location of your
     *     users, and then set the View parameter correctly for that location. Alternatively, you have the option to set
     *     ‘View=Auto’, which will return the map data based on the IP address of the request. The View parameter in
     *     Azure Maps must be used in compliance with applicable laws, including those regarding mapping, of the country
     *     where maps, images and other data and third party content that you are authorized to access via Azure Maps is
     *     made available. Example: view=IN.
     *     <p>Please refer to [Supported Views](https://aka.ms/AzureMapsLocalizationViews) for details and to see the
     *     available Views.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */

    @ServiceMethod(returns = ReturnType.SINGLE)
    public InputStream getMapTile(MapTileOptions options) {
        Mono<byte[]> byteArray = FluxUtil.collectBytesInByteBufferStream(this.asyncClient.getMapTile(options));
        return new ByteArrayInputStream(byteArray.block());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StreamResponse> getMapTileWithResponse(MapTileOptions options, Context context) {
        return this.asyncClient.getMapTileWithResponse(options, context);
    } 

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>The Get Map Tileset API allows users to request metadata for a tileset.
     *
     * @param tilesetId A tileset is a collection of raster or vector data broken up into a uniform grid of square tiles
     *     at preset zoom levels. Every tileset has a **tilesetId** to use when making requests. The **tilesetId** for
     *     tilesets created using [Azure Maps Creator](https://aka.ms/amcreator) are generated through the [Tileset
     *     Create API](https://docs.microsoft.com/en-us/rest/api/maps/tileset). The ready-to-use tilesets supplied by
     *     Azure Maps are listed below. For example, microsoft.base.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return metadata for a tileset in the TileJSON format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MapTileset getMapTileset(TilesetID tilesetId) {
        return this.asyncClient.getMapTileset(tilesetId).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MapTileset> getMapTilesetWithResponse(TilesetID tilesetID, Context context) {
        return this.asyncClient.getMapTilesetWithResponse(tilesetID, context).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>The Get Map Attribution API allows users to request map copyright attribution information for a section of a
     * tileset.
     *
     * @param tilesetId A tileset is a collection of raster or vector data broken up into a uniform grid of square tiles
     *     at preset zoom levels. Every tileset has a **tilesetId** to use when making requests. The **tilesetId** for
     *     tilesets created using [Azure Maps Creator](https://aka.ms/amcreator) are generated through the [Tileset
     *     Create API](https://docs.microsoft.com/en-us/rest/api/maps/tileset). The ready-to-use tilesets supplied by
     *     Azure Maps are listed below. For example, microsoft.base.
     * @param zoom Zoom level for the desired map attribution.
     * @param bounds The string that represents the rectangular area of a bounding box. The bounds parameter is defined
     *     by the 4 bounding box coordinates, with WGS84 longitude and latitude of the southwest corner followed by
     *     WGS84 longitude and latitude of the northeast corner. The string is presented in the following format:
     *     `[SouthwestCorner_Longitude, SouthwestCorner_Latitude, NortheastCorner_Longitude, NortheastCorner_Latitude]`.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return copyright attribution for the requested section of a tileset.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MapAttribution getMapAttribution(TilesetID tilesetId, int zoom, List<Double> bounds) {
        return this.asyncClient.getMapAttribution(tilesetId, zoom, bounds).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<MapAttribution> getMapAttributionWithResponse(TilesetID tilesetId, int zoom, List<Double> bounds, Context context) {
        return this.asyncClient.getMapAttributionWithResponse(tilesetId, zoom, bounds, context).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Fetches state tiles in vector format typically to be integrated into indoor maps module of map control or SDK.
     * The map control will call this API after user turns on dynamic styling (see [Zoom Levels and Tile
     * Grid](https://docs.microsoft.com/en-us/azure/location-based-services/zoom-levels-and-tile-grid)).
     *
     * @param statesetId The stateset id.
     * @param tileIndex Parameter group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InputStream getMapStateTile(String statesetId, TileIndex tileIndex) {
        Mono<byte[]> byteArray = FluxUtil.collectBytesInByteBufferStream(this.asyncClient.getMapStateTile(statesetId, tileIndex));
        return new ByteArrayInputStream(byteArray.block());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StreamResponse> getMapStateTileWithResponse(String statesetId, TileIndex tileIndex, Context context) {
        return this.asyncClient.getMapStateTileWithResponse(statesetId, tileIndex, context);
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Copyrights API is designed to serve copyright information for Render Tile service. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries.
     *
     * <p>As an alternative to copyrights for map request, one can receive captions for displaying the map provider
     * information on the map.
     *
     * @param format Desired format of the response. Value can be either _json_ or _xml_.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CopyrightCaption getCopyrightCaption() { 
        return this.asyncClient.getCopyrightCaption().block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CopyrightCaption> getCopyrightCaptionWithResponse(Context context) {
        return this.asyncClient.getCopyrightCaptionWithResponse(context).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>The static image service renders a user-defined, rectangular image containing a map section using a zoom level
     * from 0 to 20. The static image service renders a user-defined, rectangular image containing a map section using a
     * zoom level from 0 to 20. The supported resolution range for the map image is from 1x1 to 8192x8192. If you are
     * deciding when to use the static image service over the map tile service, you may want to consider how you would
     * like to interact with the rendered map. If the map contents will be relatively unchanging, a static map is a good
     * choice. If you want to support a lot of zooming, panning and changing of the map content, the map tile service
     * would be a better choice.
     *
     * <p>Service also provides Image Composition functionality to get a static image back with additional data like;
     * pushpins and geometry overlays with following S0 and S1 capabilities.
     *
     * <p>In S0 you can: - Render up to 5 pushpins specified in the request - Provide one custom image for the pins
     * referenced in the request - Add labels to the pushpins
     *
     * <p>In S1 you can: - Render pushpins through [Azure Maps Data Service](https://aka.ms/AzureMapsMapDataService) -
     * Specify multiple pushpin styles - Render circle, polyline and polygon geometry types. - Render of supported
     * GeoJSON geometry types uploaded through [Azure Maps Data Service](https://aka.ms/AzureMapsMapDataService)
     *
     * <p>Please see [How-to-Guide](https://aka.ms/AzureMapsHowToGuideImageCompositor) for detailed examples.
     *
     * <p>_Note_ : Either **center** or **bbox** parameter must be supplied to the API. &lt;br&gt;&lt;br&gt; The
     * supported Lat and Lon ranges when using the **bbox** parameter, are as follows: &lt;br&gt;&lt;br&gt;
     *
     * <p>|Zoom Level | Max Lon Range | Max Lat Range| |:----------|:----------------|:-------------| |0 | 360.0 | 170.0
     * | |1 | 360.0 | 170.0 | |2 | 360.0 | 170.0 | |3 | 360.0 | 170.0 | |4 | 360.0 | 170.0 | |5 | 180.0 | 85.0 | |6 |
     * 90.0 | 42.5 | |7 | 45.0 | 21.25 | |8 | 22.5 | 10.625 | |9 | 11.25 | 5.3125 | |10 | 5.625 | 2.62625 | |11 | 2.8125
     * | 1.328125 | |12 | 1.40625 | 0.6640625 | |13 | 0.703125 | 0.33203125 | |14 | 0.3515625 | 0.166015625 | |15 |
     * 0.17578125 | 0.0830078125 | |16 | 0.087890625 | 0.0415039063 | |17 | 0.0439453125 | 0.0207519531 | |18 |
     * 0.0219726563 | 0.0103759766 | |19 | 0.0109863281 | 0.0051879883 | |20 | 0.0054931641 | 0.0025939941 |.
     *
     * @param format Desired format of the response. Possible value: png.
     * @param layer Map layer requested. If layer is set to labels or hybrid, the format should be png.
     * @param style Map style to be returned. Possible values are main and dark.
     * @param zoom Desired zoom level of the map. Zoom value must be in the range: 0-20 (inclusive). Default value is
     *     12.&lt;br&gt;&lt;br&gt;Please see [Zoom Levels and Tile
     *     Grid](https://docs.microsoft.com/en-us/azure/location-based-services/zoom-levels-and-tile-grid) for details.
     * @param center Coordinates of the center point. Format: 'lon,lat'. Projection used - EPSG:3857. Longitude range:
     *     -180 to 180. Latitude range: -85 to 85.
     *     <p>Note: Either center or bbox are required parameters. They are mutually exclusive.
     * @param boundingBox Bounding box. Projection used - EPSG:3857. Format : 'minLon, minLat, maxLon, maxLat'.
     *     <p>Note: Either bbox or center are required parameters. They are mutually exclusive. It shouldn’t be used
     *     with height or width.
     *     <p>The maximum allowed ranges for Lat and Lon are defined for each zoom level in the table at the top of this
     *     page.
     * @param height Height of the resulting image in pixels. Range is 1 to 8192. Default is 512. It shouldn’t be used
     *     with bbox.
     * @param width Width of the resulting image in pixels. Range is 1 to 8192. Default is 512. It shouldn’t be used
     *     with bbox.
     * @param language Language in which search results should be returned. Should be one of supported IETF language
     *     tags, case insensitive. When data in specified language is not available for a specific field, default
     *     language is used.
     *     <p>Please refer to [Supported Languages](https://docs.microsoft.com/azure/azure-maps/supported-languages) for
     *     details.
     * @param localizedMapView The View parameter (also called the "user region" parameter) allows you to show the
     *     correct maps for a certain country/region for geopolitically disputed regions. Different countries have
     *     different views of such regions, and the View parameter allows your application to comply with the view
     *     required by the country your application will be serving. By default, the View parameter is set to “Unified”
     *     even if you haven’t defined it in the request. It is your responsibility to determine the location of your
     *     users, and then set the View parameter correctly for that location. Alternatively, you have the option to set
     *     ‘View=Auto’, which will return the map data based on the IP address of the request. The View parameter in
     *     Azure Maps must be used in compliance with applicable laws, including those regarding mapping, of the country
     *     where maps, images and other data and third party content that you are authorized to access via Azure Maps is
     *     made available. Example: view=IN.
     *     <p>Please refer to [Supported Views](https://aka.ms/AzureMapsLocalizationViews) for details and to see the
     *     available Views.
     * @param pins Pushpin style and instances. Use this parameter to optionally add pushpins to the image. The pushpin
     *     style describes the appearance of the pushpins, and the instances specify the coordinates of the pushpins and
     *     optional labels for each pin. (Be sure to properly URL-encode values of this parameter since it will contain
     *     reserved characters such as pipes and punctuation.)
     *     <p>The Azure Maps account S0 SKU only supports a single instance of the pins parameter. Other SKUs allow
     *     multiple instances of the pins parameter to specify multiple pin styles.
     *     <p>To render a pushpin at latitude 45°N and longitude 122°W using the default built-in pushpin style, add the
     *     querystring parameter
     *     <p>`pins=default||-122 45`
     *     <p>Note that the longitude comes before the latitude. After URL encoding this will look like
     *     <p>`pins=default%7C%7C-122+45`
     *     <p>All of the examples here show the pins parameter without URL encoding, for clarity.
     *     <p>To render a pin at multiple locations, separate each location with a pipe character. For example, use
     *     <p>`pins=default||-122 45|-119.5 43.2|-121.67 47.12`
     *     <p>The S0 Azure Maps account SKU only allows five pushpins. Other account SKUs do not have this limitation.
     *     <p>### Style Modifiers
     *     <p>You can modify the appearance of the pins by adding style modifiers. These are added after the style but
     *     before the locations and labels. Style modifiers each have a two-letter name. These abbreviated names are
     *     used to help reduce the length of the URL.
     *     <p>To change the color of the pushpin, use the 'co' style modifier and specify the color using the HTML/CSS
     *     RGB color format which is a six-digit hexadecimal number (the three-digit form is not supported). For
     *     example, to use a deep pink color which you would specify as #FF1493 in CSS, use
     *     <p>`pins=default|coFF1493||-122 45`
     *     <p>### Pushpin Labels
     *     <p>To add a label to the pins, put the label in single quotes just before the coordinates. For example, to
     *     label three pins with the values '1', '2', and '3', use
     *     <p>`pins=default||'1'-122 45|'2'-119.5 43.2|'3'-121.67 47.12`
     *     <p>There is a built in pushpin style called 'none' that does not display a pushpin image. You can use this if
     *     you want to display labels without any pin image. For example,
     *     <p>`pins=none||'A'-122 45|'B'-119.5 43.2`
     *     <p>To change the color of the pushpin labels, use the 'lc' label color style modifier. For example, to use
     *     pink pushpins with black labels, use
     *     <p>`pins=default|coFF1493|lc000000||-122 45`
     *     <p>To change the size of the labels, use the 'ls' label size style modifier. The label size represents the
     *     approximate height of the label text in pixels. For example, to increase the label size to 12, use
     *     <p>`pins=default|ls12||'A'-122 45|'B'-119 43`
     *     <p>The labels are centered at the pushpin 'label anchor.' The anchor location is predefined for built-in
     *     pushpins and is at the top center of custom pushpins (see below). To override the label anchor, using the
     *     'la' style modifier and provide X and Y pixel coordinates for the anchor. These coordinates are relative to
     *     the top left corner of the pushpin image. Positive X values move the anchor to the right, and positive Y
     *     values move the anchor down. For example, to position the label anchor 10 pixels right and 4 pixels above the
     *     top left corner of the pushpin image, use
     *     <p>`pins=default|la10 -4||'A'-122 45|'B'-119 43`
     *     <p>### Custom Pushpins
     *     <p>To use a custom pushpin image, use the word 'custom' as the pin style name, and then specify a URL after
     *     the location and label information. Use two pipe characters to indicate that you're done specifying locations
     *     and are starting the URL. For example,
     *     <p>`pins=custom||-122 45||http://contoso.com/pushpins/red.png`
     *     <p>After URL encoding, this would look like
     *     <p>`pins=custom%7C%7C-122+45%7C%7Chttp%3A%2F%2Fcontoso.com%2Fpushpins%2Fred.png`
     *     <p>By default, custom pushpin images are drawn centered at the pin coordinates. This usually isn't ideal as
     *     it obscures the location that you're trying to highlight. To override the anchor location of the pin image,
     *     use the 'an' style modifier. This uses the same format as the 'la' label anchor style modifier. For example,
     *     if your custom pin image has the tip of the pin at the top left corner of the image, you can set the anchor
     *     to that spot by using
     *     <p>`pins=custom|an0 0||-122 45||http://contoso.com/pushpins/red.png`
     *     <p>Note: If you use the 'co' color modifier with a custom pushpin image, the specified color will replace the
     *     RGB channels of the pixels in the image but will leave the alpha (opacity) channel unchanged. This would
     *     usually only be done with a solid-color custom image.
     *     <p>### Getting Pushpins from Azure Maps Data Storage
     *     <p>For all Azure Maps account SKUs other than S0, the pushpin location information can be obtained from Azure
     *     Maps Data Storage. After uploading a GeoJSON document containing pin locations, the Data Storage service
     *     returns a Unique Data ID (UDID) that you can use to reference the data in the pins parameter.
     *     <p>To use the point geometry from an uploaded GeoJSON document as the pin locations, specify the UDID in the
     *     locations section of the pins parameter. For example,
     *     <p>`pins=default||udid-29dc105a-dee7-409f-a3f9-22b066ae4713`
     *     <p>Note that only point and multipoint geometry, points and multipoints from geometry collections, and point
     *     geometry from features will be used. Linestring and polygon geometry will be ignored. If the point comes from
     *     a feature and the feature has a string property called "label", the value of that property will be used as
     *     the label for the pin.
     *     <p>You can mix pin locations from Data Storage and pin locations specified in the pins parameter. Any of the
     *     pipe-delimited pin locations can be a longitude and latitude or a UDID. For example,
     *     <p>`pins=default||-122 45|udid-29dc105a-dee7-409f-a3f9-22b066ae4713|-119 43`
     *     <p>### Scale, Rotation, and Opacity
     *     <p>You can make pushpins and their labels larger or smaller by using the 'sc' scale style modifier. This is a
     *     value greater than zero. A value of 1 is the standard scale. Values larger than 1 will make the pins larger,
     *     and values smaller than 1 will make them smaller. For example, to draw the pushpins 50% larger than normal,
     *     use
     *     <p>`pins=default|sc1.5||-122 45`
     *     <p>You can rotate pushpins and their labels by using the 'ro' rotation style modifier. This is a number of
     *     degrees of clockwise rotation. Use a negative number to rotate counter-clockwise. For example, to rotate the
     *     pushpins 90 degrees clockwise and double their size, use
     *     <p>`pins=default|ro90|sc2||-122 45`
     *     <p>You can make pushpins and their labels partially transparent by specifying the 'al' alpha style modifier.
     *     This is a number between 0 and 1 indicating the opacity of the pushpins. Zero makes them completely
     *     transparent (and not visible) and 1 makes them completely opaque (which is the default). For example, to make
     *     pushpins and their labels only 67% opaque, use
     *     <p>`pins=default|al.67||-122 45`
     *     <p>### Style Modifier Summary
     *     <p>Modifier | Description | Range :--------:|-----------------|------------------ al | Alpha (opacity) | 0 to
     *     1 an | Pin anchor | * co | Pin color | 000000 to FFFFFF la | Label anchor | * lc | Label color | 000000 to
     *     FFFFFF ls | Label size | Greater than 0 ro | Rotation | -360 to 360 sc | Scale | Greater than 0
     *     <p>* X and Y coordinates can be anywhere within pin image or a margin around it. The margin size is the
     *     minimum of the pin width and height.
     * @param path Path style and locations. Use this parameter to optionally add lines, polygons or circles to the
     *     image. The path style describes the appearance of the line and fill. (Be sure to properly URL-encode values
     *     of this parameter since it will contain reserved characters such as pipes and punctuation.)
     *     <p>Path parameter is supported in Azure Maps account SKU starting with S1. Multiple instances of the path
     *     parameter allow to specify multiple geometries with their styles. Number of parameters per request is limited
     *     to 10 and number of locations is limited to 100 per path.
     *     <p>To render a circle with radius 100 meters and center point at latitude 45°N and longitude 122°W using the
     *     default style, add the querystring parameter
     *     <p>`path=ra100||-122 45`
     *     <p>Note that the longitude comes before the latitude. After URL encoding this will look like
     *     <p>`path=ra100%7C%7C-122+45`
     *     <p>All of the examples here show the path parameter without URL encoding, for clarity.
     *     <p>To render a line, separate each location with a pipe character. For example, use
     *     <p>`path=||-122 45|-119.5 43.2|-121.67 47.12`
     *     <p>To render a polygon, last location must be equal to the start location. For example, use
     *     <p>`path=||-122 45|-119.5 43.2|-121.67 47.12|-122 45`
     *     <p>Longitude and latitude values for locations of lines and polygons can be in the range from -360 to 360 to
     *     allow for rendering of geometries crossing the anti-meridian.
     *     <p>### Style Modifiers
     *     <p>You can modify the appearance of the path by adding style modifiers. These are added before the locations.
     *     Style modifiers each have a two-letter name. These abbreviated names are used to help reduce the length of
     *     the URL.
     *     <p>To change the color of the outline, use the 'lc' style modifier and specify the color using the HTML/CSS
     *     RGB color format which is a six-digit hexadecimal number (the three-digit form is not supported). For
     *     example, to use a deep pink color which you would specify as #FF1493 in CSS, use
     *     <p>`path=lcFF1493||-122 45|-119.5 43.2`
     *     <p>Multiple style modifiers may be combined together to create a more complex visual style.
     *     <p>`lc0000FF|lw3|la0.60|fa0.50||-122.2 47.6|-122.2 47.7|-122.3 47.7|-122.3 47.6|-122.2 47.6`
     *     <p>### Getting Path locations from Azure Maps Data Storage
     *     <p>For all Azure Maps account SKUs other than S0, the path location information can be obtained from Azure
     *     Maps Data Storage. After uploading a GeoJSON document containing path locations, the Data Storage service
     *     returns a Unique Data ID (UDID) that you can use to reference the data in the path parameter.
     *     <p>To use the point geometry from an uploaded GeoJSON document as the path locations, specify the UDID in the
     *     locations section of the path parameter. For example,
     *     <p>`path=||udid-29dc105a-dee7-409f-a3f9-22b066ae4713`
     *     <p>Note the it is not allowed to mix path locations from Data Storage with locations specified in the path
     *     parameter.
     *     <p>### Style Modifier Summary
     *     <p>Modifier | Description | Range :--------:|------------------------|------------------ lc | Line color |
     *     000000 to FFFFFF fc | Fill color | 000000 to FFFFFF la | Line alpha (opacity) | 0 to 1 fa | Fill alpha
     *     (opacity) | 0 to 1 lw | Line width | Greater than 0 ra | Circle radius (meters) | Greater than 0.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InputStream getMapStaticImage(MapStaticImageOptions options) {
        Mono<byte[]> byteArray = FluxUtil.collectBytesInByteBufferStream(this.asyncClient.getMapStaticImage(options));
        return new ByteArrayInputStream(byteArray.block());
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<StreamResponse> getMapStaticImageWithResponse(MapStaticImageOptions options, Context context) {
        return this.asyncClient.getMapStaticImageWithResponse(options, context);
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Returns copyright information for a given bounding box. Bounding-box requests should specify the minimum and
     * maximum longitude and latitude (EPSG-3857) coordinates.
     *
     * @param format Desired format of the response. Value can be either _json_ or _xml_.
     * @param boundingBox Parameter group.
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Copyright getCopyrightFromBoundingBox(BoundingBox boundingBox, boolean includeText) {
        return this.asyncClient.getCopyrightFromBoundingBox(boundingBox, includeText).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Copyright> getCopyrightFromBoundingBoxWithResponse(BoundingBox boundingBox, boolean includeText, Context context) {
        return this.asyncClient.getCopyrightFromBoundingBoxWithResponse(boundingBox, includeText, context).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Copyrights API is designed to serve copyright information for Render Tile service. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries. Returns the
     * copyright information for a given tile. To obtain the copyright information for a particular tile, the request
     * should specify the tile's zoom level and x and y coordinates (see: Zoom Levels and Tile Grid).
     *
     * @param format Desired format of the response. Value can be either _json_ or _xml_.
     * @param tileIndex Parameter group.
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Copyright getCopyrightForTile(TileIndex tileIndex, boolean includeText) {
        return this.asyncClient.getCopyrightForTile(tileIndex, includeText).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Copyright> getCopyrightForTileWithResponse(TileIndex tileIndex, boolean includeText, Context context) {
        return this.asyncClient.getCopyrightForTileWithResponse(tileIndex, includeText).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Copyrights API is designed to serve copyright information for Render Tile service. In addition to basic
     * copyright for the whole map, API is serving specific groups of copyrights for some countries. Returns the
     * copyright information for the world. To obtain the default copyright information for the whole world, do not
     * specify a tile or bounding box.
     *
     * @param format Desired format of the response. Value can be either _json_ or _xml_.
     * @param includeText Yes/no value to exclude textual data from response. Only images and country names will be in
     *     response.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful copyright request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Copyright getCopyrightForWorld(boolean includeText) {
        return this.asyncClient.getCopyrightForWorld(includeText).block();
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Copyright> getCopyrightForWorldWithResponse(boolean includeText, Context context) {
        return this.asyncClient.getCopyrightForWorldWithResponse(includeText, context).block();
    }
}
