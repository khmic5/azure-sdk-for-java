// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Diagnostic Get. */
public final class DiagnosticGetSamples {
    /*
     * operationId: Diagnostic_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetDiagnostic
     */
    /**
     * Sample code: ApiManagementGetDiagnostic.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetDiagnostic(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager.diagnostics().getWithResponse("rg1", "apimService1", "applicationinsights", Context.NONE);
    }
}
