package com.azure.maps.search.models;

import java.util.List;

/**
 * Class holding optional parameters for Geometry Search.
 */
public class BaseSearchGeometryOptions<T extends BaseSearchGeometryOptions<T>> {
    private Integer top;
    private List<Integer> categoryFilter;
    private OperatingHoursRange operatingHours;
    private LocalizedMapView localizedMapView;

    /**
     * Returns the localized map view.
     * @return
     */
    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    /**
     * Returns the category filter.
     * @return
     */
    public List<Integer> getCategoryFilter() {
        return categoryFilter;
    }

    /**
     * Returns the top results.
     * @return
     */
    public Integer getTop() {
        return top;
    }

    /**
     * Returns the operating hours.
     * @return
     */
    public OperatingHoursRange getOperatingHours() {
        return operatingHours;
    }

    /**
     * Sets the category filter.
     * @param categoryFilter
     * @return
     */
    @SuppressWarnings("unchecked")
    public T categoryFilter(List<Integer> categoryFilter) {
        this.categoryFilter = categoryFilter;
        return (T) this;
    }

    /**
     * Sets the top value.
     * @param top
     * @return
     */
    @SuppressWarnings("unchecked")
    public T top(Integer top) {
        this.top = top;
        return (T) this;
    }

    /**
     * Sets the localized map view.
     * @param localizedMapView
     * @return
     */
    @SuppressWarnings("unchecked")
    public T localizedMapView(LocalizedMapView localizedMapView) {
        this.localizedMapView = localizedMapView;
        return (T) this;
    }

    /**
     * Sets the operating hours.
     * @param operatingHours
     * @return
     */
    @SuppressWarnings("unchecked")
    public T operatingHours(OperatingHoursRange operatingHours) {
        this.operatingHours = operatingHours;
        return (T) this;
    }
}
