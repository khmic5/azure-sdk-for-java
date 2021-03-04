// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.amqp;

import com.azure.core.amqp.implementation.MessageSerializer;
import com.azure.core.amqp.models.AmqpAddress;
import com.azure.core.amqp.models.AmqpAnnotatedMessage;
import com.azure.core.amqp.models.AmqpMessageBody;
import com.azure.core.amqp.models.AmqpMessageHeader;
import com.azure.core.amqp.models.AmqpMessageId;
import com.azure.core.amqp.models.AmqpMessageProperties;
import com.azure.core.util.logging.ClientLogger;
import org.apache.qpid.proton.Proton;
import org.apache.qpid.proton.amqp.Binary;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.UnsignedByte;
import org.apache.qpid.proton.amqp.UnsignedInteger;
import org.apache.qpid.proton.amqp.messaging.ApplicationProperties;
import org.apache.qpid.proton.amqp.messaging.Data;
import org.apache.qpid.proton.amqp.messaging.DeliveryAnnotations;
import org.apache.qpid.proton.amqp.messaging.Footer;
import org.apache.qpid.proton.amqp.messaging.Header;
import org.apache.qpid.proton.amqp.messaging.MessageAnnotations;
import org.apache.qpid.proton.amqp.messaging.Properties;
import org.apache.qpid.proton.amqp.messaging.Section;
import org.apache.qpid.proton.codec.WritableBuffer;
import org.apache.qpid.proton.message.Message;

import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Serializes an AMQP annotated message into a proton-j message and vice versa.
 */
class AmqpAnnotatedMessageSerializer implements MessageSerializer {
    private final ByteBuffer byteBuffer = ByteBuffer.allocate(1048576);
    private final ClientLogger logger = new ClientLogger(AmqpAnnotatedMessageSerializer.class);

    @Override
    public int getSize(Message amqpMessage) {
        final WritableBuffer buffer = WritableBuffer.ByteBufferWrapper.wrap(byteBuffer);
        byteBuffer.position(0);
        return amqpMessage.encode(buffer);
    }

    @Override
    public int getSize(AmqpAnnotatedMessage amqpAnnotatedMessage) {
        final Message message = serialize(amqpAnnotatedMessage);
        final int size = getSize(message);
        return size;
    }

    @Override
    public <T> Message serialize(T object) {
        if (!(object instanceof AmqpAnnotatedMessage)) {
            throw logger.logExceptionAsError(new UnsupportedOperationException(
                String.format("'%s' is not supported.", object.getClass())));
        }

        final Message serialized = Proton.message();
        final AmqpAnnotatedMessage message = (AmqpAnnotatedMessage) object;

        if (!message.getApplicationProperties().isEmpty()) {
            serialized.setApplicationProperties(new ApplicationProperties(message.getApplicationProperties()));
        }
        if (!message.getDeliveryAnnotations().isEmpty()) {
            final HashMap<Symbol, Object> hashMap = mapToSymbol(message.getDeliveryAnnotations());
            serialized.setDeliveryAnnotations(new DeliveryAnnotations(hashMap));
        }
        if (!message.getFooter().isEmpty()) {
            final HashMap<Symbol, Object> hashMap = mapToSymbol(message.getFooter());
            serialized.setFooter(new Footer(hashMap));
        }
        if (!message.getMessageAnnotations().isEmpty()) {
            final HashMap<Symbol, Object> hashMap = mapToSymbol(message.getMessageAnnotations());
            serialized.setMessageAnnotations(new MessageAnnotations(hashMap));
        }

        final AmqpMessageHeader header = message.getHeader();
        final Header amqpHeader = new Header();
        serialized.setHeader(amqpHeader);

        if (header.getDeliveryCount() != null) {
            amqpHeader.setDeliveryCount(new UnsignedInteger(header.getDeliveryCount().intValue()));
        }

        amqpHeader.setDurable(header.isDurable());
        amqpHeader.setFirstAcquirer(header.isFirstAcquirer());

        if (header.getPriority() != null) {
            amqpHeader.setPriority(new UnsignedByte(header.getPriority().byteValue()));
        }
        if (header.getTimeToLive() != null) {
            amqpHeader.setTtl(UnsignedInteger.valueOf(header.getTimeToLive().toMillis()));
        }

        final AmqpMessageProperties properties = message.getProperties();
        if (properties.getAbsoluteExpiryTime() != null) {
            serialized.setExpiryTime(properties.getAbsoluteExpiryTime().toEpochSecond());
        }
        if (properties.getTo() != null) {
            serialized.setAddress(properties.getTo().toString());
        }

        serialized.setContentEncoding(properties.getContentEncoding());
        serialized.setContentType(properties.getContentType());
        serialized.setMessageId(properties.getMessageId());

        if (properties.getCorrelationId() != null) {
            serialized.setCorrelationId(properties.getCorrelationId().toString());
        }
        if (properties.getCreationTime() != null) {
            serialized.setCreationTime(properties.getCreationTime().toEpochSecond());
        }

        serialized.setGroupId(properties.getGroupId());

        if (properties.getGroupSequence() != null) {
            serialized.setGroupSequence(properties.getGroupSequence());
        }
        if (properties.getReplyTo() != null) {
            serialized.setReplyTo(properties.getReplyTo().toString());
        }

        serialized.setReplyToGroupId(properties.getReplyToGroupId());
        serialized.setSubject(properties.getSubject());

        if (properties.getTo() != null) {
            serialized.setAddress(properties.getTo().toString());
        }

        final byte[] userId = properties.getUserId();
        if (userId.length > 0) {
            serialized.setUserId(userId);
        }

        final AmqpMessageBody body = message.getBody();
        switch (body.getBodyType()) {
            case DATA:
                final List<byte[]> collected = body.getData().stream().collect(Collectors.toList());
                if (collected.size() > 1) {
                    logger.warning("proton-j supports one section, but there are {} data segments. Using first one",
                        collected.size());
                }

                serialized.setBody(new Data(new Binary(collected.get(0))));
                break;
            case VALUE:
                // TODO (conniey): Support these.
            case SEQUENCE:
                // TODO (conniey): Support these.
            default:
                throw logger.logExceptionAsError(new UnsupportedOperationException(
                    "Type is not supported yet: " + body.getBodyType()));
        }

        return serialized;
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T deserialize(Message message, Class<T> clazz) {
        if (!(AmqpAnnotatedMessage.class == clazz)) {
            throw logger.logExceptionAsError(new UnsupportedOperationException(
                String.format("Class type %s is not supported.", clazz)));
        }

        final Section body = message.getBody();
        final AmqpAnnotatedMessage result;
        switch (body.getType()) {
            case Data:
                final Data dataBody = (Data) body;
                result = new AmqpAnnotatedMessage(AmqpMessageBody.fromData(dataBody.getValue().getArray()));
                break;
            case AmqpValue:
            case AmqpSequence:
            default:
                throw logger.logExceptionAsError(new UnsupportedOperationException(
                    "Deserializing AMQP body type is not supported. Type: " + body.getType()));
        }

        if (message.getApplicationProperties() != null) {
            message.getApplicationProperties().getValue().forEach(
                (key, value) -> result.getApplicationProperties().put(key, value));
        }
        if (message.getDeliveryAnnotations() != null) {
            message.getDeliveryAnnotations().getValue().forEach(
                (key, value) -> result.getDeliveryAnnotations().put(key.toString(), value));
        }
        final Footer footer = message.getFooter();
        if (footer != null) {
            footer.getValue().forEach(
                (key, value) -> result.getFooter().put(key.toString(), value));
        }

        if (message.getMessageAnnotations() != null) {
            message.getMessageAnnotations().getValue().forEach(
                (key, value) -> result.getMessageAnnotations().put(key.toString(), value));
        }

        final Properties properties = message.getProperties();
        if (properties != null) {
            result.getProperties()
                .setAbsoluteExpiryTime(getValue(properties.getAbsoluteExpiryTime()))
                .setContentEncoding(getValue(properties.getContentEncoding()))
                .setContentType(getValue(properties.getContentType()))
                .setCorrelationId(getAmqpMessageId(properties.getCorrelationId()))
                .setCreationTime(getValue(properties.getCreationTime()))
                .setGroupId(properties.getGroupId())
                .setGroupSequence(getLong(properties.getGroupSequence()))
                .setMessageId(getAmqpMessageId(properties.getMessageId()))
                .setReplyTo(getAmqpAddress(properties.getReplyTo()))
                .setReplyToGroupId(properties.getReplyToGroupId())
                .setSubject(properties.getSubject())
                .setTo(getAmqpAddress(properties.getTo()))
                .setUserId(properties.getUserId() != null ? properties.getUserId().getArray() : null);
        }

        final Header header = message.getHeader();
        if (header != null) {
            result.getHeader()
                .setDeliveryCount(getLong(header.getDeliveryCount()))
                .setDurable(header.getDurable())
                .setFirstAcquirer(header.getFirstAcquirer())
                .setPriority(header.getPriority() != null ? header.getPriority().shortValue() : null)
                .setTimeToLive(header.getTtl() != null ? Duration.ofMillis(header.getTtl().longValue()) : null);
        }

        return (T) result;
    }

    @Override
    public <T> List<T> deserializeList(Message message, Class<T> clazz) {
        throw new UnsupportedOperationException("Not supported for this serializer.");
    }

    private static HashMap<Symbol, Object> mapToSymbol(Map<String, Object> map) {
        return map.entrySet()
            .parallelStream()
            .collect(HashMap::new,
                (result, entry) -> result.put(Symbol.getSymbol(entry.getKey()), entry.getValue()),
                (first, second) -> second.forEach((key, value) -> first.put(key, value)));
    }

    private static String getValue(Symbol symbol) {
        return symbol != null ? symbol.toString() : null;
    }

    private static OffsetDateTime getValue(Date value) {
        return value != null ? value.toInstant().atOffset(ZoneOffset.UTC) : null;
    }

    private static AmqpMessageId getAmqpMessageId(Object value) {
        return value != null ? new AmqpMessageId(value.toString()) : null;
    }

    private static AmqpAddress getAmqpAddress(String value) {
        return value != null ? new AmqpAddress(value) : null;
    }

    private static Long getLong(UnsignedInteger value) {
        return value != null ? value.longValue() : null;
    }
}
