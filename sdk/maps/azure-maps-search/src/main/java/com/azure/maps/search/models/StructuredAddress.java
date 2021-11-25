package com.azure.maps.search.models;

public class StructuredAddress {
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

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getCrossStreet() {
        return crossStreet;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getMunicipalitySubdivision() {
        return municipalitySubdivision;
    }

    public String getCountryTertiarySubdivision() {
        return countryTertiarySubdivision;
    }

    public String getCountrySecondarySubdivision() {
        return countrySecondarySubdivision;
    }

    public String getCountrySubdivision() {
        return countrySubdivision;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public StructuredAddress streetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public StructuredAddress streetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public StructuredAddress crossStreet(String crossStreet) {
        this.crossStreet = crossStreet;
        return this;
    }

    public StructuredAddress municipality(String municipality) {
        this.municipality = municipality;
        return this;
    }

    public StructuredAddress municipalitySubdivision(String municipalitySubdivision) {
        this.municipalitySubdivision = municipalitySubdivision;
        return this;
    }

    public StructuredAddress countryTertiarySubdivision(String countryTertiarySubdivision) {
        this.countryTertiarySubdivision = countryTertiarySubdivision;
        return this;
    }

    public StructuredAddress countrySecondarySubdivision(String countrySecondarySubdivision) {
        this.countrySecondarySubdivision = countrySecondarySubdivision;
        return this;
    }

    public StructuredAddress countrySubdivision(String countrySubdivision) {
        this.countrySubdivision = countrySubdivision;
        return this;
    }

    public StructuredAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public StructuredAddress countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
}
