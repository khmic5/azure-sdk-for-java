// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.timezone.implementation;

import com.azure.maps.timezone.fluent.models.IanaIdInner;
import com.azure.maps.timezone.models.IanaId;

public final class IanaIdImpl implements IanaId {
    private IanaIdInner innerObject;

    private final com.azure.maps.timezone.TimezoneManager serviceManager;

    IanaIdImpl(IanaIdInner innerObject, com.azure.maps.timezone.TimezoneManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public Boolean isAlias() {
        return this.innerModel().isAlias();
    }

    public String aliasOf() {
        return this.innerModel().aliasOf();
    }

    public Boolean hasZone1970Location() {
        return this.innerModel().hasZone1970Location();
    }

    public IanaIdInner innerModel() {
        return this.innerObject;
    }

    private com.azure.maps.timezone.TimezoneManager manager() {
        return this.serviceManager;
    }
}
