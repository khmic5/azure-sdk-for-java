// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import com.azure.core.amqp.exception.AmqpErrorContext;
import com.azure.core.amqp.exception.AmqpException;
import com.azure.core.amqp.models.AmqpAnnotatedMessage;
import com.azure.core.amqp.models.DeliveryOutcome;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * An AMQP link that sends information to the remote endpoint.
 */
public interface AmqpSendLink extends AmqpLink {
    /**
     * Sends a single message to the remote endpoint.
     *
     * @param message Message to send.
     * @return A Mono that completes when the message has been sent.
     * @throws AmqpException if the serialized {@code message} exceed the links capacity for a single message.
     */
    Mono<DeliveryOutcome> send(AmqpAnnotatedMessage message);

    /**
     * Batches the messages given into a single proton-j message that is sent down the wire.
     *
     * @param messageBatch The batch of messages to send to the service.
     * @return A Mono that completes when all the batched messages are successfully transmitted to the message broker.
     * @throws AmqpException if the serialized contents of {@code messageBatch} exceed the link's capacity for a single
     * message.
     */
    Mono<DeliveryOutcome> send(Iterable<AmqpAnnotatedMessage> messageBatch);

    /**
     * Sends a single message to the remote endpoint with the given delivery outcome.
     *
     * @param message Message to send.
     * @param deliveryOutcome to be sent along with message.
     * @return A Mono that completes when the message has been sent.
     * @throws AmqpException if the serialized {@code message} exceed the links capacity for a single message.
     */
    Mono<DeliveryOutcome> send(AmqpAnnotatedMessage message, DeliveryOutcome deliveryOutcome);

    /**
     * Batches list of messages given into a single proton-j message that is sent down the wire.
     *
     * @param messageBatch The list of messages to send to the service.
     * @param deliveryOutcome to be sent along with message.
     *
     * @return A Mono that completes when all the batched messages are successfully transmitted to message broker.
     * @throws AmqpException if the serialized contents of {@code messageBatch} exceed the link's capacity for a single
     * message.
     */
    Mono<DeliveryOutcome> send(Iterable<AmqpAnnotatedMessage> messageBatch, DeliveryOutcome deliveryOutcome);

    /**
     * Gets the size of the send link. {@link AmqpAnnotatedMessage messages} sent on the link cannot exceed the size.
     *
     * @return A Mono that completes and returns the size of the send link.
     */
    Mono<Integer> getLinkSize();
}
