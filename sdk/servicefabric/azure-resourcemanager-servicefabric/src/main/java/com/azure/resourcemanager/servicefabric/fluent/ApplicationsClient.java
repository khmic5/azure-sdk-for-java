// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceInner;
import com.azure.resourcemanager.servicefabric.fluent.models.ApplicationResourceListInner;
import com.azure.resourcemanager.servicefabric.models.ApplicationResourceUpdate;

/** An instance of this class provides access to all the operations defined in ApplicationsClient. */
public interface ApplicationsClient {
    /**
     * Get a Service Fabric application resource created or in the process of being created in the Service Fabric
     * cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric application resource created or in the process of being created in the Service Fabric
     *     cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationResourceInner get(String resourceGroupName, String clusterName, String applicationName);

    /**
     * Get a Service Fabric application resource created or in the process of being created in the Service Fabric
     * cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Service Fabric application resource created or in the process of being created in the Service Fabric
     *     cluster resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationResourceInner> getWithResponse(
        String resourceGroupName, String clusterName, String applicationName, Context context);

    /**
     * Create or update a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters The application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationResourceInner>, ApplicationResourceInner> beginCreateOrUpdate(
        String resourceGroupName, String clusterName, String applicationName, ApplicationResourceInner parameters);

    /**
     * Create or update a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters The application resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationResourceInner>, ApplicationResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String applicationName,
        ApplicationResourceInner parameters,
        Context context);

    /**
     * Create or update a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters The application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationResourceInner createOrUpdate(
        String resourceGroupName, String clusterName, String applicationName, ApplicationResourceInner parameters);

    /**
     * Create or update a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters The application resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationResourceInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String applicationName,
        ApplicationResourceInner parameters,
        Context context);

    /**
     * Update a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters The application resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationResourceInner>, ApplicationResourceInner> beginUpdate(
        String resourceGroupName, String clusterName, String applicationName, ApplicationResourceUpdate parameters);

    /**
     * Update a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters The application resource for patch operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<ApplicationResourceInner>, ApplicationResourceInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String applicationName,
        ApplicationResourceUpdate parameters,
        Context context);

    /**
     * Update a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters The application resource for patch operations.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationResourceInner update(
        String resourceGroupName, String clusterName, String applicationName, ApplicationResourceUpdate parameters);

    /**
     * Update a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param parameters The application resource for patch operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the application resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationResourceInner update(
        String resourceGroupName,
        String clusterName,
        String applicationName,
        ApplicationResourceUpdate parameters,
        Context context);

    /**
     * Delete a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String applicationName);

    /**
     * Delete a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String applicationName, Context context);

    /**
     * Delete a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String applicationName);

    /**
     * Delete a Service Fabric application resource with the specified name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param applicationName The name of the application resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String applicationName, Context context);

    /**
     * Gets all application resources created or in the process of being created in the Service Fabric cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application resources created or in the process of being created in the Service Fabric cluster
     *     resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationResourceListInner list(String resourceGroupName, String clusterName);

    /**
     * Gets all application resources created or in the process of being created in the Service Fabric cluster resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param clusterName The name of the cluster resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all application resources created or in the process of being created in the Service Fabric cluster
     *     resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationResourceListInner> listWithResponse(
        String resourceGroupName, String clusterName, Context context);
}