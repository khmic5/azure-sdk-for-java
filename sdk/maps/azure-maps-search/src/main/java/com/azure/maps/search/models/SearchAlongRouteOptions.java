package com.azure.maps.search.models;

import java.util.List;

public class SearchAlongRouteOptions extends BaseSearchGeometryOptions<SearchAlongRouteOptions> {
    private List<String> brandFilter;
    private List<ElectricVehicleConnector> electricVehicleConnectorFilter;
    private Integer maxDetourTime;
    private SearchAlongRouteRequest route;

    public List<String> getBrandFilter() {
        return brandFilter;
    }

    public List<ElectricVehicleConnector> getElectricVehicleConnectorFilter() {
        return electricVehicleConnectorFilter;
    }

    public Integer getMaxDetourTime() {
        return this.maxDetourTime;
    }

    public SearchAlongRouteRequest getRoute() {
        return this.route;
    }

    public void setRoute(SearchAlongRouteRequest route) {
        this.route = route;
    }

    public SearchAlongRouteOptions brandFilter(List<String> brandFilter) {
        this.brandFilter = brandFilter;
        return this;
    }

    public SearchAlongRouteOptions electricVehicleConnectorFilter(List<ElectricVehicleConnector> electricVehicleConnectorFilter) {
        this.electricVehicleConnectorFilter = electricVehicleConnectorFilter;
        return this;
    }

    public SearchAlongRouteOptions maxDetourTime(Integer maxDetourTime) {
        this.maxDetourTime = maxDetourTime;
        return this;
    }

    public SearchAlongRouteOptions route(SearchAlongRouteRequest route) {
        this.route = route;
        return this;
    }

}
