// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.render.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for LocalizedMapView.
 */
public final class LocalizedMapView extends ExpandableStringEnum<LocalizedMapView> {
    /**
     * Static value AE for LocalizedMapView.
     */
    public static final LocalizedMapView AE = fromString("AE");

    /**
     * Static value AR for LocalizedMapView.
     */
    public static final LocalizedMapView AR = fromString("AR");

    /**
     * Static value BH for LocalizedMapView.
     */
    public static final LocalizedMapView BH = fromString("BH");

    /**
     * Static value IN for LocalizedMapView.
     */
    public static final LocalizedMapView IN = fromString("IN");

    /**
     * Static value IQ for LocalizedMapView.
     */
    public static final LocalizedMapView IQ = fromString("IQ");

    /**
     * Static value JO for LocalizedMapView.
     */
    public static final LocalizedMapView JO = fromString("JO");

    /**
     * Static value KW for LocalizedMapView.
     */
    public static final LocalizedMapView KW = fromString("KW");

    /**
     * Static value LB for LocalizedMapView.
     */
    public static final LocalizedMapView LB = fromString("LB");

    /**
     * Static value MA for LocalizedMapView.
     */
    public static final LocalizedMapView MA = fromString("MA");

    /**
     * Static value OM for LocalizedMapView.
     */
    public static final LocalizedMapView OM = fromString("OM");

    /**
     * Static value PK for LocalizedMapView.
     */
    public static final LocalizedMapView PK = fromString("PK");

    /**
     * Static value PS for LocalizedMapView.
     */
    public static final LocalizedMapView PS = fromString("PS");

    /**
     * Static value QA for LocalizedMapView.
     */
    public static final LocalizedMapView QA = fromString("QA");

    /**
     * Static value SA for LocalizedMapView.
     */
    public static final LocalizedMapView SA = fromString("SA");

    /**
     * Static value SY for LocalizedMapView.
     */
    public static final LocalizedMapView SY = fromString("SY");

    /**
     * Static value YE for LocalizedMapView.
     */
    public static final LocalizedMapView YE = fromString("YE");

    /**
     * Static value Auto for LocalizedMapView.
     */
    public static final LocalizedMapView AUTO = fromString("Auto");

    /**
     * Static value Unified for LocalizedMapView.
     */
    public static final LocalizedMapView UNIFIED = fromString("Unified");

    /**
     * Creates or finds a LocalizedMapView from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding LocalizedMapView.
     */
    @JsonCreator
    public static LocalizedMapView fromString(String name) {
        return fromString(name, LocalizedMapView.class);
    }

    /**
     * @return known LocalizedMapView values.
     */
    public static Collection<LocalizedMapView> values() {
        return values(LocalizedMapView.class);
    }
}
