package com.azure.maps.search.implementation.helpers;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.azure.core.models.GeoObject;
import com.azure.core.serializer.json.jackson.JacksonJsonSerializer;
import com.azure.core.serializer.json.jackson.JacksonJsonSerializerProvider;
import com.azure.core.util.UrlBuilder;
import com.azure.core.util.serializer.TypeReference;
import com.azure.maps.search.implementation.models.AddressPrivate;
import com.azure.maps.search.implementation.models.AddressRangesPrivate;
import com.azure.maps.search.implementation.models.BatchRequestItem;
import com.azure.maps.search.implementation.models.EntryPointPrivate;
import com.azure.maps.search.implementation.models.GeoJsonFeatureCollection;
import com.azure.maps.search.implementation.models.GeoJsonObject;
import com.azure.maps.search.implementation.models.PolygonPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchAddressBatchItemPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchAddressBatchResult;
import com.azure.maps.search.implementation.models.ReverseSearchAddressResultItemPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultItemPrivate;
import com.azure.maps.search.implementation.models.ReverseSearchCrossStreetAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchAddressBatchItemPrivate;
import com.azure.maps.search.implementation.models.SearchAddressBatchResult;
import com.azure.maps.search.implementation.models.SearchAddressResultItemPrivate;
import com.azure.maps.search.implementation.models.SearchAddressResultPrivate;
import com.azure.maps.search.implementation.models.SearchSummaryPrivate;
import com.azure.maps.search.models.Address;
import com.azure.maps.search.models.AddressRanges;
import com.azure.maps.search.models.BaseSearchOptions;
import com.azure.maps.search.models.BatchRequest;
import com.azure.maps.search.models.BatchResultSummary;
import com.azure.maps.search.models.BatchReverseSearchResult;
import com.azure.maps.search.models.BatchSearchResult;
import com.azure.maps.search.models.BoundingBox;
import com.azure.maps.search.models.EntryPoint;
import com.azure.maps.search.models.FuzzySearchOptions;
import com.azure.maps.search.models.LatLong;
import com.azure.maps.search.models.Polygon;
import com.azure.maps.search.models.ReverseSearchAddressBatchItem;
import com.azure.maps.search.models.ReverseSearchAddressResult;
import com.azure.maps.search.models.ReverseSearchAddressResultItem;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResult;
import com.azure.maps.search.models.ReverseSearchCrossStreetAddressResultItem;
import com.azure.maps.search.models.SearchAddressBatchItem;
import com.azure.maps.search.models.SearchAddressOptions;
import com.azure.maps.search.models.SearchAddressResult;
import com.azure.maps.search.models.SearchAddressResultItem;
import com.azure.maps.search.models.SearchSummary;

/**
 * Utility method class.
 */
public class Utility {
    private static final JacksonJsonSerializer serializer = new JacksonJsonSerializerProvider().createInstance();

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

    public static SearchAddressBatchItem toSearchAddressBatchItem(SearchAddressBatchItemPrivate item) {
        SearchAddressBatchItem resultItem = new SearchAddressBatchItem();
        SearchAddressBatchItemPropertiesHelper.setErrorDetail(resultItem, item.getResponse().getError());
        SearchAddressBatchItemPropertiesHelper.setStatusCode(resultItem, item.getStatusCode());
        SearchAddressResult result = toSearchAddressResult(item.getResponse());
        SearchAddressBatchItemPropertiesHelper.setSearchAddressResult(resultItem, result);

        return resultItem;
    }

    public static BatchSearchResult toBatchSearchResult(SearchAddressBatchResult result) {
        BatchResultSummary summary = result.getBatchSummary();
        List<SearchAddressBatchItem> items = result.getBatchItems().stream()
            .map(item -> toSearchAddressBatchItem(item))
            .collect(Collectors.toList());

        return new BatchSearchResult(summary, items);
    }

    public static ReverseSearchAddressBatchItem toReverseSearchAddressBatchItem(
            ReverseSearchAddressBatchItemPrivate item) {
        ReverseSearchAddressBatchItem resultItem = new ReverseSearchAddressBatchItem();
        ReverseSearchAddressBatchItemPropertiesHelper.setErrorDetail(resultItem, item.getResponse().getError());
        ReverseSearchAddressBatchItemPropertiesHelper.setStatusCode(resultItem, item.getStatusCode());
        ReverseSearchAddressResult result = toReverseSearchAddressResult(item.getResponse());
        ReverseSearchAddressBatchItemPropertiesHelper.setReverseSearchAddressResult(resultItem, result);

        return resultItem;
    }

    public static BatchReverseSearchResult toBatchReverseSearchResult(
            ReverseSearchAddressBatchResult result) {
        BatchResultSummary summary = result.getBatchSummary();
        List<ReverseSearchAddressBatchItem> items = result.getBatchItems().stream()
            .map(item -> toReverseSearchAddressBatchItem(item))
            .collect(Collectors.toList());

        return new BatchReverseSearchResult(summary, items);
    }

    public static Polygon toPolygon(PolygonPrivate privatePolygon) {
        Polygon polygon = new Polygon();
        PolygonPropertiesHelper.setGeometry(polygon, privatePolygon.getGeometryData());
        PolygonPropertiesHelper.setProviderID(polygon, privatePolygon.getProviderID());

        return polygon;
    }

    public static List<Polygon> toPolygonList(List<PolygonPrivate> privatePolygonList) {
        List<Polygon> polygons = privatePolygonList.stream().map(item -> toPolygon(item))
            .collect(Collectors.toList());

        return polygons;
    }

    public static GeoJsonObject toGeoJsonObject(GeoObject object) {
        // serialize to GeoJson
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        serializer.serialize(baos, object);

        // deserialize into GeoJsonObject
        final TypeReference<GeoJsonObject> typeReference = new TypeReference<GeoJsonObject>(){};
        return serializer.deserializeFromBytes(baos.toByteArray(), typeReference);
    }

    public static GeoObject toGeoObject(GeoJsonObject object) {
        // serialize to GeoJson
        // TODO Review this for other types of returned FeatureCollection
        GeoJsonFeatureCollection fc = (GeoJsonFeatureCollection) object;
        final ByteArrayOutputStream baos = new ByteArrayOutputStream();
        serializer.serialize(baos, fc.getFeatures().get(0).getGeometry());

        // deserialize into GeoObject
        final TypeReference<GeoObject> typeReference = new TypeReference<GeoObject>(){};
        return serializer.deserializeFromBytes(baos.toByteArray(), typeReference);
    }

    public static BatchRequestItem toBatchRequestItem(SearchAddressOptions options) {
        Map<String, Object> params = fillCommonParameters(options);

        // single value parameters
        params.compute("query", (k, v) -> options.getQuery());
        params.compute("typeahead", (k, v) -> options.isTypeAhead());
        params.compute("entityType", (k, v) -> options.getEntityType());

        // comma separated parameters
        if (options.getCountryFilter() != null) {
            params.compute("countrySet", (k, v) -> String.join(",", options.getCountryFilter()));
        }

        if (options.getExtendedPostalCodesFor() != null) {
            params.compute("extendedPostalCodesFor", (k, v) ->
                String.join(",", options.getExtendedPostalCodesFor()
                    .stream()
                    .map(item -> item.toString())
                    .collect(Collectors.toList())));
        }

        // double parameters
        params.compute("lat", (k, v) -> options.getCoordinates().map(LatLong::getLat).orElse(null));
        params.compute("lon", (k, v) -> options.getCoordinates().map(LatLong::getLon).orElse(null));

        // batch request item conversion
        BatchRequestItem item = convertParametersToRequestItem(params);

        return item;
    }

    public static BatchRequestItem toBatchRequestItem(FuzzySearchOptions options) {
        // query, brandset, categorySet, connectorSet, country, extendedPostalCodes, idxSet
        // lat, lon, min/max fuzzy levelopeningHours
        // typeahead
        Map<String, Object> params = fillCommonParameters(options);

        return null;
    }

    private static <T extends BaseSearchOptions<T>> Map<String, Object> fillCommonParameters(BaseSearchOptions<T> options) {
        Map<String, Object> params = new HashMap<>();

        // single value parameters
        params.compute("limit", (k, v) -> options.getTop());
        params.compute("ofs", (k, v) -> options.getSkip());
        params.compute("language", (k, v) -> options.getLanguage());
        params.compute("radius", (k, v) -> options.getRadiusInMeters());
        params.compute("view", (k, v) -> options.getLocalizedMapView());
        params.compute("topLeft", (k, v) -> options.getBoundingBox()
            .map(BoundingBox::getTopLeft).map(LatLong::toString).orElse(null));
        params.compute("btmRight", (k, v) -> options.getBoundingBox()
            .map(BoundingBox::getBottomRight).map(LatLong::toString).orElse(null));

        return params;
    }

    private static BatchRequestItem convertParametersToRequestItem(Map<String, Object> params) {
        // batch request item conversion
        BatchRequestItem item = new BatchRequestItem();
        UrlBuilder urlBuilder = new UrlBuilder();

        for (String key : params.keySet()) {
            try {
                urlBuilder.addQueryParameter(key, URLEncoder.encode(params.get(key).toString(), "UTF-8"));
            }
            catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }

        item.setQuery(urlBuilder.getQueryString());
        return item;
    }
}
