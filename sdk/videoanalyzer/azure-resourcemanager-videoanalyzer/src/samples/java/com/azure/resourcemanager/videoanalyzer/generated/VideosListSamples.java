// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for Videos List. */
public final class VideosListSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/video-list.json
     */
    /**
     * Sample code: Lists video entities.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void listsVideoEntities(com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager.videos().list("testrg", "testaccount2", 2, Context.NONE);
    }
}
