// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Delete. */
public final class PrivateEndpointConnectionsDeleteSamples {
    /*
     * x-ms-original-file: specification/videoanalyzer/resource-manager/Microsoft.Media/preview/2021-11-01-preview/examples/video-analyzer-private-endpoint-connection-delete.json
     */
    /**
     * Sample code: Delete private endpoint connection.
     *
     * @param manager Entry point to VideoAnalyzerManager.
     */
    public static void deletePrivateEndpointConnection(
        com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager) {
        manager
            .privateEndpointConnections()
            .deleteWithResponse("contoso", "contososports", "connectionName1", Context.NONE);
    }
}
