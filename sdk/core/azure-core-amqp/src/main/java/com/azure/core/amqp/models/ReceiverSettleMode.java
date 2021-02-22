package com.azure.core.amqp.models;

/**
 * The receiver settle mode.
 *
 * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/csprd01/amqp-core-transport-v1.0-csprd01.html#type-receiver-settle-mode">Receiver
 *     settle mode.</a>
 */
public enum ReceiverSettleMode {
    /**
     * The receiver will spontaneously settle all incoming transfers.
     */
    FIRST(0),
    /**
     * The receiver will only settle after sending the disposition to the sender and receiving a disposition indicating
     * settlement of the delivery from the sender.
     *
     * @see DeliveryOutcome
     */
    SECOND(1);

    private final int value;

    ReceiverSettleMode(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the receive settle mode.
     *
     * @return The value of the receive settle mode.
     */
    public int getValue() {
        return value;
    }
}
