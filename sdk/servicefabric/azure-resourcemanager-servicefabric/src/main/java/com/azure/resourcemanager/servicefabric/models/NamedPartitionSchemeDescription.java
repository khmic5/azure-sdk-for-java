// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Describes the named partition scheme of the service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "partitionScheme")
@JsonTypeName("Named")
@Fluent
public final class NamedPartitionSchemeDescription extends PartitionSchemeDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NamedPartitionSchemeDescription.class);

    /*
     * The number of partitions.
     */
    @JsonProperty(value = "Count", required = true)
    private int count;

    /*
     * Array of size specified by the ‘Count’ parameter, for the names of the
     * partitions.
     */
    @JsonProperty(value = "Names", required = true)
    private List<String> names;

    /**
     * Get the count property: The number of partitions.
     *
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: The number of partitions.
     *
     * @param count the count value to set.
     * @return the NamedPartitionSchemeDescription object itself.
     */
    public NamedPartitionSchemeDescription withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the names property: Array of size specified by the ‘Count’ parameter, for the names of the partitions.
     *
     * @return the names value.
     */
    public List<String> names() {
        return this.names;
    }

    /**
     * Set the names property: Array of size specified by the ‘Count’ parameter, for the names of the partitions.
     *
     * @param names the names value to set.
     * @return the NamedPartitionSchemeDescription object itself.
     */
    public NamedPartitionSchemeDescription withNames(List<String> names) {
        this.names = names;
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
        if (names() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property names in model NamedPartitionSchemeDescription"));
        }
    }
}