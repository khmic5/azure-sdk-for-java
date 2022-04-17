package com.azure.maps.geolocation;

import com.azure.core.util.ServiceVersion;

public enum GeolocationServiceVersion implements ServiceVersion {
    /**
     * Service version {@code 1.0}.
     */
    V1_0("1.0");

    private final String version;

    /**
     * Creates a new {@link GeolocationServiceVersion} with a version string.
     *
     * @param version
     */
    GeolocationServiceVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the latest service version supported by this client library
     *
     * @return the latest {@link GeolocationServiceVersion}
     */
    public static GeolocationServiceVersion getLatest() {
        return V1_0;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getVersion() {
        return this.version;
    }
}
