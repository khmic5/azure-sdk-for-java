// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Data Explorer command activity properties. */
@Fluent
public final class AzureDataExplorerCommandActivityTypeProperties {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(AzureDataExplorerCommandActivityTypeProperties.class);

    /*
     * A control command, according to the Azure Data Explorer command syntax.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "command", required = true)
    private Object command;

    /*
     * Control command timeout. Type: string (or Expression with resultType
     * string), pattern:
     * ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..)
     */
    @JsonProperty(value = "commandTimeout")
    private Object commandTimeout;

    /**
     * Get the command property: A control command, according to the Azure Data Explorer command syntax. Type: string
     * (or Expression with resultType string).
     *
     * @return the command value.
     */
    public Object command() {
        return this.command;
    }

    /**
     * Set the command property: A control command, according to the Azure Data Explorer command syntax. Type: string
     * (or Expression with resultType string).
     *
     * @param command the command value to set.
     * @return the AzureDataExplorerCommandActivityTypeProperties object itself.
     */
    public AzureDataExplorerCommandActivityTypeProperties withCommand(Object command) {
        this.command = command;
        return this;
    }

    /**
     * Get the commandTimeout property: Control command timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..).
     *
     * @return the commandTimeout value.
     */
    public Object commandTimeout() {
        return this.commandTimeout;
    }

    /**
     * Set the commandTimeout property: Control command timeout. Type: string (or Expression with resultType string),
     * pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9]))..).
     *
     * @param commandTimeout the commandTimeout value to set.
     * @return the AzureDataExplorerCommandActivityTypeProperties object itself.
     */
    public AzureDataExplorerCommandActivityTypeProperties withCommandTimeout(Object commandTimeout) {
        this.commandTimeout = commandTimeout;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (command() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property command in model AzureDataExplorerCommandActivityTypeProperties"));
        }
    }
}
