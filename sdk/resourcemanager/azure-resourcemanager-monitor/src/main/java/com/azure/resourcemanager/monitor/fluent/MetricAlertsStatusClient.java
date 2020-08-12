// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.MonitorClient;
import com.azure.resourcemanager.monitor.fluent.inner.MetricAlertStatusCollectionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MetricAlertsStatus. */
public final class MetricAlertsStatusClient {
    private final ClientLogger logger = new ClientLogger(MetricAlertsStatusClient.class);

    /** The proxy service used to perform REST calls. */
    private final MetricAlertsStatusService service;

    /** The service client containing this operation class. */
    private final MonitorClient client;

    /**
     * Initializes an instance of MetricAlertsStatusClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public MetricAlertsStatusClient(MonitorClient client) {
        this.service =
            RestProxy.create(MetricAlertsStatusService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientMetricAlertsStatus to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientMetricA")
    private interface MetricAlertsStatusService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights"
                + "/metricAlerts/{ruleName}/status")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MetricAlertStatusCollectionInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("ruleName") String ruleName,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Insights"
                + "/metricAlerts/{ruleName}/status/{statusName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<MetricAlertStatusCollectionInner>> listByName(
            @HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("ruleName") String ruleName,
            @PathParam("statusName") String statusName,
            @QueryParam("api-version") String apiVersion,
            Context context);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MetricAlertStatusCollectionInner>> listWithResponseAsync(
        String resourceGroupName, String ruleName) {
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
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            ruleName,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MetricAlertStatusCollectionInner>> listWithResponseAsync(
        String resourceGroupName, String ruleName, Context context) {
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
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                ruleName,
                apiVersion,
                context);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MetricAlertStatusCollectionInner> listAsync(String resourceGroupName, String ruleName) {
        return listWithResponseAsync(resourceGroupName, ruleName)
            .flatMap(
                (Response<MetricAlertStatusCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MetricAlertStatusCollectionInner> listAsync(
        String resourceGroupName, String ruleName, Context context) {
        return listWithResponseAsync(resourceGroupName, ruleName, context)
            .flatMap(
                (Response<MetricAlertStatusCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetricAlertStatusCollectionInner list(String resourceGroupName, String ruleName) {
        return listAsync(resourceGroupName, ruleName).block();
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetricAlertStatusCollectionInner list(String resourceGroupName, String ruleName, Context context) {
        return listAsync(resourceGroupName, ruleName, context).block();
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MetricAlertStatusCollectionInner>> listByNameWithResponseAsync(
        String resourceGroupName, String ruleName, String statusName) {
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
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        if (statusName == null) {
            return Mono.error(new IllegalArgumentException("Parameter statusName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .listByName(
                            this.client.getEndpoint(),
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            ruleName,
                            statusName,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<MetricAlertStatusCollectionInner>> listByNameWithResponseAsync(
        String resourceGroupName, String ruleName, String statusName, Context context) {
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
        if (ruleName == null) {
            return Mono.error(new IllegalArgumentException("Parameter ruleName is required and cannot be null."));
        }
        if (statusName == null) {
            return Mono.error(new IllegalArgumentException("Parameter statusName is required and cannot be null."));
        }
        final String apiVersion = "2018-03-01";
        context = this.client.mergeContext(context);
        return service
            .listByName(
                this.client.getEndpoint(),
                this.client.getSubscriptionId(),
                resourceGroupName,
                ruleName,
                statusName,
                apiVersion,
                context);
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MetricAlertStatusCollectionInner> listByNameAsync(
        String resourceGroupName, String ruleName, String statusName) {
        return listByNameWithResponseAsync(resourceGroupName, ruleName, statusName)
            .flatMap(
                (Response<MetricAlertStatusCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<MetricAlertStatusCollectionInner> listByNameAsync(
        String resourceGroupName, String ruleName, String statusName, Context context) {
        return listByNameWithResponseAsync(resourceGroupName, ruleName, statusName, context)
            .flatMap(
                (Response<MetricAlertStatusCollectionInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetricAlertStatusCollectionInner listByName(String resourceGroupName, String ruleName, String statusName) {
        return listByNameAsync(resourceGroupName, ruleName, statusName).block();
    }

    /**
     * Retrieve an alert rule status.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ruleName The name of the rule.
     * @param statusName The name of the status.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a collection of alert rule resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public MetricAlertStatusCollectionInner listByName(
        String resourceGroupName, String ruleName, String statusName, Context context) {
        return listByNameAsync(resourceGroupName, ruleName, statusName, context).block();
    }
}
