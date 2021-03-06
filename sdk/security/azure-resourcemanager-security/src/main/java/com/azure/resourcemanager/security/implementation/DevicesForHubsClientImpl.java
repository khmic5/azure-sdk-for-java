// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.DevicesForHubsClient;
import com.azure.resourcemanager.security.fluent.models.DeviceInner;
import com.azure.resourcemanager.security.models.DeviceList;
import com.azure.resourcemanager.security.models.ManagementState;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DevicesForHubsClient. */
public final class DevicesForHubsClientImpl implements DevicesForHubsClient {
    private final ClientLogger logger = new ClientLogger(DevicesForHubsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final DevicesForHubsService service;

    /** The service client containing this operation class. */
    private final SecurityCenterImpl client;

    /**
     * Initializes an instance of DevicesForHubsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DevicesForHubsClientImpl(SecurityCenterImpl client) {
        this.service =
            RestProxy.create(DevicesForHubsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityCenterDevicesForHubs to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SecurityCenterDevice")
    private interface DevicesForHubsService {
        @Headers({"Content-Type: application/json"})
        @Get("/{resourceId}/providers/Microsoft.Security/devices")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DeviceList>> list(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam(value = "resourceId", encoded = true) String resourceId,
            @QueryParam("$limit") Integer limit,
            @QueryParam("$skipToken") String skipToken,
            @QueryParam("deviceManagementType") ManagementState deviceManagementType,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<DeviceList>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink,
            @HostParam("$host") String endpoint,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param deviceManagementType Get devices only from specific type, Managed or Unmanaged.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DeviceInner>> listSinglePageAsync(
        String resourceId, Integer limit, String skipToken, ManagementState deviceManagementType) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-06-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            apiVersion,
                            resourceId,
                            limit,
                            skipToken,
                            deviceManagementType,
                            accept,
                            context))
            .<PagedResponse<DeviceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param deviceManagementType Get devices only from specific type, Managed or Unmanaged.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DeviceInner>> listSinglePageAsync(
        String resourceId, Integer limit, String skipToken, ManagementState deviceManagementType, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceId == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceId is required and cannot be null."));
        }
        final String apiVersion = "2020-08-06-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                apiVersion,
                resourceId,
                limit,
                skipToken,
                deviceManagementType,
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param deviceManagementType Get devices only from specific type, Managed or Unmanaged.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DeviceInner> listAsync(
        String resourceId, Integer limit, String skipToken, ManagementState deviceManagementType) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceId, limit, skipToken, deviceManagementType),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DeviceInner> listAsync(String resourceId) {
        final Integer limit = null;
        final String skipToken = null;
        final ManagementState deviceManagementType = null;
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceId, limit, skipToken, deviceManagementType),
            nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param deviceManagementType Get devices only from specific type, Managed or Unmanaged.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DeviceInner> listAsync(
        String resourceId, Integer limit, String skipToken, ManagementState deviceManagementType, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(resourceId, limit, skipToken, deviceManagementType, context),
            nextLink -> listNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeviceInner> list(String resourceId) {
        final Integer limit = null;
        final String skipToken = null;
        final ManagementState deviceManagementType = null;
        return new PagedIterable<>(listAsync(resourceId, limit, skipToken, deviceManagementType));
    }

    /**
     * Get list of the devices for the specified IoT Hub resource.
     *
     * @param resourceId The identifier of the resource.
     * @param limit Limit the number of items returned in a single page.
     * @param skipToken Skip token used for pagination.
     * @param deviceManagementType Get devices only from specific type, Managed or Unmanaged.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the devices for the specified IoT Hub resource.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DeviceInner> list(
        String resourceId, Integer limit, String skipToken, ManagementState deviceManagementType, Context context) {
        return new PagedIterable<>(listAsync(resourceId, limit, skipToken, deviceManagementType, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Devices.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DeviceInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, this.client.getEndpoint(), accept, context))
            .<PagedResponse<DeviceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Devices.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DeviceInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .listNext(nextLink, this.client.getEndpoint(), accept, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}
