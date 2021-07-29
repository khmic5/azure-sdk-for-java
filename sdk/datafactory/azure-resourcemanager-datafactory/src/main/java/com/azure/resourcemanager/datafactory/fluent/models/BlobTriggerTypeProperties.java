// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Blob Trigger properties. */
@Fluent
public final class BlobTriggerTypeProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobTriggerTypeProperties.class);

    /*
     * The path of the container/folder that will trigger the pipeline.
     */
    @JsonProperty(value = "folderPath", required = true)
    private String folderPath;

    /*
     * The max number of parallel files to handle when it is triggered.
     */
    @JsonProperty(value = "maxConcurrency", required = true)
    private int maxConcurrency;

    /*
     * The Azure Storage linked service reference.
     */
    @JsonProperty(value = "linkedService", required = true)
    private LinkedServiceReference linkedService;

    /**
     * Get the folderPath property: The path of the container/folder that will trigger the pipeline.
     *
     * @return the folderPath value.
     */
    public String folderPath() {
        return this.folderPath;
    }

    /**
     * Set the folderPath property: The path of the container/folder that will trigger the pipeline.
     *
     * @param folderPath the folderPath value to set.
     * @return the BlobTriggerTypeProperties object itself.
     */
    public BlobTriggerTypeProperties withFolderPath(String folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the maxConcurrency property: The max number of parallel files to handle when it is triggered.
     *
     * @return the maxConcurrency value.
     */
    public int maxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * Set the maxConcurrency property: The max number of parallel files to handle when it is triggered.
     *
     * @param maxConcurrency the maxConcurrency value to set.
     * @return the BlobTriggerTypeProperties object itself.
     */
    public BlobTriggerTypeProperties withMaxConcurrency(int maxConcurrency) {
        this.maxConcurrency = maxConcurrency;
        return this;
    }

    /**
     * Get the linkedService property: The Azure Storage linked service reference.
     *
     * @return the linkedService value.
     */
    public LinkedServiceReference linkedService() {
        return this.linkedService;
    }

    /**
     * Set the linkedService property: The Azure Storage linked service reference.
     *
     * @param linkedService the linkedService value to set.
     * @return the BlobTriggerTypeProperties object itself.
     */
    public BlobTriggerTypeProperties withLinkedService(LinkedServiceReference linkedService) {
        this.linkedService = linkedService;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (folderPath() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property folderPath in model BlobTriggerTypeProperties"));
        }
        if (linkedService() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property linkedService in model BlobTriggerTypeProperties"));
        } else {
            linkedService().validate();
        }
    }
}
