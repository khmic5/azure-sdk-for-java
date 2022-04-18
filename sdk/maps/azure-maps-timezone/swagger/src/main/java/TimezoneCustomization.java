import java.util.Arrays;

import com.azure.autorest.customization.ClassCustomization;
import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.LibraryCustomization;
import com.azure.autorest.customization.MethodCustomization;
import com.azure.autorest.customization.PackageCustomization;
import org.slf4j.Logger;

public class TimezoneCustomization extends Customization {
    @Override
    public void customize(LibraryCustomization customization, Logger logger) {
        PackageCustomization models = customization.getPackage("com.azure.maps.timezone.models");

        // customize timezone id
        customizeTimezoneId(models);
    }

    // Customizes the timezone id class
    private void customizeTimezoneId(PackageCustomization models) {
        ClassCustomization classCustomization = models.getClass("TimezoneId");
        classCustomization.removeMethod("getRepresentativePoint");
        final String getRepresentativePointMethod = 
            "/**" +
            " * Returns a {@link GeoPosition} coordinate." +
            "*" +
            "* return the coordinate" +
            "*/" + 
            "public GeoPosition getRepresentativePoint() {" +
            "       return new GeoPosition(this.representativePoint.getLongitude(), this.representativePoint.getLatitude());" +
            "}";
        classCustomization.addMethod(getRepresentativePointMethod, Arrays.asList("com.azure.core.models.GeoPosition"));
    }
}
