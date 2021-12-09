package com.azure.maps.search.models;

import java.util.List;

/**
 * Class holding optional parameters for Search along a route.
 */
public final class SearchAlongRouteOptions extends BaseSearchGeometryOptions<SearchAlongRouteOptions> {
    private List<String> brandFilter;
    private List<ElectricVehicleConnector> electricVehicleConnectorFilter;

    /**
     * Returns the brand filter.
     * @return
     */
    public List<String> getBrandFilter() {
        return brandFilter;
    }

    /**
     * Returns the electric vehicle connector filter.
     * @return
     */
    public List<ElectricVehicleConnector> getElectricVehicleConnectorFilter() {
        return electricVehicleConnectorFilter;
    }

    /**
     * Sets the brand filter.
     * @param brandFilter
     * @return
     */
    public SearchAlongRouteOptions brandFilter(List<String> brandFilter) {
        this.brandFilter = brandFilter;
        return this;
    }

    /**
     * Sets the electric vehicle connector filter.
     * @param electricVehicleConnectorFilter
     * @return
     */
    public SearchAlongRouteOptions electricVehicleConnectorFilter(List<ElectricVehicleConnector> electricVehicleConnectorFilter) {
        this.electricVehicleConnectorFilter = electricVehicleConnectorFilter;
        return this;
    }
}
