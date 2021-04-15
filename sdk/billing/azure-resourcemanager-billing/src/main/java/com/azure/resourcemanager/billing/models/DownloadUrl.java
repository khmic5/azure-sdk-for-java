// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.resourcemanager.billing.fluent.models.DownloadUrlInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of DownloadUrl. */
public interface DownloadUrl {
    /**
     * Gets the expiryTime property: The time in UTC when the download URL will expire.
     *
     * @return the expiryTime value.
     */
    OffsetDateTime expiryTime();

    /**
     * Gets the url property: The URL to the PDF file.
     *
     * @return the url value.
     */
    String url();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.DownloadUrlInner object.
     *
     * @return the inner object.
     */
    DownloadUrlInner innerModel();
}