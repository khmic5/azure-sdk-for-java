// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getMapTile operation. */
public final class RenderV2sGetMapTileResponse extends ResponseBase<RenderV2sGetMapTileHeaders, Void> {
    /**
     * Creates an instance of RenderV2sGetMapTileResponse.
     *
     * @param request the request which resulted in this RenderV2sGetMapTileResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public RenderV2sGetMapTileResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            Void value,
            RenderV2sGetMapTileHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }
}
