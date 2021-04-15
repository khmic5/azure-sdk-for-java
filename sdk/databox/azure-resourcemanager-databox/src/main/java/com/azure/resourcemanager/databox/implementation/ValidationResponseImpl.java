// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.implementation;

import com.azure.resourcemanager.databox.fluent.models.ValidationResponseInner;
import com.azure.resourcemanager.databox.models.OverallValidationStatus;
import com.azure.resourcemanager.databox.models.ValidationInputResponse;
import com.azure.resourcemanager.databox.models.ValidationResponse;
import java.util.Collections;
import java.util.List;

public final class ValidationResponseImpl implements ValidationResponse {
    private ValidationResponseInner innerObject;

    private final com.azure.resourcemanager.databox.DataBoxManager serviceManager;

    ValidationResponseImpl(
        ValidationResponseInner innerObject, com.azure.resourcemanager.databox.DataBoxManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OverallValidationStatus status() {
        return this.innerModel().status();
    }

    public List<ValidationInputResponse> individualResponseDetails() {
        List<ValidationInputResponse> inner = this.innerModel().individualResponseDetails();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ValidationResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databox.DataBoxManager manager() {
        return this.serviceManager;
    }
}