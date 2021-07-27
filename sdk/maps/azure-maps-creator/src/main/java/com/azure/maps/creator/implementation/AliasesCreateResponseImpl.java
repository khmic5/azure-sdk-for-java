// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.implementation;

import com.azure.maps.creator.fluent.models.AliasesCreateResponseInner;
import com.azure.maps.creator.models.AliasesCreateResponse;

public final class AliasesCreateResponseImpl implements AliasesCreateResponse {
    private AliasesCreateResponseInner innerObject;

    private final com.azure.maps.creator.CreatorManager serviceManager;

    AliasesCreateResponseImpl(
        AliasesCreateResponseInner innerObject, com.azure.maps.creator.CreatorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String createdTimestamp() {
        return this.innerModel().createdTimestamp();
    }

    public String aliasId() {
        return this.innerModel().aliasId();
    }

    public String creatorDataItemId() {
        return this.innerModel().creatorDataItemId();
    }

    public String lastUpdatedTimestamp() {
        return this.innerModel().lastUpdatedTimestamp();
    }

    public AliasesCreateResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.maps.creator.CreatorManager manager() {
        return this.serviceManager;
    }
}
