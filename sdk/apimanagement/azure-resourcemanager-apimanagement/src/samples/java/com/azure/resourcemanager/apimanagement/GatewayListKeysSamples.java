// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Gateway ListKeys. */
public final class GatewayListKeysSamples {
    /*
     * operationId: Gateway_ListKeys
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGatewayListKeys
     */
    /**
     * Sample code: ApiManagementGatewayListKeys.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGatewayListKeys(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.gateways().listKeysWithResponse("rg1", "apimService1", "gw1", Context.NONE);
    }
}
