// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the updatePreview operation. */
public final class DatasUpdatePreviewResponse
        extends ResponseBase<DatasUpdatePreviewHeaders, LongRunningOperationResult> {
    /**
     * Creates an instance of DatasUpdatePreviewResponse.
     *
     * @param request the request which resulted in this DatasUpdatePreviewResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DatasUpdatePreviewResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            LongRunningOperationResult value,
            DatasUpdatePreviewHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public LongRunningOperationResult getValue() {
        return super.getValue();
    }
}
