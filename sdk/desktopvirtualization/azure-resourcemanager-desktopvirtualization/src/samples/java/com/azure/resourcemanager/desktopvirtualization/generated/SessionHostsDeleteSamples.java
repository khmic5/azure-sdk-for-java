// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.Context;

/** Samples for SessionHosts Delete. */
public final class SessionHostsDeleteSamples {
    /*
     * x-ms-original-file: specification/desktopvirtualization/resource-manager/Microsoft.DesktopVirtualization/preview/2021-09-03-preview/examples/SessionHost_Delete.json
     */
    /**
     * Sample code: SessionHost_Delete.
     *
     * @param manager Entry point to DesktopVirtualizationManager.
     */
    public static void sessionHostDelete(
        com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager manager) {
        manager
            .sessionHosts()
            .deleteWithResponse("resourceGroup1", "hostPool1", "sessionHost1.microsoft.com", true, Context.NONE);
    }
}
