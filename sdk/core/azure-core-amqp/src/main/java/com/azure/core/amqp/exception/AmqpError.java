package com.azure.core.amqp.exception;

import java.util.Map;

/**
 * http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-transport-v1.0-os.html#type-error
 */
public class AmqpError {
    private final AmqpErrorCondition errorCondition;
    private String description;
    private Map<String, Object> errorInfo;

    public AmqpError(AmqpErrorCondition errorCondition) {
        this.errorCondition = errorCondition;
    }

    public AmqpErrorCondition getErrorCondition() {
        return errorCondition;
    }

    public String getDescription() {
        return description;
    }

    public AmqpError setDescription(String description) {
        this.description = description;
        return this;
    }

    public Map<String, Object> getErrorInfo() {
        return errorInfo;
    }

    public AmqpError setErrorInfo(Map<String, Object> errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }
}
