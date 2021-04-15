// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.SourceControlInner;
import com.azure.resourcemanager.automation.models.SourceControlCreateOrUpdateParameters;
import com.azure.resourcemanager.automation.models.SourceControlUpdateParameters;

/** An instance of this class provides access to all the operations defined in SourceControlsClient. */
public interface SourceControlsClient {
    /**
     * Create a source control.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param parameters The parameters supplied to the create or update source control operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlInner createOrUpdate(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        SourceControlCreateOrUpdateParameters parameters);

    /**
     * Create a source control.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param parameters The parameters supplied to the create or update source control operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        SourceControlCreateOrUpdateParameters parameters,
        Context context);

    /**
     * Update a source control.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param parameters The parameters supplied to the update source control operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlInner update(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        SourceControlUpdateParameters parameters);

    /**
     * Update a source control.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The source control name.
     * @param parameters The parameters supplied to the update source control operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlInner> updateWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String sourceControlName,
        SourceControlUpdateParameters parameters,
        Context context);

    /**
     * Delete the source control.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The name of source control.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String automationAccountName, String sourceControlName);

    /**
     * Delete the source control.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The name of source control.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String automationAccountName, String sourceControlName, Context context);

    /**
     * Retrieve the source control identified by source control name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The name of source control.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SourceControlInner get(String resourceGroupName, String automationAccountName, String sourceControlName);

    /**
     * Retrieve the source control identified by source control name.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param sourceControlName The name of source control.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return definition of the source control.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SourceControlInner> getWithResponse(
        String resourceGroupName, String automationAccountName, String sourceControlName, Context context);

    /**
     * Retrieve a list of source controls.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list source controls operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlInner> listByAutomationAccount(String resourceGroupName, String automationAccountName);

    /**
     * Retrieve a list of source controls.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param filter The filter to apply on the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response model for the list source controls operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SourceControlInner> listByAutomationAccount(
        String resourceGroupName, String automationAccountName, String filter, Context context);
}