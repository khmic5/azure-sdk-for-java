package com.azure.maps.search.implementation.helpers;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.maps.search.implementation.models.ReverseSearchAddressBatchResultPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchAddressBatchResult;
import com.azure.maps.search.implementation.models.SearchAddressResultPrivate;
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
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
            Response<SearchAddressResultPrivate> response) {
        SearchAddressResult result = Utility.toSearchAddressResult(response.getValue());
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
            Response<ReverseSearchAddressResultPrivate> response) {
        ReverseSearchAddressResult result = Utility.toReverseSearchAddressResult(response.getValue());
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
            Response<ReverseSearchCrossStreetAddressResultPrivate> response) {
        ReverseSearchCrossStreetAddressResult result = Utility.toReverseSearchCrossStreetAddressResult(response.getValue());
        SimpleResponse<ReverseSearchCrossStreetAddressResult> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);

        return simpleResponse;
    }

    /**
     * converts the internal representation of SearchAddressResult into the public one
     * @param response
     * @return
     */
    public static SimpleResponse<BatchSearchResult> createBatchSearchResponse(
            Response<SearchAddressBatchResult> response) {
        BatchSearchResult result = (response.getValue() == null) ? null : Utility.toBatchSearchResult(response.getValue());
        SimpleResponse<BatchSearchResult> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);

        return simpleResponse;
    }

    /**
     * converts the internal representation of SearchAddressResult into the public one
     * @param response
     * @return
     */
    public static SimpleResponse<BatchReverseSearchResult> createBatchReverseSearchResponse(
            Response<ReverseSearchAddressBatchResultPrivate> response) {
        BatchReverseSearchResult result = (response.getValue() == null) ? null : Utility.toBatchReverseSearchResult(response.getValue());
        SimpleResponse<BatchReverseSearchResult> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);

        return simpleResponse;
    }
}
