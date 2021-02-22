package com.azure.core.amqp.models;

import com.azure.core.annotation.Fluent;

import java.util.Map;

/**
 * Target associated with the link.
 */
@Fluent
public final class AmqpLinkTarget {
    private String address;

    /**
     * Sets the local address of the AMQP terminus to connect to.
     *
     * @return The local address of the AMQP terminus.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Sets the address of the AMQP terminus to connect to.
     *
     * @param address Address of the AMQP terminus.
     *
     * @return The updated {@link AmqpLinkTarget} object.
     */
    public AmqpLinkTarget setAddress(String address) {
        this.address = address;
        return this;
    }
}
