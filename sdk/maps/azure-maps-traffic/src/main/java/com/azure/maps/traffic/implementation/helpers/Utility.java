package com.azure.maps.traffic.implementation.helpers;

import java.util.Arrays;
import java.util.List;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.maps.traffic.models.GeoBoundingBox;
import com.azure.maps.traffic.implementation.models.TrafficFlowSegmentData;

public class Utility {
    public static SimpleResponse<TrafficFlowSegmentData> createTrafficFlowSegmentResponse(Response<TrafficFlowSegmentData> response) {
        SimpleResponse<TrafficFlowSegmentData> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            response.getValue());
        return simpleResponse;
    }

    public static List<Double> toBoundingBox(GeoBoundingBox boundingBox) {
        return Arrays.asList(boundingBox.getSouth(), boundingBox.getWest(), boundingBox.getNorth(), boundingBox.getEast());
    }
}