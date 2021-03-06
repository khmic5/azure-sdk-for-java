// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for SharedPrivateLinkResourceStatus. */
public enum SharedPrivateLinkResourceStatus {
    /** Enum value Pending. */
    PENDING("Pending"),

    /** Enum value Approved. */
    APPROVED("Approved"),

    /** Enum value Rejected. */
    REJECTED("Rejected"),

    /** Enum value Disconnected. */
    DISCONNECTED("Disconnected"),

    /** Enum value Timeout. */
    TIMEOUT("Timeout");

    /** The actual serialized value for a SharedPrivateLinkResourceStatus instance. */
    private final String value;

    SharedPrivateLinkResourceStatus(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SharedPrivateLinkResourceStatus instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SharedPrivateLinkResourceStatus object, or null if unable to parse.
     */
    @JsonCreator
    public static SharedPrivateLinkResourceStatus fromString(String value) {
        SharedPrivateLinkResourceStatus[] items = SharedPrivateLinkResourceStatus.values();
        for (SharedPrivateLinkResourceStatus item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
