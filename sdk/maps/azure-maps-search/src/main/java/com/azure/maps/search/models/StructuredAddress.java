package com.azure.maps.search.models;

/**
 * StructuredAddress parameter for Search.
 */
public final class StructuredAddress {
    private String streetNumber;
    private String streetName;
    private String crossStreet;
    private String municipality;
    private String municipalitySubdivision;
    private String countryTertiarySubdivision;
    private String countrySecondarySubdivision;
    private String countrySubdivision;
    private String countryCode;
    private String postalCode;

    /**
     * Returns the street number.
     * @return
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Returns the street name.
     * @return
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Returns the cross street name.
     * @return
     */
    public String getCrossStreet() {
        return crossStreet;
    }

    /**
     * Returns the municipality.
     * @return
     */
    public String getMunicipality() {
        return municipality;
    }

    /**
     * Returns the municipality subdivision.
     * @return
     */
    public String getMunicipalitySubdivision() {
        return municipalitySubdivision;
    }

    /**
     * Returns the country tertiary subdivision.
     * @return
     */
    public String getCountryTertiarySubdivision() {
        return countryTertiarySubdivision;
    }

    /**
     * Returns the country secondary subdivision.
     * @return
     */
    public String getCountrySecondarySubdivision() {
        return countrySecondarySubdivision;
    }

    /**
     * Returns the country subdivision.
     * @return
     */
    public String getCountrySubdivision() {
        return countrySubdivision;
    }

    /**
     * Returns the country code.
     * @return
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Returns the postal code.
     * @return
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the street number.
     * @param streetNumber
     * @return
     */
    public StructuredAddress streetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     * Sets the street name.
     * @param streetName
     * @return
     */
    public StructuredAddress streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    /**
     * Sets the cross street.
     * @param crossStreet
     * @return
     */
    public StructuredAddress crossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
        return this;
    }

    /**
     * Sets the municipality.
     * @param municipality
     * @return
     */
    public StructuredAddress municipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    /**
     * Sets the municipality subdivision.
     * @param municipalitySubdivision
     * @return
     */
    public StructuredAddress municipalitySubdivision(String municipalitySubdivision) {
        this.municipalitySubdivision = municipalitySubdivision;
        return this;
    }

    /**
     * Sets the country tertiary subdivision.
     * @param countryTertiarySubdivision
     * @return
     */
    public StructuredAddress countryTertiarySubdivision(String countryTertiarySubdivision) {
        this.countryTertiarySubdivision = countryTertiarySubdivision;
        return this;
    }

    /**
     * Sets the country secondary subdivision.
     * @param countrySecondarySubdivision
     * @return
     */
    public StructuredAddress countrySecondarySubdivision(String countrySecondarySubdivision) {
        this.countrySecondarySubdivision = countrySecondarySubdivision;
        return this;
    }

    /**
     * Sets the country subdivision.
     * @param countrySubdivision
     * @return
     */
    public StructuredAddress countrySubdivision(String countrySubdivision) {
        this.countrySubdivision = countrySubdivision;
        return this;
    }

    /**
     * Sets the postal code.
     * @param postalCode
     * @return
     */
    public StructuredAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Sets the country code.
     * @param countryCode
     * @return
     */
    public StructuredAddress countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
}
