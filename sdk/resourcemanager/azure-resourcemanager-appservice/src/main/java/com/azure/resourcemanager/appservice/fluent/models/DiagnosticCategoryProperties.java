// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DiagnosticCategory resource specific properties. */
@Immutable
public final class DiagnosticCategoryProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticCategoryProperties.class);

    /*
     * Description of the diagnostic category
     */
    @JsonProperty(value = "description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * Get the description property: Description of the diagnostic category.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
