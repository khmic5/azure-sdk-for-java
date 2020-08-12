// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import com.azure.resourcemanager.storage.fluent.BlobContainersClient;
import com.azure.resourcemanager.storage.fluent.BlobServicesClient;
import com.azure.resourcemanager.storage.fluent.EncryptionScopesClient;
import com.azure.resourcemanager.storage.fluent.FileServicesClient;
import com.azure.resourcemanager.storage.fluent.FileSharesClient;
import com.azure.resourcemanager.storage.fluent.ManagementPoliciesClient;
import com.azure.resourcemanager.storage.fluent.ObjectReplicationPoliciesOperationsClient;
import com.azure.resourcemanager.storage.fluent.OperationsClient;
import com.azure.resourcemanager.storage.fluent.PrivateEndpointConnectionsClient;
import com.azure.resourcemanager.storage.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.storage.fluent.QueueServicesClient;
import com.azure.resourcemanager.storage.fluent.QueuesClient;
import com.azure.resourcemanager.storage.fluent.SkusClient;
import com.azure.resourcemanager.storage.fluent.StorageAccountsClient;
import com.azure.resourcemanager.storage.fluent.TableServicesClient;
import com.azure.resourcemanager.storage.fluent.TablesClient;
import com.azure.resourcemanager.storage.fluent.UsagesClient;
import java.time.Duration;

/** Initializes a new instance of the StorageManagementClient type. */
@ServiceClient(builder = StorageManagementClientBuilder.class)
public final class StorageManagementClient extends AzureServiceClient {
    private final ClientLogger logger = new ClientLogger(StorageManagementClient.class);

    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The SkusClient object to access its operations. */
    private final SkusClient skus;

    /**
     * Gets the SkusClient object to access its operations.
     *
     * @return the SkusClient object.
     */
    public SkusClient getSkus() {
        return this.skus;
    }

    /** The StorageAccountsClient object to access its operations. */
    private final StorageAccountsClient storageAccounts;

    /**
     * Gets the StorageAccountsClient object to access its operations.
     *
     * @return the StorageAccountsClient object.
     */
    public StorageAccountsClient getStorageAccounts() {
        return this.storageAccounts;
    }

    /** The UsagesClient object to access its operations. */
    private final UsagesClient usages;

    /**
     * Gets the UsagesClient object to access its operations.
     *
     * @return the UsagesClient object.
     */
    public UsagesClient getUsages() {
        return this.usages;
    }

    /** The ManagementPoliciesClient object to access its operations. */
    private final ManagementPoliciesClient managementPolicies;

    /**
     * Gets the ManagementPoliciesClient object to access its operations.
     *
     * @return the ManagementPoliciesClient object.
     */
    public ManagementPoliciesClient getManagementPolicies() {
        return this.managementPolicies;
    }

    /** The PrivateEndpointConnectionsClient object to access its operations. */
    private final PrivateEndpointConnectionsClient privateEndpointConnections;

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    public PrivateEndpointConnectionsClient getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /** The ObjectReplicationPoliciesOperationsClient object to access its operations. */
    private final ObjectReplicationPoliciesOperationsClient objectReplicationPoliciesOperations;

    /**
     * Gets the ObjectReplicationPoliciesOperationsClient object to access its operations.
     *
     * @return the ObjectReplicationPoliciesOperationsClient object.
     */
    public ObjectReplicationPoliciesOperationsClient getObjectReplicationPoliciesOperations() {
        return this.objectReplicationPoliciesOperations;
    }

    /** The EncryptionScopesClient object to access its operations. */
    private final EncryptionScopesClient encryptionScopes;

    /**
     * Gets the EncryptionScopesClient object to access its operations.
     *
     * @return the EncryptionScopesClient object.
     */
    public EncryptionScopesClient getEncryptionScopes() {
        return this.encryptionScopes;
    }

    /** The BlobServicesClient object to access its operations. */
    private final BlobServicesClient blobServices;

    /**
     * Gets the BlobServicesClient object to access its operations.
     *
     * @return the BlobServicesClient object.
     */
    public BlobServicesClient getBlobServices() {
        return this.blobServices;
    }

    /** The BlobContainersClient object to access its operations. */
    private final BlobContainersClient blobContainers;

    /**
     * Gets the BlobContainersClient object to access its operations.
     *
     * @return the BlobContainersClient object.
     */
    public BlobContainersClient getBlobContainers() {
        return this.blobContainers;
    }

    /** The FileServicesClient object to access its operations. */
    private final FileServicesClient fileServices;

    /**
     * Gets the FileServicesClient object to access its operations.
     *
     * @return the FileServicesClient object.
     */
    public FileServicesClient getFileServices() {
        return this.fileServices;
    }

    /** The FileSharesClient object to access its operations. */
    private final FileSharesClient fileShares;

    /**
     * Gets the FileSharesClient object to access its operations.
     *
     * @return the FileSharesClient object.
     */
    public FileSharesClient getFileShares() {
        return this.fileShares;
    }

    /** The QueueServicesClient object to access its operations. */
    private final QueueServicesClient queueServices;

    /**
     * Gets the QueueServicesClient object to access its operations.
     *
     * @return the QueueServicesClient object.
     */
    public QueueServicesClient getQueueServices() {
        return this.queueServices;
    }

    /** The QueuesClient object to access its operations. */
    private final QueuesClient queues;

    /**
     * Gets the QueuesClient object to access its operations.
     *
     * @return the QueuesClient object.
     */
    public QueuesClient getQueues() {
        return this.queues;
    }

    /** The TableServicesClient object to access its operations. */
    private final TableServicesClient tableServices;

    /**
     * Gets the TableServicesClient object to access its operations.
     *
     * @return the TableServicesClient object.
     */
    public TableServicesClient getTableServices() {
        return this.tableServices;
    }

    /** The TablesClient object to access its operations. */
    private final TablesClient tables;

    /**
     * Gets the TablesClient object to access its operations.
     *
     * @return the TablesClient object.
     */
    public TablesClient getTables() {
        return this.tables;
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     */
    StorageManagementClient(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2019-06-01";
        this.operations = new OperationsClient(this);
        this.skus = new SkusClient(this);
        this.storageAccounts = new StorageAccountsClient(this);
        this.usages = new UsagesClient(this);
        this.managementPolicies = new ManagementPoliciesClient(this);
        this.privateEndpointConnections = new PrivateEndpointConnectionsClient(this);
        this.privateLinkResources = new PrivateLinkResourcesClient(this);
        this.objectReplicationPoliciesOperations = new ObjectReplicationPoliciesOperationsClient(this);
        this.encryptionScopes = new EncryptionScopesClient(this);
        this.blobServices = new BlobServicesClient(this);
        this.blobContainers = new BlobContainersClient(this);
        this.fileServices = new FileServicesClient(this);
        this.fileShares = new FileSharesClient(this);
        this.queueServices = new QueueServicesClient(this);
        this.queues = new QueuesClient(this);
        this.tableServices = new TableServicesClient(this);
        this.tables = new TablesClient(this);
    }
}
