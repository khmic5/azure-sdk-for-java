package com.azure.maps.search.util;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.maps.search.models.SearchAddressResult;

public class TypeMapper {

    // private methods
    public static SimpleResponse<SearchAddressResult> createSearchResponse(
        Response<com.azure.maps.search.implementation.models.SearchAddressResult> response) {
        SearchAddressResult result = new SearchAddressResult(response.getValue());
        SimpleResponse<SearchAddressResult> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);

        return simpleResponse;
    }
}
