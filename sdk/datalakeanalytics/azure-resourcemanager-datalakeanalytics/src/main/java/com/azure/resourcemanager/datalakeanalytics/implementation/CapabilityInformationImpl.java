// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.implementation;

import com.azure.resourcemanager.datalakeanalytics.fluent.models.CapabilityInformationInner;
import com.azure.resourcemanager.datalakeanalytics.models.CapabilityInformation;
import com.azure.resourcemanager.datalakeanalytics.models.SubscriptionState;
import java.util.UUID;

public final class CapabilityInformationImpl implements CapabilityInformation {
    private CapabilityInformationInner innerObject;

    private final com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager;

    CapabilityInformationImpl(
        CapabilityInformationInner innerObject,
        com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public UUID subscriptionId() {
        return this.innerModel().subscriptionId();
    }

    public SubscriptionState state() {
        return this.innerModel().state();
    }

    public Integer maxAccountCount() {
        return this.innerModel().maxAccountCount();
    }

    public Integer accountCount() {
        return this.innerModel().accountCount();
    }

    public Boolean migrationState() {
        return this.innerModel().migrationState();
    }

    public CapabilityInformationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.datalakeanalytics.DataLakeAnalyticsManager manager() {
        return this.serviceManager;
    }
}