// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for Reports ListByOperation. */
public final class ReportsListByOperationSamples {
    /*
     * operationId: Reports_ListByOperation
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetReportsByOperation
     */
    /**
     * Sample code: ApiManagementGetReportsByOperation.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetReportsByOperation(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .reports()
            .listByOperation(
                "rg1",
                "apimService1",
                "timestamp ge datetime'2017-06-01T00:00:00' and timestamp le datetime'2017-06-04T00:00:00'",
                null,
                null,
                null,
                Context.NONE);
    }
}
