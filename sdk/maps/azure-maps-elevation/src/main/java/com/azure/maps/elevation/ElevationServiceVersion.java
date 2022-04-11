package com.azure.maps.elevation;

import com.azure.core.util.ServiceVersion;

public enum ElevationServiceVersion implements ServiceVersion {
    /**
     * Service version {@code 1.0}.
     */
    V1_0("1.0");

    private final String version;

    /**
     * Creates a new {@link ElevationServiceVersion} with a version string.
     *
     * @param version
     */
    ElevationServiceVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the latest service version supported by this client library
     *
     * @return the latest {@link ElevationServiceVersion}
     */
    public static ElevationServiceVersion getLatest() {
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