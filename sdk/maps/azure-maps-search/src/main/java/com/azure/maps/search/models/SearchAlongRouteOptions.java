package com.azure.maps.search.models;

import java.util.List;

public class SearchAlongRouteOptions extends BaseSearchGeometryOptions<SearchAlongRouteOptions> {
    private List<String> brandFilter;
    private List<ElectricVehicleConnector> electricVehicleConnectorFilter;

    public List<String> getBrandFilter() {
        return brandFilter;
    }

    public List<ElectricVehicleConnector> getElectricVehicleConnectorFilter() {
        return electricVehicleConnectorFilter;
    }

    public SearchAlongRouteOptions brandFilter(List<String> brandFilter) {
        this.brandFilter = brandFilter;
        return this;
    }

    public SearchAlongRouteOptions electricVehicleConnectorFilter(List<ElectricVehicleConnector> electricVehicleConnectorFilter) {
        this.electricVehicleConnectorFilter = electricVehicleConnectorFilter;
        return this;
    }
}
