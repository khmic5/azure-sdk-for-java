package com.azure.maps.search.util;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;
import com.azure.maps.search.models.SearchAddressResult;

/**
 * TypeMapper utility to convert between private and public representations of search result models.
 */
public final class TypeMapper {

    /**
     * converts the internal representation of SearchAddressResult into the public one
     * @param response
     * @return
     */
    public static SimpleResponse<SearchAddressResult> createSearchResponse(
        Response<com.azure.maps.search.implementation.models.SearchAddressResult> response) {
        SearchAddressResult result = new SearchAddressResult(response.getValue());
        SimpleResponse<SearchAddressResult> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);

        return simpleResponse;
    }

    /**
     * converts the internal representation of ReverseSearchAddressResult into the public one
     */
    public static SimpleResponse<ReverseSearchAddressResult> createReverseSearchResponse(
        Response<com.azure.maps.search.implementation.models.ReverseSearchAddressResult> response) {
        ReverseSearchAddressResult result = new ReverseSearchAddressResult(response.getValue());
        SimpleResponse<ReverseSearchAddressResult> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);

        return simpleResponse;
    }

    /**
     * converts the internal representation of ReverseSearchCrossStreetAddressResult into the public one
     */
    public static SimpleResponse<ReverseSearchCrossStreetAddressResult> createReverseSearchCrossStreetResponse(
        Response<com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResult> response) {
        ReverseSearchCrossStreetAddressResult result = new ReverseSearchCrossStreetAddressResult(response.getValue());
        SimpleResponse<ReverseSearchCrossStreetAddressResult> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);

        return simpleResponse;
    }
}
