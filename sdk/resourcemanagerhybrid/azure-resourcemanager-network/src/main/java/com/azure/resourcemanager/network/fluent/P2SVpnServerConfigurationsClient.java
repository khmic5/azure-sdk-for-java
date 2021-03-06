// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.P2SVpnServerConfigurationInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in P2SVpnServerConfigurationsClient. */
public interface P2SVpnServerConfigurationsClient {
    /**
     * Retrieves the details of a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<P2SVpnServerConfigurationInner>> getWithResponseAsync(
        String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Retrieves the details of a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<P2SVpnServerConfigurationInner> getAsync(
        String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Retrieves the details of a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    P2SVpnServerConfigurationInner get(
        String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Retrieves the details of a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<P2SVpnServerConfigurationInner> getWithResponse(
        String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, Context context);

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing
     * P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param p2SVpnServerConfigurationParameters Parameters supplied to create or Update a P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName,
        String virtualWanName,
        String p2SVpnServerConfigurationName,
        P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters);

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing
     * P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param p2SVpnServerConfigurationParameters Parameters supplied to create or Update a P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<P2SVpnServerConfigurationInner>, P2SVpnServerConfigurationInner> beginCreateOrUpdateAsync(
        String resourceGroupName,
        String virtualWanName,
        String p2SVpnServerConfigurationName,
        P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters);

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing
     * P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param p2SVpnServerConfigurationParameters Parameters supplied to create or Update a P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<P2SVpnServerConfigurationInner>, P2SVpnServerConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualWanName,
        String p2SVpnServerConfigurationName,
        P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters);

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing
     * P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param p2SVpnServerConfigurationParameters Parameters supplied to create or Update a P2SVpnServerConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<P2SVpnServerConfigurationInner>, P2SVpnServerConfigurationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualWanName,
        String p2SVpnServerConfigurationName,
        P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters,
        Context context);

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing
     * P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param p2SVpnServerConfigurationParameters Parameters supplied to create or Update a P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<P2SVpnServerConfigurationInner> createOrUpdateAsync(
        String resourceGroupName,
        String virtualWanName,
        String p2SVpnServerConfigurationName,
        P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters);

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing
     * P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param p2SVpnServerConfigurationParameters Parameters supplied to create or Update a P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    P2SVpnServerConfigurationInner createOrUpdate(
        String resourceGroupName,
        String virtualWanName,
        String p2SVpnServerConfigurationName,
        P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters);

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing
     * P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param p2SVpnServerConfigurationParameters Parameters supplied to create or Update a P2SVpnServerConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return p2SVpnServerConfiguration Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    P2SVpnServerConfigurationInner createOrUpdate(
        String resourceGroupName,
        String virtualWanName,
        String p2SVpnServerConfigurationName,
        P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters,
        Context context);

    /**
     * Deletes a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Deletes a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Deletes a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Deletes a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, Context context);

    /**
     * Deletes a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Deletes a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName);

    /**
     * Deletes a P2SVpnServerConfiguration.
     *
     * @param resourceGroupName The resource group name of the P2SVpnServerConfiguration.
     * @param virtualWanName The name of the VirtualWan.
     * @param p2SVpnServerConfigurationName The name of the P2SVpnServerConfiguration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, Context context);

    /**
     * Retrieves all P2SVpnServerConfigurations for a particular VirtualWan.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all P2SVpnServerConfigurations associated to a VirtualWan.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<P2SVpnServerConfigurationInner> listByVirtualWanAsync(String resourceGroupName, String virtualWanName);

    /**
     * Retrieves all P2SVpnServerConfigurations for a particular VirtualWan.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all P2SVpnServerConfigurations associated to a VirtualWan.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<P2SVpnServerConfigurationInner> listByVirtualWan(String resourceGroupName, String virtualWanName);

    /**
     * Retrieves all P2SVpnServerConfigurations for a particular VirtualWan.
     *
     * @param resourceGroupName The resource group name of the VirtualWan.
     * @param virtualWanName The name of the VirtualWan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list all P2SVpnServerConfigurations associated to a VirtualWan.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<P2SVpnServerConfigurationInner> listByVirtualWan(
        String resourceGroupName, String virtualWanName, Context context);
}
