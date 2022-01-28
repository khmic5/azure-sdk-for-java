package com.azure.maps.route.models;

import java.time.OffsetDateTime;
import java.util.List;

import com.azure.maps.route.implementation.models.AlternativeRouteType;
import com.azure.maps.route.implementation.models.ComputeTravelTime;
import com.azure.maps.route.implementation.models.InclineLevel;
import com.azure.maps.route.implementation.models.Report;
import com.azure.maps.route.implementation.models.RouteAvoidType;
import com.azure.maps.route.implementation.models.RouteInstructionsType;
import com.azure.maps.route.implementation.models.RouteRepresentationForBestOrder;
import com.azure.maps.route.implementation.models.RouteType;
import com.azure.maps.route.implementation.models.SectionType;
import com.azure.maps.route.implementation.models.TravelMode;
import com.azure.maps.route.implementation.models.VehicleEngineType;
import com.azure.maps.route.implementation.models.VehicleLoadType;
import com.azure.maps.route.implementation.models.WindingnessLevel;

public class RouteDirectionsOptions {
    private String routePoints;
    private Integer maxAlternatives;
    private AlternativeRouteType alternativeType;
    private Integer minDeviationDistance;
    private OffsetDateTime arriveAt;
    private OffsetDateTime departAt;
    private Integer minDeviationTime;
    private RouteInstructionsType instructionsType;
    private String language;
    private Boolean computeBestWaypointOrder;
    private RouteRepresentationForBestOrder routeRepresentationForBestOrder;
    private ComputeTravelTime computeTravelTime;
    private Integer vehicleHeading;
    private Report report;
    private SectionType filterSectionType;
    private Integer vehicleAxleWeight;
    private Double vehicleWidth;
    private Double vehicleHeight;
    private Double vehicleLength;
    private Integer vehicleMaxSpeed;
    private Integer vehicleWeight;
    private Boolean isCommercialVehicle;
    private WindingnessLevel windingness;
    private InclineLevel inclineLevel;
    private TravelMode travelMode;
    private List<RouteAvoidType> avoid;
    private Boolean useTrafficData;
    private RouteType routeType;
    private VehicleLoadType vehicleLoadType;
    private VehicleEngineType vehicleEngineType;
    private String constantSpeedConsumptionInLitersPerHundredKm;
    private Double currentFuelInLiters;
    private Double auxiliaryPowerInLitersPerHour;
    private Double fuelEnergyDensityInMegajoulesPerLiter;
    private Double accelerationEfficiency;
    private Double decelerationEfficiency;
    private Double uphillEfficiency;
    private Double downhillEfficiency;
    private String constantSpeedConsumptionInKwHPerHundredKm;
    private Double currentChargeInKwH;
    private Double maxChargeInKwH;
    private Double auxiliaryPowerInKw;


    public RouteDirectionsOptions() {
    }

    public String getRoutePoints() {
        return this.routePoints;
    }

    public Integer getMaxAlternatives() {
        return this.maxAlternatives;
    }

    public String getConstantSpeedConsumptionInLitersPerHundredKm() {
        return constantSpeedConsumptionInLitersPerHundredKm;
    }

    public AlternativeRouteType getAlternativeType() {
        return this.alternativeType;
    }

    public Integer getMinDeviationDistance() {
        return this.minDeviationDistance;
    }

    public OffsetDateTime getArriveAt() {
        return this.arriveAt;
    }

    public OffsetDateTime getDepartAt() {
        return this.departAt;
    }



    public Integer getMinDeviationTime() {
        return this.minDeviationTime;
    }

    public RouteInstructionsType getInstructionsType() {
        return this.instructionsType;
    }

    public String getLanguage() {
        return this.language;
    }

    public Boolean getComputeBestWaypointOrder() {
        return this.computeBestWaypointOrder;
    }

    public RouteRepresentationForBestOrder getRouteRepresentationForBestOrder() {
        return this.routeRepresentationForBestOrder;
    }

    public ComputeTravelTime getComputeTravelTime() {
        return this.computeTravelTime;
    }

    public Integer getVehicleHeading() {
        return this.vehicleHeading;
    }

    public Report getReport() {
        return this.report;
    }

    public SectionType getFilterSectionType() {
        return this.filterSectionType;
    }

    public Integer getVehicleAxleWeight() {
        return this.vehicleAxleWeight;
    }

    public Double getVehicleWidth() {
        return this.vehicleWidth;
    }

    public Double getVehicleHeight() {
        return this.vehicleHeight;
    }

    public Double getVehicleLength() {
        return this.vehicleLength;
    }

    public Integer getVehicleMaxSpeed() {
        return this.vehicleMaxSpeed;
    }

    public Integer getVehicleWeight() {
        return this.vehicleWeight;
    }

    public Boolean isCommercialVehicle() {
        return this.isCommercialVehicle;
    }

    public WindingnessLevel getWindingness() {
        return this.windingness;
    }

    public InclineLevel getInclineLevel() {
        return this.inclineLevel;
    }

    public TravelMode getTravelMode() {
        return this.travelMode;
    }

    public List<RouteAvoidType> getAvoid() {
        return this.avoid;
    }

    public Boolean getUseTrafficData() {
        return this.useTrafficData;
    }

    public RouteType getRouteType() {
        return this.routeType;
    }

    public VehicleLoadType getVehicleLoadType() {
        return this.vehicleLoadType;
    }

    public VehicleEngineType getVehicleEngineType() {
        return this.vehicleEngineType;
    }

    public Double getCurrentFuelInLiters() {
        return this.currentFuelInLiters;
    }

    public Double getAuxiliaryPowerInLitersPerHour() {
        return this.auxiliaryPowerInLitersPerHour;
    }

    public Double getFuelEnergyDensityInMegajoulesPerLiter() {
        return this.fuelEnergyDensityInMegajoulesPerLiter;
    }

    public Double getAccelerationEfficiency() {
        return this.accelerationEfficiency;
    }

    public Double getDecelerationEfficiency() {
        return this.decelerationEfficiency;
    }

    public Double getUphillEfficiency() {
        return this.uphillEfficiency;
    }

    public Double getDownhillEfficiency() {
        return this.downhillEfficiency;
    }

    public String getConstantSpeedConsumptionInKwHPerHundredKm() {
        return this.constantSpeedConsumptionInKwHPerHundredKm;
    }

    public Double getCurrentChargeInKwH() {
        return this.currentChargeInKwH;
    }

    public Double getMaxChargeInKwH() {
        return this.maxChargeInKwH;
    }

    public Double getAuxiliaryPowerInKw() {
        return this.auxiliaryPowerInKw;
    }

    public RouteDirectionsOptions setRoutePoints(String routePoints) {
        this.routePoints = routePoints;
        return this;
    }

    public RouteDirectionsOptions setMaxAlternatives(Integer maxAlternatives) {
        this.maxAlternatives = maxAlternatives;
        return this;
    }

    public RouteDirectionsOptions setAlternativeType(AlternativeRouteType alternativeType) {
        this.alternativeType = alternativeType;
        return this;
    }

    public RouteDirectionsOptions setMinDeviationDistance(Integer minDeviationDistance) {
        this.minDeviationDistance = minDeviationDistance;
        return this;
    }

    public RouteDirectionsOptions setArriveAt(OffsetDateTime arriveAt) {
        this.arriveAt = arriveAt;
        return this;
    }

    public RouteDirectionsOptions setDepartAt(OffsetDateTime departAt) {
        this.departAt = departAt;
        return this;
    }

    public RouteDirectionsOptions setMinDeviationTime(Integer minDeviationTime) {
        this.minDeviationTime = minDeviationTime;
        return this;
    }

    public RouteDirectionsOptions setInstructionsType(RouteInstructionsType instructionsType) {
        this.instructionsType = instructionsType;
        return this;
    }

    public RouteDirectionsOptions language(String language) {
        this.language = language;
        return this;
    }

    public RouteDirectionsOptions setComputeBestWaypointOrder(Boolean computeBestWaypointOrder) {
        this.computeBestWaypointOrder = computeBestWaypointOrder;
        return this;
    }

    public RouteDirectionsOptions setRouteRepresentationForBestOrder(RouteRepresentationForBestOrder routeRepresentationForBestOrder) {
        this.routeRepresentationForBestOrder = routeRepresentationForBestOrder;
        return this;
    }

    public RouteDirectionsOptions setComputeTravelTime(ComputeTravelTime computeTravelTime) {
        this.computeTravelTime = computeTravelTime;
        return this;
    }

    public RouteDirectionsOptions setVehicleHeading(Integer vehicleHeading) {
        this.vehicleHeading = vehicleHeading;
        return this;
    }

    public RouteDirectionsOptions setReport(Report report) {
        this.report = report;
        return this;
    }

    public RouteDirectionsOptions setFilterSectionType(SectionType filterSectionType) {
        this.filterSectionType = filterSectionType;
        return this;
    }

    public RouteDirectionsOptions setVehicleAxleWeight(Integer vehicleAxleWeight) {
        this.vehicleAxleWeight = vehicleAxleWeight;
        return this;
    }

    public RouteDirectionsOptions setVehicleWidth(Double vehicleWidth) {
        this.vehicleWidth = vehicleWidth;
        return this;
    }

    public RouteDirectionsOptions setVehicleHeight(Double vehicleHeight) {
        this.vehicleHeight = vehicleHeight;
        return this;
    }

    public RouteDirectionsOptions setVehicleLength(Double vehicleLength) {
        this.vehicleLength = vehicleLength;
        return this;
    }

    public RouteDirectionsOptions setVehicleMaxSpeed(Integer vehicleMaxSpeed) {
        this.vehicleMaxSpeed = vehicleMaxSpeed;
        return this;
    }

    public RouteDirectionsOptions setVehicleWeight(Integer vehicleWeight) {
        this.vehicleWeight = vehicleWeight;
        return this;
    }

    public RouteDirectionsOptions setIsCommercialVehicle(Boolean isCommercialVehicle) {
        this.isCommercialVehicle = isCommercialVehicle;
        return this;
    }

    public RouteDirectionsOptions setWindingness(WindingnessLevel windingness) {
        this.windingness = windingness;
        return this;
    }

    public RouteDirectionsOptions setInclineLevel(InclineLevel inclineLevel) {
        this.inclineLevel = inclineLevel;
        return this;
    }

    public RouteDirectionsOptions setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
        return this;
    }

    public RouteDirectionsOptions setAvoid(List<RouteAvoidType> avoid) {
        this.avoid = avoid;
        return this;
    }

    public RouteDirectionsOptions setUseTrafficData(Boolean useTrafficData) {
        this.useTrafficData = useTrafficData;
        return this;
    }

    public RouteDirectionsOptions setRouteType(RouteType routeType) {
        this.routeType = routeType;
        return this;
    }

    public RouteDirectionsOptions setVehicleLoadType(VehicleLoadType vehicleLoadType) {
        this.vehicleLoadType = vehicleLoadType;
        return this;
    }

    public RouteDirectionsOptions setVehicleEngineType(VehicleEngineType vehicleEngineType) {
        this.vehicleEngineType = vehicleEngineType;
        return this;
    }

    public RouteDirectionsOptions setConstantSpeedConsumptionInLitersPerHundredKm(String constantSpeedConsumptionInLitersPerHundredKm) {
        this.constantSpeedConsumptionInLitersPerHundredKm = constantSpeedConsumptionInLitersPerHundredKm;
        return this;
    }

    public RouteDirectionsOptions setCurrentFuelInLiters(Double currentFuelInLiters) {
        this.currentFuelInLiters = currentFuelInLiters;
        return this;
    }

    public RouteDirectionsOptions setAuxiliaryPowerInLitersPerHour(Double auxiliaryPowerInLitersPerHour) {
        this.auxiliaryPowerInLitersPerHour = auxiliaryPowerInLitersPerHour;
        return this;
    }

    public RouteDirectionsOptions setFuelEnergyDensityInMegajoulesPerLiter(Double fuelEnergyDensityInMegajoulesPerLiter) {
        this.fuelEnergyDensityInMegajoulesPerLiter = fuelEnergyDensityInMegajoulesPerLiter;
        return this;
    }

    public RouteDirectionsOptions setAccelerationEfficiency(Double accelerationEfficiency) {
        this.accelerationEfficiency = accelerationEfficiency;
        return this;
    }

    public RouteDirectionsOptions setDecelerationEfficiency(Double decelerationEfficiency) {
        this.decelerationEfficiency = decelerationEfficiency;
        return this;
    }

    public RouteDirectionsOptions setUphillEfficiency(Double uphillEfficiency) {
        this.uphillEfficiency = uphillEfficiency;
        return this;
    }

    public RouteDirectionsOptions setDownhillEfficiency(Double downhillEfficiency) {
        this.downhillEfficiency = downhillEfficiency;
        return this;
    }

    public RouteDirectionsOptions setConstantSpeedConsumptionInKwHPerHundredKm(String constantSpeedConsumptionInKwHPerHundredKm) {
        this.constantSpeedConsumptionInLitersPerHundredKm = constantSpeedConsumptionInKwHPerHundredKm;
        return this;
    }

    public RouteDirectionsOptions setCurrentChargeInKwH(Double currentChargeInKwH) {
        this.currentChargeInKwH = currentChargeInKwH;
        return this;
    }

    public RouteDirectionsOptions setMaxChargeInKwH(Double maxChargeInKwH) {
        this.maxChargeInKwH = maxChargeInKwH;
        return this;
    }

    public RouteDirectionsOptions setAuxiliaryPowerInKw(Double auxiliaryPowerInKw) {
        this.auxiliaryPowerInKw = auxiliaryPowerInKw;
        return this;
    }
}
