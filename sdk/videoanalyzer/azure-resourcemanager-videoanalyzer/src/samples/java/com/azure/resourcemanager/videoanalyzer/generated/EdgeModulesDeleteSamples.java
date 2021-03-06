// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for EdgeModules Delete. */
public final class EdgeModulesDeleteSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/edge-modules-delete.json
     */
    /**
     * Sample code: Deletes an edge module registration.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void deletesAnEdgeModuleRegistration(
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager.edgeModules().deleteWithResponse("testrg", "testaccount2", "edgeModule1", Context.NONE);
    }
}
