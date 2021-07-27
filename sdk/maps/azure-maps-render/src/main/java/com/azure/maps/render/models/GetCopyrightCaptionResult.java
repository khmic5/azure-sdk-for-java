// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.maps.render.fluent.models.GetCopyrightCaptionResultInner;

/** An immutable client-side representation of GetCopyrightCaptionResult. */
public interface GetCopyrightCaptionResult {
    /**
     * Gets the formatVersion property: Format Version property.
     *
     * @return the formatVersion value.
     */
    String formatVersion();

    /**
     * Gets the copyrightsCaption property: Copyrights Caption property.
     *
     * @return the copyrightsCaption value.
     */
    String copyrightsCaption();

    /**
     * Gets the inner com.azure.maps.render.fluent.models.GetCopyrightCaptionResultInner object.
     *
     * @return the inner object.
     */
    GetCopyrightCaptionResultInner innerModel();
}
