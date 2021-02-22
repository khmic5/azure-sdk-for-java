// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

/**
 * The sender settlement types.
 *
 * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/csprd01/amqp-core-transport-v1.0-csprd01.html#type-sender-settle-mode">Sender
 *     settle mode</a>
 */
public enum SenderSettleMode {
    /**
     * The sender will send all deliveries initially unsettled to the receiver.
     */
    UNSETTLED(0),
    /**
     * The sender will send all deliveries settled to the receiver.
     */
    SETTLED(1),
    /**
     * The sender may send a mixture of settled and unsettled deliveries to the receiver.
     */
    MIXED(2);

    private final int value;

    SenderSettleMode(int value) {
        this.value = value;
    }

    /**
     * Gets the value of this settle mode.
     *
     * @return The value of the settle mode.
     */
    public int getValue() {
        return value;
    }
}
