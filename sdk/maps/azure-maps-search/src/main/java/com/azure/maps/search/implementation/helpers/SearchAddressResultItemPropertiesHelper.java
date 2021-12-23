package com.azure.maps.search.implementation.helpers;

import com.azure.maps.search.implementation.models.SearchAddressResultItemPrivate;
import com.azure.maps.search.models.SearchAddressResultItem;

/**
 * The helper class to set the non-public properties of an {@link SearchAddressResultItemPrivate} instance.
 */
public final class SearchAddressResultItemPropertiesHelper {
    private static SearchAddressResultItemAccessor accessor;

    private SearchAddressResultItemPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link SearchAddressResultItemPrivate} instance.
     */
    public interface SearchAddressResultItemAccessor {
        void setFromSearchAddressResultItemPrivate(SearchAddressResultItem resultItem,
            SearchAddressResultItemPrivate privateResultItem);
    }

    /**
     * The method called from {@link SearchAddressResultItem} to set it's accessor.
     *
     * @param searchAddressResultItemAccessor The accessor.
     */
    public static void setAccessor(final SearchAddressResultItemAccessor searchAddressResultAccessor) {
        accessor = searchAddressResultAccessor;
    }

    public static void setFromSearchAddressResultItemPrivate(SearchAddressResultItem resultItem,
        SearchAddressResultItemPrivate privateResultItem) {
        accessor.setFromSearchAddressResultItemPrivate(resultItem, privateResultItem);
    }
}

