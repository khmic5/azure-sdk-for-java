// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ApiIssueComment ListByService. */
public final class ApiIssueCommentListByServiceSamples {
    /*
     * operationId: ApiIssueComment_ListByService
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListApiIssueComments
     */
    /**
     * Sample code: ApiManagementListApiIssueComments.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListApiIssueComments(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiIssueComments()
            .listByService(
                "rg1",
                "apimService1",
                "57d1f7558aa04f15146d9d8a",
                "57d2ef278aa04f0ad01d6cdc",
                null,
                null,
                null,
                Context.NONE);
    }
}
