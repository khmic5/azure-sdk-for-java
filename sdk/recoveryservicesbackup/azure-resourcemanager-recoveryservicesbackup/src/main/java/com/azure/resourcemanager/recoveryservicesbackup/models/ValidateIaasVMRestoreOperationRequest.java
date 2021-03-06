// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** AzureRestoreValidation request. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("ValidateIaasVMRestoreOperationRequest")
@Fluent
public final class ValidateIaasVMRestoreOperationRequest extends ValidateRestoreOperationRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateIaasVMRestoreOperationRequest.class);

    /** {@inheritDoc} */
    @Override
    public ValidateIaasVMRestoreOperationRequest withRestoreRequest(RestoreRequest restoreRequest) {
        super.withRestoreRequest(restoreRequest);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
