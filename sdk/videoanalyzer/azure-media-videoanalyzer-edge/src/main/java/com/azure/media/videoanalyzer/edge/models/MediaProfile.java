// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing the ONVIF MediaProfiles. */
@Fluent
public final class MediaProfile {
    /*
     * The name of the Media Profile.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Object representing the URI that will be used to request for media
     * streaming.
     */
    @JsonProperty(value = "mediaUri")
    private Object mediaUri;

    /*
     * The Video encoder configuration.
     */
    @JsonProperty(value = "videoEncoderConfiguration")
    private VideoEncoderConfiguration videoEncoderConfiguration;

    /**
     * Get the name property: The name of the Media Profile.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Media Profile.
     *
     * @param name the name value to set.
     * @return the MediaProfile object itself.
     */
    public MediaProfile setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the mediaUri property: Object representing the URI that will be used to request for media streaming.
     *
     * @return the mediaUri value.
     */
    public Object getMediaUri() {
        return this.mediaUri;
    }

    /**
     * Set the mediaUri property: Object representing the URI that will be used to request for media streaming.
     *
     * @param mediaUri the mediaUri value to set.
     * @return the MediaProfile object itself.
     */
    public MediaProfile setMediaUri(Object mediaUri) {
        this.mediaUri = mediaUri;
        return this;
    }

    /**
     * Get the videoEncoderConfiguration property: The Video encoder configuration.
     *
     * @return the videoEncoderConfiguration value.
     */
    public VideoEncoderConfiguration getVideoEncoderConfiguration() {
        return this.videoEncoderConfiguration;
    }

    /**
     * Set the videoEncoderConfiguration property: The Video encoder configuration.
     *
     * @param videoEncoderConfiguration the videoEncoderConfiguration value to set.
     * @return the MediaProfile object itself.
     */
    public MediaProfile setVideoEncoderConfiguration(VideoEncoderConfiguration videoEncoderConfiguration) {
        this.videoEncoderConfiguration = videoEncoderConfiguration;
        return this;
    }
}
