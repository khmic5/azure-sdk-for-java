// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Detailed information for the alias. */
@Immutable
public final class AliasListItemInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AliasListItemInner.class);

    /*
     * The created timestamp for the alias.
     */
    @JsonProperty(value = "createdTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private String createdTimestamp;

    /*
     * The id for the alias.
     */
    @JsonProperty(value = "aliasId", access = JsonProperty.Access.WRITE_ONLY)
    private String aliasId;

    /*
     * The id for the creator data item that this alias references (could be
     * null if the alias has not been assigned).
     */
    @JsonProperty(value = "creatorDataItemId", access = JsonProperty.Access.WRITE_ONLY)
    private String creatorDataItemId;

    /*
     * The timestamp of the last time the alias was assigned.
     */
    @JsonProperty(value = "lastUpdatedTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTimestamp;

    /**
     * Get the createdTimestamp property: The created timestamp for the alias.
     *
     * @return the createdTimestamp value.
     */
    public String createdTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * Get the aliasId property: The id for the alias.
     *
     * @return the aliasId value.
     */
    public String aliasId() {
        return this.aliasId;
    }

    /**
     * Get the creatorDataItemId property: The id for the creator data item that this alias references (could be null if
     * the alias has not been assigned).
     *
     * @return the creatorDataItemId value.
     */
    public String creatorDataItemId() {
        return this.creatorDataItemId;
    }

    /**
     * Get the lastUpdatedTimestamp property: The timestamp of the last time the alias was assigned.
     *
     * @return the lastUpdatedTimestamp value.
     */
    public OffsetDateTime lastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
