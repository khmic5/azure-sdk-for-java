package com.azure.maps.search.models;

public class BaseReverseSearchOptions<T extends BaseReverseSearchOptions<T>> {
    private String language;
    private Integer heading;
    private Integer radiusInMeters;
    private LocalizedMapView localizedMapView;

    public Integer getRadiusInMeters() {
        return radiusInMeters;
    }

    public String getLanguage() {
        return language;
    }

    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    public Integer getHeading() {
        return heading;
    }

    @SuppressWarnings("unchecked")
    public T radiusInMeters(Integer radiusInMeters) {
        this.radiusInMeters = radiusInMeters;
        return (T) this;
    }

    @SuppressWarnings("unchecked")
    public T heading(Integer heading) {
        this.heading = heading;
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
}
