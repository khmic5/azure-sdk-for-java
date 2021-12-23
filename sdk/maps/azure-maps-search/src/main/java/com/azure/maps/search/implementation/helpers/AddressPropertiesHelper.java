package com.azure.maps.search.implementation.helpers;

import com.azure.maps.search.implementation.models.AddressPrivate;
import com.azure.maps.search.models.Address;

/**
 * The helper class to set the non-public properties of an {@link AddressPrivate} instance.
 */
public final class AddressPropertiesHelper {
    private static AddressAccessor accessor;

    private AddressPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link AddressPrivate} instance.
     */
    public interface AddressAccessor {
        void setFromAddressPrivate(Address address, AddressPrivate addressPrivate);
    }

    /**
     * The method called from {@link Address} to set it's accessor.
     *
     * @param addressAccessor The accessor.
     */
    public static void setAccessor(final AddressAccessor addressAccessor) {
        accessor = addressAccessor;
    }

    public static void setFromAddressPrivate(Address address, AddressPrivate addressPrivate) {
        accessor.setFromAddressPrivate(address, addressPrivate);
    }
}
