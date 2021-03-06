// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Role Assignments. */
@Fluent
public final class RoleAssignmentInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoleAssignmentInner.class);

    /*
     * The role assignment ID.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The role assignment name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The role assignment type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * Role assignment properties.
     */
    @JsonProperty(value = "properties")
    private RoleAssignmentPropertiesWithScope innerProperties;

    /**
     * Get the id property: The role assignment ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The role assignment name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The role assignment type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: Role assignment properties.
     *
     * @return the innerProperties value.
     */
    private RoleAssignmentPropertiesWithScope innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the scope property: The role assignment scope.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Set the scope property: The role assignment scope.
     *
     * @param scope the scope value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withScope(String scope) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentPropertiesWithScope();
        }
        this.innerProperties().withScope(scope);
        return this;
    }

    /**
     * Get the roleDefinitionId property: The role definition ID.
     *
     * @return the roleDefinitionId value.
     */
    public String roleDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().roleDefinitionId();
    }

    /**
     * Set the roleDefinitionId property: The role definition ID.
     *
     * @param roleDefinitionId the roleDefinitionId value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withRoleDefinitionId(String roleDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentPropertiesWithScope();
        }
        this.innerProperties().withRoleDefinitionId(roleDefinitionId);
        return this;
    }

    /**
     * Get the principalId property: The principal ID.
     *
     * @return the principalId value.
     */
    public String principalId() {
        return this.innerProperties() == null ? null : this.innerProperties().principalId();
    }

    /**
     * Set the principalId property: The principal ID.
     *
     * @param principalId the principalId value to set.
     * @return the RoleAssignmentInner object itself.
     */
    public RoleAssignmentInner withPrincipalId(String principalId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RoleAssignmentPropertiesWithScope();
        }
        this.innerProperties().withPrincipalId(principalId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
