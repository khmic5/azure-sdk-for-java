// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Gateway Get. */
public final class GatewayGetSamples {
    /*
     * operationId: Gateway_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetGateway
     */
    /**
     * Sample code: ApiManagementGetGateway.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetGateway(com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.gateways().getWithResponse("rg1", "apimService1", "gw1", Context.NONE);
    }
}
