package com.azure.maps.traffic.implementation.helpers;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.maps.traffic.implementation.models.TrafficFlowSegmentData;

public class Utility {
    public static SimpleResponse<TrafficFlowSegmentData> createTrafficFlowSegmentResponse(Response<TrafficFlowSegmentData> response) {
        SimpleResponse<TrafficFlowSegmentData> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            response.getValue());
        return simpleResponse;
    }
}