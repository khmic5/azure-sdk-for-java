// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.maps.search;

import java.util.List;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.maps.search.models.BatchRequest;
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
import com.azure.maps.search.models.ErrorResponseException;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.PointOfInterestCategoryTreeResult;
import com.azure.maps.search.models.Polygon;
import com.azure.maps.search.models.ReverseSearchAddressOptions;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressOptions;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;
import com.azure.maps.search.models.SearchAddressOptions;
import com.azure.maps.search.models.SearchAddressResult;
import com.azure.maps.search.models.SearchAlongRouteOptions;
import com.azure.maps.search.models.SearchInsideGeometryOptions;
import com.azure.maps.search.models.SearchNearbyPointsOfInterestOptions;
import com.azure.maps.search.models.SearchPointOfInterestCategoryOptions;
import com.azure.maps.search.models.SearchPointOfInterestOptions;
import com.azure.maps.search.models.SearchStructuredAddressOptions;
import com.azure.maps.search.models.StructuredAddress;

/** Initializes a new instance of the synchronous SearchClient type. */
@ServiceClient(builder = SearchClientBuilder.class)
public final class SearchClient {
    private final SearchAsyncClient asyncClient;

    /**
     * Initializes an instance of Searches client.
     *
     * @param serviceClient the service client implementation.
     */
    SearchClient(SearchAsyncClient asyncClient) {
        this.asyncClient = asyncClient;
    }

    /**
     * List Polygons
     *
     * @param geometryIds
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public List<Polygon> getPolygons(List<String> geometryIds) {
        return this.asyncClient.getPolygons(geometryIds).block();
    }

    /**
     * **Get Polygon**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param geometryIds Comma separated list of geometry UUIDs, previously retrieved from an Online Search request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Polygon call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<List<Polygon>> getPolygonsWithResponse(List<String> geometryIds, Context context) {
        return this.asyncClient.getPolygonsWithResponse(geometryIds, context).block();
    }

    /**
     *
     * @param options
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SearchAddressResult fuzzySearch(FuzzySearchOptions options){
        return this.asyncClient.fuzzySearch(options).block();
    }

    /**
     * **Free Form Search**
     *
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SearchAddressResult> fuzzySearchWithResponse(FuzzySearchOptions options, Context context) {
        return this.asyncClient.fuzzySearchWithResponse(options, context).block();
    }

    /**
     *
     * @param options
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SearchAddressResult searchPointOfInterest(SearchPointOfInterestOptions options) {
        return this.asyncClient.searchPointOfInterest(options).block();
    }

    /**
     * **Get POI by Name**
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SearchAddressResult> searchPointOfInterestWithResponse(SearchPointOfInterestOptions options,
            Context context) {
        return this.asyncClient.searchPointOfInterestWithResponse(options, context).block();
    }

    /**
     * **Nearby Search**
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SearchAddressResult searchNearbyPointOfInterest(SearchNearbyPointsOfInterestOptions options) {
        return this.asyncClient.searchNearbyPointOfInterest(options).block();
    }

    /**
     * **Nearby Search**
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SearchAddressResult> searchNearbyPointOfInterestWithResponse(
            SearchNearbyPointsOfInterestOptions options, Context context) {
        return this.asyncClient.searchNearbyPointOfInterestWithResponse(options, context).block();
    }

    /**
     * **Get POI by Category**
     *
     * @param operatingHours Hours of operation for a POI (Points of Interest). The availability of hours of operation
     *     will vary based on the data available. If not passed, then no opening hours information will be returned.
     *     Supported value: nextSevenDays.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SearchAddressResult searchPointOfInterestCategory(SearchPointOfInterestCategoryOptions options) {
        return this.asyncClient.searchPointOfInterestCategory(options).block();
    }

    /**
     * **Get POI by Category**
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SearchAddressResult> searchPointOfInterestCategoryWithResponse(
            SearchPointOfInterestCategoryOptions options, Context context) {
        return this.asyncClient.searchPointOfInterestCategoryWithResponse(options, context).block();
    }

    /**
     * **Get POI Category Tree**
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>POI Category API provides a full list of supported Points of Interest (POI) categories and subcategories
     * together with their translations and synonyms. The returned content can be used to provide more meaningful
     * results through other Search Service APIs, like [Get Search
     * POI](https://docs.microsoft.com/rest/api/maps/search/getsearchpoi).
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param language Language in which search results should be returned. Should be one of supported IETF language
     *     tags, except NGT and NGT-Latn. Language tag is case insensitive. When data in specified language is not
     *     available for a specific field, default language is used (English).
     *     <p>Please refer to [Supported Languages](https://docs.microsoft.com/azure/azure-maps/supported-languages) for
     *     details.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful POI Category Tree call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PointOfInterestCategoryTreeResult getPointOfInterestCategoryTree(String language) {
        return this.asyncClient.getPointOfInterestCategoryTree(language).block();
    }

    /**
     * **Get POI Category Tree**
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * <p>POI Category API provides a full list of supported Points of Interest (POI) categories and subcategories
     * together with their translations and synonyms. The returned content can be used to provide more meaningful
     * results through other Search Service APIs, like [Get Search
     * POI](https://docs.microsoft.com/rest/api/maps/search/getsearchpoi).
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param language Language in which search results should be returned. Should be one of supported IETF language
     *     tags, except NGT and NGT-Latn. Language tag is case insensitive. When data in specified language is not
     *     available for a specific field, default language is used (English).
     *     <p>Please refer to [Supported Languages](https://docs.microsoft.com/azure/azure-maps/supported-languages) for
     *     details.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful POI Category Tree call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<PointOfInterestCategoryTreeResult> getPointOfInterestCategoryTreeWithResponse(
            String language, Context context) {
        return this.asyncClient.getPointOfInterestCategoryTreeWithResponse(language, context).block();
    }

    /**
     * **Address Geocoding**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SearchAddressResult searchAddress(SearchAddressOptions options) {
        return this.asyncClient.searchAddress(options).block();
    }

    /**
     * **Address Geocoding**
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.

     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SearchAddressResult> searchAddressWithResponse(SearchAddressOptions options,
            Context context) {
        return this.asyncClient.searchAddressWithResponse(options, context).block();
    }

    /**
     * **Reverse Geocode to an Address**

     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReverseSearchAddressResult reverseSearchAddress(ReverseSearchAddressOptions options) {
        return this.asyncClient.reverseSearchAddress(options).block();
    }

    /**
     * **Reverse Geocode to an Address**
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReverseSearchAddressResult> reverseSearchAddressWithResponse(
            ReverseSearchAddressOptions options, Context context) {
        return this.asyncClient.reverseSearchAddressWithResponse(options, context).block();
    }

    /**
     * **Reverse Geocode to a Cross Street**
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse CrossStreet call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ReverseSearchCrossStreetAddressResult reverseSearchCrossStreetAddress(
            ReverseSearchCrossStreetAddressOptions options) {
        return this.asyncClient.reverseSearchCrossStreetAddress(options).block();
    }

    /**
     * **Reverse Geocode to a Cross Street**
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse CrossStreet call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ReverseSearchCrossStreetAddressResult> reverseSearchCrossStreetAddressWithResponse(
            ReverseSearchCrossStreetAddressOptions options, Context context) {
        return this.asyncClient.reverseSearchCrossStreetAddressWithResponse(options, context).block();
    }

    /**
     * **Structured Address Geocoding**
     *

     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SearchAddressResult searchStructuredAddress(StructuredAddress address,
            SearchStructuredAddressOptions options) {
        return this.asyncClient.searchStructuredAddress(address, options).block();
    }

    /**
     * **Structured Address Geocoding**
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SearchAddressResult> searchStructuredAddressWithResponse(
            StructuredAddress address, SearchStructuredAddressOptions options, Context context) {
        return this.asyncClient.searchStructuredAddressWithResponse(address, options, context).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SearchAddressResult searchInsideGeometry(SearchInsideGeometryOptions options) {
        return this.asyncClient.searchInsideGeometry(options).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.

     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SearchAddressResult> searchInsideGeometryWithResponse(SearchInsideGeometryOptions options,
            Context context) {
        return this.asyncClient.searchInsideGeometryWithResponse(options, null).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *

     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SearchAddressResult searchAlongRoute(SearchAlongRouteOptions options) {
        return this.asyncClient.searchAlongRoute(options).block();
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SearchAddressResult> searchAlongRouteWithResponse(SearchAlongRouteOptions options,
            Context context) {
        return this.asyncClient.searchAlongRouteWithResponse(options, context).block();
    }

    /**
     * **Search Fuzzy Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of search fuzzy queries/requests to process. The list can contain a
     *     max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BatchSearchResult fuzzySearchBatchSync(BatchRequest batchRequest) {
        return this.asyncClient.fuzzySearchBatchSync(batchRequest).block();
    }

    /**
     * **Search Fuzzy Batch API**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of search fuzzy queries/requests to process. The list can contain a
     *     max of 10,000 queries and must contain at least 1 query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BatchSearchResult> fuzzySearchBatchSyncWithResponse(
            BatchRequest batchRequest, Context context) {
        return this.asyncClient.fuzzySearchBatchSyncWithResponse(batchRequest, context).block();
    }

    /**
     * **Search Fuzzy Batch API**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of search fuzzy queries/requests to process. The list can contain a
     *     max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchSearchResult, BatchSearchResult> beginFuzzySearchBatch(
            BatchRequest batchRequest) {
        return this.asyncClient.beginFuzzySearchBatch(batchRequest).getSyncPoller();
    }

    /**
     * **Search Fuzzy Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of search fuzzy queries/requests to process. The list can contain a
     *     max of 10,000 queries and must contain at least 1 query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchSearchResult, BatchSearchResult> beginFuzzySearchBatch(
            BatchRequest batchRequest, Context context) {
        return this.asyncClient.beginFuzzySearchBatch(batchRequest, context).getSyncPoller();
    }

    /**
     * **Search Fuzzy Batch API**
     *
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchSearchResult, BatchSearchResult> beginGetFuzzySearchBatch(
            String batchId) {
        return this.asyncClient.beginGetFuzzySearchBatch(batchId).getSyncPoller();
    }

    /**
     * **Search Fuzzy Batch API**
     *
     *
     * @param batchId Batch id for querying the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchSearchResult, BatchSearchResult> beginGetFuzzySearchBatch(
            String batchId, Context context) {
        return this.asyncClient.beginGetFuzzySearchBatch(batchId, context).getSyncPoller();
    }

    /**
     * **Search Address Batch API**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BatchSearchResult searchAddressBatchSync(BatchRequest batchRequest) {
        return this.asyncClient.searchAddressBatchSync(batchRequest).block();
    }

    /**
     * **Search Address Batch API**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BatchSearchResult> searchAddressBatchSyncWithResponse(
            BatchRequest batchRequest, Context context) {
        return this.asyncClient.searchAddressBatchSyncWithResponse(batchRequest, context).block();
    }

    /**
     * **Search Address Batch API**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchSearchResult, BatchSearchResult> beginSearchAddressBatch(
            BatchRequest batchRequest) {
        return this.asyncClient.beginSearchAddressBatch(batchRequest).getSyncPoller();
    }

    /**
     * **Search Address Batch API**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchSearchResult, BatchSearchResult> beginSearchAddressBatch(
            BatchRequest batchRequest, Context context) {
        return this.asyncClient.beginSearchAddressBatch(batchRequest, context).getSyncPoller();
    }

    /**
     * **Search Address Batch API**
     *
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchSearchResult, BatchSearchResult> beginGetSearchAddressBatch(
            String batchId) {
        return this.asyncClient.beginGetSearchAddressBatch(batchId).getSyncPoller();
    }

    /**
     * **Search Address Batch API**
     * @param batchId Batch id for querying the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchSearchResult, BatchSearchResult> beginGetSearchAddressBatch(
            String batchId, Context context) {
        return this.asyncClient.beginGetSearchAddressBatch(batchId, context).getSyncPoller();
    }

    /**
     * **Search Address Reverse Batch API**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BatchReverseSearchResult reverseSearchAddressBatchSync(
            BatchRequest batchRequest) {
        return this.asyncClient.reverseSearchAddressBatchSync(batchRequest).block();
    }

    /**
     * **Search Address Reverse Batch API**
     *
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<BatchReverseSearchResult> reverseSearchAddressBatchSyncWithResponse(
            BatchRequest batchRequest, Context context) {
        return this.asyncClient.reverseSearchAddressBatchSyncWithResponse(batchRequest, context).block();
    }

    /**
     * **Search Address Reverse Batch API**
     *
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchReverseSearchResult, BatchReverseSearchResult>
            beginReverseSearchAddressBatch(BatchRequest batchRequest) {
        return this.asyncClient.beginReverseSearchAddressBatch(batchRequest).getSyncPoller();
    }

    /**
     * **Search Address Reverse Batch API**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchReverseSearchResult, BatchReverseSearchResult>
            beginReverseSearchAddressBatch(BatchRequest batchRequest, Context context) {
        return this.asyncClient.beginReverseSearchAddressBatch(batchRequest, context).getSyncPoller();
    }

    /**
     * **Search Address Reverse Batch API**
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchReverseSearchResult, BatchReverseSearchResult>
            beginGetReverseSearchAddressBatch(String batchId) {
        return this.asyncClient.beginGetReverseSearchAddressBatch(batchId).getSyncPoller();
    }

    /**
     * **Search Address Reverse Batch API**

     *
     * @param batchId Batch id for querying the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public SyncPoller<BatchReverseSearchResult, BatchReverseSearchResult>
            beginGetReverseSearchAddressBatch(String batchId, Context context) {
        return this.asyncClient.beginGetReverseSearchAddressBatch(batchId, context).getSyncPoller();
    }
}
