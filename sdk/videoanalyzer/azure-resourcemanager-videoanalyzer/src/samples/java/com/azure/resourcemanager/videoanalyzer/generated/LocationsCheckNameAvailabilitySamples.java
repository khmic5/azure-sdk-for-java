// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.models.CheckNameAvailabilityRequest;

/** Samples for Locations CheckNameAvailability. */
public final class LocationsCheckNameAvailabilitySamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/accounts-check-name-availability.json
     */
    /**
     * Sample code: Check Name Availability.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void checkNameAvailability(com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager
            .locations()
            .checkNameAvailabilityWithResponse(
                "japanwest",
                new CheckNameAvailabilityRequest().withName("contosotv").withType("videoAnalyzers"),
                Context.NONE);
    }
}
