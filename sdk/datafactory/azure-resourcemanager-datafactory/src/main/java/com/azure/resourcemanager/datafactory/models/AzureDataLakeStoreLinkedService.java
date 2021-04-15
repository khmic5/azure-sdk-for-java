// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Azure Data Lake Store linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDataLakeStore")
@JsonFlatten
@Fluent
public class AzureDataLakeStoreLinkedService extends LinkedService {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureDataLakeStoreLinkedService.class);

    /*
     * Data Lake Store service URI. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.dataLakeStoreUri", required = true)
    private Object dataLakeStoreUri;

    /*
     * The ID of the application used to authenticate against the Azure Data
     * Lake Store account. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /*
     * The Key of the application used to authenticate against the Azure Data
     * Lake Store account.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /*
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /*
     * Indicates the azure cloud type of the service principle auth. Allowed
     * values are AzurePublic, AzureChina, AzureUsGovernment, AzureGermany.
     * Default value is the data factory regions’ cloud type. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.azureCloudType")
    private Object azureCloudType;

    /*
     * Data Lake Store account name. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.accountName")
    private Object accountName;

    /*
     * Data Lake Store account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.subscriptionId")
    private Object subscriptionId;

    /*
     * Data Lake Store account resource group name (if different from Data
     * Factory account). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.resourceGroupName")
    private Object resourceGroupName;

    /*
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the dataLakeStoreUri property: Data Lake Store service URI. Type: string (or Expression with resultType
     * string).
     *
     * @return the dataLakeStoreUri value.
     */
    public Object dataLakeStoreUri() {
        return this.dataLakeStoreUri;
    }

    /**
     * Set the dataLakeStoreUri property: Data Lake Store service URI. Type: string (or Expression with resultType
     * string).
     *
     * @param dataLakeStoreUri the dataLakeStoreUri value to set.
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withDataLakeStoreUri(Object dataLakeStoreUri) {
        this.dataLakeStoreUri = dataLakeStoreUri;
        return this;
    }

    /**
     * Get the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Store account. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value.
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the servicePrincipalId property: The ID of the application used to authenticate against the Azure Data Lake
     * Store account. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set.
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Store account.
     *
     * @return the servicePrincipalKey value.
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the servicePrincipalKey property: The Key of the application used to authenticate against the Azure Data Lake
     * Store account.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set.
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @return the tenant value.
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the tenant property: The name or ID of the tenant to which the service principal belongs. Type: string (or
     * Expression with resultType string).
     *
     * @param tenant the tenant value to set.
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @return the azureCloudType value.
     */
    public Object azureCloudType() {
        return this.azureCloudType;
    }

    /**
     * Set the azureCloudType property: Indicates the azure cloud type of the service principle auth. Allowed values are
     * AzurePublic, AzureChina, AzureUsGovernment, AzureGermany. Default value is the data factory regions’ cloud type.
     * Type: string (or Expression with resultType string).
     *
     * @param azureCloudType the azureCloudType value to set.
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withAzureCloudType(Object azureCloudType) {
        this.azureCloudType = azureCloudType;
        return this;
    }

    /**
     * Get the accountName property: Data Lake Store account name. Type: string (or Expression with resultType string).
     *
     * @return the accountName value.
     */
    public Object accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Data Lake Store account name. Type: string (or Expression with resultType string).
     *
     * @param accountName the accountName value to set.
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withAccountName(Object accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the subscriptionId property: Data Lake Store account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     *
     * @return the subscriptionId value.
     */
    public Object subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: Data Lake Store account subscription ID (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroupName property: Data Lake Store account resource group name (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     *
     * @return the resourceGroupName value.
     */
    public Object resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: Data Lake Store account resource group name (if different from Data Factory
     * account). Type: string (or Expression with resultType string).
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withResourceGroupName(Object resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
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
     * @return the AzureDataLakeStoreLinkedService object itself.
     */
    public AzureDataLakeStoreLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureDataLakeStoreLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
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
        if (dataLakeStoreUri() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataLakeStoreUri in model AzureDataLakeStoreLinkedService"));
        }
        if (servicePrincipalKey() != null) {
            servicePrincipalKey().validate();
        }
    }
}