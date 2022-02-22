// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.maps.route.implementation.helpers;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UncheckedIOException;

import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.JsonSerializer;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.core.util.serializer.TypeReference;
import com.azure.maps.route.implementation.models.RouteMatrixResultPrivate;
import com.azure.maps.route.models.RouteMatrixResult;

import reactor.core.publisher.Mono;

/**
 * Jackson based implementation of the {@link JsonSerializer}.
 *
 * This implementation first deserializes the response into a private {@link SearchAddressResult}
 * then converts it to a public {@link BatchSearchResult} with the right properties and methods.
 *
 */
public final class RouteMatrixResultSerializer implements JsonSerializer {
    private final SerializerAdapter jacksonAdapter = JacksonAdapter.createDefaultSerializerAdapter();
    private final ClientLogger logger = new ClientLogger(RouteMatrixResultSerializer.class);

    /**
     * Performs deserialization from {@link RouteMatrixResultPrivate}
     * and conversion to {@link RouteMatrixResult}.
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> T deserializeFromBytes(byte[] data, TypeReference<T> typeReference) {
        try {
            if (typeReference.getJavaType().getTypeName().contains("RouteMatrixResult")) {
                TypeReference<RouteMatrixResultPrivate> interimType = new TypeReference<RouteMatrixResultPrivate>(){};
                RouteMatrixResultPrivate interimResult = jacksonAdapter
                    .<RouteMatrixResultPrivate>deserialize(data, interimType.getJavaType(),
                        SerializerEncoding.JSON);
                RouteMatrixResult result = Utility.toRouteMatrixResult(interimResult);
                return (T) result;
            }
            else {
                return jacksonAdapter.deserialize(data, typeReference.getJavaType(), SerializerEncoding.JSON);
            }
        } catch (IOException e) {
            throw logger.logExceptionAsError(new UncheckedIOException(e));
        }
    }

    @Override
    public <T> T deserialize(InputStream stream, TypeReference<T> typeReference) {
        try {
            return jacksonAdapter.deserialize(stream, typeReference.getJavaType(), SerializerEncoding.JSON);
        } catch (IOException e) {
            throw logger.logExceptionAsError(new UncheckedIOException(e));
        }
    }

    @Override
    public <T> Mono<T> deserializeFromBytesAsync(byte[] data, TypeReference<T> typeReference) {
        return Mono.defer(() -> Mono.fromCallable(() -> deserializeFromBytes(data, typeReference)));
    }

    @Override
    public <T> Mono<T> deserializeAsync(InputStream stream, TypeReference<T> typeReference) {
        return Mono.defer(() -> Mono.fromCallable(() -> deserialize(stream, typeReference)));
    }

    @Override
    public byte[] serializeToBytes(Object value) {
        try {
            return jacksonAdapter.serializeToBytes(value, SerializerEncoding.JSON);
        } catch (IOException e) {
            throw logger.logExceptionAsError(new UncheckedIOException(e));
        }
    }

    @Override
    public void serialize(OutputStream stream, Object value) {
        try {
            jacksonAdapter.serialize(value, SerializerEncoding.JSON, stream);
        } catch (IOException e) {
            throw logger.logExceptionAsError(new UncheckedIOException(e));
        }
    }

    @Override
    public Mono<byte[]> serializeToBytesAsync(Object value) {
        return Mono.defer(() -> Mono.fromCallable(() -> serializeToBytes(value)));
    }

    @Override
    public Mono<Void> serializeAsync(OutputStream stream, Object value) {
        return Mono.fromRunnable(() -> serialize(stream, value));
    }
}
