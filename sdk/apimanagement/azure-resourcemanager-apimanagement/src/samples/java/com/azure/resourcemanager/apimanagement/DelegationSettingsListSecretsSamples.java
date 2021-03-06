// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for DelegationSettings ListSecrets. */
public final class DelegationSettingsListSecretsSamples {
    /*
     * operationId: DelegationSettings_ListSecrets
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListSecretsPortalSettings
     */
    /**
     * Sample code: ApiManagementListSecretsPortalSettings.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListSecretsPortalSettings(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.delegationSettings().listSecretsWithResponse("rg1", "apimService1", Context.NONE);
    }
}
