// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageimportexport.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
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
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storageimportexport.fluent.BitLockerKeysClient;
import com.azure.resourcemanager.storageimportexport.fluent.models.DriveBitLockerKeyInner;
import com.azure.resourcemanager.storageimportexport.models.ErrorResponseException;
import com.azure.resourcemanager.storageimportexport.models.GetBitLockerKeysResponse;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in BitLockerKeysClient. */
public final class BitLockerKeysClientImpl implements BitLockerKeysClient {
    private final ClientLogger logger = new ClientLogger(BitLockerKeysClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final BitLockerKeysService service;

    /** The service client containing this operation class. */
    private final StorageImportExportImpl client;

    /**
     * Initializes an instance of BitLockerKeysClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    BitLockerKeysClientImpl(StorageImportExportImpl client) {
        this.service =
            RestProxy.create(BitLockerKeysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for StorageImportExportBitLockerKeys to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "StorageImportExportB")
    private interface BitLockerKeysService {
        @Headers({"Content-Type: application/json"})
        @Post(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ImportExport/jobs"
                + "/{jobName}/listBitLockerKeys")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<GetBitLockerKeysResponse>> list(
            @HostParam("$host") String endpoint,
            @PathParam("jobName") String jobName,
            @PathParam("subscriptionId") String subscriptionId,
            @PathParam("resourceGroupName") String resourceGroupName,
            @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept-Language") String acceptLanguage,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Returns the BitLocker Keys for all drives in the specified job.
     *
     * @param jobName The name of the import/export job.
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return getBitLockerKeys response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DriveBitLockerKeyInner>> listSinglePageAsync(String jobName, String resourceGroupName) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
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
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(),
                            jobName,
                            this.client.getSubscriptionId(),
                            resourceGroupName,
                            this.client.getApiVersion(),
                            this.client.getAcceptLanguage(),
                            accept,
                            context))
            .<PagedResponse<DriveBitLockerKeyInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Returns the BitLocker Keys for all drives in the specified job.
     *
     * @param jobName The name of the import/export job.
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return getBitLockerKeys response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<PagedResponse<DriveBitLockerKeyInner>> listSinglePageAsync(
        String jobName, String resourceGroupName, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (jobName == null) {
            return Mono.error(new IllegalArgumentException("Parameter jobName is required and cannot be null."));
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
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .list(
                this.client.getEndpoint(),
                jobName,
                this.client.getSubscriptionId(),
                resourceGroupName,
                this.client.getApiVersion(),
                this.client.getAcceptLanguage(),
                accept,
                context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(), res.getStatusCode(), res.getHeaders(), res.getValue().value(), null, null));
    }

    /**
     * Returns the BitLocker Keys for all drives in the specified job.
     *
     * @param jobName The name of the import/export job.
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return getBitLockerKeys response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DriveBitLockerKeyInner> listAsync(String jobName, String resourceGroupName) {
        return new PagedFlux<>(() -> listSinglePageAsync(jobName, resourceGroupName));
    }

    /**
     * Returns the BitLocker Keys for all drives in the specified job.
     *
     * @param jobName The name of the import/export job.
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return getBitLockerKeys response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    private PagedFlux<DriveBitLockerKeyInner> listAsync(String jobName, String resourceGroupName, Context context) {
        return new PagedFlux<>(() -> listSinglePageAsync(jobName, resourceGroupName, context));
    }

    /**
     * Returns the BitLocker Keys for all drives in the specified job.
     *
     * @param jobName The name of the import/export job.
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return getBitLockerKeys response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DriveBitLockerKeyInner> list(String jobName, String resourceGroupName) {
        return new PagedIterable<>(listAsync(jobName, resourceGroupName));
    }

    /**
     * Returns the BitLocker Keys for all drives in the specified job.
     *
     * @param jobName The name of the import/export job.
     * @param resourceGroupName The resource group name uniquely identifies the resource group within the user
     *     subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return getBitLockerKeys response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DriveBitLockerKeyInner> list(String jobName, String resourceGroupName, Context context) {
        return new PagedIterable<>(listAsync(jobName, resourceGroupName, context));
    }
}