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
public class RouteCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization customization, Logger logger) {
        PackageCustomization models = customization.getPackage("com.azure.maps.route.models");

        // customize route leg
        customizeRouteLeg(models);

        // customize route instruction
        customizeRouteInstruction(models);

        // customize route range
        customizeRouteRange(models);

        // customize route matrix
        customizeRouteMatrix(models);
        /*ClassCustomization classCustomization = models.getClass("RouteLeg");
        MethodCustomization methodCustomization = classCustomization.getMethod("getPoints");
        //methodCustomization.setReturnType("List<LatLong>",
        //    "%s.stream().map(item -> new LatLong(item.getLatitude(), item.getLongitude()).collect(java.util.Collectors.toList());");
        methodCustomization.setReturnType("UUID", "UUID.fromString(%s)");
        // System.out.println(models);
        */



        //MethodCustomization getId = foo.getMethod("getPoints");
        //getId.setReturnType("UUID", "UUID.fromString(%s)");; // change return type to UUID

        /*
        // Changes to JacksonXmlRootElement for classes that have been renamed.
        models.getClass("QueueAnalyticsLogging").removeAnnotation("@JacksonXmlRootElement")
            .addAnnotation("@JacksonXmlRootElement(localName = \"Logging\")");

        models.getClass("QueueMetrics").removeAnnotation("@JacksonXmlRootElement")
            .addAnnotation("@JacksonXmlRootElement(localName = \"Metrics\")");

        models.getClass("QueueRetentionPolicy").removeAnnotation("@JacksonXmlRootElement")
            .addAnnotation("@JacksonXmlRootElement(localName = \"RetentionPolicy\")");

        models.getClass("QueueServiceStatistics").removeAnnotation("@JacksonXmlRootElement")
            .addAnnotation("@JacksonXmlRootElement(localName = \"StorageServiceStats\")");

        models.getClass("QueueSignedIdentifier").removeAnnotation("@JacksonXmlRootElement")
            .addAnnotation("@JacksonXmlRootElement(localName = \"SignedIdentifier\")");

        models.getClass("QueueAccessPolicy").removeAnnotation("@JacksonXmlRootElement")
            .addAnnotation("@JacksonXmlRootElement(localName = \"AccessPolicy\")");
        */
    }

    // Customizes the RouteMatrix class by flattening the Response property.
    private void customizeRouteMatrix(PackageCustomization models) {
        ClassCustomization classCustomization = models.getClass("RouteMatrixPrivate");
        classCustomization.removeMethod("getResponse");
        final String getSummaryMethod =
            "/** " +
            "* Returns a {@link RouteLegSummary} summarizing this route section." +
            "*" +
            "* return RouteLegSummary" +
            "*/" +
            "public RouteLegSummary getSummary() {" +
            "    return this.response.getSummary();" +
            "}";
        classCustomization.addMethod(getSummaryMethod);
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
}
