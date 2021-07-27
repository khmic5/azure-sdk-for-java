// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.maps.creator.fluent.models.LongRunningOperationResultInner;

/** Contains all response data for the uploadPreview operation. */
public final class DatasUploadPreviewResponse
    extends ResponseBase<DatasUploadPreviewHeaders, LongRunningOperationResultInner> {
    /**
     * Creates an instance of DatasUploadPreviewResponse.
     *
     * @param request the request which resulted in this DatasUploadPreviewResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public DatasUploadPreviewResponse(
        HttpRequest request,
        int statusCode,
        HttpHeaders rawHeaders,
        LongRunningOperationResultInner value,
        DatasUploadPreviewHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public LongRunningOperationResultInner getValue() {
        return super.getValue();
    }
}
