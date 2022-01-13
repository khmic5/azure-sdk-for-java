package com.azure.maps.search;

import com.azure.core.util.ServiceVersion;

public enum MapsSearchServiceVersion implements ServiceVersion {
    /**
     * Service version {@code 1.0}.
     */
    V1_0("1.0");

    private final String version;

    MapsSearchServiceVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the latest service version supported by this client library
     *
     * @return the latest {@link MapsSearchServiceVersion}
     */
    public static MapsSearchServiceVersion getLatest() {
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
