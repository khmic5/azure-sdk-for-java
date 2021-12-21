// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.

package com.azure.maps.search.models;

import java.util.List;

import com.azure.core.annotation.Immutable;
import com.azure.maps.search.implementation.models.AddressPrivate;

/** The address of the result. */
@Immutable
public final class Address {
    private AddressPrivate internalModel;

    /**
     * Internal model
     * @param addressPrivate
     */
    Address(AddressPrivate addressPrivate) {
        this.internalModel = addressPrivate;
    }

    /**
     * Get the buildingNumber property: The building number on the street. DEPRECATED, use streetNumber instead.
     *
     * @return the buildingNumber value.
     */
    public String getBuildingNumber() {
        return this.internalModel.getBuildingNumber();
    }

    /**
     * Get the street property: The street name. DEPRECATED, use streetName instead.
     *
     * @return the street value.
     */
    public String getStreet() {
        return this.internalModel.getStreet();
    }

    /**
     * Get the crossStreet property: The name of the street being crossed.
     *
     * @return the crossStreet value.
     */
    public String getCrossStreet() {
        return this.internalModel.getCrossStreet();
    }

    /**
     * Get the streetNumber property: The building number on the street.
     *
     * @return the streetNumber value.
     */
    public String getStreetNumber() {
        return this.internalModel.getStreetNumber();
    }

    /**
     * Get the routeNumbers property: The codes used to unambiguously identify the street.
     *
     * @return the routeNumbers value.
     */
    public List<Integer> getRouteNumbers() {
        return this.internalModel.getRouteNumbers();
    }

    /**
     * Get the streetName property: The street name.
     *
     * @return the streetName value.
     */
    public String getStreetName() {
        return this.internalModel.getStreetName();
    }

    /**
     * Get the streetNameAndNumber property: The street name and number.
     *
     * @return the streetNameAndNumber value.
     */
    public String getStreetNameAndNumber() {
        return this.getStreetNameAndNumber();
    }

    /**
     * Get the municipality property: City / Town.
     *
     * @return the municipality value.
     */
    public String getMunicipality() {
        return this.internalModel.getMunicipality();
    }

    /**
     * Get the municipalitySubdivision property: Sub / Super City.
     *
     * @return the municipalitySubdivision value.
     */
    public String getMunicipalitySubdivision() {
        return this.internalModel.getMunicipalitySubdivision();
    }

    /**
     * Get the countryTertiarySubdivision property: Named Area.
     *
     * @return the countryTertiarySubdivision value.
     */
    public String getCountryTertiarySubdivision() {
        return this.getCountryTertiarySubdivision();
    }

    /**
     * Get the countrySecondarySubdivision property: County.
     *
     * @return the countrySecondarySubdivision value.
     */
    public String getCountrySecondarySubdivision() {
        return this.getCountrySecondarySubdivision();
    }

    /**
     * Get the countrySubdivision property: State or Province.
     *
     * @return the countrySubdivision value.
     */
    public String getCountrySubdivision() {
        return this.getCountrySubdivision();
    }

    /**
     * Get the postalCode property: Postal Code / Zip Code.
     *
     * @return the postalCode value.
     */
    public String getPostalCode() {
        return this.getPostalCode();
    }

    /**
     * Get the extendedPostalCode property: Extended postal code (availability is dependent on the region).
     *
     * @return the extendedPostalCode value.
     */
    public String getExtendedPostalCode() {
        return this.getExtendedPostalCode();
    }

    /**
     * Get the countryCode property: Country (Note: This is a two-letter code, not a country name.).
     *
     * @return the countryCode value.
     */
    public String getCountryCode() {
        return this.getCountryCode();
    }

    /**
     * Get the country property: Country name.
     *
     * @return the country value.
     */
    public String getCountry() {
        return this.getCountry();
    }

    /**
     * Get the countryCodeISO3 property: ISO alpha-3 country code.
     *
     * @return the countryCodeISO3 value.
     */
    public String getCountryCodeISO3() {
        return this.getCountryCodeISO3();
    }

    /**
     * Get the freeformAddress property: An address line formatted according to the formatting rules of a Result's
     * country of origin, or in the case of a country, its full country name.
     *
     * @return the freeformAddress value.
     */
    public String getFreeformAddress() {
        return this.getFreeformAddress();
    }

    /**
     * Get the countrySubdivisionName property: The full name of a first level of country administrative hierarchy. This
     * field appears only in case countrySubdivision is presented in an abbreviated form. Only supported for USA,
     * Canada, and Great Britain.
     *
     * @return the countrySubdivisionName value.
     */
    public String getCountrySubdivisionName() {
        return this.getCountrySubdivisionName();
    }

    /**
     * Get the localName property: An address component which represents the name of a geographic area or locality that
     * groups a number of addressable objects for addressing purposes, without being an administrative unit. This field
     * is used to build the `freeformAddress` property.
     *
     * @return the localName value.
     */
    public String getLocalName() {
        return this.getLocalName();
    }

    /**
     * Get the boundingBox property: The bounding box of the location.
     *
     * @return the boundingBox value.
     */
    public BoundingBox getBoundingBox() {
        return new BoundingBox(this.internalModel.getBoundingBox());
    }
}
