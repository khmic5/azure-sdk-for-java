package com.azure.maps.search.implementation.helpers;

import java.util.List;

import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultItemPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchSummaryPrivate;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;

/**
 * The helper class to set the non-public properties of an {@link ReverseSearchCrossStreetAddressResultPrivate} instance.
 */
public final class ReverseSearchCrossStreetAddressResultPropertiesHelper {
    private static ReverseSearchCrossStreetAddressResultAccessor accessor;

    private ReverseSearchCrossStreetAddressResultPropertiesHelper() { }

    /**
     * Type defining the methods to set the non-public properties of an {@link ReverseSearchCrossStreetAddressResultPrivate} instance.
     */
    public interface ReverseSearchCrossStreetAddressResultAccessor {
        void setSummary(ReverseSearchCrossStreetAddressResult result, SearchSummaryPrivate privateSearchSummary);
        void setAddresses(ReverseSearchCrossStreetAddressResult result, List<ReverseSearchCrossStreetAddressResultItemPrivate> privateResults);
    }

    /**
     * The method called from {@link ReverseSearchCrossStreetAddressResult} to set it's accessor.
     *
     * @param ReverseSearchCrossStreetAddressResultAccessor The accessor.
     */
    public static void setAccessor(final ReverseSearchCrossStreetAddressResultAccessor ReverseSearchCrossStreetAddressResultAccessor) {
        accessor = ReverseSearchCrossStreetAddressResultAccessor;
    }

    public static void setSummary(ReverseSearchCrossStreetAddressResult result, SearchSummaryPrivate privateSearchSummary) {
        accessor.setSummary(result, privateSearchSummary);
    }

    public static void setAddresses(ReverseSearchCrossStreetAddressResult result, List<ReverseSearchCrossStreetAddressResultItemPrivate> privateResults) {
        accessor.setAddresses(result, privateResults);
    }
}

