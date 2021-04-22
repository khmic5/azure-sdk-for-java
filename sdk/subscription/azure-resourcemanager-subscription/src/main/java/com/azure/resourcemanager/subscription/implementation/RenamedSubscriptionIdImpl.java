// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.subscription.implementation;

import com.azure.resourcemanager.subscription.fluent.models.RenamedSubscriptionIdInner;
import com.azure.resourcemanager.subscription.models.RenamedSubscriptionId;

public final class RenamedSubscriptionIdImpl implements RenamedSubscriptionId {
    private RenamedSubscriptionIdInner innerObject;

    private final com.azure.resourcemanager.subscription.SubscriptionManager serviceManager;

    RenamedSubscriptionIdImpl(
        RenamedSubscriptionIdInner innerObject,
        com.azure.resourcemanager.subscription.SubscriptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String value() {
        return this.innerModel().value();
    }

    public RenamedSubscriptionIdInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.subscription.SubscriptionManager manager() {
        return this.serviceManager;
    }
}