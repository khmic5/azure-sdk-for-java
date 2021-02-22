// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.models.ReceiverSettleMode;
import com.azure.core.amqp.models.SenderSettleMode;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Represents a unidirectional AMQP link.
 */
public interface AmqpLink extends Disposable {
    /**
     * Gets the name of the link.
     *
     * @return The name of the link.
     */
    String getLinkName();

    /**
     * The remote endpoint path this link is connected to.
     *
     * @return The remote endpoint path this link is connected to.
     */
    String getEntityPath();

    /**
     * The host name of the message broker that this link that is connected to.
     *
     * @return The host name of the message broker that this link that is connected to.
     */
    String getHostname();

    /**
     * Gets the endpoint states for the AMQP link. {@link AmqpException AmqpExceptions} that occur on the link are
     * reported in the connection state. When the stream terminates, the link is closed.
     *
     * @return A stream of endpoint states for the AMQP link.
     */
    Flux<AmqpEndpointState> getEndpointStates();

    /**
     * Gets the maximum message size supported by the link.
     *
     * @return the maximum message size supported by the link.
     */
    Mono<Long> getMaxMessageSizeInBytes();

    /**
     * Gets the actual capabilities offered by the link.
     *
     * @return Capabilities offered by the link.
     */
    Flux<String> getOfferedCapabilities();

    /**
     * Gets the desired capabilities of the link.
     *
     * @return The desired capabilities of the link.
     */
    Iterable<String> getDesiredCapabilities();

    /**
     * Gets the sender settle mode.
     *
     * @return The sender settle mode.
     */
    SenderSettleMode getSenderSettleMode();

    /**
     * Gets the receiver settle mode.
     *
     * @return The receiver settle mode.
     */
    ReceiverSettleMode getReceiverSettleMode();
}
