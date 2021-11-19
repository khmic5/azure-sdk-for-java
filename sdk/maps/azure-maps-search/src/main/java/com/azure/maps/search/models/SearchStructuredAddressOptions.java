package com.azure.maps.search.models;

import java.util.List;

public class SearchStructuredAddressOptions {
    private String language;
    private String countryCode;
    private Integer top;
    private Integer skip;
    private String streetNumber;
    private String streetName;
    private String crossStreet;
    private String municipality;
    private String municipalitySubdivision;
    private String countryTertiarySubdivision;
    private String countrySecondarySubdivision;
    private String countrySubdivision;
    private String postalCode;
    private List<SearchIndexes> extendedPostalCodesFor;
    private GeographicEntityType entityType;
    private LocalizedMapView localizedMapView;


    /**
     * @return String return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @return String return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * @return Integer return the top
     */
    public Integer getTop() {
        return top;
    }

    /**
     * @return Integer return the skip
     */
    public Integer getSkip() {
        return skip;
    }

    /**
     * @return String return the streetNumber
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * @return String return the streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * @return String return the crossStreet
     */
    public String getCrossStreet() {
        return crossStreet;
    }

    /**
     * @return String return the municipality
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * @return String return the municipalitySubdivision
     */
    public String getMunicipalitySubdivision() {
        return municipalitySubdivision;
    }

    /**
     * @return String return the countryTertiarySubdivision
     */
    public String getCountryTertiarySubdivision() {
        return countryTertiarySubdivision;
    }

    /**
     * @return String return the countrySecondarySubdivision
     */
    public String getCountrySecondarySubdivision() {
        return countrySecondarySubdivision;
    }

    /**
     * @return String return the countrySubdivision
     */
    public String getCountrySubdivision() {
        return countrySubdivision;
    }

    /**
     * @return String return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @return List<SearchIndexes> return the extendedPostalCodesFor
     */
    public List<SearchIndexes> getExtendedPostalCodesFor() {
        return extendedPostalCodesFor;
    }

    /**
     * @return GeographicEntityType return the entityType
     */
    public GeographicEntityType getEntityType() {
        return entityType;
    }

    /**
     * @return LocalizedMapView return the localizedMapView
     */
    public LocalizedMapView getLocalizedMapView() {
        return localizedMapView;
    }

    public SearchStructuredAddressOptions language(String language) {
        this.language = language;
        return this;
    }

    public SearchStructuredAddressOptions countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public SearchStructuredAddressOptions top(Integer top) {
        this.top = top;
        return this;
    }

    public SearchStructuredAddressOptions skip(Integer skip) {
        this.skip = skip;
        return this;
    }

    public SearchStructuredAddressOptions streetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public SearchStructuredAddressOptions streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public SearchStructuredAddressOptions crossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
        return this;
    }

    public SearchStructuredAddressOptions municipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    public SearchStructuredAddressOptions municipalitySubdivision(String municipalitySubdivision) {
        this.municipalitySubdivision = municipalitySubdivision;
        return this;
    }

    public SearchStructuredAddressOptions countryTertiarySubdivision(String countryTertiarySubdivision) {
        this.countryTertiarySubdivision = countryTertiarySubdivision;
        return this;
    }

    public SearchStructuredAddressOptions countrySecondarySubdivision(String countrySecondarySubdivision) {
        this.countrySecondarySubdivision = countrySecondarySubdivision;
        return this;
    }

    public SearchStructuredAddressOptions countrySubdivision(String countrySubdivision) {
        this.countrySubdivision = countrySubdivision;
        return this;
    }

    public SearchStructuredAddressOptions postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public SearchStructuredAddressOptions extendedPostalCodesFor(List<SearchIndexes> extendedPostalCodesFor) {
        this.extendedPostalCodesFor = extendedPostalCodesFor;
        return this;
    }

    public SearchStructuredAddressOptions entityType(GeographicEntityType entityType) {
        this.entityType = entityType;
        return this;
    }

    public SearchStructuredAddressOptions localizedMapView(LocalizedMapView localizedMapView) {
        this.localizedMapView = localizedMapView;
        return this;
    }
}
