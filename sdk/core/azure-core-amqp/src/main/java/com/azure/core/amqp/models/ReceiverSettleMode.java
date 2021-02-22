package com.azure.core.amqp.models;

/**
 * http://docs.oasis-open.org/amqp/core/v1.0/csprd01/amqp-core-transport-v1.0-csprd01.html#type-receiver-settle-mode
 */
public enum ReceiverSettleMode {
    FIRST(0),
    SECOND(1);

    private final int value;

    ReceiverSettleMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
