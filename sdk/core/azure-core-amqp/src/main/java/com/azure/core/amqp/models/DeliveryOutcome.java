package com.azure.core.amqp.models;

import com.azure.core.annotation.Fluent;

/**
 * There are different outcomes accepted by the AMQP protocol layer.
 *
 * Outcomes that don't have any other fields
 * http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-messaging-v1.0-os.html#type-accepted
 * http://docs.oasis-open.org/amqp/core/v1.0/os/amqp-core-messaging-v1.0-os.html#type-released
 */
@Fluent
public class DeliveryOutcome {
    private DeliveryState deliveryState;

    public DeliveryOutcome(DeliveryState deliveryState) {
        this.deliveryState = deliveryState;
    }

    public DeliveryState getDeliveryState() {
        return deliveryState;
    }

    DeliveryOutcome setDeliveryState(DeliveryState deliveryState) {
        this.deliveryState = deliveryState;
        return this;
    }
}
