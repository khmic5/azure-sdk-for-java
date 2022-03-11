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

        // customize classes with the wrong getYear()
        customizeClassesWithString(models, "ActiveStorm", "getYear", "setYear");
        customizeClassesWithString(models, "StormSearchResultItem", "getYear", "setYear");
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

    // Customizes classes with getYear() as a String
    private void customizeClassesWithString(PackageCustomization models, String clazz, String getter, String setter) {
        ClassCustomization classCustomization = models.getClass(clazz);
        MethodCustomization methodCustomization = classCustomization.getMethod(getter);
        methodCustomization.setReturnType("Integer", "Integer.valueOf(returnValue)");
        classCustomization.removeMethod(setter);
    }
}
