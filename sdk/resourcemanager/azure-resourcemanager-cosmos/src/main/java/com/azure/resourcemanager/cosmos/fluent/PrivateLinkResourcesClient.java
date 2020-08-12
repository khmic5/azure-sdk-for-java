// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
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
import com.azure.resourcemanager.cosmos.CosmosDBManagementClient;
import com.azure.resourcemanager.cosmos.fluent.inner.PrivateLinkResourceInner;
import com.azure.resourcemanager.cosmos.fluent.inner.PrivateLinkResourceListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PrivateLinkResources. */
public final class PrivateLinkResourcesClient {
    private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesClient.class);

    /** The proxy service used to perform REST calls. */
    private final PrivateLinkResourcesService service;

    /** The service client containing this operation class. */
    private final CosmosDBManagementClient client;

    /**
     * Initializes an instance of PrivateLinkResourcesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateLinkResourcesClient(CosmosDBManagementClient client) {
        this.service =
            RestProxy
                .create(PrivateLinkResourcesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for CosmosDBManagementClientPrivateLinkResources to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "CosmosDBManagementCl")
    private interface PrivateLinkResourcesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB"
                + "/databaseAccounts/{accountName}/privateLinkResources")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceListResultInner>> listByDatabaseAccount(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("accountName") String accountName,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DocumentDB"
                + "/databaseAccounts/{accountName}/privateLinkResources/{groupName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<PrivateLinkResourceInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @PathParam("accountName") String accountName,
            @PathParam("groupName") String groupName,
            Context context);
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PrivateLinkResourceInner>> listByDatabaseAccountSinglePageAsync(
        String resourceGroupName, String accountName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByDatabaseAccount(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            apiVersion,
                            accountName,
                            context))
            .<PagedResponse<PrivateLinkResourceInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<PrivateLinkResourceInner>> listByDatabaseAccountSinglePageAsync(
        String resourceGroupName, String accountName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01-preview";
        context = this.client.mergeContext(context);
        return service
            .listByDatabaseAccount(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                apiVersion,
                accountName,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PrivateLinkResourceInner> listByDatabaseAccountAsync(
        String resourceGroupName, String accountName) {
        return new PagedFlux<>(() -> listByDatabaseAccountSinglePageAsync(resourceGroupName, accountName));
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<PrivateLinkResourceInner> listByDatabaseAccountAsync(
        String resourceGroupName, String accountName, Context context) {
        return new PagedFlux<>(() -> listByDatabaseAccountSinglePageAsync(resourceGroupName, accountName, context));
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkResourceInner> listByDatabaseAccount(String resourceGroupName, String accountName) {
        return new PagedIterable<>(listByDatabaseAccountAsync(resourceGroupName, accountName));
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<PrivateLinkResourceInner> listByDatabaseAccount(
        String resourceGroupName, String accountName, Context context) {
        return new PagedIterable<>(listByDatabaseAccountAsync(resourceGroupName, accountName, context));
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String groupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            apiVersion,
                            accountName,
                            groupName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<PrivateLinkResourceInner>> getWithResponseAsync(
        String resourceGroupName, String accountName, String groupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (accountName == null) {
            return Mono.error(new IllegalArgumentException("Parameter accountName is required and cannot be null."));
        }
        if (groupName == null) {
            return Mono.error(new IllegalArgumentException("Parameter groupName is required and cannot be null."));
        }
        final String apiVersion = "2019-08-01-preview";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                apiVersion,
                accountName,
                groupName,
                context);
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateLinkResourceInner> getAsync(String resourceGroupName, String accountName, String groupName) {
        return getWithResponseAsync(resourceGroupName, accountName, groupName)
            .flatMap(
                (Response<PrivateLinkResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PrivateLinkResourceInner> getAsync(
        String resourceGroupName, String accountName, String groupName, Context context) {
        return getWithResponseAsync(resourceGroupName, accountName, groupName, context)
            .flatMap(
                (Response<PrivateLinkResourceInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param groupName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceInner get(String resourceGroupName, String accountName, String groupName) {
        return getAsync(resourceGroupName, accountName, groupName).block();
    }

    /**
     * Gets the private link resources that need to be created for a Cosmos DB account.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName Cosmos DB database account name.
     * @param groupName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private link resources that need to be created for a Cosmos DB account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public PrivateLinkResourceInner get(
        String resourceGroupName, String accountName, String groupName, Context context) {
        return getAsync(resourceGroupName, accountName, groupName, context).block();
    }
}
