package com.azure.maps.search.implementation.helpers;

import java.util.List;

import com.azure.maps.search.implementation.models.SearchAddressResultItemPrivate;
import com.azure.maps.search.implementation.models.SearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchSummaryPrivate;
import com.azure.maps.search.models.SearchAddressResult;

/**
 * The helper class to set the non-public properties of an {@link SearchAddressResultPrivate} instance.
 */
public final class SearchAddressResultPropertiesHelper {
    private static SearchAddressResultAccessor accessor;

    private SearchAddressResultPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link SearchAddressResultPrivate} instance.
     */
    public interface SearchAddressResultAccessor {
        void setSummary(SearchAddressResult result, SearchSummaryPrivate privateSearchSummary);
        void setResults(SearchAddressResult result, List<SearchAddressResultItemPrivate> privateResults);
    }

    /**
     * The method called from {@link SearchAddressResult} to set it's accessor.
     *
     * @param searchAddressResultAccessor The accessor.
     */
    public static void setAccessor(final SearchAddressResultAccessor searchAddressResultAccessor) {
        accessor = searchAddressResultAccessor;
    }

    public static void setSummary(SearchAddressResult result, SearchSummaryPrivate privateSearchSummary) {
        accessor.setSummary(result, privateSearchSummary);
    }

    public static void setResults(SearchAddressResult result, List<SearchAddressResultItemPrivate> privateResults) {
        accessor.setResults(result, privateResults);
    }
}

