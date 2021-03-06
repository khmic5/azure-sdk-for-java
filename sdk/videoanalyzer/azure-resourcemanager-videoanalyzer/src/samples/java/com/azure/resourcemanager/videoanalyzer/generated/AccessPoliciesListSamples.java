// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for AccessPolicies List. */
public final class AccessPoliciesListSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/access-policy-list.json
     */
    /**
     * Sample code: Lists access policy entities.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void listsAccessPolicyEntities(com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager.accessPolicies().list("testrg", "testaccount2", 2, Context.NONE);
    }
}
