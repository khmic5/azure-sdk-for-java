// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.implementation;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.authorization.fluent.RoleAssignmentMetricsClient;
import com.azure.resourcemanager.authorization.fluent.models.RoleAssignmentMetricsResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in RoleAssignmentMetricsClient. */
public final class RoleAssignmentMetricsClientImpl implements RoleAssignmentMetricsClient {
    private final ClientLogger logger = new ClientLogger(RoleAssignmentMetricsClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final RoleAssignmentMetricsService service;

    /** The service client containing this operation class. */
    private final AuthorizationManagementClientImpl client;

    /**
     * Initializes an instance of RoleAssignmentMetricsClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    RoleAssignmentMetricsClientImpl(AuthorizationManagementClientImpl client) {
        this.service =
            RestProxy
                .create(RoleAssignmentMetricsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AuthorizationManagementClientRoleAssignmentMetrics to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AuthorizationManagem")
    private interface RoleAssignmentMetricsService {
        @Headers({"Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Authorization/roleAssignmentsUsageMetrics")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RoleAssignmentMetricsResultInner>> getMetricsForSubscription(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Get role assignment usage metrics for a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment usage metrics for a subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RoleAssignmentMetricsResultInner>> getMetricsForSubscriptionWithResponseAsync() {
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
        final String apiVersion = "2019-08-01-preview";
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .getMetricsForSubscription(
                            this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get role assignment usage metrics for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment usage metrics for a subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<RoleAssignmentMetricsResultInner>> getMetricsForSubscriptionWithResponseAsync(
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
        final String apiVersion = "2019-08-01-preview";
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .getMetricsForSubscription(
                this.client.getEndpoint(), this.client.getSubscriptionId(), apiVersion, accept, context);
    }

    /**
     * Get role assignment usage metrics for a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment usage metrics for a subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RoleAssignmentMetricsResultInner> getMetricsForSubscriptionAsync() {
        return getMetricsForSubscriptionWithResponseAsync()
            .flatMap(
                (Response<RoleAssignmentMetricsResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Get role assignment usage metrics for a subscription.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment usage metrics for a subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RoleAssignmentMetricsResultInner getMetricsForSubscription() {
        return getMetricsForSubscriptionAsync().block();
    }

    /**
     * Get role assignment usage metrics for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role assignment usage metrics for a subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<RoleAssignmentMetricsResultInner> getMetricsForSubscriptionWithResponse(Context context) {
        return getMetricsForSubscriptionWithResponseAsync(context).block();
    }
}
