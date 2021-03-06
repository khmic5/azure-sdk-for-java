// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A content line object consisting of an adjacent sequence of content elements, such as words and selection marks. */
@Fluent
public final class DocumentLine {
    /*
     * Concatenated content of the contained elements in reading order.
     */
    @JsonProperty(value = "content", required = true)
    private String content;

    /*
     * Bounding box of the line.
     */
    @JsonProperty(value = "boundingBox")
    private List<Float> boundingBox;

    /*
     * Location of the line in the reading order concatenated content.
     */
    @JsonProperty(value = "spans", required = true)
    private List<DocumentSpan> spans;

    /**
     * Get the content property: Concatenated content of the contained elements in reading order.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: Concatenated content of the contained elements in reading order.
     *
     * @param content the content value to set.
     * @return the DocumentLine object itself.
     */
    public DocumentLine setContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the boundingBox property: Bounding box of the line.
     *
     * @return the boundingBox value.
     */
    public List<Float> getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of the line.
     *
     * @param boundingBox the boundingBox value to set.
     * @return the DocumentLine object itself.
     */
    public DocumentLine setBoundingBox(List<Float> boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the spans property: Location of the line in the reading order concatenated content.
     *
     * @return the spans value.
     */
    public List<DocumentSpan> getSpans() {
        return this.spans;
    }

    /**
     * Set the spans property: Location of the line in the reading order concatenated content.
     *
     * @param spans the spans value to set.
     * @return the DocumentLine object itself.
     */
    public DocumentLine setSpans(List<DocumentSpan> spans) {
        this.spans = spans;
        return this;
    }
}
