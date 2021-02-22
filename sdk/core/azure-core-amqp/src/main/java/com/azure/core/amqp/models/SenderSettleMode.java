package com.azure.core.amqp.models;

/**
 * http://docs.oasis-open.org/amqp/core/v1.0/csprd01/amqp-core-transport-v1.0-csprd01.html#type-sender-settle-mode
 */
public enum SenderSettleMode {
    UNSETTLED(0),
    SETTLED(1),
    MIXED(2);

    private final int value;

    SenderSettleMode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
