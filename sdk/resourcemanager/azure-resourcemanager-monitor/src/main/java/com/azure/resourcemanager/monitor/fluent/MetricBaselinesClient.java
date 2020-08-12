// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent;

import com.azure.core.annotation.BodyParam;
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
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.MonitorClient;
import com.azure.resourcemanager.monitor.fluent.inner.BaselineResponseInner;
import com.azure.resourcemanager.monitor.fluent.inner.CalculateBaselineResponseInner;
import com.azure.resourcemanager.monitor.models.ResultType;
import com.azure.resourcemanager.monitor.models.TimeSeriesInformation;
import java.time.Duration;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in MetricBaselines. */
public final class MetricBaselinesClient {
    private final ClientLogger logger = new ClientLogger(MetricBaselinesClient.class);

    /** The proxy service used to perform REST calls. */
    private final MetricBaselinesService service;

    /** The service client containing this operation class. */
    private final MonitorClient client;

    /**
     * Initializes an instance of MetricBaselinesClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public MetricBaselinesClient(MonitorClient client) {
        this.service =
            RestProxy.create(MetricBaselinesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for MonitorClientMetricBaselines to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "MonitorClientMetricB")
    private interface MetricBaselinesService {
        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Get("/{resourceUri}/providers/microsoft.insights/baseline/{metricName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<BaselineResponseInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @PathParam("metricName") String metricName,
            @QueryParam("timespan") String timespan,
            @QueryParam("interval") Duration interval,
            @QueryParam("aggregation") String aggregation,
            @QueryParam("sensitivities") String sensitivities,
            @QueryParam("resultType") ResultType resultType,
            @QueryParam("api-version") String apiVersion,
            Context context);

        @Headers({"Accept: application/json", "Content-Type: application/json"})
        @Post("/{resourceUri}/providers/microsoft.insights/calculatebaseline")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CalculateBaselineResponseInner>> calculateBaseline(
            @HostParam("$host") String endpoint,
            @PathParam(value = "resourceUri", encoded = true) String resourceUri,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") TimeSeriesInformation timeSeriesInformation,
            Context context);
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BaselineResponseInner>> getWithResponseAsync(
        String resourceUri,
        String metricName,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        ResultType resultType) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (metricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter metricName is required and cannot be null."));
        }
        final String apiVersion = "2017-11-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceUri,
                            metricName,
                            timespan,
                            interval,
                            aggregation,
                            sensitivities,
                            resultType,
                            apiVersion,
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<BaselineResponseInner>> getWithResponseAsync(
        String resourceUri,
        String metricName,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        ResultType resultType,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (metricName == null) {
            return Mono.error(new IllegalArgumentException("Parameter metricName is required and cannot be null."));
        }
        final String apiVersion = "2017-11-01-preview";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceUri,
                metricName,
                timespan,
                interval,
                aggregation,
                sensitivities,
                resultType,
                apiVersion,
                context);
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BaselineResponseInner> getAsync(
        String resourceUri,
        String metricName,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        ResultType resultType) {
        return getWithResponseAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType)
            .flatMap(
                (Response<BaselineResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BaselineResponseInner> getAsync(
        String resourceUri,
        String metricName,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        ResultType resultType,
        Context context) {
        return getWithResponseAsync(
                resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType, context)
            .flatMap(
                (Response<BaselineResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<BaselineResponseInner> getAsync(String resourceUri, String metricName) {
        final String timespan = null;
        final Duration interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final ResultType resultType = null;
        final Context context = null;
        return getWithResponseAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType)
            .flatMap(
                (Response<BaselineResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BaselineResponseInner get(
        String resourceUri,
        String metricName,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        ResultType resultType) {
        return getAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType).block();
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @param timespan The timespan of the query. It is a string with the following format
     *     'startDateTime_ISO/endDateTime_ISO'.
     * @param interval The interval (i.e. timegrain) of the query.
     * @param aggregation The aggregation type of the metric to retrieve the baseline for.
     * @param sensitivities The list of sensitivities (comma separated) to retrieve.
     * @param resultType Allows retrieving only metadata of the baseline. On data request all information is retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BaselineResponseInner get(
        String resourceUri,
        String metricName,
        String timespan,
        Duration interval,
        String aggregation,
        String sensitivities,
        ResultType resultType,
        Context context) {
        return getAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType, context)
            .block();
    }

    /**
     * **Gets the baseline values for a specific metric**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param metricName The name of the metric to retrieve the baseline for.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a baseline query.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public BaselineResponseInner get(String resourceUri, String metricName) {
        final String timespan = null;
        final Duration interval = null;
        final String aggregation = null;
        final String sensitivities = null;
        final ResultType resultType = null;
        final Context context = null;
        return getAsync(resourceUri, metricName, timespan, interval, aggregation, sensitivities, resultType).block();
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a calculate baseline call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CalculateBaselineResponseInner>> calculateBaselineWithResponseAsync(
        String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (timeSeriesInformation == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter timeSeriesInformation is required and cannot be null."));
        } else {
            timeSeriesInformation.validate();
        }
        final String apiVersion = "2017-11-01-preview";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .calculateBaseline(
                            this.client.getEndpoint(), resourceUri, apiVersion, timeSeriesInformation, context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a calculate baseline call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CalculateBaselineResponseInner>> calculateBaselineWithResponseAsync(
        String resourceUri, TimeSeriesInformation timeSeriesInformation, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceUri == null) {
            return Mono.error(new IllegalArgumentException("Parameter resourceUri is required and cannot be null."));
        }
        if (timeSeriesInformation == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter timeSeriesInformation is required and cannot be null."));
        } else {
            timeSeriesInformation.validate();
        }
        final String apiVersion = "2017-11-01-preview";
        context = this.client.mergeContext(context);
        return service
            .calculateBaseline(this.client.getEndpoint(), resourceUri, apiVersion, timeSeriesInformation, context);
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a calculate baseline call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CalculateBaselineResponseInner> calculateBaselineAsync(
        String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        return calculateBaselineWithResponseAsync(resourceUri, timeSeriesInformation)
            .flatMap(
                (Response<CalculateBaselineResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a calculate baseline call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CalculateBaselineResponseInner> calculateBaselineAsync(
        String resourceUri, TimeSeriesInformation timeSeriesInformation, Context context) {
        return calculateBaselineWithResponseAsync(resourceUri, timeSeriesInformation, context)
            .flatMap(
                (Response<CalculateBaselineResponseInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a calculate baseline call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CalculateBaselineResponseInner calculateBaseline(
        String resourceUri, TimeSeriesInformation timeSeriesInformation) {
        return calculateBaselineAsync(resourceUri, timeSeriesInformation).block();
    }

    /**
     * **Lists the baseline values for a resource**.
     *
     * @param resourceUri The identifier of the resource. It has the following structure:
     *     subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/{providerName}/{resourceName}.
     *     For example:
     *     subscriptions/b368ca2f-e298-46b7-b0ab-012281956afa/resourceGroups/vms/providers/Microsoft.Compute/virtualMachines/vm1.
     * @param timeSeriesInformation The time series info needed for calculating the baseline.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response to a calculate baseline call.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CalculateBaselineResponseInner calculateBaseline(
        String resourceUri, TimeSeriesInformation timeSeriesInformation, Context context) {
        return calculateBaselineAsync(resourceUri, timeSeriesInformation, context).block();
    }
}
