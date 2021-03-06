// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices;

import com.azure.core.util.Context;

/** Samples for StreamingLocators Delete. */
public final class StreamingLocatorsDeleteSamples {
    /**
     * Sample code: Delete a Streaming Locator.
     *
     * @param mediaServicesManager Entry point to MediaServicesManager. This Swagger was generated by the API Framework.
     */
    public static void deleteAStreamingLocator(
        com.azure.resourcemanager.mediaservices.MediaServicesManager mediaServicesManager) {
        mediaServicesManager
            .streamingLocators()
            .deleteWithResponse("contoso", "contosomedia", "clearStreamingLocator", Context.NONE);
    }
}
