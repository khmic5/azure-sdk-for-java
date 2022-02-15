package com.azure.maps.render;

import com.azure.core.util.ServiceVersion;

public enum RenderServiceVersion implements ServiceVersion{
     /**
     * Service version {@code 1.0}.
     */
    V1_0("1.0");

    private final String version;

    /**
     * Creates a new {@link MapsSearchServiceVersion} with a version string.
     *
     * @param version
     */
    RenderServiceVersion(String version) {
        this.version = version;
    }

    /**
     * Gets the latest service version supported by this client library
     *
     * @return the latest {@link MapsSearchServiceVersion}
     */
    public static RenderServiceVersion getLatest() {
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
