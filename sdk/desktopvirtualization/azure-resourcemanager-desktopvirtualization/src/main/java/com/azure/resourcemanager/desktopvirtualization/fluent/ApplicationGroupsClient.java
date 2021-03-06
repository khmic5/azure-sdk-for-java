// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.ApplicationGroupInner;
import com.azure.resourcemanager.desktopvirtualization.models.ApplicationGroupPatch;

/** An instance of this class provides access to all the operations defined in ApplicationGroupsClient. */
public interface ApplicationGroupsClient {
    /**
     * Get an application group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationGroupInner getByResourceGroup(String resourceGroupName, String applicationGroupName);

    /**
     * Get an application group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an application group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationGroupInner> getByResourceGroupWithResponse(
        String resourceGroupName, String applicationGroupName, Context context);

    /**
     * Create or update an applicationGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationGroup Object containing ApplicationGroup definitions.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ApplicationGroup definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationGroupInner createOrUpdate(
        String resourceGroupName, String applicationGroupName, ApplicationGroupInner applicationGroup);

    /**
     * Create or update an applicationGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationGroup Object containing ApplicationGroup definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ApplicationGroup definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationGroupInner> createOrUpdateWithResponse(
        String resourceGroupName, String applicationGroupName, ApplicationGroupInner applicationGroup, Context context);

    /**
     * Remove an applicationGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationGroupName);

    /**
     * Remove an applicationGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String applicationGroupName, Context context);

    /**
     * Update an applicationGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ApplicationGroup definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationGroupInner update(String resourceGroupName, String applicationGroupName);

    /**
     * Update an applicationGroup.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param applicationGroupName The name of the application group.
     * @param applicationGroup Object containing ApplicationGroup definitions.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a ApplicationGroup definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationGroupInner> updateWithResponse(
        String resourceGroupName, String applicationGroupName, ApplicationGroupPatch applicationGroup, Context context);

    /**
     * List applicationGroups.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return applicationGroupList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationGroupInner> listByResourceGroup(String resourceGroupName);

    /**
     * List applicationGroups.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param filter OData filter expression. Valid properties for filtering are applicationGroupType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return applicationGroupList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationGroupInner> listByResourceGroup(String resourceGroupName, String filter, Context context);

    /**
     * List applicationGroups in subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return applicationGroupList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationGroupInner> list();

    /**
     * List applicationGroups in subscription.
     *
     * @param filter OData filter expression. Valid properties for filtering are applicationGroupType.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return applicationGroupList.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationGroupInner> list(String filter, Context context);
}
