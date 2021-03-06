// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing the MPEG4 Configuration. */
@Fluent
public final class VideoEncoderConfiguration {
    /*
     * The video codec used by the Media Profile.
     */
    @JsonProperty(value = "encoding")
    private VideoEncoding encoding;

    /*
     * Relative value representing the quality of the video.
     */
    @JsonProperty(value = "quality")
    private Float quality;

    /*
     * The Video Resolution.
     */
    @JsonProperty(value = "resolution")
    private VideoResolution resolution;

    /*
     * The Video's rate control.
     */
    @JsonProperty(value = "rateControl")
    private RateControl rateControl;

    /*
     * The H264 Configuration.
     */
    @JsonProperty(value = "h264")
    private H264Configuration h264;

    /*
     * The H264 Configuration.
     */
    @JsonProperty(value = "mpeg4")
    private Mpeg4Configuration mpeg4;

    /**
     * Get the encoding property: The video codec used by the Media Profile.
     *
     * @return the encoding value.
     */
    public VideoEncoding getEncoding() {
        return this.encoding;
    }

    /**
     * Set the encoding property: The video codec used by the Media Profile.
     *
     * @param encoding the encoding value to set.
     * @return the VideoEncoderConfiguration object itself.
     */
    public VideoEncoderConfiguration setEncoding(VideoEncoding encoding) {
        this.encoding = encoding;
        return this;
    }

    /**
     * Get the quality property: Relative value representing the quality of the video.
     *
     * @return the quality value.
     */
    public Float getQuality() {
        return this.quality;
    }

    /**
     * Set the quality property: Relative value representing the quality of the video.
     *
     * @param quality the quality value to set.
     * @return the VideoEncoderConfiguration object itself.
     */
    public VideoEncoderConfiguration setQuality(Float quality) {
        this.quality = quality;
        return this;
    }

    /**
     * Get the resolution property: The Video Resolution.
     *
     * @return the resolution value.
     */
    public VideoResolution getResolution() {
        return this.resolution;
    }

    /**
     * Set the resolution property: The Video Resolution.
     *
     * @param resolution the resolution value to set.
     * @return the VideoEncoderConfiguration object itself.
     */
    public VideoEncoderConfiguration setResolution(VideoResolution resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Get the rateControl property: The Video's rate control.
     *
     * @return the rateControl value.
     */
    public RateControl getRateControl() {
        return this.rateControl;
    }

    /**
     * Set the rateControl property: The Video's rate control.
     *
     * @param rateControl the rateControl value to set.
     * @return the VideoEncoderConfiguration object itself.
     */
    public VideoEncoderConfiguration setRateControl(RateControl rateControl) {
        this.rateControl = rateControl;
        return this;
    }

    /**
     * Get the h264 property: The H264 Configuration.
     *
     * @return the h264 value.
     */
    public H264Configuration getH264() {
        return this.h264;
    }

    /**
     * Set the h264 property: The H264 Configuration.
     *
     * @param h264 the h264 value to set.
     * @return the VideoEncoderConfiguration object itself.
     */
    public VideoEncoderConfiguration setH264(H264Configuration h264) {
        this.h264 = h264;
        return this;
    }

    /**
     * Get the mpeg4 property: The H264 Configuration.
     *
     * @return the mpeg4 value.
     */
    public Mpeg4Configuration getMpeg4() {
        return this.mpeg4;
    }

    /**
     * Set the mpeg4 property: The H264 Configuration.
     *
     * @param mpeg4 the mpeg4 value to set.
     * @return the VideoEncoderConfiguration object itself.
     */
    public VideoEncoderConfiguration setMpeg4(Mpeg4Configuration mpeg4) {
        this.mpeg4 = mpeg4;
        return this;
    }
}
