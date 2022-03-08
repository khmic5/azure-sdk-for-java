package com.azure.maps.traffic.implementation.helpers;

import java.util.Arrays;
import java.util.List;

import com.azure.core.models.GeoBoundingBox;
import com.azure.core.models.GeoPosition;



public class Utility {
    // public static SimpleResponse<TrafficFlowSegmentData> createTrafficFlowSegmentResponse(Response<TrafficFlowSegmentData> response) {
    //     SimpleResponse<TrafficFlowSegmentData> simpleResponse = new SimpleResponse<>(response.getRequest(),
    //         response.getStatusCode(),
    //         response.getHeaders(),
    //         response.getValue());
    //     return simpleResponse;
    // }

    public static List<Double> toBoundingBox(GeoBoundingBox boundingBox) {
        return Arrays.asList(boundingBox.getSouth(), boundingBox.getWest(), boundingBox.getNorth(), boundingBox.getEast());
    }
    public static List<Double> toCoordinates(GeoPosition geoPosition) {
        return Arrays.asList(geoPosition.getLatitude(),geoPosition.getLongitude());
    }
}