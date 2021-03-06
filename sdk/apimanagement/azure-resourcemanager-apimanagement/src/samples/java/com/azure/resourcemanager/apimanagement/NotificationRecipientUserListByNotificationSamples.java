// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement;

import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.models.NotificationName;

/** Samples for NotificationRecipientUser ListByNotification. */
public final class NotificationRecipientUserListByNotificationSamples {
    /*
     * operationId: NotificationRecipientUser_ListByNotification
     * api-version: 2020-12-01
     * x-ms-examples: ApiManagementListNotificationRecipientUsers
     */
    /**
     * Sample code: ApiManagementListNotificationRecipientUsers.
     *
     * @param manager Entry point to ApiManagementManager.
     */
    public static void apiManagementListNotificationRecipientUsers(
        com.azure.resourcemanager.apimanagement.ApiManagementManager manager) {
        manager
            .notificationRecipientUsers()
            .listByNotificationWithResponse(
                "rg1", "apimService1", NotificationName.REQUEST_PUBLISHER_NOTIFICATION_MESSAGE, Context.NONE);
    }
}
