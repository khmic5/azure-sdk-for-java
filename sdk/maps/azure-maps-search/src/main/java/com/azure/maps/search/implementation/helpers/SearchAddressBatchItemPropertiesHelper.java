package com.azure.maps.search.implementation.helpers;

import com.azure.maps.search.implementation.models.BatchResult;
import com.azure.maps.search.models.ErrorDetail;
import com.azure.maps.search.models.SearchAddressBatchItem;
import com.azure.maps.search.models.SearchAddressResult;

/**
 * The helper class to set the non-public properties of an {@link BatchResult} instance.
 * @param <T>
 */
public final class SearchAddressBatchItemPropertiesHelper {
    private static SearchAddressBatchItemAccessor accessor;

    private SearchAddressBatchItemPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link SearchAddressBatchItem} instance.
     */
    public interface SearchAddressBatchItemAccessor {
        void setStatusCode(SearchAddressBatchItem item, Integer statusCode);
        void setErrorDetail(SearchAddressBatchItem item, ErrorDetail detail);
        void setSearchAddressResult(SearchAddressBatchItem item, SearchAddressResult result);
    }

    /**
     * The method called from {@link SearchAddressResult} to set it's accessor.
     *
     * @param searchAddressResultAccessor The accessor.
     */
    public static void setAccessor(final SearchAddressBatchItemAccessor batchResultAccessor) {
        accessor = batchResultAccessor;
    }

    public static void setStatusCode(SearchAddressBatchItem item, Integer statusCode) {
        accessor.setStatusCode(item, statusCode);
    }

    public static void setErrorDetail(SearchAddressBatchItem item, ErrorDetail detail) {
        accessor.setErrorDetail(item, detail);
    }

    public static void setSearchAddressResult(SearchAddressBatchItem item, SearchAddressResult result) {
        accessor.setSearchAddressResult(item, result);
    }
}
