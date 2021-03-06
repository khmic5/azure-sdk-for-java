// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

import com.azure.core.util.Context;

/** Samples for BestPractices Get. */
public final class BestPracticesGetSamples {
    /*
     * x-ms-original-file: specification/automanage/resource-manager/Microsoft.Automanage/preview/2021-04-30-preview/examples/getBestPractice.json
     */
    /**
     * Sample code: Get an Automanage best practice.
     *
     * @param manager Entry point to AutomanageManager.
     */
    public static void getAnAutomanageBestPractice(com.azure.resourcemanager.automanage.AutomanageManager manager) {
        manager.bestPractices().getWithResponse("azureBestPracticesProduction", Context.NONE);
    }
}
