// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mixedreality.fluent.models.AccountKeysInner;
import com.azure.resourcemanager.mixedreality.fluent.models.RemoteRenderingAccountInner;
import com.azure.resourcemanager.mixedreality.models.AccountKeyRegenerateRequest;

/** An instance of this class provides access to all the operations defined in RemoteRenderingAccountsClient. */
public interface RemoteRenderingAccountsClient {
    /**
     * List Remote Rendering Accounts by Subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to get resource collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemoteRenderingAccountInner> list();

    /**
     * List Remote Rendering Accounts by Subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to get resource collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemoteRenderingAccountInner> list(Context context);

    /**
     * List Resources by Resource Group.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to get resource collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemoteRenderingAccountInner> listByResourceGroup(String resourceGroupName);

    /**
     * List Resources by Resource Group.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to get resource collection.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RemoteRenderingAccountInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Delete a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName);

    /**
     * Delete a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Retrieve a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return remoteRenderingAccount Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemoteRenderingAccountInner getByResourceGroup(String resourceGroupName, String accountName);

    /**
     * Retrieve a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return remoteRenderingAccount Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemoteRenderingAccountInner> getByResourceGroupWithResponse(
        String resourceGroupName, String accountName, Context context);

    /**
     * Updating a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param remoteRenderingAccount Remote Rendering Account parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return remoteRenderingAccount Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemoteRenderingAccountInner update(
        String resourceGroupName, String accountName, RemoteRenderingAccountInner remoteRenderingAccount);

    /**
     * Updating a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param remoteRenderingAccount Remote Rendering Account parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return remoteRenderingAccount Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemoteRenderingAccountInner> updateWithResponse(
        String resourceGroupName,
        String accountName,
        RemoteRenderingAccountInner remoteRenderingAccount,
        Context context);

    /**
     * Creating or Updating a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param remoteRenderingAccount Remote Rendering Account parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return remoteRenderingAccount Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RemoteRenderingAccountInner create(
        String resourceGroupName, String accountName, RemoteRenderingAccountInner remoteRenderingAccount);

    /**
     * Creating or Updating a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param remoteRenderingAccount Remote Rendering Account parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return remoteRenderingAccount Response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RemoteRenderingAccountInner> createWithResponse(
        String resourceGroupName,
        String accountName,
        RemoteRenderingAccountInner remoteRenderingAccount,
        Context context);

    /**
     * List Both of the 2 Keys of a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return developer Keys of account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountKeysInner listKeys(String resourceGroupName, String accountName);

    /**
     * List Both of the 2 Keys of a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return developer Keys of account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountKeysInner> listKeysWithResponse(String resourceGroupName, String accountName, Context context);

    /**
     * Regenerate specified Key of a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param regenerate Required information for key regeneration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return developer Keys of account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccountKeysInner regenerateKeys(
        String resourceGroupName, String accountName, AccountKeyRegenerateRequest regenerate);

    /**
     * Regenerate specified Key of a Remote Rendering Account.
     *
     * @param resourceGroupName Name of an Azure resource group.
     * @param accountName Name of an Mixed Reality Account.
     * @param regenerate Required information for key regeneration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return developer Keys of account.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccountKeysInner> regenerateKeysWithResponse(
        String resourceGroupName, String accountName, AccountKeyRegenerateRequest regenerate, Context context);
}