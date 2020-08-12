// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
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
import com.azure.resourcemanager.sql.SqlManagementClient;
import com.azure.resourcemanager.sql.fluent.inner.ElasticPoolOperationInner;
import com.azure.resourcemanager.sql.fluent.inner.ElasticPoolOperationListResultInner;
import java.util.UUID;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ElasticPoolOperations. */
public final class ElasticPoolOperationsClient {
    private final ClientLogger logger = new ClientLogger(ElasticPoolOperationsClient.class);

    /** The proxy service used to perform REST calls. */
    private final ElasticPoolOperationsService service;

    /** The service client containing this operation class. */
    private final SqlManagementClient client;

    /**
     * Initializes an instance of ElasticPoolOperationsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ElasticPoolOperationsClient(SqlManagementClient client) {
        this.service =
            RestProxy
                .create(ElasticPoolOperationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientElasticPoolOperations to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientE")
    private interface ElasticPoolOperationsService {
        @Headers({"Accept: application/json;q=0.9", "Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/elasticPools/{elasticPoolName}/operations/{operationId}/cancel")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<Void>> cancel(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("elasticPoolName") String elasticPoolName,
            @PathParam("operationId") UUID operationId,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/elasticPools/{elasticPoolName}/operations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ElasticPoolOperationListResultInner>> listByElasticPool(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("elasticPoolName") String elasticPoolName,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ElasticPoolOperationListResultInner>> listByElasticPoolNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Cancels the asynchronous operation on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param operationId The operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponseAsync(
        String resourceGroupName, String serverName, String elasticPoolName, UUID operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (elasticPoolName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-10-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .cancel(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            elasticPoolName,
                            operationId,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Cancels the asynchronous operation on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param operationId The operation identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> cancelWithResponseAsync(
        String resourceGroupName, String serverName, String elasticPoolName, UUID operationId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (elasticPoolName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-10-01-preview";
        context = this.client.mergeContext(context);
        return service
            .cancel(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                elasticPoolName,
                operationId,
                this.client.getSubscriptionId(),
                apiVersion,
                context);
    }

    /**
     * Cancels the asynchronous operation on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param operationId The operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelAsync(
        String resourceGroupName, String serverName, String elasticPoolName, UUID operationId) {
        return cancelWithResponseAsync(resourceGroupName, serverName, elasticPoolName, operationId)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancels the asynchronous operation on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param operationId The operation identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> cancelAsync(
        String resourceGroupName, String serverName, String elasticPoolName, UUID operationId, Context context) {
        return cancelWithResponseAsync(resourceGroupName, serverName, elasticPoolName, operationId, context)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Cancels the asynchronous operation on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param operationId The operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancel(String resourceGroupName, String serverName, String elasticPoolName, UUID operationId) {
        cancelAsync(resourceGroupName, serverName, elasticPoolName, operationId).block();
    }

    /**
     * Cancels the asynchronous operation on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param operationId The operation identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void cancel(
        String resourceGroupName, String serverName, String elasticPoolName, UUID operationId, Context context) {
        cancelAsync(resourceGroupName, serverName, elasticPoolName, operationId, context).block();
    }

    /**
     * Gets a list of operations performed on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the elastic pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ElasticPoolOperationInner>> listByElasticPoolSinglePageAsync(
        String resourceGroupName, String serverName, String elasticPoolName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (elasticPoolName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-10-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByElasticPool(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serverName,
                            elasticPoolName,
                            this.client.getSubscriptionId(),
                            apiVersion,
                            context))
            .<PagedResponse<ElasticPoolOperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets a list of operations performed on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the elastic pool.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ElasticPoolOperationInner>> listByElasticPoolSinglePageAsync(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (elasticPoolName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2017-10-01-preview";
        context = this.client.mergeContext(context);
        return service
            .listByElasticPool(
                this.client.getEndpoint(),
                resourceGroupName,
                serverName,
                elasticPoolName,
                this.client.getSubscriptionId(),
                apiVersion,
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
     * Gets a list of operations performed on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the elastic pool.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ElasticPoolOperationInner> listByElasticPoolAsync(
        String resourceGroupName, String serverName, String elasticPoolName) {
        return new PagedFlux<>(
            () -> listByElasticPoolSinglePageAsync(resourceGroupName, serverName, elasticPoolName),
            nextLink -> listByElasticPoolNextSinglePageAsync(nextLink));
    }

    /**
     * Gets a list of operations performed on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the elastic pool.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ElasticPoolOperationInner> listByElasticPoolAsync(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        return new PagedFlux<>(
            () -> listByElasticPoolSinglePageAsync(resourceGroupName, serverName, elasticPoolName, context),
            nextLink -> listByElasticPoolNextSinglePageAsync(nextLink, context));
    }

    /**
     * Gets a list of operations performed on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the elastic pool.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ElasticPoolOperationInner> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName) {
        return new PagedIterable<>(listByElasticPoolAsync(resourceGroupName, serverName, elasticPoolName));
    }

    /**
     * Gets a list of operations performed on the elastic pool.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param elasticPoolName The elasticPoolName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of operations performed on the elastic pool.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ElasticPoolOperationInner> listByElasticPool(
        String resourceGroupName, String serverName, String elasticPoolName, Context context) {
        return new PagedIterable<>(listByElasticPoolAsync(resourceGroupName, serverName, elasticPoolName, context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list elastic pool operations request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ElasticPoolOperationInner>> listByElasticPoolNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listByElasticPoolNext(nextLink, context))
            .<PagedResponse<ElasticPoolOperationInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a list elastic pool operations request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ElasticPoolOperationInner>> listByElasticPoolNextSinglePageAsync(
        String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        context = this.client.mergeContext(context);
        return service
            .listByElasticPoolNext(nextLink, context)
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
