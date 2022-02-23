// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route;

import java.time.Duration;
import java.util.Objects;
import java.util.function.Supplier;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.core.util.polling.DefaultPollingStrategy;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.TypeReference;
import com.azure.maps.route.implementation.RoutesImpl;
import com.azure.maps.route.implementation.helpers.RouteMatrixResultSerializer;
import com.azure.maps.route.implementation.helpers.Utility;
import com.azure.maps.route.implementation.models.BatchRequest;
import com.azure.maps.route.implementation.models.JsonFormat;
import com.azure.maps.route.implementation.models.ResponseFormat;
import com.azure.maps.route.implementation.models.RouteDirectionParameters;
import com.azure.maps.route.implementation.models.RouteMatrixQueryPrivate;
import com.azure.maps.route.models.ErrorResponseException;
import com.azure.maps.route.models.RouteDirections;
import com.azure.maps.route.models.RouteDirectionsBatchResult;
import com.azure.maps.route.models.RouteDirectionsOptions;
import com.azure.maps.route.models.RouteMatrixOptions;
import com.azure.maps.route.models.RouteMatrixQuery;
import com.azure.maps.route.models.RouteMatrixResult;
import com.azure.maps.route.models.RouteRangeOptions;
import com.azure.maps.route.models.RouteRangeResult;

import reactor.core.publisher.Mono;

/** Initializes a new instance of the asynchronous RouteClient type. */
@ServiceClient(builder = RouteClientBuilder.class, isAsync = true)
public final class RouteAsyncClient {
    // route batch size constants
    private final static int ROUTE_MATRIX_SMALL_SIZE = 100;
    private final static int ROUTE_DIRECTIONS_SMALL_SIZE = 100;

    // polling strategy constants
    private static final int POLLING_FREQUENCY = 1;
    private static final String POLLING_BATCH_HEADER_KEY = "BatchId";

    // instance fields
    private final DefaultPollingStrategy<RouteDirectionsBatchResult,
        RouteDirectionsBatchResult> forwardStrategy;
    private final DefaultPollingStrategy<RouteMatrixResult, RouteMatrixResult>
        routeMatrixStrategy;
    private RouteMatrixResultSerializer serializer;
    @Generated private final RoutesImpl serviceClient;

    /**
     * Initializes an instance of Routes client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    RouteAsyncClient(RoutesImpl serviceClient, HttpPipeline httpPipeline) {
        this.serviceClient = serviceClient;
        this.serializer = new RouteMatrixResultSerializer();
        this.forwardStrategy = new DefaultPollingStrategy<>(httpPipeline, this.serializer);
        this.routeMatrixStrategy = new DefaultPollingStrategy<>(httpPipeline, this.serializer);
    }

    /**
     * Wraps sync/sync behavior.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Matrix call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<RouteMatrixResult, RouteMatrixResult> beginRequestRouteMatrix(
            RouteMatrixOptions options) {
        return this.beginRequestRouteMatrix(options, null);
    }

    /**
     * Wraps sync/sync behavior.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Matrix call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<RouteMatrixResult, RouteMatrixResult> beginRequestRouteMatrix(
            RouteMatrixOptions options, Context context) {
        // if it's a small batch, then let's wait for results and avoid polling
        RouteMatrixQuery query = options.getRouteMatrixQuery();
        RouteMatrixQueryPrivate privateQuery = Utility.toRouteMatrixQueryPrivate(query);
        final int originSize = privateQuery.getOrigins().getCoordinates().size();
        final int destSize = privateQuery.getDestinations().getCoordinates().size();
        boolean waitForResults = (originSize * destSize <= ROUTE_MATRIX_SMALL_SIZE);

        return createPollerFlux(
            () ->
                this.serviceClient.requestRouteMatrixWithResponseAsync(
                    JsonFormat.JSON,
                    privateQuery,
                    waitForResults,
                    options.getComputeTravelTime(),
                    options.getFilterSectionType(),
                    options.getArriveAt(),
                    options.getDepartAt(),
                    options.getVehicleAxleWeight(),
                    options.getVehicleLength(),
                    options.getVehicleHeight(),
                    options.getVehicleWidth(),
                    options.getVehicleMaxSpeed(),
                    options.getVehicleWeight(),
                    options.getWindingness(),
                    options.getInclineLevel(),
                    options.getTravelMode(),
                    options.getAvoid(),
                    options.getUseTrafficData(),
                    options.getRouteType(),
                    options.getVehicleLoadType(),
                    context).flatMap(response -> {
                        return Mono.just(Utility.createRouteMatrixResponse(response));
                    }),
            this.routeMatrixStrategy);
    }

    /**
     * If the Matrix Route request was accepted successfully, the Location header in the response contains the URL to
     * download the results of the request. This status URI looks like the following:
     *
     * @param matrixId Matrix id received after the Matrix Route request was accepted successfully.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Matrix call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<RouteMatrixResult, RouteMatrixResult> beginGetRouteMatrix(String matrixId) {
        return this.beginGetRouteMatrix(matrixId, null);
    }

    /**
     * If the Matrix Route request was accepted successfully, the Location header in the response contains the URL to
     * download the results of the request. This status URI looks like the following:
     *
     * @param matrixId Matrix id received after the Matrix Route request was accepted successfully.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Matrix call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<RouteMatrixResult, RouteMatrixResult> beginGetRouteMatrix(String matrixId, Context context) {
        return createPollerFlux(
            () -> this.serviceClient.getRouteMatrixWithResponseAsync(matrixId, context)
                    .flatMap(response -> {
                        return Mono.just(Utility.createRouteMatrixResponse(response));
                    }),
            this.routeMatrixStrategy);
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Returns a route between an origin and a destination, passing through waypoints if they are specified. The
     * route will take into account factors such as current traffic and the typical road speeds on the requested day of
     * the week and time of day.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteDirections> getRouteDirections(
            RouteDirectionsOptions options) {
        Mono<Response<RouteDirections>> result = this.getRouteDirectionsWithResponse(options);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Returns a route between an origin and a destination, passing through waypoints if they are specified. The
     * route will take into account factors such as current traffic and the typical road speeds on the requested day of
     * the week and time of day.
     *

     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouteDirections>> getRouteDirectionsWithResponse(
            RouteDirectionsOptions options) {
        return this.getRouteDirectionsWithResponse(options, null);
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Returns a route between an origin and a destination, passing through waypoints if they are specified. The
     * route will take into account factors such as current traffic and the typical road speeds on the requested day of
     * the week and time of day.
     *

     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteDirections>> getRouteDirectionsWithResponse(
            RouteDirectionsOptions options, Context context) {
        return this.serviceClient.getRouteDirectionsWithResponseAsync(
                ResponseFormat.JSON,
                options.getRoutePoints(),
                options.getMaxAlternatives(),
                options.getAlternativeType(),
                options.getMinDeviationDistance(),
                options.getArriveAt(),
                options.getDepartAt(),
                options.getMinDeviationTime(),
                options.getInstructionsType(),
                options.getLanguage(),
                options.getComputeBestWaypointOrder(),
                options.getRouteRepresentationForBestOrder(),
                options.getComputeTravelTime(),
                options.getVehicleHeading(),
                options.getReport(),
                options.getFilterSectionType(),
                options.getVehicleAxleWeight(),
                options.getVehicleWidth(),
                options.getVehicleHeight(),
                options.getVehicleLength(),
                options.getVehicleMaxSpeed(),
                options.getVehicleWeight(),
                options.isCommercialVehicle(),
                options.getWindingness(),
                options.getInclineLevel(),
                options.getTravelMode(),
                options.getAvoid(),
                options.getUseTrafficData(),
                options.getRouteType(),
                options.getVehicleLoadType(),
                options.getVehicleEngineType(),
                options.getConstantSpeedConsumptionInLitersPerHundredKm(),
                options.getCurrentFuelInLiters(),
                options.getAuxiliaryPowerInLitersPerHour(),
                options.getFuelEnergyDensityInMegajoulesPerLiter(),
                options.getAccelerationEfficiency(),
                options.getDecelerationEfficiency(),
                options.getUphillEfficiency(),
                options.getDownhillEfficiency(),
                options.getConstantSpeedConsumptionInKwHPerHundredKm(),
                options.getCurrentChargeInKwH(),
                options.getMaxChargeInKwH(),
                options.getAuxiliaryPowerInKw(),
                context);
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Returns a route between an origin and a destination, passing through waypoints if they are specified. The
     * route will take into account factors such as current traffic and the typical road speeds on the requested day of
     * the week and time of day.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteDirections> getRouteDirectionsWithAdditionalParameters(
            RouteDirectionsOptions options,
            RouteDirectionParameters parameters) {
        Mono<Response<RouteDirections>> result =
            this.getRouteDirectionsWithAdditionalParametersWithResponse(options, parameters);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Returns a route between an origin and a destination, passing through waypoints if they are specified. The
     * route will take into account factors such as current traffic and the typical road speeds on the requested day of
     * the week and time of day.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RouteDirections>> getRouteDirectionsWithAdditionalParametersWithResponse(
            RouteDirectionsOptions options,
            RouteDirectionParameters parameters) {
        return this.getRouteDirectionsWithAdditionalParametersWithResponse(options, parameters, null);
    }

    /**
     * **Applies to**: S0 and S1 pricing tiers.
     *
     * <p>Returns a route between an origin and a destination, passing through waypoints if they are specified. The
     * route will take into account factors such as current traffic and the typical road speeds on the requested day of
     * the week and time of day.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteDirections>> getRouteDirectionsWithAdditionalParametersWithResponse(
            RouteDirectionsOptions options,
            RouteDirectionParameters parameters,
            Context context) {
        return this.serviceClient.getRouteDirectionsWithAdditionalParametersWithResponseAsync(
                ResponseFormat.JSON,
                options.getRoutePoints(),
                parameters,
                options.getMaxAlternatives(),
                options.getAlternativeType(),
                options.getMinDeviationDistance(),
                options.getMinDeviationTime(),
                options.getInstructionsType(),
                options.getLanguage(),
                options.getComputeBestWaypointOrder(),
                options.getRouteRepresentationForBestOrder(),
                options.getComputeTravelTime(),
                options.getVehicleHeading(),
                options.getReport(),
                options.getFilterSectionType(),
                options.getArriveAt(),
                options.getDepartAt(),
                options.getVehicleAxleWeight(),
                options.getVehicleLength(),
                options.getVehicleHeight(),
                options.getVehicleWidth(),
                options.getVehicleMaxSpeed(),
                options.getVehicleWeight(),
                options.isCommercialVehicle(),
                options.getWindingness(),
                options.getInclineLevel(),
                options.getTravelMode(),
                options.getAvoid(),
                options.getUseTrafficData(),
                options.getRouteType(),
                options.getVehicleLoadType(),
                options.getVehicleEngineType(),
                options.getConstantSpeedConsumptionInLitersPerHundredKm(),
                options.getCurrentFuelInLiters(),
                options.getAuxiliaryPowerInLitersPerHour(),
                options.getFuelEnergyDensityInMegajoulesPerLiter(),
                options.getAccelerationEfficiency(),
                options.getDecelerationEfficiency(),
                options.getUphillEfficiency(),
                options.getDownhillEfficiency(),
                options.getConstantSpeedConsumptionInKwHPerHundredKm(),
                options.getCurrentChargeInKwH(),
                options.getMaxChargeInKwH(),
                options.getAuxiliaryPowerInKw(),
                context);
    }

    /**
     * __Route Range (Isochrone) API__
     *
     * <p>**Applies to**: S1 pricing tier.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Reachable Range call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RouteRangeResult> getRouteRange(RouteRangeOptions options) {
        Mono<Response<RouteRangeResult>> result = this.getRouteRangeWithResponse(options);
        return result.flatMap(response -> {
            return Mono.just(response.getValue());
        });
    }

    /**
     * __Route Range (Isochrone) API__
     *
     * <p>**Applies to**: S1 pricing tier.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Reachable Range call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteRangeResult>> getRouteRangeWithResponse(RouteRangeOptions options) {
        return this.getRouteRangeWithResponse(options, null);
    }

    /**
     * __Route Range (Isochrone) API__
     *
     * <p>**Applies to**: S1 pricing tier.
     *
     * <p>This service will calculate a set of locations that can be reached from the origin point based on fuel,
     * energy, time or distance budget that is specified. A polygon boundary (or Isochrone) is returned in a
     * counterclockwise orientation as well as the precise polygon center which was the result of the origin point.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Reachable Range call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RouteRangeResult>> getRouteRangeWithResponse(
            RouteRangeOptions options, Context context) {
        return this.serviceClient.getRouteRangeWithResponseAsync(
                ResponseFormat.JSON,
                options.getQuery(),
                options.getFuelBudgetInLiters(),
                options.getEnergyBudgetInKwH(),
                options.getTimeBudgetInSec(),
                options.getDistanceBudgetInMeters(),
                options.getDepartAt(),
                options.getRouteType(),
                options.getUseTrafficData(),
                options.getAvoid(),
                options.getTravelMode(),
                options.getInclineLevel(),
                options.getWindingness(),
                options.getVehicleAxleWeight(),
                options.getVehicleWidth(),
                options.getVehicleHeight(),
                options.getVehicleLength(),
                options.getVehicleMaxSpeed(),
                options.getVehicleWeight(),
                options.isCommercialVehicle(),
                options.getVehicleLoadType(),
                options.getVehicleEngineType(),
                options.getConstantSpeedConsumptionInKwHPerHundredKm(),
                options.getCurrentFuelInLiters(),
                options.getAuxiliaryPowerInLitersPerHour(),
                options.getFuelEnergyDensityInMegajoulesPerLiter(),
                options.getAccelerationEfficiency(),
                options.getDecelerationEfficiency(),
                options.getUphillEfficiency(),
                options.getDownhillEfficiency(),
                options.getConstantSpeedConsumptionInKwHPerHundredKm(),
                options.getCurrentChargeInKwH(),
                options.getMaxChargeInKwH(),
                options.getAuxiliaryPowerInKw(),
                context);
    }

    /**
     * **Route Directions Batch API**
     * parameters were incorrectly specified or are mutually exclusive." } } } ] } ```.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param routeDirectionsBatchQueries The list of route directions queries/requests to process. The list can contain
     *     a max of 700 queries for async and 100 queries for sync version and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions Batch service call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<RouteDirectionsBatchResult, RouteDirectionsBatchResult>
            beginRequestRouteDirectionsBatch(BatchRequest batchRequest) {
        return this.beginRequestRouteDirectionsBatch(batchRequest, null);
    }

    /**
     * **Route Directions Batch API**
     * parameters were incorrectly specified or are mutually exclusive." } } } ] } ```.
     *
     * @param format Desired format of the response. Only `json` format is supported.
     * @param routeDirectionsBatchQueries The list of route directions queries/requests to process. The list can contain
     *     a max of 700 queries for async and 100 queries for sync version and must contain at least 1 query.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions Batch service call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<RouteDirectionsBatchResult, RouteDirectionsBatchResult>
            beginRequestRouteDirectionsBatch(BatchRequest batchRequest, Context context) {
        Objects.requireNonNull(batchRequest.getBatchItems(), "'batchItems' is a required parameter.");

        // convert list to batch request
        // List<BatchRequestItem> items = optionsList.stream()
        //    .map(item -> Utility.toFuzzySearchBatchRequestItem(item)).collect(Collectors.toList());
        // BatchRequest batchRequest = new BatchRequest().setBatchItems(items);

        if (batchRequest.getBatchItems().size() <= ROUTE_DIRECTIONS_SMALL_SIZE) {
            return createDirectionsPollerFlux(
                () -> this.serviceClient
                        .requestRouteDirectionsBatchSyncWithResponseAsync(JsonFormat.JSON, batchRequest, context)
                    .flatMap(response -> {
                        return Mono.empty(); //just(Utility.createBatchSearchResponse(response));
                    }),
                this.forwardStrategy);
        }
        else {
            return createDirectionsPollerFlux(
                () -> this.serviceClient
                        .requestRouteDirectionsBatchWithResponseAsync(JsonFormat.JSON, batchRequest, context)
                    .flatMap(response -> {
                        return Mono.empty(); //just(Utility.createBatchSearchResponse(response));
                    }),
                this.forwardStrategy);
        }
    }

    /**
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions Batch service call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    public PollerFlux<RouteDirectionsBatchResult, RouteDirectionsBatchResult> beginGetRouteDirectionsBatch(
            String batchId) {
        return this.beginGetRouteDirectionsBatch(batchId, null);
    }

    /**
     * @param batchId Batch id for querying the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return this object is returned from a successful Route Directions Batch service call.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<RouteDirectionsBatchResult, RouteDirectionsBatchResult> beginGetRouteDirectionsBatch(
            String batchId, Context context) {
        return this.serviceClient.beginGetRouteDirectionsBatchAsync(batchId);
    }

    // private utility methods
    private PollerFlux<RouteMatrixResult, RouteMatrixResult> createPollerFlux(
            Supplier<Mono<? extends Response<?>>> initialOperation,
            DefaultPollingStrategy<RouteMatrixResult, RouteMatrixResult> strategy) {

        // Create poller instance
        return PollerFlux.create(
            Duration.ofSeconds(POLLING_FREQUENCY),
            context -> initialOperation.get()
                .flatMap(response -> strategy.canPoll(response).flatMap(canPoll -> {
                    if (!canPoll) {
                        return Mono.error(new IllegalStateException(
                            "Cannot poll with strategy " + strategy.getClass().getSimpleName()));
                    }
                    context.setData(POLLING_BATCH_HEADER_KEY, Utility.getBatchId(response.getHeaders()));
                    return strategy.onInitialResponse(response, context, new TypeReference<RouteMatrixResult>() {});
                })),
            context -> strategy.poll(context, new TypeReference<RouteMatrixResult>() {}),
            strategy::cancel,
            context -> {
                return strategy
                    .getResult(context, new TypeReference<RouteMatrixResult>() {})
                        .flatMap(result -> {
                            final String matrixId = context.getData(POLLING_BATCH_HEADER_KEY);
                            result.setMatrixId(matrixId);
                            return Mono.just(result);
                        });
            });
    }

    private PollerFlux<RouteDirectionsBatchResult, RouteDirectionsBatchResult> createDirectionsPollerFlux(
            Supplier<Mono<? extends Response<?>>> initialOperation,
            DefaultPollingStrategy<RouteDirectionsBatchResult, RouteDirectionsBatchResult> strategy) {

        // Create poller instance
        return PollerFlux.create(
            Duration.ofSeconds(POLLING_FREQUENCY),
            context -> initialOperation.get()
                .flatMap(response -> strategy.canPoll(response).flatMap(canPoll -> {
                    if (!canPoll) {
                        return Mono.error(new IllegalStateException(
                            "Cannot poll with strategy " + strategy.getClass().getSimpleName()));
                    }
                    context.setData(POLLING_BATCH_HEADER_KEY, Utility.getBatchId(response.getHeaders()));
                    return strategy.onInitialResponse(response, context, new TypeReference<RouteDirectionsBatchResult>() {});
                })),
            context -> strategy.poll(context, new TypeReference<RouteDirectionsBatchResult>() {}),
            strategy::cancel,
            context -> {
                return strategy
                    .getResult(context, new TypeReference<RouteDirectionsBatchResult>() {})
                        .flatMap(result -> {
                            final String batchId = context.getData(POLLING_BATCH_HEADER_KEY);
                            // result.setBatchId(batchId);
                            return Mono.just(result);
                        });
            });
    }

}
