// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Azure SQL workload-specific backup policy. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "backupManagementType")
@JsonTypeName("AzureSql")
@Fluent
public final class AzureSqlProtectionPolicy extends ProtectionPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureSqlProtectionPolicy.class);

    /*
     * Retention policy details.
     */
    @JsonProperty(value = "retentionPolicy")
    private RetentionPolicy retentionPolicy;

    /**
     * Get the retentionPolicy property: Retention policy details.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicy retentionPolicy() {
        return this.retentionPolicy;
    }

    /**
     * Set the retentionPolicy property: Retention policy details.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the AzureSqlProtectionPolicy object itself.
     */
    public AzureSqlProtectionPolicy withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectionPolicy withProtectedItemsCount(Integer protectedItemsCount) {
        super.withProtectedItemsCount(protectedItemsCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureSqlProtectionPolicy withResourceGuardOperationRequests(List<String> resourceGuardOperationRequests) {
        super.withResourceGuardOperationRequests(resourceGuardOperationRequests);
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
        if (retentionPolicy() != null) {
            retentionPolicy().validate();
        }
    }
}
