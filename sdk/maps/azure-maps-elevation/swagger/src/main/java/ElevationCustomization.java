import java.util.Arrays;

import com.azure.autorest.customization.ClassCustomization;
import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.LibraryCustomization;
import com.azure.autorest.customization.PackageCustomization;

import org.slf4j.Logger;

/**
 * Customization class for Queue Storage.
 */
public class ElevationCustomization extends Customization {

    @Override
    public void customize(LibraryCustomization customization, Logger logger) {
        PackageCustomization models = customization.getPackage("com.azure.maps.elevation.models");
        
        // customize elevation
        customizeElevation(models);

    }

    // Customizes the Elevation class
    private void customizeElevation(PackageCustomization models) {
        ClassCustomization classCustomization = models.getClass("Elevation");
        classCustomization.removeMethod("getCoordinate");
        final String getCoordinateMethod = 
            "/**" +
            " * Returns a {@link GeoPosition} coordinate." +
            "*" +
            "* return the coordinate" +
            "*/" + 
            "public GeoPosition getCoordinate() {" +
            "       return new GeoPosition(this.coordinate.getLongitude(), this.coordinate.getLatitude());" +
            "}";
        classCustomization.addMethod(getCoordinateMethod, Arrays.asList("com.azure.core.models.GeoPosition"));
        classCustomization.removeMethod("setCoordinate");
    }
}