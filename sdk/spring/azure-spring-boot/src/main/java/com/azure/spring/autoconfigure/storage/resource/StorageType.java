// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.autoconfigure.storage.resource;

/**
 * Azure Storage Account types.
 *
 * @author Warren Zhu
 * @see <a href="https://docs.microsoft.com/en-us/azure/storage/common/storage-account-overview">StorageAccount</a>
 */
public enum StorageType {
    /**
     * Blob
     */
    BLOB("blob"),

    /**
     * File
     */
    FILE("file");

    private final String type;

    StorageType(String type) {
        this.type = type;
    }

    /**
     * Gets the string representation of the enum.
     *
     * @return the string representation of the enum
     */
    public String getType() {
        return type;
    }
}
