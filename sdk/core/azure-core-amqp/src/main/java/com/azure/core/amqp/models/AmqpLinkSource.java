package com.azure.core.amqp.models;

import com.azure.core.annotation.Fluent;

import java.util.Map;

/**
 * Source associated with the link.
 */
@Fluent
public final class AmqpLinkSource {
    private String address;
    private Map<String, Object> filters;

    /**
     * Gets the address of the AMQP terminus to connect to.
     *
     * @return the address of the AMQP terminus to connect to.
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Sets the local address of the AMQP terminus to connect to.
     *
     * @param address The local address of the AMQP terminus.
     *
     * @return The updated {@link AmqpLinkSource} object.
     */
    public AmqpLinkSource setAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * Gets any filters to apply to the source.
     *
     * @return Filters to apply to the source.
     *
     * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/amqp-core-messaging-v1.0.html#type-filter-set">Filter
     *     set</a>
     */
    public Map<String, Object> getFilters() {
        return filters;
    }

    /**
     * Sets the filters to apply to the source.
     * <p>
     * A set of named filters. Every key in the map MUST be of type symbol, every value MUST be either null or of a
     * described type which provides the archetype filter. A filter acts as a function on a message which returns a
     * boolean result indicating whether the message can pass through that filter or not. A message will pass through a
     * filter-set if and only if it passes through each of the named filters. If the value for a given key is null, this
     * acts as if there were no such key present (i.e., all messages pass through the null filter).
     * </p>
     *
     * @param filters Filters to apply to the source.
     *
     * @return The updated {@link AmqpLinkSource} object.
     *
     * @see <a href="http://docs.oasis-open.org/amqp/core/v1.0/amqp-core-messaging-v1.0.html#type-filter-set">Filter
     *     set</a>
     */
    public AmqpLinkSource setFilters(Map<String, Object> filters) {
        this.filters = filters;
        return this;
    }
}
