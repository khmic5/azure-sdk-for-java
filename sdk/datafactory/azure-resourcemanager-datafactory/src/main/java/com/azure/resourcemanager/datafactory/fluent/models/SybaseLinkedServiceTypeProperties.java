// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.SecretBase;
import com.azure.resourcemanager.datafactory.models.SybaseAuthenticationType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sybase linked service properties. */
@Fluent
public final class SybaseLinkedServiceTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SybaseLinkedServiceTypeProperties.class);

    /*
     * Server name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "server", required = true)
    private Object server;

    /*
     * Database name for connection. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "database", required = true)
    private Object database;

    /*
     * Schema name for connection. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "schema")
    private Object schema;

    /*
     * AuthenticationType to be used for connection.
     */
    @JsonProperty(value = "authenticationType")
    private SybaseAuthenticationType authenticationType;

    /*
     * Username for authentication. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "username")
    private Object username;

    /*
     * Password for authentication.
     */
    @JsonProperty(value = "password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the server property: Server name for connection. Type: string (or Expression with resultType string).
     *
     * @return the server value.
     */
    public Object server() {
        return this.server;
    }

    /**
     * Set the server property: Server name for connection. Type: string (or Expression with resultType string).
     *
     * @param server the server value to set.
     * @return the SybaseLinkedServiceTypeProperties object itself.
     */
    public SybaseLinkedServiceTypeProperties withServer(Object server) {
        this.server = server;
        return this;
    }

    /**
     * Get the database property: Database name for connection. Type: string (or Expression with resultType string).
     *
     * @return the database value.
     */
    public Object database() {
        return this.database;
    }

    /**
     * Set the database property: Database name for connection. Type: string (or Expression with resultType string).
     *
     * @param database the database value to set.
     * @return the SybaseLinkedServiceTypeProperties object itself.
     */
    public SybaseLinkedServiceTypeProperties withDatabase(Object database) {
        this.database = database;
        return this;
    }

    /**
     * Get the schema property: Schema name for connection. Type: string (or Expression with resultType string).
     *
     * @return the schema value.
     */
    public Object schema() {
        return this.schema;
    }

    /**
     * Set the schema property: Schema name for connection. Type: string (or Expression with resultType string).
     *
     * @param schema the schema value to set.
     * @return the SybaseLinkedServiceTypeProperties object itself.
     */
    public SybaseLinkedServiceTypeProperties withSchema(Object schema) {
        this.schema = schema;
        return this;
    }

    /**
     * Get the authenticationType property: AuthenticationType to be used for connection.
     *
     * @return the authenticationType value.
     */
    public SybaseAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: AuthenticationType to be used for connection.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the SybaseLinkedServiceTypeProperties object itself.
     */
    public SybaseLinkedServiceTypeProperties withAuthenticationType(SybaseAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: Username for authentication. Type: string (or Expression with resultType string).
     *
     * @param username the username value to set.
     * @return the SybaseLinkedServiceTypeProperties object itself.
     */
    public SybaseLinkedServiceTypeProperties withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for authentication.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set the password property: Password for authentication.
     *
     * @param password the password value to set.
     * @return the SybaseLinkedServiceTypeProperties object itself.
     */
    public SybaseLinkedServiceTypeProperties withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SybaseLinkedServiceTypeProperties object itself.
     */
    public SybaseLinkedServiceTypeProperties withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (server() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property server in model SybaseLinkedServiceTypeProperties"));
        }
        if (database() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property database in model SybaseLinkedServiceTypeProperties"));
        }
        if (password() != null) {
            password().validate();
        }
    }
}
