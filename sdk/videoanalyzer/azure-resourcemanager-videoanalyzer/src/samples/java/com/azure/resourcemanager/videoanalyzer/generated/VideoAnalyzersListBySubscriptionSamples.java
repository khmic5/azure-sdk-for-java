// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for VideoAnalyzers ListBySubscription. */
public final class VideoAnalyzersListBySubscriptionSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/video-analyzer-accounts-subscription-list-all-accounts.json
     */
    /**
     * Sample code: List all Video Analyzer accounts in the specified subscription.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void listAllVideoAnalyzerAccountsInTheSpecifiedSubscription(
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager.videoAnalyzers().listBySubscriptionWithResponse(Context.NONE);
    }
}
