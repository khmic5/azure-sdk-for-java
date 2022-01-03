// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.maps.search;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.TypeReference;
import com.azure.maps.search.implementation.SearchesImpl;
import com.azure.maps.search.implementation.helpers.BatchResponseSerializer;
import com.azure.maps.search.implementation.helpers.TypeMapper;
import com.azure.maps.search.implementation.models.PolygonResult;
import com.azure.maps.search.implementation.models.ResponseFormat;
import com.azure.maps.search.implementation.models.ReverseSearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchAddressBatchResult;
import com.azure.maps.search.implementation.models.SearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchAlongRouteRequest;
import com.azure.maps.search.implementation.models.SearchInsideGeometryRequest;
import com.azure.maps.search.models.BatchRequest;
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
import com.azure.maps.search.models.BoundingBox;
import com.azure.maps.search.models.ErrorResponseException;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.JsonFormat;
import com.azure.maps.search.models.LatLong;
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

import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous SearchClient type. */
@ServiceClient(builder = SearchClientBuilder.class, isAsync = true)
public final class SearchAsyncClient {
    // constants
    private static final int BATCH_SIZE = 100;
    private static final int POLLING_FREQUENCY = 1;

    // instance fields
    private final SearchesImpl serviceClient;
    private final HttpPipeline httpPipeline;
    private final BatchResponseSerializer serializer;
    private final DefaultPollingStrategy<BatchSearchResult, BatchSearchResult> forwardStrategy;
    private final DefaultPollingStrategy<BatchReverseSearchResult, BatchReverseSearchResult> reverseStrategy;

    /**
     * Initializes an instance of Searches client.
     *
     * @param serviceClient the service client implementation.
     */
    SearchAsyncClient(SearchesImpl serviceClient, HttpPipeline pipeline) {
        this.serviceClient = serviceClient;
        this.httpPipeline = pipeline;
        this.serializer = new BatchResponseSerializer();
        this.forwardStrategy = new DefaultPollingStrategy<>(httpPipeline, serializer);
        this.reverseStrategy = new DefaultPollingStrategy<>(httpPipeline, serializer);
    }

    /**
     * **Get Polygons**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param geometryIds Comma separated list of geometry UUIDs, previously retrieved from an Online Search request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Polygon call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<List<Polygon>> getPolygons(List<String> geometryIds) {
        Mono<Response<List<Polygon>>> result = this.getPolygonsWithResponse(geometryIds);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Get Polygons**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param geometryIds Comma separated list of geometry UUIDs, previously retrieved from an Online Search request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Polygon call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<Polygon>>> getPolygonsWithResponse(List<String> geometryIds) {
        return this.getPolygonsWithResponse(geometryIds, null);
    }

    /**
     * **Get Polygons**
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param geometryIds Comma separated list of geometry UUIDs, previously retrieved from an Online Search request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Polygon call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<List<Polygon>>> getPolygonsWithResponse(List<String> geometryIds,
            Context context) {
        Mono<Response<PolygonResult>> result = this.serviceClient.listPolygonsWithResponseAsync(JsonFormat.JSON,
            geometryIds, context);
        return result.flatMap(response -> {
            Response<List<Polygon>> simpleResponse = new SimpleResponse<List<Polygon>>(response,
                response.getValue().getPolygons());
            return Mono.just(simpleResponse);
        });
    }

    /**
     *
     * @param options
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchAddressResult> fuzzySearch(FuzzySearchOptions options) {
        Mono<Response<SearchAddressResult>> result = this.fuzzySearchWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Free Form Search**
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SearchAddressResult>> fuzzySearchWithResponse(FuzzySearchOptions options) {
        return this.fuzzySearchWithResponse(options, null);
    }

    /**
     * **Free Form Search**
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SearchAddressResult>> fuzzySearchWithResponse(FuzzySearchOptions options, Context context) {
        final Optional<LatLong> optCoordinates = Optional.ofNullable(options.getCoordinates());
        Mono<Response<SearchAddressResultPrivate>> responseMono =
            this.serviceClient.fuzzySearchWithResponseAsync(
                ResponseFormat.JSON,
                options.getQuery(),
                options.isTypeAhead(),
                options.getTop(),
                options.getSkip(),
                options.getCategoryFilter(),
                options.getCountryFilter(),
                optCoordinates.map(LatLong::getLat).orElse(null),
                optCoordinates.map(LatLong::getLon).orElse(null),
                options.getRadiusInMeters(),
                options.getBoundingBox().map(BoundingBox::getTopLeft).map(LatLong::toString).orElse(null),
                options.getBoundingBox().map(BoundingBox::getBottomRight).map(LatLong::toString).orElse(null),
                options.getLanguage(),
                options.getExtendedPostalCodesFor(),
                options.getMinFuzzyLevel(),
                options.getMaxFuzzyLevel(),
                options.getIndexFilter(),
                options.getBrandFilter(),
                options.getElectricVehicleConnectorFilter(),
                options.getEntityType(),
                options.getLocalizedMapView(),
                options.getOperatingHours(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<SearchAddressResult> simpleResponse = TypeMapper.createSearchResponse(response);
            return Mono.just(simpleResponse);
        });
    }

    /**
     *
     * @param options
     * @return
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchAddressResult> searchPointOfInterest(SearchPointOfInterestOptions options) {
        Mono<Response<SearchAddressResult>> result = this.searchPointOfInterestWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Get POI by Name**
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SearchAddressResult>> searchPointOfInterestWithResponse(SearchPointOfInterestOptions options) {
        return this.searchPointOfInterestWithResponse(options, null);
    }

    /**
     * **Get POI by Name**
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SearchAddressResult>> searchPointOfInterestWithResponse(SearchPointOfInterestOptions options,
            Context context) {
        final Optional<LatLong> optCoordinates = Optional.ofNullable(options.getCoordinates());
        Mono<Response<SearchAddressResultPrivate>> responseMono =
            this.serviceClient.searchPointOfInterestWithResponseAsync(
                ResponseFormat.JSON,
                options.getQuery(),
                options.isTypeAhead(),
                options.getTop(),
                options.getSkip(),
                options.getCategoryFilter(),
                options.getCountryFilter(),
                optCoordinates.map(LatLong::getLat).orElse(null),
                optCoordinates.map(LatLong::getLon).orElse(null),
                options.getRadiusInMeters(),
                options.getBoundingBox().map(BoundingBox::getTopLeft).map(LatLong::toString).orElse(null),
                options.getBoundingBox().map(BoundingBox::getBottomRight).map(LatLong::toString).orElse(null),
                options.getLanguage(),
                options.getExtendedPostalCodesFor(),
                options.getBrandFilter(),
                options.getElectricVehicleConnectorFilter(),
                options.getLocalizedMapView(),
                options.getOperatingHours(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<SearchAddressResult> simpleResponse = TypeMapper.createSearchResponse(response);
            return Mono.just(simpleResponse);
        });
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
    public Mono<SearchAddressResult> searchNearbyPointOfInterest(
            SearchNearbyPointsOfInterestOptions options) {
        Mono<Response<SearchAddressResult>> result = this.searchNearbyPointOfInterestWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Nearby Search**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchAddressResult>> searchNearbyPointOfInterestWithResponse(
            SearchNearbyPointsOfInterestOptions options) {
        return this.searchNearbyPointOfInterestWithResponse(options, null);
    }

    /**
     * **Nearby Search**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SearchAddressResult>> searchNearbyPointOfInterestWithResponse(
            SearchNearbyPointsOfInterestOptions options, Context context) {
        Mono<Response<SearchAddressResultPrivate>> responseMono =
            this.serviceClient.searchNearbyPointOfInterestWithResponseAsync(
                ResponseFormat.JSON,
                options.getCoordinates().getLat(),
                options.getCoordinates().getLon(),
                options.getTop(),
                options.getSkip(),
                options.getCategoryFilter(),
                options.getCountryFilter(),
                options.getRadiusInMeters(),
                options.getLanguage(),
                options.getExtendedPostalCodesFor(),
                options.getBrandFilter(),
                options.getElectricVehicleConnectorFilter(),
                options.getLocalizedMapView(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<SearchAddressResult> simpleResponse = TypeMapper.createSearchResponse(response);
            return Mono.just(simpleResponse);
        });
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
    public Mono<SearchAddressResult> searchPointOfInterestCategory(SearchPointOfInterestCategoryOptions options) {
        Mono<Response<SearchAddressResult>> result = this.searchPointOfInterestCategoryWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Get POI by Category**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchAddressResult>> searchPointOfInterestCategoryWithResponse(
                SearchPointOfInterestCategoryOptions options) {
        return this.searchPointOfInterestCategoryWithResponse(options, null);
    }
    /**
     * **Get POI by Category**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SearchAddressResult>> searchPointOfInterestCategoryWithResponse(
                SearchPointOfInterestCategoryOptions options, Context context) {
        final Optional<LatLong> optCoordinates = Optional.ofNullable(options.getCoordinates());
        Mono<Response<SearchAddressResultPrivate>> responseMono =
            this.serviceClient.searchPointOfInterestCategoryWithResponseAsync(
                ResponseFormat.JSON,
                options.getQuery(),
                options.isTypeAhead(),
                options.getTop(),
                options.getSkip(),
                options.getCategoryFilter(),
                options.getCountryFilter(),
                optCoordinates.map(LatLong::getLat).orElse(null),
                optCoordinates.map(LatLong::getLon).orElse(null),
                options.getRadiusInMeters(),
                options.getBoundingBox().map(BoundingBox::getTopLeft).map(LatLong::toString).orElse(null),
                options.getBoundingBox().map(BoundingBox::getBottomRight).map(LatLong::toString).orElse(null),
                options.getLanguage(),
                options.getExtendedPostalCodesFor(),
                options.getBrandFilter(),
                options.getElectricVehicleConnectorFilter(),
                options.getLocalizedMapView(),
                options.getOperatingHours(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<SearchAddressResult> simpleResponse = TypeMapper.createSearchResponse(response);
            return Mono.just(simpleResponse);
        });
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
    public Mono<PointOfInterestCategoryTreeResult> getPointOfInterestCategoryTree(String language) {
        return this.serviceClient.getPointOfInterestCategoryTreeAsync(JsonFormat.JSON, language);
    }

    /**
     * **Get POI Category Tree**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful POI Category Tree call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PointOfInterestCategoryTreeResult>> getPointOfInterestCategoryTreeWithResponse(
            String language) {
        return this.getPointOfInterestCategoryTreeWithResponse(language, null);
    }

    /**
     * **Get POI Category Tree**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful POI Category Tree call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PointOfInterestCategoryTreeResult>> getPointOfInterestCategoryTreeWithResponse(
            String language, Context context) {
        return this.serviceClient.getPointOfInterestCategoryTreeWithResponseAsync(JsonFormat.JSON, language,
            context);
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
    public Mono<SearchAddressResult> searchAddress(SearchAddressOptions options) {
        Mono<Response<SearchAddressResult>> result = this.searchAddressWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Address Geocoding**
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SearchAddressResult>> searchAddressWithResponse(SearchAddressOptions options) {
        return this.searchAddressWithResponse(options, null);
    }

    /**
     * **Address Geocoding**
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SearchAddressResult>> searchAddressWithResponse(SearchAddressOptions options, Context context) {
        Mono<Response<SearchAddressResultPrivate>> responseMono =
            this.serviceClient.searchAddressWithResponseAsync(
                ResponseFormat.JSON,
                options.getQuery(),
                options.isTypeAhead(),
                options.getTop(),
                options.getSkip(),
                options.getCountryFilter(),
                options.getCoordinates().map(LatLong::getLat).orElse(null),
                options.getCoordinates().map(LatLong::getLon).orElse(null),
                options.getRadiusInMeters(),
                options.getBoundingBox().map(BoundingBox::getTopLeft).map(LatLong::toString).orElse(null),
                options.getBoundingBox().map(BoundingBox::getBottomRight).map(LatLong::toString).orElse(null),
                options.getLanguage(),
                options.getExtendedPostalCodesFor(),
                options.getEntityType(),
                options.getLocalizedMapView(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<SearchAddressResult> simpleResponse = TypeMapper.createSearchResponse(response);
            return Mono.just(simpleResponse);
        });
    }

    /**
     * **Reverse Geocode to an Address**

     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReverseSearchAddressResult> reverseSearchAddress(ReverseSearchAddressOptions options) {
        Mono<Response<ReverseSearchAddressResult>> result = this.reverseSearchAddressWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

        /**
     * **Reverse Geocode to an Address**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ReverseSearchAddressResult>> reverseSearchAddressWithResponse(
                ReverseSearchAddressOptions options) {
        return this.reverseSearchAddressWithResponse(options, null);
    }

    /**
     * **Reverse Geocode to an Address**
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ReverseSearchAddressResult>> reverseSearchAddressWithResponse(
                ReverseSearchAddressOptions options, Context context) {
        Mono<Response<ReverseSearchAddressResultPrivate>> responseMono =
            this.serviceClient.reverseSearchAddressWithResponseAsync(
                ResponseFormat.JSON,
                Arrays.asList(options.getCoordinates().getLat(), options.getCoordinates().getLon()),
                options.getLanguage(),
                options.includeSpeedLimit(),
                options.getHeading(),
                options.getRadiusInMeters(),
                options.getNumber(),
                options.includeRoadUse(),
                options.getRoadUse(),
                options.allowFreeformNewline(),
                options.includeMatchType(),
                options.getEntityType(),
                options.getLocalizedMapView(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<ReverseSearchAddressResult> simpleResponse = TypeMapper.createReverseSearchResponse(response);
            return Mono.just(simpleResponse);
        });
    }

    /**
     * **Reverse Geocode to a Cross Street**
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse CrossStreet call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ReverseSearchCrossStreetAddressResult> reverseSearchCrossStreetAddress(
            ReverseSearchCrossStreetAddressOptions options) {
        Mono<Response<ReverseSearchCrossStreetAddressResult>> result =
            this.reverseSearchCrossStreetAddressWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Reverse Geocode to a Cross Street**
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse CrossStreet call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ReverseSearchCrossStreetAddressResult>> reverseSearchCrossStreetAddressWithResponse(
            ReverseSearchCrossStreetAddressOptions options) {
        return this.reverseSearchCrossStreetAddressWithResponse(options, null);
    }

    /**
     * **Reverse Geocode to a Cross Street**
     *
     * <p>**Applies to**: S0 and S1 pricing tiers.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse CrossStreet call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<ReverseSearchCrossStreetAddressResult>> reverseSearchCrossStreetAddressWithResponse(
            ReverseSearchCrossStreetAddressOptions options, Context context) {
        Mono<Response<ReverseSearchCrossStreetAddressResultPrivate>> responseMono =
            this.serviceClient.reverseSearchCrossStreetAddressWithResponseAsync(
                ResponseFormat.JSON,
                Arrays.asList(options.getCoordinates().getLat(), options.getCoordinates().getLon()),
                options.getTop(),
                options.getHeading(),
                options.getRadiusInMeters(),
                options.getLanguage(),
                options.getLocalizedMapView(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<ReverseSearchCrossStreetAddressResult> simpleResponse = TypeMapper
                .createReverseSearchCrossStreetResponse(response);
            return Mono.just(simpleResponse);
        });
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
    public Mono<SearchAddressResult> searchStructuredAddress(StructuredAddress address,
            SearchStructuredAddressOptions options) {
        Mono<Response<SearchAddressResult>> result = this.searchStructuredAddressWithResponse(address,
            options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
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
    public Mono<Response<SearchAddressResult>> searchStructuredAddressWithResponse(
            StructuredAddress address, SearchStructuredAddressOptions options) {
        return this.searchStructuredAddressWithResponse(address, options, null);
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
    Mono<Response<SearchAddressResult>> searchStructuredAddressWithResponse(
            StructuredAddress address, SearchStructuredAddressOptions options, Context context) {
        final SearchStructuredAddressOptions param = Optional.ofNullable(options)
            .orElse(new SearchStructuredAddressOptions());
        Mono<Response<SearchAddressResultPrivate>> responseMono =
            this.serviceClient.searchStructuredAddressWithResponseAsync(
                ResponseFormat.JSON,
                address.getCountryCode(),
                param.getLanguage(),
                param.getTop(),
                param.getSkip(),
                address.getStreetNumber(),
                address.getStreetName(),
                address.getCrossStreet(),
                address.getMunicipality(),
                address.getMunicipalitySubdivision(),
                address.getCountryTertiarySubdivision(),
                address.getCountrySecondarySubdivision(),
                address.getCountrySubdivision(),
                address.getPostalCode(),
                param.getExtendedPostalCodesFor(),
                param.getEntityType(),
                param.getLocalizedMapView(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<SearchAddressResult> simpleResponse = TypeMapper.createSearchResponse(response);
            return Mono.just(simpleResponse);
        });
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.

     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search calls.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchAddressResult> searchInsideGeometry(SearchInsideGeometryOptions options) {
        Mono<Response<SearchAddressResult>> result = this.searchInsideGeometryWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
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
    public Mono<Response<SearchAddressResult>> searchInsideGeometryWithResponse(
            SearchInsideGeometryOptions options) {
        return this.searchInsideGeometryWithResponse(options, null);
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
    Mono<Response<SearchAddressResult>> searchInsideGeometryWithResponse(SearchInsideGeometryOptions options,
            Context context) {
        Mono<Response<SearchAddressResultPrivate>> responseMono =
            this.serviceClient.searchInsideGeometryWithResponseAsync(
                ResponseFormat.JSON,
                options.getQuery(),
                new SearchInsideGeometryRequest().setGeometry(options.getGeometry()),
                options.getTop(),
                options.getLanguage(),
                options.getCategoryFilter(),
                options.getExtendedPostalCodesFor(),
                options.getIndexFilter(),
                options.getLocalizedMapView(),
                options.getOperatingHours(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<SearchAddressResult> simpleResponse = TypeMapper.createSearchResponse(response);
            return Mono.just(simpleResponse);
        });
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
    public Mono<SearchAddressResult> searchAlongRoute(SearchAlongRouteOptions options) {
        Mono<Response<SearchAddressResult>> result = this.searchAlongRouteWithResponse(options, null);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
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
    public Mono<Response<SearchAddressResult>> searchAlongRouteWithResponse(SearchAlongRouteOptions options) {
        return this.searchAlongRouteWithResponse(options, null);
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
    Mono<Response<SearchAddressResult>> searchAlongRouteWithResponse(SearchAlongRouteOptions options,
            Context context) {
        Mono<Response<SearchAddressResultPrivate>> responseMono =
            this.serviceClient.searchAlongRouteWithResponseAsync(
                ResponseFormat.JSON,
                options.getQuery(),
                options.getMaxDetourTime(),
                new SearchAlongRouteRequest().setRoute(options.getRoute()),
                options.getTop(),
                options.getBrandFilter(),
                options.getCategoryFilter(),
                options.getElectricVehicleConnectorFilter(),
                options.getLocalizedMapView(),
                options.getOperatingHours(),
                context);

        // convert to the right (public) SearchAddressResult
        return responseMono.flatMap(response -> {
            Response<SearchAddressResult> simpleResponse = TypeMapper.createSearchResponse(response);
            return Mono.just(simpleResponse);
        });
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
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BatchSearchResult> fuzzySearchBatchSync(BatchRequest batchRequest) {
        return this.fuzzySearchBatchSync(batchRequest, null);
    }*/

    /**
     * **Search Fuzzy Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of search fuzzy queries/requests to process. The list can contain a
     *     max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BatchSearchResult> fuzzySearchBatchSync(BatchRequest batchRequest, Context context) {
        Mono<SearchAddressBatchResult> responseMono = this.serviceClient
            .fuzzySearchBatchSyncAsync(JsonFormat.JSON, batchRequest, context);

        // convert to BatchSearchResult
        return responseMono.flatMap(response -> {
            BatchSearchResult result = Utility.toBatchSearchResult(response);
            return Mono.just(result);
        });
    }*/

    /**
     * **Search Fuzzy Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of search fuzzy queries/requests to process. The list can contain a
     *     max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BatchSearchResult>> fuzzySearchBatchSyncWithResponse(BatchRequest batchRequest) {
        return this.fuzzySearchBatchSyncWithResponse(batchRequest, null);
    }*/

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
    Mono<Response<BatchSearchResult>> fuzzySearchBatchSyncWithResponse(BatchRequest batchRequest,
            Context context) {
        Mono<Response<SearchAddressBatchResult>> responseMono = this.serviceClient
            .fuzzySearchBatchSyncWithResponseAsync(JsonFormat.JSON, batchRequest, context);

        // convert to BatchSearchResult
        return responseMono.flatMap(response -> {
            Response<BatchSearchResult> simpleResponse = TypeMapper.createBatchSearchResponse(response);
            return Mono.just(simpleResponse);
        });
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

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BatchSearchResult>> fuzzySearchBatchWithResponse(BatchRequest batchRequest) {
        Mono<SearchesFuzzySearchBatchResponse> responseMono = this.serviceClient
            .fuzzySearchBatchWithResponseAsync(JsonFormat.JSON, batchRequest);

        return responseMono.flatMap(response -> {
            Response<BatchSearchResult> simpleResponse = TypeMapper
                .createBatchSearchResponse(response);
            return Mono.just(simpleResponse);
        });
    }
    */

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
    public PollerFlux<BatchSearchResult, BatchSearchResult> beginFuzzySearchBatch(
            BatchRequest batchRequest) {
        return this.beginFuzzySearchBatch(batchRequest, null);
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
    PollerFlux<BatchSearchResult, BatchSearchResult> beginFuzzySearchBatch(
            BatchRequest batchRequest, Context context) {
        if (batchRequest.getBatchItems().size() <= BATCH_SIZE) {
            return createPollerFlux(
                () -> this.serviceClient.fuzzySearchBatchSyncWithResponseAsync(JsonFormat.JSON,
                    batchRequest, context)
                    .flatMap(response -> {
                        return Mono.just(TypeMapper.createBatchSearchResponse(response));
                    }),
                this.forwardStrategy);
        }
        else {
            return createPollerFlux(
                () -> this.serviceClient.fuzzySearchBatchWithResponseAsync(JsonFormat.JSON,
                    batchRequest, context).flatMap(response -> {
                    return Mono.just(TypeMapper.createBatchSearchResponse(response));
                }),
                this.forwardStrategy);
        }
    }

    /**
     * **Search Fuzzy Batch API**
     *
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BatchSearchResult>> getFuzzySearchBatchWithResponse(String batchId) {
        Mono<SearchesGetFuzzySearchBatchResponse> responseMono = this.serviceClient
            .getFuzzySearchBatchWithResponseAsync(batchId);

        return responseMono.flatMap(response -> {
            Response<BatchSearchResult> simpleResponse = TypeMapper
                .createBatchSearchResponse(response);
            return Mono.just(simpleResponse);
        });
    }*/

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
    public PollerFlux<BatchSearchResult, BatchSearchResult> beginGetFuzzySearchBatch(
            String batchId) {
        return this.beginGetFuzzySearchBatch(batchId, null);
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
    PollerFlux<BatchSearchResult, BatchSearchResult> beginGetFuzzySearchBatch(
            String batchId, Context context) {
        return createPollerFlux(
            () -> this.serviceClient.getFuzzySearchBatchWithResponseAsync(batchId, context)
                    .flatMap(response -> {
                        return Mono.just(TypeMapper.createBatchSearchResponse(response));
                    }),
            this.forwardStrategy);
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
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BatchSearchResult> searchAddressBatchSync(BatchRequest batchRequest) {
        return this.searchAddressBatchSync(batchRequest, null);
    }*/

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
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BatchSearchResult> searchAddressBatchSync(BatchRequest batchRequest, Context context) {
        Mono<SearchAddressBatchResult> responseMono = this.serviceClient
            .searchAddressBatchSyncAsync(JsonFormat.JSON, batchRequest, context);

        // convert to BatchSearchResult
        return responseMono.flatMap(response -> {
            BatchSearchResult result = Utility.toBatchSearchResult(response);
            return Mono.just(result);
        });
    }*/

    /**
     * **Search Address Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BatchSearchResult>> searchAddressBatchSyncWithResponse(
            BatchRequest batchRequest) {
        return this.searchAddressBatchSyncWithResponse(batchRequest, null);
    }*/

    /**
     * **Search Address Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BatchSearchResult>> searchAddressBatchSyncWithResponse(
            BatchRequest batchRequest, Context context) {
        Mono<Response<SearchAddressBatchResult>> responseMono = this.serviceClient
            .searchAddressBatchSyncWithResponseAsync(JsonFormat.JSON, batchRequest, context);

        // convert to BatchSearchResult
        return responseMono.flatMap(response -> {
            Response<BatchSearchResult> simpleResponse = TypeMapper.createBatchSearchResponse(response);
            return Mono.just(simpleResponse);
        });
    }*/

    /**
     * **Search Address Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BatchSearchResult>> searchAddressBatchWithResponse(
            BatchRequest batchRequest) {
        Mono<SearchesSearchAddressBatchResponse> responseMono =
            this.serviceClient.searchAddressBatchWithResponseAsync(JsonFormat.JSON, batchRequest);

        return responseMono.flatMap(response -> {
            Response<BatchSearchResult> simpleResponse = TypeMapper
                .createBatchSearchResponse(response);
            return Mono.just(simpleResponse);
        });
    }*/

    /**
     * **Search Address Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BatchSearchResult, BatchSearchResult> beginSearchAddressBatch(
            BatchRequest batchRequest) {
        return this.beginSearchAddressBatch(batchRequest, null);
    }

    /**
     * **Search Address Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of address geocoding queries/requests to process. The list can
     *     contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<BatchSearchResult, BatchSearchResult> beginSearchAddressBatch(
            BatchRequest batchRequest, Context context) {
        if (batchRequest.getBatchItems().size() <= BATCH_SIZE) {
            return createPollerFlux(
                () -> this.serviceClient.searchAddressBatchSyncWithResponseAsync(JsonFormat.JSON,
                    batchRequest, context)
                    .flatMap(response -> {
                        return Mono.just(TypeMapper.createBatchSearchResponse(response));
                    }),
                this.forwardStrategy);
        }
        else {
            return createPollerFlux(
                () -> this.serviceClient.searchAddressBatchWithResponseAsync(JsonFormat.JSON,
                    batchRequest, context).flatMap(response -> {
                    return Mono.just(TypeMapper.createBatchSearchResponse(response));
                }),
                this.forwardStrategy);
        }
    }

    /**
     * **Search Address Batch API**
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchesGetSearchAddressBatchResponse> getSearchAddressBatchWithResponse(String batchId) {
        return this.serviceClient.getSearchAddressBatchWithResponseAsync(batchId);
    }*/

    /**
     * **Search Address Batch API**
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BatchSearchResult, BatchSearchResult> beginGetSearchAddressBatch(
            String batchId) {
        return this.beginGetSearchAddressBatch(batchId, null);
    }

    /**
     * **Search Address Batch API**
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<BatchSearchResult, BatchSearchResult> beginGetSearchAddressBatch(
            String batchId, Context context) {
        return createPollerFlux(
            () -> this.serviceClient.getSearchAddressBatchWithResponseAsync(batchId, context)
                .flatMap(response -> {
                    return Mono.just(TypeMapper.createBatchSearchResponse(response));
                }),
            this.forwardStrategy);
    }

    /**
     * **Search Address Reverse Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BatchReverseSearchResult> reverseSearchAddressBatchSync(BatchRequest batchRequest) {
        return this.reverseSearchAddressBatchSync(batchRequest, null);
    }*/

    /**
     * **Search Address Reverse Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<BatchReverseSearchResult> reverseSearchAddressBatchSync(BatchRequest batchRequest,
            Context context) {
        Mono<ReverseSearchAddressBatchResultPrivate> responseMono = this.serviceClient
            .reverseSearchAddressBatchSyncAsync(JsonFormat.JSON, batchRequest);

        // convert to BatchReverseSearchResult
        return responseMono.flatMap(response -> {
            BatchReverseSearchResult result = Utility.toBatchReverseSearchResult(response);
            return Mono.just(result);
        });
    }*/

    /**
     * **Search Address Reverse Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BatchReverseSearchResult>> reverseSearchAddressBatchSyncWithResponse(
            BatchRequest batchRequest) {
        return this.reverseSearchAddressBatchSyncWithResponse(batchRequest, null);
    }*/

    /**
     * **Search Address Reverse Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     *
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<BatchReverseSearchResult>> reverseSearchAddressBatchSyncWithResponse(
            BatchRequest batchRequest, Context context) {
        Mono<Response<ReverseSearchAddressBatchResultPrivate>> responseMono = this.serviceClient
            .reverseSearchAddressBatchSyncWithResponseAsync(JsonFormat.JSON, batchRequest, context);

        // convert to BatchReverseSearchResult
        return responseMono.flatMap(response -> {
            Response<BatchReverseSearchResult> result = TypeMapper
                .createBatchReverseSearchResponse(response);
            return Mono.just(result);
        });
    }*/

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

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchesReverseSearchAddressBatchResponse> reverseSearchAddressBatchWithResponse(
            BatchRequest batchRequest) {
        return this.serviceClient.reverseSearchAddressBatchWithResponseAsync(
                JsonFormat.JSON, batchRequest);
    }*/

    /**
     * **Search Address Reverse Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BatchReverseSearchResult, BatchReverseSearchResult>
            beginReverseSearchAddressBatch(BatchRequest batchRequest) {
        return this.beginReverseSearchAddressBatch(batchRequest, null);
    }

    /**
     * **Search Address Reverse Batch API**
     * @param format Desired format of the response. Only `json` format is supported.
     * @param batchRequest The list of reverse geocoding queries/requests to process. The list
     *     can contain a max of 10,000 queries and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<BatchReverseSearchResult, BatchReverseSearchResult>
            beginReverseSearchAddressBatch(BatchRequest batchRequest, Context context) {
        if (batchRequest.getBatchItems().size() <= BATCH_SIZE) {
            return createReversePollerFlux(
                () -> this.serviceClient.reverseSearchAddressBatchSyncWithResponseAsync(JsonFormat.JSON,
                    batchRequest, context)
                    .flatMap(response -> {
                        return Mono.just(TypeMapper.createBatchReverseSearchResponse(response));
                    }),
                this.reverseStrategy);
        }
        else {
            return createReversePollerFlux(
                () -> this.serviceClient.reverseSearchAddressBatchWithResponseAsync(JsonFormat.JSON,
                    batchRequest, context).flatMap(response -> {
                    return Mono.just(TypeMapper.createBatchReverseSearchResponse(response));
                }),
                this.reverseStrategy);
        }
    }

    /**
     * **Search Address Reverse Batch API**
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SearchesGetReverseSearchAddressBatchResponse> getReverseSearchAddressBatchWithResponse(
            String batchId) {
        return this.serviceClient.getReverseSearchAddressBatchWithResponseAsync(batchId);
    }*/

    /**
     * **Search Address Reverse Batch API**
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Search Address Reverse Batch service call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<BatchReverseSearchResult, BatchReverseSearchResult>
            beginGetReverseSearchAddressBatch(String batchId) {
        return this.beginGetReverseSearchAddressBatch(batchId, null);
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
    PollerFlux<BatchReverseSearchResult, BatchReverseSearchResult>
            beginGetReverseSearchAddressBatch(String batchId, Context context) {
        return createReversePollerFlux(
            () -> this.serviceClient.getReverseSearchAddressBatchWithResponseAsync(batchId, context)
                .flatMap(response -> {
                    return Mono.just(TypeMapper.createBatchReverseSearchResponse(response));
                }),
            this.reverseStrategy);
    }

    // private utility methods
    private PollerFlux<BatchSearchResult, BatchSearchResult> createPollerFlux(
            Supplier<Mono<? extends Response<?>>> initialOperation,
            DefaultPollingStrategy<BatchSearchResult, BatchSearchResult> strategy) {

        return PollerFlux.create(
            Duration.ofSeconds(POLLING_FREQUENCY),
            initialOperation,
            strategy,
            new TypeReference<BatchSearchResult>() {},
            new TypeReference<BatchSearchResult>() {});
    }

    private PollerFlux<BatchReverseSearchResult, BatchReverseSearchResult> createReversePollerFlux(
        Supplier<Mono<? extends Response<?>>> initialOperation,
        DefaultPollingStrategy<BatchReverseSearchResult, BatchReverseSearchResult> strategy) {

        return PollerFlux.create(
            Duration.ofSeconds(POLLING_FREQUENCY),
            initialOperation,
            strategy,
            new TypeReference<BatchReverseSearchResult>() {},
            new TypeReference<BatchReverseSearchResult>() {});
    }
}
