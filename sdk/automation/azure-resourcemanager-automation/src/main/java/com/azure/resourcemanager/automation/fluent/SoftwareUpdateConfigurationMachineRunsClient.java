// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationMachineRunInner;
import com.azure.resourcemanager.automation.fluent.models.SoftwareUpdateConfigurationMachineRunListResultInner;
import java.util.UUID;

/**
 * An instance of this class provides access to all the operations defined in
 * SoftwareUpdateConfigurationMachineRunsClient.
 */
public interface SoftwareUpdateConfigurationMachineRunsClient {
    /**
     * Get a single software update configuration machine run by Id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param softwareUpdateConfigurationMachineRunId The Id of the software update configuration machine run.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single software update configuration machine run by Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SoftwareUpdateConfigurationMachineRunInner getById(
        String resourceGroupName, String automationAccountName, UUID softwareUpdateConfigurationMachineRunId);

    /**
     * Get a single software update configuration machine run by Id.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param softwareUpdateConfigurationMachineRunId The Id of the software update configuration machine run.
     * @param clientRequestId Identifies this specific client request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a single software update configuration machine run by Id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SoftwareUpdateConfigurationMachineRunInner> getByIdWithResponse(
        String resourceGroupName,
        String automationAccountName,
        UUID softwareUpdateConfigurationMachineRunId,
        String clientRequestId,
        Context context);

    /**
     * Return list of software update configuration machine runs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing all software update configuration machine runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SoftwareUpdateConfigurationMachineRunListResultInner list(String resourceGroupName, String automationAccountName);

    /**
     * Return list of software update configuration machine runs.
     *
     * @param resourceGroupName Name of an Azure Resource group.
     * @param automationAccountName The name of the automation account.
     * @param clientRequestId Identifies this specific client request.
     * @param filter The filter to apply on the operation. You can use the following filters: 'properties/osType',
     *     'properties/status', 'properties/startTime', and 'properties/softwareUpdateConfiguration/name'.
     * @param skip number of entries you skip before returning results.
     * @param top Maximum number of entries returned in the results collection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of listing all software update configuration machine runs.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SoftwareUpdateConfigurationMachineRunListResultInner> listWithResponse(
        String resourceGroupName,
        String automationAccountName,
        String clientRequestId,
        String filter,
        String skip,
        String top,
        Context context);
}