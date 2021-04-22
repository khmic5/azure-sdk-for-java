// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.notificationhubs.fluent.models.NotificationHubResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List NotificationHub operation. */
@Fluent
public final class NotificationHubListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NotificationHubListResult.class);

    /*
     * Result of the List NotificationHub operation.
     */
    @JsonProperty(value = "value")
    private List<NotificationHubResourceInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of NotificationHub
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List NotificationHub operation.
     *
     * @return the value value.
     */
    public List<NotificationHubResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List NotificationHub operation.
     *
     * @param value the value value to set.
     * @return the NotificationHubListResult object itself.
     */
    public NotificationHubListResult withValue(List<NotificationHubResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * NotificationHub.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * NotificationHub.
     *
     * @param nextLink the nextLink value to set.
     * @return the NotificationHubListResult object itself.
     */
    public NotificationHubListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}