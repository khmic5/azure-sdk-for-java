package com.azure.maps.render.implementation.helpers;

import java.util.Arrays;
import java.util.List;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.maps.render.implementation.models.IncludeText;
import com.azure.maps.render.implementation.models.MapTilesetPrivate;
import com.azure.maps.render.models.BoundingBox;
import com.azure.maps.render.models.Center;
import com.azure.maps.render.models.MapTileset;

public class Utility {
    public static BoundingBox toBoundingBox(List<Double> boundingBox) {
        if (boundingBox == null || boundingBox.size() == 0) {
            return null;
        }
        BoundingBox result = new BoundingBox(boundingBox.get(3), boundingBox.get(2), boundingBox.get(1), boundingBox.get(0));
        return result;
    }

    public static IncludeText toIncludeTextPrivate(boolean includeText) {
        return IncludeText.fromString(String.valueOf(includeText));
    }

    public static List<Double> toCenterPrivate(Center center) {
        return Arrays.asList(center.getCoordinates().getLatitude(), 
        center.getCoordinates().getLongitude(), Double.valueOf(center.getZoom()));
    }

    public static Center toCenter(List<Float> center) {
        return new Center(center.get(0), center.get(1), center.get(2));
    }

    public static SimpleResponse<MapTileset> createMapTilesetResponse(Response<MapTilesetPrivate> response) {
        MapTileset result = Utility.toMapTileset(response.getValue());
        SimpleResponse<MapTileset> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);
        return simpleResponse;
    }

    public static MapTileset toMapTileset(MapTilesetPrivate privateResult) {
        MapTileset result = new MapTileset();
        MapTilesetPropertiesHelper.setFromMapTilesetPrivate(result, privateResult);
        return result;
    }
}