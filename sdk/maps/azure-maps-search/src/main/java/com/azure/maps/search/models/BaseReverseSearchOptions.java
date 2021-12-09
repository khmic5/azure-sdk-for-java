package com.azure.maps.search.models;

/**
 * Class holding optional parameters for reverse search.
 */
public class BaseReverseSearchOptions<T extends BaseReverseSearchOptions<T>> {
    private String language;
    private Integer heading;
    private Integer radiusInMeters;
    private LocalizedMapView localizedMapView;

    /**
     * Returns the radius in meters.
     * @return
     */
    public Integer getRadiusInMeters() {
        return radiusInMeters;
    }

    /**
     * Returns the language.
     * @return
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Returns the localized map view.
     * @return
     */
    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    /**
     * Returns the heading.
     * @return
     */
    public Integer getHeading() {
        return heading;
    }

    /**
     * Sets the radius in meters.
     * @param radiusInMeters
     * @return
     */
    @SuppressWarnings("unchecked")
    public T radiusInMeters(Integer radiusInMeters) {
        this.radiusInMeters = radiusInMeters;
        return (T) this;
    }

    /**
     * Sets the heading.
     * @param heading
     * @return
     */
    @SuppressWarnings("unchecked")
    public T heading(Integer heading) {
        this.heading = heading;
        return (T) this;
    }

    /**
     * Sets the language.
     * @param language
     * @return
     */
    @SuppressWarnings("unchecked")
    public T language(String language) {
        this.language = language;
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
}
