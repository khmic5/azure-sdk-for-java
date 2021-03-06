// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

import com.azure.core.util.Context;

/** Samples for BestPracticesVersions Get. */
public final class BestPracticesVersionsGetSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/preview/2021-04-30-preview/examples/getBestPracticeVersion.json
     */
    /**
     * Sample code: Get an Automanage best practice version.
     *
     * @param manager Entry point to AutomanageManager.
     */
    public static void getAnAutomanageBestPracticeVersion(
        com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager.bestPracticesVersions().getWithResponse("azureBestPracticesProduction", "version1", Context.NONE);
    }
}
