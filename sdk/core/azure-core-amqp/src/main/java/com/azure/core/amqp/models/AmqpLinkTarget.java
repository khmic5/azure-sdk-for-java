// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp.models;

import com.azure.core.annotation.Fluent;

import java.util.Map;

/**
 * Target associated with the link.
 */
@Fluent
public final class AmqpLinkTarget {
    private AmqpAddress address;

    /**
     * Sets the local address of the AMQP terminus to connect to.
     *
     * @return The local address of the AMQP terminus.
     */
    public AmqpAddress getAddress() {
        return this.address;
    }

    /**
     * Sets the address of the AMQP terminus to connect to.
     *
     * @param address Address of the AMQP terminus.
     *
     * @return The updated {@link AmqpLinkTarget} object.
     */
    public AmqpLinkTarget setAddress(AmqpAddress address) {
        this.address = address;
        return this;
    }
}
