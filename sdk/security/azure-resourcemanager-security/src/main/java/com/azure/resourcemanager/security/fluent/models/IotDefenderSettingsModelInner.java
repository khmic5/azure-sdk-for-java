// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.models.OnboardingKind;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** IoT Defender settings. */
@JsonFlatten
@Fluent
public class IotDefenderSettingsModelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotDefenderSettingsModelInner.class);

    /*
     * Size of the device quota (as a opposed to a Pay as You Go billing
     * model). Value is required to be in multiples of 1000.
     */
    @JsonProperty(value = "properties.deviceQuota")
    private Integer deviceQuota;

    /*
     * Sentinel Workspace Resource Ids
     */
    @JsonProperty(value = "properties.sentinelWorkspaceResourceIds")
    private List<String> sentinelWorkspaceResourceIds;

    /*
     * The kind of onboarding for the subscription
     */
    @JsonProperty(value = "properties.onboardingKind")
    private OnboardingKind onboardingKind;

    /*
     * End time of the evaluation period, if such exist
     */
    @JsonProperty(value = "properties.evaluationEndTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime evaluationEndTime;

    /**
     * Get the deviceQuota property: Size of the device quota (as a opposed to a Pay as You Go billing model). Value is
     * required to be in multiples of 1000.
     *
     * @return the deviceQuota value.
     */
    public Integer deviceQuota() {
        return this.deviceQuota;
    }

    /**
     * Set the deviceQuota property: Size of the device quota (as a opposed to a Pay as You Go billing model). Value is
     * required to be in multiples of 1000.
     *
     * @param deviceQuota the deviceQuota value to set.
     * @return the IotDefenderSettingsModelInner object itself.
     */
    public IotDefenderSettingsModelInner withDeviceQuota(Integer deviceQuota) {
        this.deviceQuota = deviceQuota;
        return this;
    }

    /**
     * Get the sentinelWorkspaceResourceIds property: Sentinel Workspace Resource Ids.
     *
     * @return the sentinelWorkspaceResourceIds value.
     */
    public List<String> sentinelWorkspaceResourceIds() {
        return this.sentinelWorkspaceResourceIds;
    }

    /**
     * Set the sentinelWorkspaceResourceIds property: Sentinel Workspace Resource Ids.
     *
     * @param sentinelWorkspaceResourceIds the sentinelWorkspaceResourceIds value to set.
     * @return the IotDefenderSettingsModelInner object itself.
     */
    public IotDefenderSettingsModelInner withSentinelWorkspaceResourceIds(List<String> sentinelWorkspaceResourceIds) {
        this.sentinelWorkspaceResourceIds = sentinelWorkspaceResourceIds;
        return this;
    }

    /**
     * Get the onboardingKind property: The kind of onboarding for the subscription.
     *
     * @return the onboardingKind value.
     */
    public OnboardingKind onboardingKind() {
        return this.onboardingKind;
    }

    /**
     * Set the onboardingKind property: The kind of onboarding for the subscription.
     *
     * @param onboardingKind the onboardingKind value to set.
     * @return the IotDefenderSettingsModelInner object itself.
     */
    public IotDefenderSettingsModelInner withOnboardingKind(OnboardingKind onboardingKind) {
        this.onboardingKind = onboardingKind;
        return this;
    }

    /**
     * Get the evaluationEndTime property: End time of the evaluation period, if such exist.
     *
     * @return the evaluationEndTime value.
     */
    public OffsetDateTime evaluationEndTime() {
        return this.evaluationEndTime;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
