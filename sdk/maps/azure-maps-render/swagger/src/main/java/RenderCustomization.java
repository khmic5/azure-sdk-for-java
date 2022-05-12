import org.slf4j.Logger;

import java.util.Arrays;

import com.azure.autorest.customization.ClassCustomization;
import com.azure.autorest.customization.ConstructorCustomization;
import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.PackageCustomization;

import com.azure.autorest.customization.LibraryCustomization;
import com.azure.autorest.customization.MethodCustomization;

public class RenderCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization customization, Logger logger) {
        PackageCustomization models = customization.getPackage("com.azure.maps.render.models");

         // customize maptileset
        //  customizeMapTileset(models);

         // custome error repsponse exception
         customizeErrorResponseException(models);
    }

    // Customizes the MapTileset class
    private void customizeMapTileset(PackageCustomization models) {
        final String getBoundsMethod =
            "/** " +
            "* Returns a {@link GeoBoundingBox} geometric bounding box. Return the geoboundingbox" +
            "Bounds must define an area covered by all zoom levels. The bounds are represented in WGS:84 latitude and longitude values " +
            "in the order left, bottom, right, top. Values may be integers or floating point numbers." +
            "*/" +
            "public GeoBoundingBox getBounds() {" +
            "    return new GeoBoundingBox(this.bounds.get(0), this.bounds.get(1), this.bounds.get(2), this.bounds.get(3));" +
            "}";
        final String getCenterMethod =
            "/** " +
            "* Returns a {@link GeoPosition} coordinate." +
            "Get the center property: The default location of the tileset in the form [longitutde, latitude, zoom]. " +
            "The zoom level must be between minzoom and maxzoom. Implementation can use this value to set the default location." +
            "@Return the center value" +
            "*/" +
            "public GeoPosition getCenter() {" +
            "    return new GeoPosition(this.center.get(0).doubleValue(), this.center.get(1).doubleValue(), this.center.get(2).doubleValue());" +
            "}";
        ClassCustomization classCustomization = models.getClass("MapTileset");
        classCustomization.removeMethod("getBounds");
        classCustomization.removeMethod("setBounds");
        classCustomization.removeMethod("getCenter");
        classCustomization.removeMethod("setCenter");
        classCustomization.addMethod(getBoundsMethod, Arrays.asList("com.azure.core.models.GeoBoundingBox"));
        classCustomization.addMethod(getCenterMethod, Arrays.asList("com.azure.core.models.GeoPosition"));
    }

    // Customizes the ErrorResponseException class
    private void customizeErrorResponseException(PackageCustomization models) {
        ClassCustomization classCustomization = models.getClass("ErrorResponseException");
        MethodCustomization mc = classCustomization.getMethod("getValue");
        // mc.rename("hello");
        ClassCustomization cc = models.getClass("ErrorResponseException");
        cc.removeMethod("getValue");
        // classCustomization.getConstructor("ErrorResponseException(String message, HttpResponse response, ErrorResponse value)")
        //     .replaceParameters("String message, HttpResponse response, ResponseError value");
        // final String errorResponseExceptionMethod = 
        //     "/** " +
        //     "* Initializes a new instance of the ErrorResponseException class." +
        //     "* @param message the exception message or the response content if a message is not available." +
        //     "* @param response the HTTP response." +
        //     "* @param value the deserialized response value." +
        //     "*/" +
        //     "public ErrorResponseException(String message, HttpResponse response, ResponseError value) {" +
        //     "    super(message, response, value);" +
        //     "}";
        // final String getValueMethod = 
        //     "@Override" +
        //     "/** " +
        //     "* Gets the deserialized response value." +
        //     "*/" +
        //     "@Override" +
        //     "public ResponseError getValue() {" +
        //     "    return (ResponseError) super.getValue();" +
        //     "}";
        // classCustomization.addConstructor(errorResponseExceptionMethod, Arrays.asList("com.azure.core.models.ResponseError"));
        // classCustomization.addMethod(getValueMethod, Arrays.asList("com.azure.core.models.ResponseError"));
    }
}
