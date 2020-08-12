// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
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
import com.azure.resourcemanager.monitor.MonitorClient;
import com.azure.resourcemanager.monitor.fluent.inner.EventCategoryCollectionInner;
import com.azure.resourcemanager.monitor.fluent.inner.LocalizableStringInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in EventCategories. */
public final class EventCategoriesClient {
    private final ClientLogger logger = new ClientLogger(EventCategoriesClient.class);

    /** The proxy service used to perform REST calls. */
    private final EventCategoriesService service;

    /** The service client containing this operation class. */
    private final MonitorClient client;

    /**
     * Initializes an instance of EventCategoriesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public EventCategoriesClient(MonitorClient client) {
        this.service =
            RestProxy.create(EventCategoriesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientEventCategories to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientEventCa")
    private interface EventCategoriesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/providers/microsoft.insights/eventcategories")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<EventCategoryCollectionInner>> list(
            @HostParam("$host") String endpoint, @QueryParam("api-version") String apiVersion, Context context);
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LocalizableStringInner>> listSinglePageAsync() {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        return FluxUtil
            .withContext(context -> service.list(this.client.getEndpoint(), apiVersion, context))
            .<PagedResponse<LocalizableStringInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<LocalizableStringInner>> listSinglePageAsync(Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        final String apiVersion = "2015-04-01";
        context = this.client.mergeContext(context);
        return service
            .list(this.client.getEndpoint(), apiVersion, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LocalizableStringInner> listAsync() {
        return new PagedFlux<>(() -> listSinglePageAsync());
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<LocalizableStringInner> listAsync(Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(context));
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocalizableStringInner> list() {
        return new PagedIterable<>(listAsync());
    }

    /**
     * Get the list of available event categories supported in the Activity Logs Service.&lt;br&gt;The current list
     * includes the following: Administrative, Security, ServiceHealth, Alert, Recommendation, Policy.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of available event categories supported in the Activity Logs Service.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<LocalizableStringInner> list(Context context) {
        return new PagedIterable<>(listAsync(context));
    }
}
