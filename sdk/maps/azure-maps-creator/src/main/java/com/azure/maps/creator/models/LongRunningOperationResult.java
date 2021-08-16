// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.creator.models;

import com.azure.core.management.exception.ManagementError;
import com.azure.maps.creator.fluent.models.LongRunningOperationResultInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of LongRunningOperationResult. */
public interface LongRunningOperationResult {
    /**
     * Gets the operationId property: The Id for this long-running operation.
     *
     * @return the operationId value.
     */
    String operationId();

    /**
     * Gets the status property: The status state of the request.
     *
     * @return the status value.
     */
    LroStatus status();

    /**
     * Gets the created property: The created timestamp.
     *
     * @return the created value.
     */
    OffsetDateTime created();

    /**
     * Gets the error property: The error detail.
     *
     * @return the error value.
     */
    ManagementError error();

    /**
     * Gets the warning property: The error detail.
     *
     * @return the warning value.
     */
    ManagementError warning();

    /**
     * Gets the inner com.azure.maps.creator.fluent.models.LongRunningOperationResultInner object.
     *
     * @return the inner object.
     */
    LongRunningOperationResultInner innerModel();
}
