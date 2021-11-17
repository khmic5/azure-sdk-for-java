// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;
import com.azure.maps.search.implementation.models.SearchesReverseSearchAddressBatchHeaders;

/** Contains all response data for the reverseSearchAddressBatch operation. */
public final class SearchesReverseSearchAddressBatchResponse
        extends ResponseBase<SearchesReverseSearchAddressBatchHeaders, ReverseSearchAddressBatchProcessResult> {
    /**
     * Creates an instance of SearchesReverseSearchAddressBatchResponse.
     *
     * @param request the request which resulted in this SearchesReverseSearchAddressBatchResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public SearchesReverseSearchAddressBatchResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            ReverseSearchAddressBatchProcessResult value,
            SearchesReverseSearchAddressBatchHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public ReverseSearchAddressBatchProcessResult getValue() {
        return super.getValue();
    }
}
