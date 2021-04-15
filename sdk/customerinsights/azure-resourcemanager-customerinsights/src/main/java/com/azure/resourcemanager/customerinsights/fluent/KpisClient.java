// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.customerinsights.fluent.models.KpiResourceFormatInner;

/** An instance of this class provides access to all the operations defined in KpisClient. */
public interface KpisClient {
    /**
     * Creates a KPI or updates an existing KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param parameters Parameters supplied to the create/update KPI operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the KPI resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<KpiResourceFormatInner>, KpiResourceFormatInner> beginCreateOrUpdate(
        String resourceGroupName, String hubName, String kpiName, KpiResourceFormatInner parameters);

    /**
     * Creates a KPI or updates an existing KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param parameters Parameters supplied to the create/update KPI operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the KPI resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<KpiResourceFormatInner>, KpiResourceFormatInner> beginCreateOrUpdate(
        String resourceGroupName, String hubName, String kpiName, KpiResourceFormatInner parameters, Context context);

    /**
     * Creates a KPI or updates an existing KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param parameters Parameters supplied to the create/update KPI operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the KPI resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KpiResourceFormatInner createOrUpdate(
        String resourceGroupName, String hubName, String kpiName, KpiResourceFormatInner parameters);

    /**
     * Creates a KPI or updates an existing KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param parameters Parameters supplied to the create/update KPI operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the KPI resource format.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KpiResourceFormatInner createOrUpdate(
        String resourceGroupName, String hubName, String kpiName, KpiResourceFormatInner parameters, Context context);

    /**
     * Gets a KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a KPI in the hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KpiResourceFormatInner get(String resourceGroupName, String hubName, String kpiName);

    /**
     * Gets a KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a KPI in the hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<KpiResourceFormatInner> getWithResponse(
        String resourceGroupName, String hubName, String kpiName, Context context);

    /**
     * Deletes a KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hubName, String kpiName);

    /**
     * Deletes a KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String hubName, String kpiName, Context context);

    /**
     * Deletes a KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, String kpiName);

    /**
     * Deletes a KPI in the hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hubName, String kpiName, Context context);

    /**
     * Reprocesses the Kpi values of the specified KPI.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void reprocess(String resourceGroupName, String hubName, String kpiName);

    /**
     * Reprocesses the Kpi values of the specified KPI.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param kpiName The name of the KPI.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> reprocessWithResponse(String resourceGroupName, String hubName, String kpiName, Context context);

    /**
     * Gets all the KPIs in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the KPIs in the specified hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KpiResourceFormatInner> listByHub(String resourceGroupName, String hubName);

    /**
     * Gets all the KPIs in the specified hub.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the hub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the KPIs in the specified hub.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KpiResourceFormatInner> listByHub(String resourceGroupName, String hubName, Context context);
}