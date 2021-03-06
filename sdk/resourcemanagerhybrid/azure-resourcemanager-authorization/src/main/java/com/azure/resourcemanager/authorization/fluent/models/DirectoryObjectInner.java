// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Represents an Azure Active Directory object. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "objectType",
    defaultImpl = DirectoryObjectInner.class)
@JsonTypeName("DirectoryObject")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "User", value = UserInner.class),
    @JsonSubTypes.Type(name = "Application", value = ApplicationInner.class),
    @JsonSubTypes.Type(name = "Group", value = ADGroupInner.class),
    @JsonSubTypes.Type(name = "ServicePrincipal", value = ServicePrincipalInner.class),
    @JsonSubTypes.Type(name = "AppRoleAssignment", value = AppRoleAssignmentInner.class)
})
@Fluent
public class DirectoryObjectInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DirectoryObjectInner.class);

    /*
     * The object ID.
     */
    @JsonProperty(value = "objectId", access = JsonProperty.Access.WRITE_ONLY)
    private String objectId;

    /*
     * The time at which the directory object was deleted.
     */
    @JsonProperty(value = "deletionTimestamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime deletionTimestamp;

    /*
     * Represents an Azure Active Directory object.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the objectId property: The object ID.
     *
     * @return the objectId value.
     */
    public String objectId() {
        return this.objectId;
    }

    /**
     * Get the deletionTimestamp property: The time at which the directory object was deleted.
     *
     * @return the deletionTimestamp value.
     */
    public OffsetDateTime deletionTimestamp() {
        return this.deletionTimestamp;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the DirectoryObjectInner object itself.
     */
    public DirectoryObjectInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
