// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.route.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Details of the traffic event, using definitions in the [TPEG2-TEC](https://www.iso.org/standard/63116.html) standard.
 * Can contain effectCode and causes elements.
 */
@Fluent
public final class RouteResultSectionTec {
    /*
     * The effect on the traffic flow. Contains a value in the
     * tec001:EffectCode table, as defined in the
     * [TPEG2-TEC](https://www.iso.org/standard/63116.html) standard. Can be
     * used to color-code traffic events according to severity.
     */
    @JsonProperty(value = "effectCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer effectCode;

    /*
     * Causes array
     */
    @JsonProperty(value = "causes")
    private List<RouteResultSectionTecCause> causes;

    /**
     * Get the effectCode property: The effect on the traffic flow. Contains a value in the tec001:EffectCode table, as
     * defined in the [TPEG2-TEC](https://www.iso.org/standard/63116.html) standard. Can be used to color-code traffic
     * events according to severity.
     *
     * @return the effectCode value.
     */
    public Integer getEffectCode() {
        return this.effectCode;
    }

    /**
     * Get the causes property: Causes array.
     *
     * @return the causes value.
     */
    public List<RouteResultSectionTecCause> getCauses() {
        return this.causes;
    }

    /**
     * Set the causes property: Causes array.
     *
     * @param causes the causes value to set.
     * @return the RouteResultSectionTec object itself.
     */
    public RouteResultSectionTec setCauses(List<RouteResultSectionTecCause> causes) {
        this.causes = causes;
        return this;
    }
}
