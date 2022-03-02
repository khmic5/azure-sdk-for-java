// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.traffic;

import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.http.rest.StreamResponse;
import com.azure.maps.traffic.implementation.models.ErrorResponseException;
import com.azure.maps.traffic.implementation.models.IncidentDetailStyle;
import com.azure.maps.traffic.implementation.models.IncidentGeometryType;
import com.azure.maps.traffic.implementation.models.ProjectionStandard;
import com.azure.maps.traffic.implementation.models.ResponseFormat;
import com.azure.maps.traffic.implementation.models.SpeedUnit;
import com.azure.maps.traffic.models.TileFormat;
import com.azure.maps.traffic.models.TileIndex;
import com.azure.maps.traffic.implementation.models.TrafficFlowSegmentData;
import com.azure.maps.traffic.implementation.models.TrafficFlowSegmentStyle;
import com.azure.maps.traffic.models.TrafficFlowTileStyle;
import com.azure.maps.traffic.implementation.models.TrafficIncidentDetail;
import com.azure.maps.traffic.implementation.models.TrafficIncidentTileStyle;
import com.azure.maps.traffic.implementation.models.TrafficIncidentViewport;
import com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream;

import reactor.core.publisher.Mono;

/** Initializes a new instance of the synchronous TrafficClient type. */
@ServiceClient(builder = TrafficClientBuilder.class)
public final class TrafficClient {
     /**
     * Initializes an instance of TrafficClient client.
     *
     * @param serviceClient the service client implementation.
     */
    private final TrafficAsyncClient asyncClient;

    /**
     * Initializes an instance of Traffic client.
     *
     * @param serviceClient the service client implementation.
     */
    TrafficClient(TrafficAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * __Traffic Flow Tile__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>The Azure Flow Tile API serves 256 x 256 pixel tiles showing traffic flow. All tiles use the same grid system.
     * Because the traffic tiles use transparent images, they can be layered on top of map tiles to create a compound
     * display. The Flow tiles use colors to indicate either the speed of traffic on different road segments, or the
     * difference between that speed and the free-flow speed on the road segment in question.
     *
     * @param format Desired format of the response. Possible values are png &amp; pbf.
     * @param style &lt;p&gt;The style to be used to render the tile.&lt;/p&gt;.
     * @param zoom Zoom level for the desired tile. For _raster_ tiles, value must be in the range: 0-22 (inclusive).
     *     For _vector_ tiles, value must be in the range: 0-22 (inclusive). Please see [Zoom Levels and Tile
     *     Grid](https://docs.microsoft.com/azure/location-based-services/zoom-levels-and-tile-grid) for details.
     * @param tileIndex Parameter group.
     * @param thickness The value of the width of the line representing traffic. This value is a multiplier and the
     *     accepted values range from 1 - 20. The default value is 10. This parameter is not valid when format is pbf.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InputStream getTrafficFlowTile(
            TileFormat format, TrafficFlowTileStyle style, int zoom, TileIndex tileIndex, Integer thickness) {
        Iterator<ByteBufferBackedInputStream> iterator = this.asyncClient.getTrafficFlowTile(format, style, zoom, tileIndex, thickness).map(ByteBufferBackedInputStream::new).toStream().iterator();
        return getInputStream(iterator);
    }

    /**
     * Get traffic flow tile with response
     * @param format Desired format of the response. Possible values are png & amp
     * @param style The style to be used to render the tile
     * @param zoom Zoom level for the desired tile. For _raster_ tiles, value must be in the range: 0-22 (inclusive).
     *     For _vector_ tiles, value must be in the range: 0-22 (inclusive). Please see [Zoom Levels and Tile
     *     Grid](https://docs.microsoft.com/azure/location-based-services/zoom-levels-and-tile-grid) for details.
     * @param tileIndex Parameter group
     * @param thickness The value of the width of the line representing traffic. This value is a multiplier and the
     *     accepted values range from 1 - 20. The default value is 10. This parameter is not valid when format is pbf
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SimpleResponse<InputStream> getTrafficFlowTileWithResponse(TileFormat format, TrafficFlowTileStyle style, int zoom, TileIndex tileIndex, Integer thickness) {
        Mono<StreamResponse> monoResp = this.asyncClient.getTrafficFlowTileWithResponse(format, style, zoom, tileIndex, thickness); 
        StreamResponse resp = monoResp.block();
        Iterator<ByteBufferBackedInputStream> iterator = resp.getValue().map(ByteBufferBackedInputStream::new).toStream().iterator();
        return new SimpleResponse<InputStream>(resp.getRequest(), resp.getStatusCode(), resp.getHeaders(), getInputStream(iterator));
    } 

    /**
     * __Traffic Flow Segment__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This service provides information about the speeds and travel times of the road fragment closest to the given
     * coordinates. It is designed to work alongside the Flow layer of the Render Service to support clickable flow data
     * visualizations. With this API, the client side can connect any place in the map with flow data on the closest
     * road and present it to the user.
     *
     * @param format Desired format of the response. Value can be either _json_ or _xml_.
     * @param style The style to be used to render the tile. Valid values are absolute which returns colors reflecting
     *     the absolute speed measured, relative which returns the speed relative to free-flow, Relative-delay which
     *     displays relative speeds only where they are different from the freeflow speeds.
     * @param zoom Zoom level for the desired tile. Zoom value must be in the range: 0-22 (inclusive). Please see [Zoom
     *     Levels and Tile
     *     Grid](https://docs.microsoft.com/azure/location-based-services/zoom-levels-and-tile-grid) for details.
     * @param coordinates Coordinates of the point close to the road segment. This parameter is a list of four
     *     coordinates, containing two coordinate pairs (lat, long, lat, long), and calculated using EPSG4326
     *     projection. When this endpoint is called directly, coordinates are passed in as a single string containing
     *     four coordinates, separated by commas.
     * @param unit Unit of speed in KMPH or MPH.
     * @param thickness The value of the width of the line representing traffic. This value is a multiplier and the
     *     accepted values range from 1 - 20. The default value is 10.
     * @param openLr Boolean on whether the response should include OpenLR code.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Traffic Flow Segment call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TrafficFlowSegmentData getTrafficFlowSegment(
            ResponseFormat format,
            TrafficFlowSegmentStyle style,
            int zoom,
            List<Double> coordinates,
            SpeedUnit unit,
            Integer thickness,
            Boolean openLr) {
        return this.asyncClient.getTrafficFlowSegment(format, style, zoom, coordinates, unit, thickness, openLr).block();
    }
    
    /**
     * Get traffic flow segment with response
     * @param format Desired format of the response. Value can be either _json_ or _xml_
     * @param style The style to be used to render the tile. Valid values are absolute which returns colors reflecting
     *     the absolute speed measured, relative which returns the speed relative to free-flow, Relative-delay which
     *     displays relative speeds only where they are different from the freeflow speeds.
     * @param zoom Zoom level for the desired tile. Zoom value must be in the range: 0-22 (inclusive). Please see [Zoom
     *     Levels and Tile
     *     Grid](https://docs.microsoft.com/azure/location-based-services/zoom-levels-and-tile-grid) for details
     * @param coordinates Coordinates of the point close to the road segment. This parameter is a list of four
     *     coordinates, containing two coordinate pairs (lat, long, lat, long), and calculated using EPSG4326
     *     projection. When this endpoint is called directly, coordinates are passed in as a single string containing
     *     four coordinates, separated by commas
     * @param unit Unit of speed in KMPH or MPH
     * @param thickness The value of the width of the line representing traffic. This value is a multiplier and the
     *     accepted values range from 1 - 20. The default value is 10
     * @param openLr Boolean on whether the response should include OpenLR code
     * @return
     */    
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TrafficFlowSegmentData> getTrafficFlowSegmentWithResponse(
        ResponseFormat format,
        TrafficFlowSegmentStyle style,
        int zoom,
        List<Double> coordinates,
        SpeedUnit unit,
        Integer thickness,
        Boolean openLr) {
        return this.asyncClient.getTrafficFlowSegmentWithResponse(format, style, zoom, coordinates, unit, thickness, openLr).block();
    }

    /**
     * __Traffic Incident Tile__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This service serves 256 x 256 pixel tiles showing traffic incidents. All tiles use the same grid system.
     * Because the traffic tiles use transparent images, they can be layered on top of map tiles to create a compound
     * display. Traffic tiles render graphics to indicate traffic on the roads in the specified area.
     *
     * @param format Desired format of the response. Possible values are png &amp; pbf.
     * @param style The style to be used to render the tile. This parameter is not valid when format is pbf.
     * @param zoom Zoom level for the desired tile. For _raster_ tiles, value must be in the range: 0-22 (inclusive).
     *     For _vector_ tiles, value must be in the range: 0-22 (inclusive). Please see [Zoom Levels and Tile
     *     Grid](https://docs.microsoft.com/azure/location-based-services/zoom-levels-and-tile-grid) for details.
     * @param tileIndex Parameter group.
     * @param trafficState Reference value for the state of traffic at a particular time, obtained from the Viewport API
     *     call, trafficModelId attribute in trafficState field. It is updated every minute, and is valid for two
     *     minutes before it times out. Use -1 to get the most recent traffic information. Default: most recent traffic
     *     information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public InputStream getTrafficIncidentTile(
            TileFormat format, TrafficIncidentTileStyle style, int zoom, TileIndex tileIndex, String trafficState) {
                Iterator<ByteBufferBackedInputStream> iterator = this.asyncClient.getTrafficIncidentTile(format, style, zoom, tileIndex, trafficState).map(ByteBufferBackedInputStream::new).toStream().iterator();
                return getInputStream(iterator);
    }

    /**
     * 
     * @param format Desired format of the response. Possible values are png & amp
     * @param style The style to be used to render the tile. This parameter is not valid when format is pbf
     * @param zoom Zoom level for the desired tile. For _raster_ tiles, value must be in the range: 0-22 (inclusive).
     *     For _vector_ tiles, value must be in the range: 0-22 (inclusive). Please see [Zoom Levels and Tile
     *     Grid](https://docs.microsoft.com/azure/location-based-services/zoom-levels-and-tile-grid) for details
     * @param tileIndex Parameter group
     * @param trafficState Reference value for the state of traffic at a particular time, obtained from the Viewport API
     *     call, trafficModelId attribute in trafficState field. It is updated every minute, and is valid for two
     *     minutes before it times out. Use -1 to get the most recent traffic information. Default: most recent traffic
     *     information
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SimpleResponse<InputStream> getTrafficIncidentTileWithResponse(TileFormat format, TrafficIncidentTileStyle style, int zoom, TileIndex tileIndex, String trafficState) {
        Mono<StreamResponse> monoResp = this.asyncClient.getTrafficIncidentTileWithResponse(format, style, zoom, tileIndex, trafficState); 
        StreamResponse resp = monoResp.block();
        Iterator<ByteBufferBackedInputStream> iterator = resp.getValue().map(ByteBufferBackedInputStream::new).toStream().iterator();
        return new SimpleResponse<InputStream>(resp.getRequest(), resp.getStatusCode(), resp.getHeaders(), getInputStream(iterator));
    } 

    /**
     * __Traffic Incident Detail__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API provides information on traffic incidents inside a given bounding box, based on the current Traffic
     * Model ID. The Traffic Model ID is available to grant synchronization of data between calls and API's. The Traffic
     * Model ID is a key value for determining the currency of traffic incidents. It is updated every minute, and is
     * valid for two minutes before it times out. It is used in rendering [incident
     * tiles](https://docs.microsoft.com/en-us/rest/api/maps/traffic/gettrafficincidenttile). It can be obtained from
     * the [Viewport API](https://docs.microsoft.com/en-us/rest/api/maps/traffic/gettrafficincidentviewport).
     *
     * @param format Desired format of the response. Value can be either _json_ or _xml_.
     * @param style The style that will be used to render the tile in Traffic [Incident Tile
     *     API](https://docs.microsoft.com/rest/api/maps/traffic/gettrafficincidenttile). This will have an effect
     *     on the coordinates of traffic incidents in the reply.
     * @param boundingbox The `boundingbox` is represented by two value pairs describing it's corners (first pair for
     *     lower left corner and second for upper right). The pairs can either be specified using any of the
     *     `projection`'s specified below (e.g., _minY,minX,maxY,maxX_) or by two latitude-longitude pairs (e.g.,
     *     _minLat,minLon,maxLat,maxLon_).&lt;br&gt;&lt;br&gt;NOTE: If latitude/longitude pairs are used, then the
     *     `projection` parameter must be set to "EPSG4326".
     * @param boundingZoom Zoom level for desired tile. 0 to 22 for raster tiles, 0 through 22 for vector tiles.
     * @param trafficmodelid Number referencing traffic model. This can be obtained from the [Viewport
     *     API](https://docs.microsoft.com/rest/api/maps/traffic/gettrafficincidentviewport). It is updated every
     *     minute, and is valid for two minutes before it times out. If the wrong Traffic Model ID is specified, the
     *     correct one will be returned by the interface. A value of -1 will always invoke the most recent traffic
     *     model.
     * @param language [ISO 639-1 code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) for the output language.
     *     Supported languages are ar, ca, cs, da, de, el, en, en-GB, en-US, es, et, fi, fr, he, hu, id, in*, it, lt,
     *     lv, nb, nl, no, pl, pt, ro, ru, sk, sv, th, tr, zh.
     *     <p>Please refer to [Supported
     *     Languages](https://docs.microsoft.com/azure/azure-maps/supported-languages) for details. When invalid
     *     language code is provided response is returned in English. When incident cause or description does not have
     *     translation, English description is returned.
     * @param projection The projection used to specify the coordinates in the request and response.
     *     [EPSG900913](http://docs.openlayers.org/library/spherical_mercator.html) (default) or
     *     [EPSG4326](http://spatialreference.org/ref/epsg/4326/).
     * @param geometries The type of vector geometry added to incidents (returned in the &lt;v&gt; element of the
     *     response).
     * @param expandCluster Boolean to indicate whether to list all traffic incidents in a cluster separately.
     * @param originalPosition Boolean on whether to return the original position of the incident (&lt;op&gt;) as well
     *     as the one shifted to the beginning of the traffic tube (&lt;op&gt;).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Traffic incident Detail call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TrafficIncidentDetail getTrafficIncidentDetail(
            ResponseFormat format,
            IncidentDetailStyle style,
            List<Double> boundingbox,
            int boundingZoom,
            String trafficmodelid,
            String language,
            ProjectionStandard projection,
            IncidentGeometryType geometries,
            Boolean expandCluster,
            Boolean originalPosition) {
        return this.asyncClient.getTrafficIncidentDetail(
                format,
                style,
                boundingbox,
                boundingZoom,
                trafficmodelid,
                language,
                projection,
                geometries,
                expandCluster,
                originalPosition).block();
    }

    /**
     * Get traffic incident detail with response
     * @param format Desired format of the response. Value can be either _json_ or _xml_
     * @param style The style that will be used to render the tile in Traffic [Incident Tile
     *     API](https://docs.microsoft.com/rest/api/maps/traffic/gettrafficincidenttile). This will have an effect
     *     on the coordinates of traffic incidents in the reply.
     * @param boundingbox The `boundingbox` is represented by two value pairs describing it's corners (first pair for
     *     lower left corner and second for upper right). The pairs can either be specified using any of the
     *     `projection`'s specified below (e.g., _minY,minX,maxY,maxX_) or by two latitude-longitude pairs (e.g.,
     *     _minLat,minLon,maxLat,maxLon_).&lt;br&gt;&lt;br&gt;NOTE: If latitude/longitude pairs are used, then the
     *     `projection` parameter must be set to "EPSG4326".
     * @param boundingZoom Zoom level for desired tile. 0 to 22 for raster tiles, 0 through 22 for vector tiles
     * @param trafficmodelid Number referencing traffic model. This can be obtained from the [Viewport
     *     API](https://docs.microsoft.com/rest/api/maps/traffic/gettrafficincidentviewport). It is updated every
     *     minute, and is valid for two minutes before it times out. If the wrong Traffic Model ID is specified, the
     *     correct one will be returned by the interface. A value of -1 will always invoke the most recent traffic
     *     model.
     * @param language [ISO 639-1 code](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) for the output language.
     *     Supported languages are ar, ca, cs, da, de, el, en, en-GB, en-US, es, et, fi, fr, he, hu, id, in*, it, lt,
     *     lv, nb, nl, no, pl, pt, ro, ru, sk, sv, th, tr, zh.
     *     <p>Please refer to [Supported
     *     Languages](https://docs.microsoft.com/azure/azure-maps/supported-languages) for details. When invalid
     *     language code is provided response is returned in English. When incident cause or description does not have
     *     translation, English description is returned.
     * @param projection The projection used to specify the coordinates in the request and response.
     *     [EPSG900913](http://docs.openlayers.org/library/spherical_mercator.html) (default) or
     *     [EPSG4326](http://spatialreference.org/ref/epsg/4326/).
     * @param geometries The type of vector geometry added to incidents (returned in the &lt;v&gt; element of the
     *     response).
     * @param expandCluster Boolean to indicate whether to list all traffic incidents in a cluster separately
     * @param originalPosition Boolean on whether to return the original position of the incident (&lt;op&gt;) as well
     *     as the one shifted to the beginning of the traffic tube (&lt;op&gt;)
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TrafficIncidentDetail> getTrafficIncidentDetailWithResponse(
        ResponseFormat format,
            IncidentDetailStyle style,
            List<Double> boundingbox,
            int boundingZoom,
            String trafficmodelid,
            String language,
            ProjectionStandard projection,
            IncidentGeometryType geometries,
            Boolean expandCluster,
            Boolean originalPosition) {
        return this.asyncClient.getTrafficIncidentDetailWithResponse(
            format,
            style,
            boundingbox,
            boundingZoom,
            trafficmodelid,
            language,
            projection,
            geometries,
            expandCluster,
            originalPosition).block();
    }

    /**
     * __Traffic Incident Viewport__
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>This API returns legal and technical information for the viewport described in the request. It should be
     * called by client applications whenever the viewport changes (for instance, through zooming, panning, going to a
     * location, or displaying a route). The request should contain the bounding box and zoom level of the viewport
     * whose information is needed. The return will contain map version information, as well as the current Traffic
     * Model ID and copyright IDs. The Traffic Model ID returned by the Viewport Description is used by other APIs to
     * retrieve last traffic information for further processing.
     *
     * @param format Desired format of the response. Value can be either _json_ or _xml_.
     * @param boundingbox Bounding box of the map viewport in
     *     [EPSG900913](http://docs.openlayers.org/library/spherical_mercator.html) projection. The `boundingbox` is
     *     represented by two value pairs describing it's corners (first pair for lower left corner and second for upper
     *     right). When this endpoint is called directly, all values should be separated by commas (e.g.,
     *     _minY,minX,maxY,maxX_). The maximum size of the bounding box that can be passed is dependent on the requested
     *     zoom level. The width and height cannot exceed 4092 pixels when rendered on the given zoom
     *     level.&lt;br&gt;&lt;br&gt;NOTE: Bounding boxes that cross the 180° meridian require special treatment. For
     *     such boxes, the eastern _maxX_ value will be negative, and thus less than the _minX_ value west of the 180°
     *     meridian. To address that, the value 40075016.6855874 should be added to the true _maxX_ value before it is
     *     passed in the request.
     * @param boundingzoom Zoom level of the map viewport. Used to determine whether the view can be zoomed in.
     * @param overviewbox Bounding box of the overview map in
     *     [EPSG900913](http://docs.openlayers.org/library/spherical_mercator.html) projection.&lt;br&gt;&lt;br&gt;Used
     *     in case the overview box/mini map has different copyright data than the main map. If there is no mini map,
     *     the same coordinates as `boundingBox` is used. When this endpoint is called directly, coordinates are passed
     *     in as a single string containing four coordinates, separated by commas.
     * @param overviewzoom Zoom level of the overview map. If there is no mini map, use the same zoom level as
     *     boundingZoom.
     * @param copyright Determines what copyright information to return. When true the copyright text is returned; when
     *     false only the copyright index is returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Traffic Incident Viewport call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public TrafficIncidentViewport getTrafficIncidentViewport(
            ResponseFormat format,
            List<Double> boundingbox,
            int boundingzoom,
            List<Double> overviewbox,
            int overviewzoom,
            Boolean copyright) {
        return this.asyncClient.getTrafficIncidentViewport(
                format, boundingbox, boundingzoom, overviewbox, overviewzoom, copyright).block();
    }

    /**
     * Get traffic incident viewport with response
     * @param format Desired format of the response. Value can be either _json_ or _xml_
     * @param boundingbox Bounding box of the map viewport in
     *     [EPSG900913](http://docs.openlayers.org/library/spherical_mercator.html) projection. The `boundingbox` is
     *     represented by two value pairs describing it's corners (first pair for lower left corner and second for upper
     *     right). When this endpoint is called directly, all values should be separated by commas (e.g.,
     *     _minY,minX,maxY,maxX_). The maximum size of the bounding box that can be passed is dependent on the requested
     *     zoom level. The width and height cannot exceed 4092 pixels when rendered on the given zoom
     *     level.&lt;br&gt;&lt;br&gt;NOTE: Bounding boxes that cross the 180° meridian require special treatment. For
     *     such boxes, the eastern _maxX_ value will be negative, and thus less than the _minX_ value west of the 180°
     *     meridian. To address that, the value 40075016.6855874 should be added to the true _maxX_ value before it is
     *     passed in the request.
     * @param boundingzoom Zoom level of the map viewport. Used to determine whether the view can be zoomed in
     * @param overviewbox Bounding box of the overview map in
     *     [EPSG900913](http://docs.openlayers.org/library/spherical_mercator.html) projection.&lt;br&gt;&lt;br&gt;Used
     *     in case the overview box/mini map has different copyright data than the main map. If there is no mini map,
     *     the same coordinates as `boundingBox` is used. When this endpoint is called directly, coordinates are passed
     *     in as a single string containing four coordinates, separated by commas.
     * @param overviewzoom Zoom level of the overview map. If there is no mini map, use the same zoom level as
     *     boundingZoom.
     * @param copyright Determines what copyright information to return. When true the copyright text is returned; when
     *     false only the copyright index is returned
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<TrafficIncidentViewport> getTrafficIncidentViewportWithResponse(
            ResponseFormat format,
            List<Double> boundingbox,
            int boundingzoom,
            List<Double> overviewbox,
            int overviewzoom,
            Boolean copyright) {
        return this.asyncClient.getTrafficIncidentViewportWithResponse(format, boundingbox, boundingzoom, overviewbox, overviewzoom, copyright).block();
    }

    private InputStream getInputStream(Iterator<ByteBufferBackedInputStream> iterator) {
        Enumeration<InputStream> enumeration = new Enumeration<InputStream>() {
            @Override
            public boolean hasMoreElements() {
                return iterator.hasNext();
            }

            @Override
            public InputStream nextElement() {
                return iterator.next();
            }
        };
        return new SequenceInputStream(enumeration);
    }
}