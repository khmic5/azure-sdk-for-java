// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ScalingPlanInner;
import com.azure.resourcemanager.desktopvirtualization.models.ScalingPlanPatch;

/** An instance of this class provides access to all the operations defined in ScalingPlansClient. */
public interface ScalingPlansClient {
    /**
     * Get a scaling plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a scaling plan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScalingPlanInner getByResourceGroup(String resourceGroupName, String scalingPlanName);

    /**
     * Get a scaling plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a scaling plan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScalingPlanInner> getByResourceGroupWithResponse(
        String resourceGroupName, String scalingPlanName, Context context);

    /**
     * Create or update a scaling plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlan Object containing scaling plan definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScalingPlanInner create(String resourceGroupName, String scalingPlanName, ScalingPlanInner scalingPlan);

    /**
     * Create or update a scaling plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlan Object containing scaling plan definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScalingPlanInner> createWithResponse(
        String resourceGroupName, String scalingPlanName, ScalingPlanInner scalingPlan, Context context);

    /**
     * Remove a scaling plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String scalingPlanName);

    /**
     * Remove a scaling plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String scalingPlanName, Context context);

    /**
     * Update a scaling plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ScalingPlanInner update(String resourceGroupName, String scalingPlanName);

    /**
     * Update a scaling plan.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param scalingPlanName The name of the scaling plan.
     * @param scalingPlan Object containing scaling plan definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlan.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ScalingPlanInner> updateWithResponse(
        String resourceGroupName, String scalingPlanName, ScalingPlanPatch scalingPlan, Context context);

    /**
     * List scaling plans.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScalingPlanInner> listByResourceGroup(String resourceGroupName);

    /**
     * List scaling plans.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScalingPlanInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List scaling plans in subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScalingPlanInner> list();

    /**
     * List scaling plans in subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScalingPlanInner> list(Context context);

    /**
     * List scaling plan associated with hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScalingPlanInner> listByHostPool(String resourceGroupName, String hostPoolName);

    /**
     * List scaling plan associated with hostpool.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param hostPoolName The name of the host pool within the specified resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return scalingPlanList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ScalingPlanInner> listByHostPool(String resourceGroupName, String hostPoolName, Context context);
}
