// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;

/** Samples for ResourceGuards GetUpdateProtectedItemRequestsObjects. */
public final class ResourceGuardsGetUpdateProtectedItemRequestsObjectsSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/ResourceGuardCRUD/ListUpdateProtectedItemRequests.json
     */
    /**
     * Sample code: List OperationsRequestObject.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void listOperationsRequestObject(
        com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .resourceGuards()
            .getUpdateProtectedItemRequestsObjects("SampleResourceGroup", "swaggerExample", Context.NONE);
    }
}
