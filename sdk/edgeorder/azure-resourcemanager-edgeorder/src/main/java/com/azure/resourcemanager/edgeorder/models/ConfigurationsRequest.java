// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Configuration request object. */
@Fluent
public final class ConfigurationsRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConfigurationsRequest.class);

    /*
     * Holds details about product hierarchy information and filterable
     * property.
     */
    @JsonProperty(value = "configurationFilters", required = true)
    private List<ConfigurationFilters> configurationFilters;

    /*
     * Customer subscription properties. Clients can display available products
     * to unregistered customers by explicitly passing subscription details
     */
    @JsonProperty(value = "customerSubscriptionDetails")
    private CustomerSubscriptionDetails customerSubscriptionDetails;

    /**
     * Get the configurationFilters property: Holds details about product hierarchy information and filterable property.
     *
     * @return the configurationFilters value.
     */
    public List<ConfigurationFilters> configurationFilters() {
        return this.configurationFilters;
    }

    /**
     * Set the configurationFilters property: Holds details about product hierarchy information and filterable property.
     *
     * @param configurationFilters the configurationFilters value to set.
     * @return the ConfigurationsRequest object itself.
     */
    public ConfigurationsRequest withConfigurationFilters(List<ConfigurationFilters> configurationFilters) {
        this.configurationFilters = configurationFilters;
        return this;
    }

    /**
     * Get the customerSubscriptionDetails property: Customer subscription properties. Clients can display available
     * products to unregistered customers by explicitly passing subscription details.
     *
     * @return the customerSubscriptionDetails value.
     */
    public CustomerSubscriptionDetails customerSubscriptionDetails() {
        return this.customerSubscriptionDetails;
    }

    /**
     * Set the customerSubscriptionDetails property: Customer subscription properties. Clients can display available
     * products to unregistered customers by explicitly passing subscription details.
     *
     * @param customerSubscriptionDetails the customerSubscriptionDetails value to set.
     * @return the ConfigurationsRequest object itself.
     */
    public ConfigurationsRequest withCustomerSubscriptionDetails(
        CustomerSubscriptionDetails customerSubscriptionDetails) {
        this.customerSubscriptionDetails = customerSubscriptionDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (configurationFilters() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property configurationFilters in model ConfigurationsRequest"));
        } else {
            configurationFilters().forEach(e -> e.validate());
        }
        if (customerSubscriptionDetails() != null) {
            customerSubscriptionDetails().validate();
        }
    }
}
