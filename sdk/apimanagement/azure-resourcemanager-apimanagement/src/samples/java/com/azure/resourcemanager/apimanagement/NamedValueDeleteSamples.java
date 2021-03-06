// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for NamedValue Delete. */
public final class NamedValueDeleteSamples {
    /*
     * operationId: NamedValue_Delete
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementDeleteNamedValue
     */
    /**
     * Sample code: ApiManagementDeleteNamedValue.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementDeleteNamedValue(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.namedValues().deleteWithResponse("rg1", "apimService1", "testprop2", "*", Context.NONE);
    }
}
