package com.azure.maps.route.implementation.helpers;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.models.GeoCollection;
import com.azure.core.models.GeoPolygonCollection;
import com.azure.core.models.GeoPosition;
import com.azure.maps.route.implementation.models.GeoJsonMultiPoint;
import com.azure.maps.route.implementation.models.RouteDirectionParametersPrivate;
import com.azure.maps.route.implementation.models.RouteMatrixQueryPrivate;
import com.azure.maps.route.models.LatLong;
import com.azure.maps.route.models.RouteDirectionsParameters;
import com.azure.maps.route.models.RouteMatrixQuery;
import com.azure.maps.route.models.RouteMatrixResult;

public class Utility {
    private static final Pattern uuidPattern = Pattern.compile("[0-9A-Fa-f\\-]{36}");

    /**
     * Gets batch Id from headers to be used in the returned batch result object.
     */
    public static String getBatchId(HttpHeaders headers) {
        // this can happen when deserialization is happening
        // to convert the private model to public model (see BatchResponseSerializer)
        if (headers == null) return null;

        // if not, let's go
        final String location = headers.getValue("Location");

        if (location != null) {
            Matcher matcher = uuidPattern.matcher(location);
            matcher.find();
            return matcher.group();
        }

        return null;
    }


    /**
     * converts the internal representation of {@link RouteMatrixResult} into the public one
     * from inside the HTTP response.
     * @param response
     * @return
     */
    public static SimpleResponse<RouteMatrixResult> createRouteMatrixResponse(
            Response<RouteMatrixResult> response) {
        RouteMatrixResult result = response.getValue();
        SimpleResponse<RouteMatrixResult> simpleResponse = new SimpleResponse<>(response.getRequest(),
            response.getStatusCode(),
            response.getHeaders(),
            result);

        return simpleResponse;
    }

    /**
     * Converts a private {@link RouteMatrixQueryPrivate} into a public {@link RouteMatrixQuery}
     * @param query
     * @return
     */
    public static RouteMatrixQueryPrivate toRouteMatrixQueryPrivate(RouteMatrixQuery query) {
        RouteMatrixQueryPrivate privateQuery = new RouteMatrixQueryPrivate();
        GeoJsonMultiPoint origins = new GeoJsonMultiPoint();
        GeoJsonMultiPoint destinations = new GeoJsonMultiPoint();

        // origins
        List<List<Double>> originCoordinates = query.getOrigins()
            .getPoints()
            .stream()
            .map(point -> {
                GeoPosition position = point.getCoordinates();
                return Arrays.asList(position.getLatitude(), position.getLongitude());
            })
            .collect(Collectors.toList());

        // destinations
        List<List<Double>> destCoordinates = query.getDestinations()
            .getPoints()
            .stream()
            .map(point -> {
                GeoPosition position = point.getCoordinates();
                return Arrays.asList(position.getLatitude(), position.getLongitude());
            })
            .collect(Collectors.toList());

        origins.setCoordinates(originCoordinates);
        destinations.setCoordinates(destCoordinates);
        privateQuery.setOrigins(origins);
        privateQuery.setDestinations(destinations);

        return privateQuery;
    }

    /**
     * Returns the route points (coordinates) as a colon separated string.
     *
     * @param routePoints
     * @return a String containing all route points
     */
    public static String toRouteQueryString(List<LatLong> routePoints) {
        return routePoints
            .stream()
            .map(item -> item.toString())
            .collect(Collectors.joining(":"));
    }

    /**
     * Returns the private version of a @{link RouteDirectionsParameters}.
     *
     * return private parameters
     */
    public static RouteDirectionParametersPrivate toRouteDirectionParametersPrivate(
            RouteDirectionsParameters parameters) {
        RouteDirectionParametersPrivate privateParams = new RouteDirectionParametersPrivate();

        // set allowVignette
        privateParams.setAllowVignette(parameters.getAllowVignette());

        // convert GeoCollection into GeoJsonGeometryCollection
        GeoCollection collection = parameters.getSupportingPoints();

        //
        GeoPolygonCollection polygonCollection = parameters.getAvoidAreas();

        return null;
    }
}
