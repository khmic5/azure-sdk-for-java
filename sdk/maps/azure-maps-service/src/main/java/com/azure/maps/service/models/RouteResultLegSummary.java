// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Summary object for route section. */
@Immutable
public final class RouteResultLegSummary {
    /*
     * Length In Meters property
     */
    @JsonProperty(value = "lengthInMeters", access = JsonProperty.Access.WRITE_ONLY)
    private Integer lengthInMeters;

    /*
     * Estimated travel time in seconds property that includes the delay due to
     * real-time traffic. Note that even when traffic=false travelTimeInSeconds
     * still includes the delay due to traffic. If DepartAt is in the future,
     * travel time is calculated using time-dependent historic traffic data.
     */
    @JsonProperty(value = "travelTimeInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer travelTimeInSeconds;

    /*
     * Estimated delay in seconds caused by the real-time incident(s) according
     * to traffic information. For routes planned with departure time in the
     * future, delays is always 0. To return additional travel times using
     * different types of traffic information, parameter
     * computeTravelTimeFor=all needs to be added.
     */
    @JsonProperty(value = "trafficDelayInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer trafficDelayInSeconds;

    /*
     * Departure Time property
     */
    @JsonProperty(value = "departureTime", access = JsonProperty.Access.WRITE_ONLY)
    private String departureTime;

    /*
     * Arrival Time property
     */
    @JsonProperty(value = "arrivalTime", access = JsonProperty.Access.WRITE_ONLY)
    private String arrivalTime;

    /*
     * Estimated travel time calculated as if there are no delays on the route
     * due to traffic conditions (e.g. congestion). Included only if
     * computeTravelTimeFor = all is used in the query.
     */
    @JsonProperty(value = "noTrafficTravelTimeInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer noTrafficTravelTimeInSeconds;

    /*
     * Estimated travel time calculated using time-dependent historic traffic
     * data. Included only if computeTravelTimeFor = all is used in the query.
     */
    @JsonProperty(value = "historicTrafficTravelTimeInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer historicTrafficTravelTimeInSeconds;

    /*
     * Estimated travel time calculated using real-time speed data. Included
     * only if computeTravelTimeFor = all is used in the query.
     */
    @JsonProperty(value = "liveTrafficIncidentsTravelTimeInSeconds", access = JsonProperty.Access.WRITE_ONLY)
    private Integer liveTrafficIncidentsTravelTimeInSeconds;

    /*
     * Estimated fuel consumption in liters using the Combustion Consumption
     * Model. Included if vehicleEngineType is set to _combustion_ and
     * constantSpeedConsumptionInLitersPerHundredkm is specified. The value
     * will be non-negative.
     */
    @JsonProperty(value = "fuelConsumptionInLiters", access = JsonProperty.Access.WRITE_ONLY)
    private Float fuelConsumptionInLiters;

    /*
     * Estimated electric energy consumption in kilowatt hours (kWh) using the
     * Electric Consumption Model. Included if vehicleEngineType is set to
     * electric and constantSpeedConsumptionInkWhPerHundredkm is specified. The
     * value of batteryConsumptionInkWh includes the recuperated electric
     * energy and can therefore be negative (which indicates gaining energy).
     * If both maxChargeInkWh and currentChargeInkWh are specified,
     * recuperation will be capped to ensure that the battery charge level
     * never exceeds maxChargeInkWh. If neither maxChargeInkWh nor
     * currentChargeInkWh are specified, unconstrained recuperation is assumed
     * in the consumption calculation.
     */
    @JsonProperty(value = "batteryConsumptionInkWh", access = JsonProperty.Access.WRITE_ONLY)
    private Float batteryConsumptionInkWh;

    /**
     * Get the lengthInMeters property: Length In Meters property.
     *
     * @return the lengthInMeters value.
     */
    public Integer getLengthInMeters() {
        return this.lengthInMeters;
    }

    /**
     * Get the travelTimeInSeconds property: Estimated travel time in seconds property that includes the delay due to
     * real-time traffic. Note that even when traffic=false travelTimeInSeconds still includes the delay due to traffic.
     * If DepartAt is in the future, travel time is calculated using time-dependent historic traffic data.
     *
     * @return the travelTimeInSeconds value.
     */
    public Integer getTravelTimeInSeconds() {
        return this.travelTimeInSeconds;
    }

    /**
     * Get the trafficDelayInSeconds property: Estimated delay in seconds caused by the real-time incident(s) according
     * to traffic information. For routes planned with departure time in the future, delays is always 0. To return
     * additional travel times using different types of traffic information, parameter computeTravelTimeFor=all needs to
     * be added.
     *
     * @return the trafficDelayInSeconds value.
     */
    public Integer getTrafficDelayInSeconds() {
        return this.trafficDelayInSeconds;
    }

    /**
     * Get the departureTime property: Departure Time property.
     *
     * @return the departureTime value.
     */
    public String getDepartureTime() {
        return this.departureTime;
    }

    /**
     * Get the arrivalTime property: Arrival Time property.
     *
     * @return the arrivalTime value.
     */
    public String getArrivalTime() {
        return this.arrivalTime;
    }

    /**
     * Get the noTrafficTravelTimeInSeconds property: Estimated travel time calculated as if there are no delays on the
     * route due to traffic conditions (e.g. congestion). Included only if computeTravelTimeFor = all is used in the
     * query.
     *
     * @return the noTrafficTravelTimeInSeconds value.
     */
    public Integer getNoTrafficTravelTimeInSeconds() {
        return this.noTrafficTravelTimeInSeconds;
    }

    /**
     * Get the historicTrafficTravelTimeInSeconds property: Estimated travel time calculated using time-dependent
     * historic traffic data. Included only if computeTravelTimeFor = all is used in the query.
     *
     * @return the historicTrafficTravelTimeInSeconds value.
     */
    public Integer getHistoricTrafficTravelTimeInSeconds() {
        return this.historicTrafficTravelTimeInSeconds;
    }

    /**
     * Get the liveTrafficIncidentsTravelTimeInSeconds property: Estimated travel time calculated using real-time speed
     * data. Included only if computeTravelTimeFor = all is used in the query.
     *
     * @return the liveTrafficIncidentsTravelTimeInSeconds value.
     */
    public Integer getLiveTrafficIncidentsTravelTimeInSeconds() {
        return this.liveTrafficIncidentsTravelTimeInSeconds;
    }

    /**
     * Get the fuelConsumptionInLiters property: Estimated fuel consumption in liters using the Combustion Consumption
     * Model. Included if vehicleEngineType is set to _combustion_ and constantSpeedConsumptionInLitersPerHundredkm is
     * specified. The value will be non-negative.
     *
     * @return the fuelConsumptionInLiters value.
     */
    public Float getFuelConsumptionInLiters() {
        return this.fuelConsumptionInLiters;
    }

    /**
     * Get the batteryConsumptionInkWh property: Estimated electric energy consumption in kilowatt hours (kWh) using the
     * Electric Consumption Model. Included if vehicleEngineType is set to electric and
     * constantSpeedConsumptionInkWhPerHundredkm is specified. The value of batteryConsumptionInkWh includes the
     * recuperated electric energy and can therefore be negative (which indicates gaining energy). If both
     * maxChargeInkWh and currentChargeInkWh are specified, recuperation will be capped to ensure that the battery
     * charge level never exceeds maxChargeInkWh. If neither maxChargeInkWh nor currentChargeInkWh are specified,
     * unconstrained recuperation is assumed in the consumption calculation.
     *
     * @return the batteryConsumptionInkWh value.
     */
    public Float getBatteryConsumptionInkWh() {
        return this.batteryConsumptionInkWh;
    }
}
