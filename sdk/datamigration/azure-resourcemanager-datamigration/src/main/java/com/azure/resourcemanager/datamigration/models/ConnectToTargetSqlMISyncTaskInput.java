// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for the task that validates connection to Azure SQL Database Managed Instance online scenario. */
@Fluent
public final class ConnectToTargetSqlMISyncTaskInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectToTargetSqlMISyncTaskInput.class);

    /*
     * Connection information for Azure SQL Database Managed Instance
     */
    @JsonProperty(value = "targetConnectionInfo", required = true)
    private MiSqlConnectionInfo targetConnectionInfo;

    /*
     * Azure Active Directory Application the DMS instance will use to connect
     * to the target instance of Azure SQL Database Managed Instance and the
     * Azure Storage Account
     */
    @JsonProperty(value = "azureApp", required = true)
    private AzureActiveDirectoryApp azureApp;

    /**
     * Get the targetConnectionInfo property: Connection information for Azure SQL Database Managed Instance.
     *
     * @return the targetConnectionInfo value.
     */
    public MiSqlConnectionInfo targetConnectionInfo() {
        return this.targetConnectionInfo;
    }

    /**
     * Set the targetConnectionInfo property: Connection information for Azure SQL Database Managed Instance.
     *
     * @param targetConnectionInfo the targetConnectionInfo value to set.
     * @return the ConnectToTargetSqlMISyncTaskInput object itself.
     */
    public ConnectToTargetSqlMISyncTaskInput withTargetConnectionInfo(MiSqlConnectionInfo targetConnectionInfo) {
        this.targetConnectionInfo = targetConnectionInfo;
        return this;
    }

    /**
     * Get the azureApp property: Azure Active Directory Application the DMS instance will use to connect to the target
     * instance of Azure SQL Database Managed Instance and the Azure Storage Account.
     *
     * @return the azureApp value.
     */
    public AzureActiveDirectoryApp azureApp() {
        return this.azureApp;
    }

    /**
     * Set the azureApp property: Azure Active Directory Application the DMS instance will use to connect to the target
     * instance of Azure SQL Database Managed Instance and the Azure Storage Account.
     *
     * @param azureApp the azureApp value to set.
     * @return the ConnectToTargetSqlMISyncTaskInput object itself.
     */
    public ConnectToTargetSqlMISyncTaskInput withAzureApp(AzureActiveDirectoryApp azureApp) {
        this.azureApp = azureApp;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetConnectionInfo() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property targetConnectionInfo in model ConnectToTargetSqlMISyncTaskInput"));
        } else {
            targetConnectionInfo().validate();
        }
        if (azureApp() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property azureApp in model ConnectToTargetSqlMISyncTaskInput"));
        } else {
            azureApp().validate();
        }
    }
}