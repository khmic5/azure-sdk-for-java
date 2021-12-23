package com.azure.maps.search.implementation.helpers;

import com.azure.maps.search.implementation.models.AddressPrivate;
import com.azure.maps.search.implementation.models.AddressRangesPrivate;
import com.azure.maps.search.implementation.models.EntryPointPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchAddressResultItemPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultItemPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchAddressResultItemPrivate;
import com.azure.maps.search.implementation.models.SearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchSummaryPrivate;
import com.azure.maps.search.models.Address;
import com.azure.maps.search.models.AddressRanges;
import com.azure.maps.search.models.EntryPoint;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchAddressResultItem;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResultItem;
import com.azure.maps.search.models.SearchAddressResult;
import com.azure.maps.search.models.SearchAddressResultItem;
import com.azure.maps.search.models.SearchSummary;

/**
 * Utility method class.
 */
public class Utility {

    /**
     * Helper method to convert {@link AddressPrivate} to
     * {@link Address}.
     *
     * @param addressPrivate The {@link AddressPrivate}.
     *
     * @return A {@link Address}.

    public static SingleCategoryClassifyResultCollection toSingleCategoryClassifyResultCollection(
        CustomSingleClassificationResult customSingleClassificationResult) {
        final List<SingleCategoryClassifyResult> singleCategoryClassifyResults = new ArrayList<>();
        final List<SingleClassificationDocument> singleClassificationDocuments =
            customSingleClassificationResult.getDocuments();

        for (SingleClassificationDocument documentSummary : singleClassificationDocuments) {
            singleCategoryClassifyResults.add(toSingleCategoryClassifyResult(documentSummary));
        }

        for (DocumentError documentError : customSingleClassificationResult.getErrors()) {
            singleCategoryClassifyResults.add(new SingleCategoryClassifyResult(documentError.getId(), null,
                toTextAnalyticsError(documentError.getError())));
        }

        final SingleCategoryClassifyResultCollection resultCollection =
            new SingleCategoryClassifyResultCollection(singleCategoryClassifyResults);
        SingleCategoryClassifyResultCollectionPropertiesHelper.setProjectName(resultCollection,
            customSingleClassificationResult.getProjectName());
        SingleCategoryClassifyResultCollectionPropertiesHelper.setDeploymentName(resultCollection,
            customSingleClassificationResult.getDeploymentName());
        if (customSingleClassificationResult.getStatistics() != null) {
            SingleCategoryClassifyResultCollectionPropertiesHelper.setStatistics(resultCollection,
                toBatchStatistics(customSingleClassificationResult.getStatistics()));
        }
        return resultCollection;
    }
    */

    public static Address toAddress(AddressPrivate addressPrivate) {
        Address address = new Address();
        AddressPropertiesHelper.setFromAddressPrivate(address, addressPrivate);

        return address;
    }

    public static AddressRanges toAddressRanges(AddressRangesPrivate addressRangesPrivate) {
        AddressRanges addressRanges = new AddressRanges();
        AddressRangesPropertiesHelper.setFromAddressRangesPrivate(addressRanges, addressRangesPrivate);

        return addressRanges;
    }

    public static EntryPoint toEntryPoint(EntryPointPrivate entryPointPrivate) {
        EntryPoint entryPoint = new EntryPoint();
        EntryPointPropertiesHelper.setPosition(entryPoint, entryPointPrivate.getPosition());
        EntryPointPropertiesHelper.setType(entryPoint, entryPointPrivate.getType());

        return entryPoint;
    }

    public static SearchAddressResultItem toSearchAddressResultItem(SearchAddressResultItemPrivate privateResultItem) {
        SearchAddressResultItem resultItem = new SearchAddressResultItem();
        SearchAddressResultItemPropertiesHelper.setFromSearchAddressResultItemPrivate(resultItem,
            privateResultItem);

        return resultItem;
    }

    public static SearchAddressResult toSearchAddressResult(SearchAddressResultPrivate privateResult) {
        SearchAddressResult result = new SearchAddressResult();
        SearchAddressResultPropertiesHelper.setSummary(result, privateResult.getSummary());
        SearchAddressResultPropertiesHelper.setResults(result, privateResult.getResults());

        return result;
    }

    public static SearchSummary toSearchSummary(SearchSummaryPrivate privateSearchSummary) {
        SearchSummary summary = new SearchSummary();
        SearchSummaryPropertiesHelper.setFromPrivateSearchSummary(summary, privateSearchSummary);

        return summary;
    }

    public static ReverseSearchAddressResultItem toReverseSearchAddressResultItem(ReverseSearchAddressResultItemPrivate privateResultItem) {
        ReverseSearchAddressResultItem resultItem = new ReverseSearchAddressResultItem();
        ReverseSearchAddressResultItemPropertiesHelper.setFromReverseSearchAddressResultItemPrivate(
            resultItem, privateResultItem);

        return resultItem;
    }

    public static ReverseSearchAddressResult toReverseSearchAddressResult(ReverseSearchAddressResultPrivate privateResult) {
        ReverseSearchAddressResult result = new ReverseSearchAddressResult();
        ReverseSearchAddressResultPropertiesHelper.setSummary(result, privateResult.getSummary());
        ReverseSearchAddressResultPropertiesHelper.setAddresses(result, privateResult.getAddresses());

        return result;
    }

    public static ReverseSearchCrossStreetAddressResultItem toReverseSearchCrossStreetAddressResultItem(
            ReverseSearchCrossStreetAddressResultItemPrivate privateResultItem) {
        ReverseSearchCrossStreetAddressResultItem resultItem = new ReverseSearchCrossStreetAddressResultItem();
        ReverseSearchCrossStreetAddressResultItemPropertiesHelper.setFromReverseSearchCrossStreetAddressResultItemPrivate(
            resultItem, privateResultItem);

        return resultItem;
    }

    public static ReverseSearchCrossStreetAddressResult toReverseSearchCrossStreetAddressResult(
            ReverseSearchCrossStreetAddressResultPrivate privateResult) {
        ReverseSearchCrossStreetAddressResult result = new ReverseSearchCrossStreetAddressResult();
        ReverseSearchCrossStreetAddressResultPropertiesHelper.setSummary(result, privateResult.getSummary());
        ReverseSearchCrossStreetAddressResultPropertiesHelper.setAddresses(result, privateResult.getAddresses());

        return result;
    }
}
