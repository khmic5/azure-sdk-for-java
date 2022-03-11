// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

import java.util.Arrays;

import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.LibraryCustomization;
import com.azure.autorest.customization.PackageCustomization;
import com.azure.autorest.customization.ClassCustomization;
import com.azure.autorest.customization.MethodCustomization;
import org.slf4j.Logger;

/**
 * Customization class for Queue Storage.
 */
public class WeatherCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization customization, Logger logger) {
        PackageCustomization models = customization.getPackage("com.azure.maps.weather.models");

        // customize classes with latlongpair
        customizeLatLongPairClasses(models, "StormForecast", "getCoordinates", "setCoordinates");
        customizeLatLongPairClasses(models, "StormLocation", "getCoordinates", "setCoordinates");
        customizeLatLongPairClasses(models, "WeatherWindow", "getTopLeft", "setTopLeft");
        customizeLatLongPairClasses(models, "WeatherWindow", "getBottomRight", "setBottomRight");

        // customize WeatherWindow
        customizeGeoJsonGeometryProperty(models, "WeatherWindow", "getGeometry", "setGeometry", "geometry");
        customizeGeoJsonGeometryProperty(models, "StormWindRadiiSummary", "getRadiiGeometry", "setRadiiGeometry",
            "radiiGeometry");

        /*
        // customize route instruction
        customizeRouteInstruction(models);

        // customize route range
        customizeRouteRange(models);

        // customize route matrix
        customizeRouteMatrix(models);

        // customize route batch item
        customizeDirectionsBatchItem(models);
        */
    }

    // Customizes the StormForecast class
    private void customizeLatLongPairClasses(PackageCustomization models, String clazz, String getter, String setter) {
        ClassCustomization classCustomization = models.getClass(clazz);
        MethodCustomization methodCustomization = classCustomization.getMethod(getter);
        methodCustomization.setReturnType("GeoPosition", "new GeoPosition(returnValue.getLongitude(), " +
            "returnValue.getLatitude())");
        classCustomization.removeMethod(setter);
    }

    // Customizes the WeatherWindow and StormWindRadiiSummary classes
    // Have to customize it this way because setting return type imports the wrong Utility package.
    private void customizeGeoJsonGeometryProperty(PackageCustomization models,String clazz, String getter,
            String setter, String property) {
        ClassCustomization classCustomization = models.getClass(clazz);
        classCustomization.removeMethod(getter);
        classCustomization.removeMethod(setter);
        final String getPolygonMethod =
            "/** " +
            "* Returns a {@link GeoPolygon} for this weather window" +
            "*" +
            "* return GeoPolygon" +
            "*/" +
            "public GeoPolygon getPolygon() {" +
            "    return Utility.toGeoPolygon(this." + property + ");" +
            "}";
        classCustomization.addMethod(getPolygonMethod, Arrays.asList(
            "com.azure.maps.weather.implementation.helpers.Utility",
            "com.azure.core.models.GeoPolygon"));
    }

    // Customizes the RouteLeg class
    private void customizeRouteLeg(PackageCustomization models) {
        final String getPointsMethod =
            "/** " +
            "* Returns a list of {@link LatLong} coordinates." +
            "*" +
            "* return the coordinates" +
            "*/" +
            "public List<LatLong> getPoints() {" +
            "    return this.points" +
            "        .stream()" +
            "        .map(item -> new LatLong(item.getLatitude(), item.getLongitude()))" +
            "        .collect(Collectors.toList());" +
            "}";

        ClassCustomization classCustomization = models.getClass("RouteLeg");
        classCustomization.removeMethod("getPoints");
        classCustomization.addMethod(getPointsMethod, Arrays.asList("java.util.List",
            "java.util.stream.Collectors", "java.util.Arrays"));
    }

    // Customizes the RouteInstruction class
    private void customizeRouteInstruction(PackageCustomization models) {
        ClassCustomization classCustomization = models.getClass("RouteInstruction");
        MethodCustomization methodCustomization = classCustomization.getMethod("getPoint");
        methodCustomization.setReturnType("LatLong", "new LatLong(returnValue.getLatitude(), " +
            "returnValue.getLongitude())");
        classCustomization.removeMethod("setPoint");
    }

    // Customizes the RouteRange class
    private void customizeRouteRange(PackageCustomization models) {
        ClassCustomization classCustomization = models.getClass("RouteRange");

        // replaces getBoundary()
        final String getBoundaryMethod =
            "/** " +
            "* Returns a list of {@link LatLong} coordinates." +
            "* " +
            "* return the coordinates" +
            "*/" +
            "public List<LatLong> getBoundary() {" +
            "    return this.boundary" +
            "        .stream()" +
            "        .map(item -> new LatLong(item.getLatitude(), item.getLongitude()))" +
            "        .collect(Collectors.toList());" +
            "}";

        classCustomization.removeMethod("getBoundary");
        classCustomization.addMethod(getBoundaryMethod, Arrays.asList("java.util.List",
            "java.util.stream.Collectors", "java.util.Arrays"));

        // changes the Center property to be LatLong
        MethodCustomization methodCustomization = classCustomization.getMethod("getCenter");
        methodCustomization.setReturnType("LatLong", "new LatLong(returnValue.getLatitude(), " +
            "returnValue.getLongitude())");
        classCustomization.removeMethod("setCenter");
    }

    // Customizes the RouteDirectionsBatchItem class
    private void customizeDirectionsBatchItem(PackageCustomization models) {
        ClassCustomization classCustomization = models.getClass("RouteDirectionsBatchItem");

        // replaces getResponse() with getError
        final String getErrorMethod =
            "/** " +
            "* Returns the {@link ErrorDetail} in case of an error response." +
            "* " +
            "* return {@code ErrorDetail}" +
            "*/" +
            "public ErrorDetail getError() {" +
            "    return this.response.getError();" +
            "}";

        // classCustomization.removeMethod("getResponse");
        classCustomization.addMethod(getErrorMethod);

        // Adds getRouteDirections()
        final String getRouteDirectionsMethod =
            "/** " +
            "* Returns the {@link RouteDirections} associated with the response." +
            "* " +
            "* return {@code RouteDirections}" +
            "*/" +
            "public RouteDirections getRouteDirections() {" +
            "    return (RouteDirections)this.response;" +
            "}";
        classCustomization.addMethod(getRouteDirectionsMethod);

        // remove getResponse
        classCustomization.removeMethod("getResponse");
    }
}
