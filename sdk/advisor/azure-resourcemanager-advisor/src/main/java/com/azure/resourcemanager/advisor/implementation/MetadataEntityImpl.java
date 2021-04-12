// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.implementation;

import com.azure.resourcemanager.advisor.fluent.models.MetadataEntityInner;
import com.azure.resourcemanager.advisor.models.MetadataEntity;
import com.azure.resourcemanager.advisor.models.MetadataSupportedValueDetail;
import com.azure.resourcemanager.advisor.models.Scenario;
import java.util.Collections;
import java.util.List;

public final class MetadataEntityImpl implements MetadataEntity {
    private MetadataEntityInner innerObject;

    private final com.azure.resourcemanager.advisor.AdvisorManager serviceManager;

    MetadataEntityImpl(
        MetadataEntityInner innerObject, com.azure.resourcemanager.advisor.AdvisorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public List<String> dependsOn() {
        List<String> inner = this.innerModel().dependsOn();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<Scenario> applicableScenarios() {
        List<Scenario> inner = this.innerModel().applicableScenarios();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<MetadataSupportedValueDetail> supportedValues() {
        List<MetadataSupportedValueDetail> inner = this.innerModel().supportedValues();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public MetadataEntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.advisor.AdvisorManager manager() {
        return this.serviceManager;
    }
}