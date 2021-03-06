// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.imagebuilder.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.imagebuilder.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents an output that was created by running an image template. */
@Fluent
public final class RunOutputInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunOutputInner.class);

    /*
     * The properties of the run output
     */
    @JsonProperty(value = "properties")
    private RunOutputProperties innerProperties;

    /*
     * Resource name
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Resource type
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: The properties of the run output.
     *
     * @return the innerProperties value.
     */
    private RunOutputProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Resource name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name.
     *
     * @param name the name value to set.
     * @return the RunOutputInner object itself.
     */
    public RunOutputInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public RunOutputInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the artifactId property: The resource id of the artifact.
     *
     * @return the artifactId value.
     */
    public String artifactId() {
        return this.innerProperties() == null ? null : this.innerProperties().artifactId();
    }

    /**
     * Set the artifactId property: The resource id of the artifact.
     *
     * @param artifactId the artifactId value to set.
     * @return the RunOutputInner object itself.
     */
    public RunOutputInner withArtifactId(String artifactId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunOutputProperties();
        }
        this.innerProperties().withArtifactId(artifactId);
        return this;
    }

    /**
     * Get the artifactUri property: The location URI of the artifact.
     *
     * @return the artifactUri value.
     */
    public String artifactUri() {
        return this.innerProperties() == null ? null : this.innerProperties().artifactUri();
    }

    /**
     * Set the artifactUri property: The location URI of the artifact.
     *
     * @param artifactUri the artifactUri value to set.
     * @return the RunOutputInner object itself.
     */
    public RunOutputInner withArtifactUri(String artifactUri) {
        if (this.innerProperties() == null) {
            this.innerProperties = new RunOutputProperties();
        }
        this.innerProperties().withArtifactUri(artifactUri);
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model RunOutputInner"));
        }
    }
}
