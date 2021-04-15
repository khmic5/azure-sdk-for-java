// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.models.StreamType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** Definition of the source control sync job stream by id. */
@JsonFlatten
@Fluent
public class SourceControlSyncJobStreamByIdInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SourceControlSyncJobStreamByIdInner.class);

    /*
     * Resource id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The sync job stream id.
     */
    @JsonProperty(value = "properties.sourceControlSyncJobStreamId")
    private String sourceControlSyncJobStreamId;

    /*
     * The summary of the sync job stream.
     */
    @JsonProperty(value = "properties.summary")
    private String summary;

    /*
     * The time of the sync job stream.
     */
    @JsonProperty(value = "properties.time", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime time;

    /*
     * The type of the sync job stream.
     */
    @JsonProperty(value = "properties.streamType")
    private StreamType streamType;

    /*
     * The text of the sync job stream.
     */
    @JsonProperty(value = "properties.streamText")
    private String streamText;

    /*
     * The values of the job stream.
     */
    @JsonProperty(value = "properties.value")
    private Map<String, Object> value;

    /**
     * Get the id property: Resource id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the sourceControlSyncJobStreamId property: The sync job stream id.
     *
     * @return the sourceControlSyncJobStreamId value.
     */
    public String sourceControlSyncJobStreamId() {
        return this.sourceControlSyncJobStreamId;
    }

    /**
     * Set the sourceControlSyncJobStreamId property: The sync job stream id.
     *
     * @param sourceControlSyncJobStreamId the sourceControlSyncJobStreamId value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withSourceControlSyncJobStreamId(String sourceControlSyncJobStreamId) {
        this.sourceControlSyncJobStreamId = sourceControlSyncJobStreamId;
        return this;
    }

    /**
     * Get the summary property: The summary of the sync job stream.
     *
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: The summary of the sync job stream.
     *
     * @param summary the summary value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the time property: The time of the sync job stream.
     *
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Get the streamType property: The type of the sync job stream.
     *
     * @return the streamType value.
     */
    public StreamType streamType() {
        return this.streamType;
    }

    /**
     * Set the streamType property: The type of the sync job stream.
     *
     * @param streamType the streamType value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withStreamType(StreamType streamType) {
        this.streamType = streamType;
        return this;
    }

    /**
     * Get the streamText property: The text of the sync job stream.
     *
     * @return the streamText value.
     */
    public String streamText() {
        return this.streamText;
    }

    /**
     * Set the streamText property: The text of the sync job stream.
     *
     * @param streamText the streamText value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withStreamText(String streamText) {
        this.streamText = streamText;
        return this;
    }

    /**
     * Get the value property: The values of the job stream.
     *
     * @return the value value.
     */
    public Map<String, Object> value() {
        return this.value;
    }

    /**
     * Set the value property: The values of the job stream.
     *
     * @param value the value value to set.
     * @return the SourceControlSyncJobStreamByIdInner object itself.
     */
    public SourceControlSyncJobStreamByIdInner withValue(Map<String, Object> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}