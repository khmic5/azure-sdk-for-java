// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.maps.route.models.RouteMatrixResult;

/** Contains all response data for the requestRouteMatrix operation. */
public final class RoutesRequestRouteMatrixResponse
        extends ResponseBase<RoutesRequestRouteMatrixHeaders, RouteMatrixResult> {
    /**
     * Creates an instance of RoutesRequestRouteMatrixResponse.
     *
     * @param request the request which resulted in this RoutesRequestRouteMatrixResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public RoutesRequestRouteMatrixResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            RouteMatrixResult value,
            RoutesRequestRouteMatrixHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public RouteMatrixResult getValue() {
        return super.getValue();
    }
}
