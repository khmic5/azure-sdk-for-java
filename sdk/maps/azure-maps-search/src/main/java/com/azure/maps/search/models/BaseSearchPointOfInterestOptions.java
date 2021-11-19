package com.azure.maps.search.models;

import java.util.List;

public class BaseSearchPointOfInterestOptions<T extends BaseSearchPointOfInterestOptions<T>> extends BaseSearchOptions<T> {
    private List<Integer> categoryFilter;
    private List<String> brandFilter;
    private List<ElectricVehicleConnector> electricVehicleConnectorFilter;
    private OperatingHoursRange operatingHours;

    public List<Integer> getCategoryFilter() {
        return categoryFilter;
    }

    public List<String> getBrandFilter() {
        return brandFilter;
    }

    public List<ElectricVehicleConnector> getElectricVehicleConnectorFilter() {
        return electricVehicleConnectorFilter;
    }

    public OperatingHoursRange getOperatingHours() {
        return operatingHours;
    }

    @SuppressWarnings("unchecked")
    public T categoryFilter(List<Integer> categoryFilter) {
        this.categoryFilter = categoryFilter;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T brandFilter(List<String> brandFilter) {
        this.brandFilter = brandFilter;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T electricVehicleConnectorFilter(List<ElectricVehicleConnector> electricVehicleConnectorFilter) {
        this.electricVehicleConnectorFilter = electricVehicleConnectorFilter;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T operatingHours(OperatingHoursRange operatingHours) {
        this.operatingHours = operatingHours;
        return (T) this;
    }
}
