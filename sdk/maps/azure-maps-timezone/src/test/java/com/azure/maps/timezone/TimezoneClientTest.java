package com.azure.maps.timezone;

import java.io.IOException;
import java.util.List;

import com.azure.core.http.HttpClient;
import com.azure.core.models.GeoPosition;
import com.azure.maps.timezone.models.IanaId;
import com.azure.maps.timezone.models.TimezoneCoordinateOptions;
import com.azure.maps.timezone.models.TimezoneIDOptions;
import com.azure.maps.timezone.models.TimezoneIanaVersionResult;
import com.azure.maps.timezone.models.TimezoneOptions;
import com.azure.maps.timezone.models.TimezoneResult;
import com.azure.maps.timezone.models.TimezoneWindows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TimezoneClientTest extends TimezoneClientTestBase {
    private TimezoneClient client;
    private static final String DISPLAY_NAME_WITH_ARGUMENTS = "{displayName} with [{arguments}]";

    private TimezoneClient getTimezoneClient(HttpClient httpClient, TimezoneServiceVersion serviceVersion) {
        return getTimezoneAsyncClientBuilder(httpClient, serviceVersion).buildClient();
    }

    // Test get timezone by id
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.timezone.TestUtils#getTestParameters")
    public void testGetTimezoneById(HttpClient httpClient, TimezoneServiceVersion serviceVersion) throws IOException {
        client = getTimezoneClient(httpClient, serviceVersion);
        TimezoneIDOptions options = new TimezoneIDOptions().setTimezoneId("Asia/Bahrain").setOptions(TimezoneOptions.ALL).setAcceptLanguage(null)
            .setTimeStamp(null).setDaylightSavingsTimeFrom(null).setDaylightSavingsTimeLastingYears(null);
        TimezoneResult actualResult = client.getTimezoneByID(options);
        TimezoneResult expectedResult = TestUtils.getExpectedTimezoneById();
        validateGetTimezoneById(actualResult, expectedResult);
    }

    // Test get timezone by id with response

    // Test get timezone by coordinates 
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.timezone.TestUtils#getTestParameters")
    public void testGetTimezoneByCoordinates(HttpClient httpClient, TimezoneServiceVersion serviceVersion) throws IOException {
        client = getTimezoneClient(httpClient, serviceVersion);
        GeoPosition coordinate = new GeoPosition(-122, 47.0);
        TimezoneCoordinateOptions options = new TimezoneCoordinateOptions().setCoordinates(coordinate).setOptions(TimezoneOptions.ALL);
        TimezoneResult actualResult = client.getTimezoneByCoordinates(options);
        TimezoneResult expectedResult = TestUtils.getExpectedTimezoneByCoordinates();
        validateGetTimezoneByCoordinates(actualResult, expectedResult);
    }

    // Test get timezone by coordinates with response

    // Test get windows timezone ids
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.timezone.TestUtils#getTestParameters")
    public void testGetWindowsTimezoneIds(HttpClient httpClient, TimezoneServiceVersion serviceVersion) throws IOException {
        client = getTimezoneClient(httpClient, serviceVersion);
        List<TimezoneWindows> actualResult = client.getWindowsTimezoneIds();
        List<TimezoneWindows> expectedResult = TestUtils.getExpectedWindowsTimezoneIds();
        validateGetWindowsTimezoneIds(actualResult, expectedResult);
    }

    // Test get windows timezone ids with response

    // Test get iana timezone ids
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.timezone.TestUtils#getTestParameters")
    public void testGetIanaTimezoneIds(HttpClient httpClient, TimezoneServiceVersion serviceVersion) throws IOException {
        client = getTimezoneClient(httpClient, serviceVersion);
        List<IanaId> actualResult = client.getIanaTimezoneIds();
        List<IanaId> expectedResult = TestUtils.getExpectedIanaTimezoneIds();
        validateGetIanaTimezoneIds(actualResult, expectedResult);
    }

    // Test getiana timezone ids with response

    // Test get iana version
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.timezone.TestUtils#getTestParameters")
    public void testGetIanaVersion(HttpClient httpClient, TimezoneServiceVersion serviceVersion) throws IOException {
        client = getTimezoneClient(httpClient, serviceVersion);
        TimezoneIanaVersionResult actualResult = client.getIanaVersion();
        TimezoneIanaVersionResult expectedResult = TestUtils.getExpectedIanaVersion();
        validateGetIanaVersion(actualResult, expectedResult);
    }

    // Test get iana version with response

    // Test convert windows timezone to iana
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.maps.timezone.TestUtils#getTestParameters")
    public void testGetConvertWindowsTimezoneToIana(HttpClient httpClient, TimezoneServiceVersion serviceVersion) throws IOException {
        client = getTimezoneClient(httpClient, serviceVersion);
        List<IanaId> actualResult = client.convertWindowsTimezoneToIana("pacific standard time", null);
        List<IanaId> expectedResult = TestUtils.getExpectedConvertWindowsTimezoneToIana();
        validateConvertWindowsTimezoneToIana(actualResult, expectedResult);
    }

    // Test convert windows timezone to iana with response
}
