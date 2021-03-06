// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.fluent.models.StorageAccountPropertiesCreateParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters used when creating a storage account. */
@Fluent
public final class StorageAccountCreateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageAccountCreateParameters.class);

    /*
     * Required. Gets or sets the SKU name.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Required. Indicates the type of storage account.
     */
    @JsonProperty(value = "kind", required = true)
    private Kind kind;

    /*
     * Required. Gets or sets the location of the resource. This will be one of
     * the supported and registered Azure Geo Regions (e.g. West US, East US,
     * Southeast Asia, etc.). The geo region of a resource cannot be changed
     * once it is created, but if an identical geo region is specified on
     * update, the request will succeed.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Gets or sets a list of key value pairs that describe the resource. These
     * tags can be used for viewing and grouping this resource (across resource
     * groups). A maximum of 15 tags can be provided for a resource. Each tag
     * must have a key with a length no greater than 128 characters and a value
     * with a length no greater than 256 characters.
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /*
     * The identity of the resource.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The parameters used to create the storage account.
     */
    @JsonProperty(value = "properties")
    private StorageAccountPropertiesCreateParameters innerProperties;

    /**
     * Get the sku property: Required. Gets or sets the SKU name.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Required. Gets or sets the SKU name.
     *
     * @param sku the sku value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: Required. Indicates the type of storage account.
     *
     * @return the kind value.
     */
    public Kind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Required. Indicates the type of storage account.
     *
     * @param kind the kind value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withKind(Kind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the location property: Required. Gets or sets the location of the resource. This will be one of the supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource
     * cannot be changed once it is created, but if an identical geo region is specified on update, the request will
     * succeed.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Required. Gets or sets the location of the resource. This will be one of the supported
     * and registered Azure Geo Regions (e.g. West US, East US, Southeast Asia, etc.). The geo region of a resource
     * cannot be changed once it is created, but if an identical geo region is specified on update, the request will
     * succeed.
     *
     * @param location the location value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no
     * greater than 256 characters.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Gets or sets a list of key value pairs that describe the resource. These tags can be used
     * for viewing and grouping this resource (across resource groups). A maximum of 15 tags can be provided for a
     * resource. Each tag must have a key with a length no greater than 128 characters and a value with a length no
     * greater than 256 characters.
     *
     * @param tags the tags value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The identity of the resource.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity of the resource.
     *
     * @param identity the identity value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the innerProperties property: The parameters used to create the storage account.
     *
     * @return the innerProperties value.
     */
    private StorageAccountPropertiesCreateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     *
     * @return the customDomain value.
     */
    public CustomDomain customDomain() {
        return this.innerProperties() == null ? null : this.innerProperties().customDomain();
    }

    /**
     * Set the customDomain property: User domain assigned to the storage account. Name is the CNAME source. Only one
     * custom domain is supported per storage account at this time. To clear the existing custom domain, use an empty
     * string for the custom domain name property.
     *
     * @param customDomain the customDomain value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withCustomDomain(CustomDomain customDomain) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withCustomDomain(customDomain);
        return this;
    }

    /**
     * Get the encryption property: Not applicable. Azure Storage encryption is enabled for all storage accounts and
     * cannot be disabled.
     *
     * @return the encryption value.
     */
    public Encryption encryption() {
        return this.innerProperties() == null ? null : this.innerProperties().encryption();
    }

    /**
     * Set the encryption property: Not applicable. Azure Storage encryption is enabled for all storage accounts and
     * cannot be disabled.
     *
     * @param encryption the encryption value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEncryption(Encryption encryption) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withEncryption(encryption);
        return this;
    }

    /**
     * Get the networkRuleSet property: Network rule set.
     *
     * @return the networkRuleSet value.
     */
    public NetworkRuleSet networkRuleSet() {
        return this.innerProperties() == null ? null : this.innerProperties().networkRuleSet();
    }

    /**
     * Set the networkRuleSet property: Network rule set.
     *
     * @param networkRuleSet the networkRuleSet value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withNetworkRuleSet(NetworkRuleSet networkRuleSet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withNetworkRuleSet(networkRuleSet);
        return this;
    }

    /**
     * Get the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @return the accessTier value.
     */
    public AccessTier accessTier() {
        return this.innerProperties() == null ? null : this.innerProperties().accessTier();
    }

    /**
     * Set the accessTier property: Required for storage accounts where kind = BlobStorage. The access tier used for
     * billing.
     *
     * @param accessTier the accessTier value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAccessTier(AccessTier accessTier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAccessTier(accessTier);
        return this;
    }

    /**
     * Get the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @return the azureFilesIdentityBasedAuthentication value.
     */
    public AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication() {
        return this.innerProperties() == null ? null : this.innerProperties().azureFilesIdentityBasedAuthentication();
    }

    /**
     * Set the azureFilesIdentityBasedAuthentication property: Provides the identity based authentication settings for
     * Azure Files.
     *
     * @param azureFilesIdentityBasedAuthentication the azureFilesIdentityBasedAuthentication value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAzureFilesIdentityBasedAuthentication(
        AzureFilesIdentityBasedAuthentication azureFilesIdentityBasedAuthentication) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAzureFilesIdentityBasedAuthentication(azureFilesIdentityBasedAuthentication);
        return this;
    }

    /**
     * Get the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     *
     * @return the enableHttpsTrafficOnly value.
     */
    public Boolean enableHttpsTrafficOnly() {
        return this.innerProperties() == null ? null : this.innerProperties().enableHttpsTrafficOnly();
    }

    /**
     * Set the enableHttpsTrafficOnly property: Allows https traffic only to storage service if sets to true. The
     * default value is true since API version 2019-04-01.
     *
     * @param enableHttpsTrafficOnly the enableHttpsTrafficOnly value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withEnableHttpsTrafficOnly(enableHttpsTrafficOnly);
        return this;
    }

    /**
     * Get the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @return the isHnsEnabled value.
     */
    public Boolean isHnsEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().isHnsEnabled();
    }

    /**
     * Set the isHnsEnabled property: Account HierarchicalNamespace enabled if sets to true.
     *
     * @param isHnsEnabled the isHnsEnabled value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withIsHnsEnabled(Boolean isHnsEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withIsHnsEnabled(isHnsEnabled);
        return this;
    }

    /**
     * Get the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @return the largeFileSharesState value.
     */
    public LargeFileSharesState largeFileSharesState() {
        return this.innerProperties() == null ? null : this.innerProperties().largeFileSharesState();
    }

    /**
     * Set the largeFileSharesState property: Allow large file shares if sets to Enabled. It cannot be disabled once it
     * is enabled.
     *
     * @param largeFileSharesState the largeFileSharesState value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withLargeFileSharesState(LargeFileSharesState largeFileSharesState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withLargeFileSharesState(largeFileSharesState);
        return this;
    }

    /**
     * Get the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @return the routingPreference value.
     */
    public RoutingPreference routingPreference() {
        return this.innerProperties() == null ? null : this.innerProperties().routingPreference();
    }

    /**
     * Set the routingPreference property: Maintains information about the network routing choice opted by the user for
     * data transfer.
     *
     * @param routingPreference the routingPreference value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withRoutingPreference(RoutingPreference routingPreference) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withRoutingPreference(routingPreference);
        return this;
    }

    /**
     * Get the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @return the allowBlobPublicAccess value.
     */
    public Boolean allowBlobPublicAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowBlobPublicAccess();
    }

    /**
     * Set the allowBlobPublicAccess property: Allow or disallow public access to all blobs or containers in the storage
     * account. The default interpretation is true for this property.
     *
     * @param allowBlobPublicAccess the allowBlobPublicAccess value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAllowBlobPublicAccess(Boolean allowBlobPublicAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAllowBlobPublicAccess(allowBlobPublicAccess);
        return this;
    }

    /**
     * Get the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @return the minimumTlsVersion value.
     */
    public MinimumTlsVersion minimumTlsVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().minimumTlsVersion();
    }

    /**
     * Set the minimumTlsVersion property: Set the minimum TLS version to be permitted on requests to storage. The
     * default interpretation is TLS 1.0 for this property.
     *
     * @param minimumTlsVersion the minimumTlsVersion value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withMinimumTlsVersion(MinimumTlsVersion minimumTlsVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withMinimumTlsVersion(minimumTlsVersion);
        return this;
    }

    /**
     * Get the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @return the allowSharedKeyAccess value.
     */
    public Boolean allowSharedKeyAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().allowSharedKeyAccess();
    }

    /**
     * Set the allowSharedKeyAccess property: Indicates whether the storage account permits requests to be authorized
     * with the account access key via Shared Key. If false, then all requests, including shared access signatures, must
     * be authorized with Azure Active Directory (Azure AD). The default value is null, which is equivalent to true.
     *
     * @param allowSharedKeyAccess the allowSharedKeyAccess value to set.
     * @return the StorageAccountCreateParameters object itself.
     */
    public StorageAccountCreateParameters withAllowSharedKeyAccess(Boolean allowSharedKeyAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new StorageAccountPropertiesCreateParameters();
        }
        this.innerProperties().withAllowSharedKeyAccess(allowSharedKeyAccess);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sku in model StorageAccountCreateParameters"));
        } else {
            sku().validate();
        }
        if (kind() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property kind in model StorageAccountCreateParameters"));
        }
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model StorageAccountCreateParameters"));
        }
        if (identity() != null) {
            identity().validate();
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
