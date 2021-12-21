// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The address of the result. */
@Immutable
public final class AddressPrivate {
    /*
     * The building number on the street. DEPRECATED, use streetNumber instead.
     */
    @JsonProperty(value = "buildingNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String buildingNumber;

    /*
     * The street name. DEPRECATED, use streetName instead.
     */
    @JsonProperty(value = "street", access = JsonProperty.Access.WRITE_ONLY)
    private String street;

    /*
     * The name of the street being crossed.
     */
    @JsonProperty(value = "crossStreet", access = JsonProperty.Access.WRITE_ONLY)
    private String crossStreet;

    /*
     * The building number on the street.
     */
    @JsonProperty(value = "streetNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String streetNumber;

    /*
     * The codes used to unambiguously identify the street
     */
    @JsonProperty(value = "routeNumbers", access = JsonProperty.Access.WRITE_ONLY)
    private List<Integer> routeNumbers;

    /*
     * The street name.
     */
    @JsonProperty(value = "streetName", access = JsonProperty.Access.WRITE_ONLY)
    private String streetName;

    /*
     * The street name and number.
     */
    @JsonProperty(value = "streetNameAndNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String streetNameAndNumber;

    /*
     * City / Town
     */
    @JsonProperty(value = "municipality", access = JsonProperty.Access.WRITE_ONLY)
    private String municipality;

    /*
     * Sub / Super City
     */
    @JsonProperty(value = "municipalitySubdivision", access = JsonProperty.Access.WRITE_ONLY)
    private String municipalitySubdivision;

    /*
     * Named Area
     */
    @JsonProperty(value = "countryTertiarySubdivision", access = JsonProperty.Access.WRITE_ONLY)
    private String countryTertiarySubdivision;

    /*
     * County
     */
    @JsonProperty(value = "countrySecondarySubdivision", access = JsonProperty.Access.WRITE_ONLY)
    private String countrySecondarySubdivision;

    /*
     * State or Province
     */
    @JsonProperty(value = "countrySubdivision", access = JsonProperty.Access.WRITE_ONLY)
    private String countrySubdivision;

    /*
     * Postal Code / Zip Code
     */
    @JsonProperty(value = "postalCode", access = JsonProperty.Access.WRITE_ONLY)
    private String postalCode;

    /*
     * Extended postal code (availability is dependent on the region).
     */
    @JsonProperty(value = "extendedPostalCode", access = JsonProperty.Access.WRITE_ONLY)
    private String extendedPostalCode;

    /*
     * Country (Note: This is a two-letter code, not a country name.)
     */
    @JsonProperty(value = "countryCode", access = JsonProperty.Access.WRITE_ONLY)
    private String countryCode;

    /*
     * Country name
     */
    @JsonProperty(value = "country", access = JsonProperty.Access.WRITE_ONLY)
    private String country;

    /*
     * ISO alpha-3 country code
     */
    @JsonProperty(value = "countryCodeISO3", access = JsonProperty.Access.WRITE_ONLY)
    private String countryCodeISO3;

    /*
     * An address line formatted according to the formatting rules of a
     * Result's country of origin, or in the case of a country, its full
     * country name.
     */
    @JsonProperty(value = "freeformAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String freeformAddress;

    /*
     * The full name of a first level of country administrative hierarchy. This
     * field appears only in case countrySubdivision is presented in an
     * abbreviated form. Only supported for USA, Canada, and Great Britain.
     */
    @JsonProperty(value = "countrySubdivisionName", access = JsonProperty.Access.WRITE_ONLY)
    private String countrySubdivisionName;

    /*
     * An address component which represents the name of a geographic area or
     * locality that groups a number of addressable objects for addressing
     * purposes, without being an administrative unit. This field is used to
     * build the `freeformAddress` property.
     */
    @JsonProperty(value = "localName", access = JsonProperty.Access.WRITE_ONLY)
    private String localName;

    /*
     * The bounding box of the location.
     */
    @JsonProperty(value = "boundingBox", access = JsonProperty.Access.WRITE_ONLY)
    private BoundingBoxCompassNotation boundingBox;

    /**
     * Get the buildingNumber property: The building number on the street. DEPRECATED, use streetNumber instead.
     *
     * @return the buildingNumber value.
     */
    public String getBuildingNumber() {
        return this.buildingNumber;
    }

    /**
     * Get the street property: The street name. DEPRECATED, use streetName instead.
     *
     * @return the street value.
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Get the crossStreet property: The name of the street being crossed.
     *
     * @return the crossStreet value.
     */
    public String getCrossStreet() {
        return this.crossStreet;
    }

    /**
     * Get the streetNumber property: The building number on the street.
     *
     * @return the streetNumber value.
     */
    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * Get the routeNumbers property: The codes used to unambiguously identify the street.
     *
     * @return the routeNumbers value.
     */
    public List<Integer> getRouteNumbers() {
        return this.routeNumbers;
    }

    /**
     * Get the streetName property: The street name.
     *
     * @return the streetName value.
     */
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * Get the streetNameAndNumber property: The street name and number.
     *
     * @return the streetNameAndNumber value.
     */
    public String getStreetNameAndNumber() {
        return this.streetNameAndNumber;
    }

    /**
     * Get the municipality property: City / Town.
     *
     * @return the municipality value.
     */
    public String getMunicipality() {
        return this.municipality;
    }

    /**
     * Get the municipalitySubdivision property: Sub / Super City.
     *
     * @return the municipalitySubdivision value.
     */
    public String getMunicipalitySubdivision() {
        return this.municipalitySubdivision;
    }

    /**
     * Get the countryTertiarySubdivision property: Named Area.
     *
     * @return the countryTertiarySubdivision value.
     */
    public String getCountryTertiarySubdivision() {
        return this.countryTertiarySubdivision;
    }

    /**
     * Get the countrySecondarySubdivision property: County.
     *
     * @return the countrySecondarySubdivision value.
     */
    public String getCountrySecondarySubdivision() {
        return this.countrySecondarySubdivision;
    }

    /**
     * Get the countrySubdivision property: State or Province.
     *
     * @return the countrySubdivision value.
     */
    public String getCountrySubdivision() {
        return this.countrySubdivision;
    }

    /**
     * Get the postalCode property: Postal Code / Zip Code.
     *
     * @return the postalCode value.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Get the extendedPostalCode property: Extended postal code (availability is dependent on the region).
     *
     * @return the extendedPostalCode value.
     */
    public String getExtendedPostalCode() {
        return this.extendedPostalCode;
    }

    /**
     * Get the countryCode property: Country (Note: This is a two-letter code, not a country name.).
     *
     * @return the countryCode value.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Get the country property: Country name.
     *
     * @return the country value.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Get the countryCodeISO3 property: ISO alpha-3 country code.
     *
     * @return the countryCodeISO3 value.
     */
    public String getCountryCodeISO3() {
        return this.countryCodeISO3;
    }

    /**
     * Get the freeformAddress property: An address line formatted according to the formatting rules of a Result's
     * country of origin, or in the case of a country, its full country name.
     *
     * @return the freeformAddress value.
     */
    public String getFreeformAddress() {
        return this.freeformAddress;
    }

    /**
     * Get the countrySubdivisionName property: The full name of a first level of country administrative hierarchy. This
     * field appears only in case countrySubdivision is presented in an abbreviated form. Only supported for USA,
     * Canada, and Great Britain.
     *
     * @return the countrySubdivisionName value.
     */
    public String getCountrySubdivisionName() {
        return this.countrySubdivisionName;
    }

    /**
     * Get the localName property: An address component which represents the name of a geographic area or locality that
     * groups a number of addressable objects for addressing purposes, without being an administrative unit. This field
     * is used to build the `freeformAddress` property.
     *
     * @return the localName value.
     */
    public String getLocalName() {
        return this.localName;
    }

    /**
     * Get the boundingBox property: The bounding box of the location.
     *
     * @return the boundingBox value.
     */
    public BoundingBoxCompassNotation getBoundingBox() {
        return this.boundingBox;
    }
}
