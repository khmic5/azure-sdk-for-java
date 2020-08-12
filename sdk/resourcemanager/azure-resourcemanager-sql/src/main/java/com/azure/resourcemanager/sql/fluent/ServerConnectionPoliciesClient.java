// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.SqlManagementClient;
import com.azure.resourcemanager.sql.fluent.inner.ServerConnectionPolicyInner;
import com.azure.resourcemanager.sql.models.ConnectionPolicyName;
import com.azure.resourcemanager.sql.models.ServerConnectionType;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ServerConnectionPolicies. */
public final class ServerConnectionPoliciesClient {
    private final ClientLogger logger = new ClientLogger(ServerConnectionPoliciesClient.class);

    /** The proxy service used to perform REST calls. */
    private final ServerConnectionPoliciesService service;

    /** The service client containing this operation class. */
    private final SqlManagementClient client;

    /**
     * Initializes an instance of ServerConnectionPoliciesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public ServerConnectionPoliciesClient(SqlManagementClient client) {
        this.service =
            RestProxy
                .create(ServerConnectionPoliciesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SqlManagementClientServerConnectionPolicies to be used by the proxy
     * service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SqlManagementClientS")
    private interface ServerConnectionPoliciesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Put(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/connectionPolicies/{connectionPolicyName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServerConnectionPolicyInner>> createOrUpdate(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("connectionPolicyName") ConnectionPolicyName connectionPolicyName,
            @BodyParam("application/json") ServerConnectionPolicyInner parameters,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers"
                + "/{serverName}/connectionPolicies/{connectionPolicyName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<ServerConnectionPolicyInner>> get(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serverName") String serverName,
            @PathParam("connectionPolicyName") ConnectionPolicyName connectionPolicyName,
            Context context);
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param connectionType The server connection type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ServerConnectionPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionType connectionType) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (connectionPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter connectionPolicyName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        ServerConnectionPolicyInner parameters = new ServerConnectionPolicyInner();
        parameters.withConnectionType(connectionType);
        return FluxUtil
            .withContext(
                context ->
                    service
                        .createOrUpdate(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            connectionPolicyName,
                            parameters,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param connectionType The server connection type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ServerConnectionPolicyInner>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionType connectionType,
        Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (connectionPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter connectionPolicyName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        ServerConnectionPolicyInner parameters = new ServerConnectionPolicyInner();
        parameters.withConnectionType(connectionType);
        context = this.client.mergeContext(context);
        return service
            .createOrUpdate(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                connectionPolicyName,
                parameters,
                context);
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param connectionType The server connection type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerConnectionPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionType connectionType) {
        return createOrUpdateWithResponseAsync(resourceGroupName, serverName, connectionPolicyName, connectionType)
            .flatMap(
                (Response<ServerConnectionPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param connectionType The server connection type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerConnectionPolicyInner> createOrUpdateAsync(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionType connectionType,
        Context context) {
        return createOrUpdateWithResponseAsync(
                resourceGroupName, serverName, connectionPolicyName, connectionType, context)
            .flatMap(
                (Response<ServerConnectionPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param connectionType The server connection type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerConnectionPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionType connectionType) {
        return createOrUpdateAsync(resourceGroupName, serverName, connectionPolicyName, connectionType).block();
    }

    /**
     * Creates or updates the server's connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param connectionType The server connection type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a server secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerConnectionPolicyInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        ConnectionPolicyName connectionPolicyName,
        ServerConnectionType connectionType,
        Context context) {
        return createOrUpdateAsync(resourceGroupName, serverName, connectionPolicyName, connectionType, context)
            .block();
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ServerConnectionPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (connectionPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter connectionPolicyName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            apiVersion,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            serverName,
                            connectionPolicyName,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ServerConnectionPolicyInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName, Context context) {
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
        if (serverName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serverName is required and cannot be null."));
        }
        if (connectionPolicyName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter connectionPolicyName is required and cannot be null."));
        }
        final String apiVersion = "2014-04-01";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                apiVersion,
                this.client.getSubscriptionId(),
                resourceGroupName,
                serverName,
                connectionPolicyName,
                context);
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerConnectionPolicyInner> getAsync(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName) {
        return getWithResponseAsync(resourceGroupName, serverName, connectionPolicyName)
            .flatMap(
                (Response<ServerConnectionPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ServerConnectionPolicyInner> getAsync(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName, Context context) {
        return getWithResponseAsync(resourceGroupName, serverName, connectionPolicyName, context)
            .flatMap(
                (Response<ServerConnectionPolicyInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerConnectionPolicyInner get(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName) {
        return getAsync(resourceGroupName, serverName, connectionPolicyName).block();
    }

    /**
     * Gets the server's secure connection policy.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param connectionPolicyName The name of the connection policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the server's secure connection policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ServerConnectionPolicyInner get(
        String resourceGroupName, String serverName, ConnectionPolicyName connectionPolicyName, Context context) {
        return getAsync(resourceGroupName, serverName, connectionPolicyName, context).block();
    }
}
