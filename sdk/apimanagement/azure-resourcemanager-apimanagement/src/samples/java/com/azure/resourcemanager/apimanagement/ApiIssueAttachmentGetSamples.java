// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;

/** Samples for ApiIssueAttachment Get. */
public final class ApiIssueAttachmentGetSamples {
    /*
     * operationId: ApiIssueAttachment_Get
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementGetApiIssueAttachment
     */
    /**
     * Sample code: ApiManagementGetApiIssueAttachment.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementGetApiIssueAttachment(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .apiIssueAttachments()
            .getWithResponse(
                "rg1",
                "apimService1",
                "57d2ef278aa04f0888cba3f3",
                "57d2ef278aa04f0ad01d6cdc",
                "57d2ef278aa04f0888cba3f3",
                Context.NONE);
    }
}
