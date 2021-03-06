// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information on a specific package upgrade download. */
@Immutable
public final class UpgradePackageDownloadInfo extends PackageDownloadInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpgradePackageDownloadInfo.class);

    /*
     * Minimum base version for upgrade
     */
    @JsonProperty(value = "fromVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String fromVersion;

    /**
     * Get the fromVersion property: Minimum base version for upgrade.
     *
     * @return the fromVersion value.
     */
    public String fromVersion() {
        return this.fromVersion;
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
