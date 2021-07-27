// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HillinessDegree. */
public final class HillinessDegree extends ExpandableStringEnum<HillinessDegree> {
    /** Static value low for HillinessDegree. */
    public static final HillinessDegree LOW = fromString("low");

    /** Static value normal for HillinessDegree. */
    public static final HillinessDegree NORMAL = fromString("normal");

    /** Static value high for HillinessDegree. */
    public static final HillinessDegree HIGH = fromString("high");

    /**
     * Creates or finds a HillinessDegree from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HillinessDegree.
     */
    @JsonCreator
    public static HillinessDegree fromString(String name) {
        return fromString(name, HillinessDegree.class);
    }

    /** @return known HillinessDegree values. */
    public static Collection<HillinessDegree> values() {
        return values(HillinessDegree.class);
    }
}
