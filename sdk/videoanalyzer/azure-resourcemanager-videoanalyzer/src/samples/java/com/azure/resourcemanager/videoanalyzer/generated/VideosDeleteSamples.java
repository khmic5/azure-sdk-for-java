// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for Videos Delete. */
public final class VideosDeleteSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/video-delete.json
     */
    /**
     * Sample code: Deletes a video entity.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void deletesAVideoEntity(com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager.videos().deleteWithResponse("testrg", "testaccount2", "video1", Context.NONE);
    }
}
