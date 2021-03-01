// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.core.amqp.exception;

import com.azure.core.amqp.AmqpConnection;
import com.azure.core.amqp.AmqpLink;
import com.azure.core.amqp.AmqpSession;
import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;

import java.io.Serializable;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;

/**
 * Provides context for an {@link AmqpException} that occurs in an {@link AmqpConnection}, {@link AmqpSession},
 * or {@link AmqpLink}.
 *
 * @see AmqpException
 * @see SessionErrorContext
 * @see LinkErrorContext
 */
public class AmqpErrorContext implements Serializable {
    static final String MESSAGE_PARAMETER_DELIMITER = ", ";

    private static final long serialVersionUID = -2819764407122954927L;

    private final String namespace;
    private Map<String, Object> errorInfo;

    /**
     * Creates a new instance with the provided {@code namespace}.
     *
     * @param namespace The service namespace of the error.
     * @throws IllegalArgumentException when {@code namespace} is {@code null} or empty.
     */
    public AmqpErrorContext(String namespace) {
        if (CoreUtils.isNullOrEmpty(namespace)) {
            throw new IllegalArgumentException("'namespace' cannot be null or empty");
        }

        this.namespace = namespace;
    }

    /**
     * Gets the namespace for this error.
     *
     * @return The namespace for this error.
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * Gets the map carrying information about the error condition.
     *
     * @return Map carrying additional information about the error.
     */
    public Map<String, Object> getErrorInfo() {
        return errorInfo != null ? errorInfo : Collections.emptyMap();
    }

    /**
     * Sets map carrying information about the error condition.
     *
     * @param errorInfo Map carrying additional information about the error.
     * @return The updated {@link AmqpErrorContext} context.
     */
    public AmqpErrorContext setErrorInfo(Map<String, Object> errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
     * Creates a string representation of this ErrorContext.
     *
     * @return A string representation of this ErrorContext.
     */
    @Override
    public String toString() {
        return String.format(Locale.US, "NAMESPACE: %s", getNamespace());
    }
}
