// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.implementation;

import com.azure.maps.creator.fluent.models.StatesetCreatedResponseInner;
import com.azure.maps.creator.models.StatesetCreatedResponse;

public final class StatesetCreatedResponseImpl implements StatesetCreatedResponse {
    private StatesetCreatedResponseInner innerObject;

    private final com.azure.maps.creator.CreatorManager serviceManager;

    StatesetCreatedResponseImpl(
        StatesetCreatedResponseInner innerObject, com.azure.maps.creator.CreatorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String statesetId() {
        return this.innerModel().statesetId();
    }

    public StatesetCreatedResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.maps.creator.CreatorManager manager() {
        return this.serviceManager;
    }
}
