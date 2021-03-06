// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appconfiguration;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnections Get. */
public final class PrivateEndpointConnectionsGetSamples {
    /**
     * Sample code: PrivateEndpointConnection_GetConnection.
     *
     * @param appConfigurationManager Entry point to AppConfigurationManager.
     */
    public static void privateEndpointConnectionGetConnection(
        com.azure.resourcemanager.appconfiguration.AppConfigurationManager appConfigurationManager) {
        appConfigurationManager
            .privateEndpointConnections()
            .getWithResponse("myResourceGroup", "contoso", "myConnection", Context.NONE);
    }
}
