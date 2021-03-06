// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loadtestservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.loadtestservice.fluent.models.LoadTestResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of resources page result. */
@Fluent
public final class LoadTestResourcePageList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadTestResourcePageList.class);

    /*
     * List of resources in current page.
     */
    @JsonProperty(value = "value")
    private List<LoadTestResourceInner> value;

    /*
     * Link to next page of resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of resources in current page.
     *
     * @return the value value.
     */
    public List<LoadTestResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of resources in current page.
     *
     * @param value the value value to set.
     * @return the LoadTestResourcePageList object itself.
     */
    public LoadTestResourcePageList withValue(List<LoadTestResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to next page of resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to next page of resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the LoadTestResourcePageList object itself.
     */
    public LoadTestResourcePageList withNextLink(String nextLink) {
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
