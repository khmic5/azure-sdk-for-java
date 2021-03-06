// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.models.IoTSecurityAggregatedRecommendationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of IoT Security solution aggregated recommendations. */
@Fluent
public final class IoTSecurityAggregatedRecommendationList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IoTSecurityAggregatedRecommendationList.class);

    /*
     * List of aggregated recommendations data.
     */
    @JsonProperty(value = "value", required = true)
    private List<IoTSecurityAggregatedRecommendationInner> value;

    /*
     * When there is too much alert data for one page, use this URI to fetch
     * the next page.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: List of aggregated recommendations data.
     *
     * @return the value value.
     */
    public List<IoTSecurityAggregatedRecommendationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of aggregated recommendations data.
     *
     * @param value the value value to set.
     * @return the IoTSecurityAggregatedRecommendationList object itself.
     */
    public IoTSecurityAggregatedRecommendationList withValue(List<IoTSecurityAggregatedRecommendationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: When there is too much alert data for one page, use this URI to fetch the next page.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model IoTSecurityAggregatedRecommendationList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
