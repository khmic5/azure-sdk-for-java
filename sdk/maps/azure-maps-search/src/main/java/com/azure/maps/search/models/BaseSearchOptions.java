package com.azure.maps.search.models;

import java.util.List;
import java.util.Optional;

public class BaseSearchOptions<T extends BaseSearchOptions<T>> {
    private Integer top;
    private Integer skip;
    private List<String> countryFilter;
    private LatLong coordinates;
    private Integer radiusInMeters;
    private BoundingBox boundingBox;
    private String language;
    private LocalizedMapView localizedMapView;

    public Integer getTop() {
        return top;
    }

    public Integer getSkip() {
        return skip;
    }

    public List<String> getCountryFilter() {
        return countryFilter;
    }

    public Integer getRadiusInMeters() {
        return radiusInMeters;
    }

    public Optional<BoundingBox> getBoundingBox() {
        return Optional.ofNullable(boundingBox);
    }

    public String getLanguage() {
        return language;
    }

    public Optional<LatLong> getCoordinates() {
        return Optional.ofNullable(this.coordinates);
    }

    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    @SuppressWarnings("unchecked")
    public T top(Integer top) {
        this.top = top;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T skip(Integer skip) {
        this.skip = skip;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T countryFilter(List<String> countryFilter) {
        this.countryFilter = countryFilter;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T radiusInMeters(Integer radiusInMeters) {
        this.radiusInMeters = radiusInMeters;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T boundingBox(BoundingBox box) {
        this.boundingBox = box;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T language(String language) {
        this.language = language;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T localizedMapView(LocalizedMapView localizedMapView) {
        this.localizedMapView = localizedMapView;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T coordinates(LatLong coordinates) {
        this.coordinates = coordinates;
        return (T) this;
    }
}
