package com.azure.maps.search.models;

import java.util.List;

public class BaseSearchGeometryOptions<T extends BaseSearchGeometryOptions<T>> {
    private Integer top;
    private List<Integer> categoryFilter;
    private OperatingHoursRange operatingHours;
    private LocalizedMapView localizedMapView;

    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    public List<Integer> getCategoryFilter() {
        return categoryFilter;
    }

    public Integer getTop() {
        return top;
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
    public T top(Integer top) {
        this.top = top;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T localizedMapView(LocalizedMapView localizedMapView) {
        this.localizedMapView = localizedMapView;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T opeartingHours(OperatingHoursRange operatingHours) {
        this.operatingHours = operatingHours;
        return (T) this;
    }
}
