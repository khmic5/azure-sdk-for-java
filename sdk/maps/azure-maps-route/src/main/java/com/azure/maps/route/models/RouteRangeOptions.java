package com.azure.maps.route.models;

public class RouteRangeOptions extends BaseRouteOptions<RouteRangeOptions> {
    private LatLong startingPoint;
    private Double fuelBudgetInLiters;
    private Double energyBudgetInKwH;
    private Double timeBudgetInSec;
    private Double distanceBudgetInMeters;

    public RouteRangeOptions() {}

    public LatLong getStartingPoint() {
        return this.startingPoint;
    }

    public Double getFuelBudgetInLiters() {
        return this.fuelBudgetInLiters;
    }

    public Double getEnergyBudgetInKwH() {
        return this.energyBudgetInKwH;
    }

    public Double getTimeBudgetInSec() {
        return this.timeBudgetInSec;
    }

    public Double getDistanceBudgetInMeters() {
        return this.distanceBudgetInMeters;
    }

    public RouteRangeOptions startingPoint(LatLong startingPoint) {
        this.startingPoint = startingPoint;
        return this;
    }

    public RouteRangeOptions fuelBudgetInLiters(Double fuelBudgetInLiters) {
        this.fuelBudgetInLiters = fuelBudgetInLiters;
        return this;
    }

    public RouteRangeOptions energyBudgetInKwH(Double energyBudgetInKwH) {
        this.energyBudgetInKwH = energyBudgetInKwH;
        return this;
    }

    public RouteRangeOptions timeBudgetInSec(Double timeBudgetInSec) {
        this.timeBudgetInSec = timeBudgetInSec;
        return this;
    }

    public RouteRangeOptions distanceBudgetInMeters(Double distanceBudgetInMeters) {
        this.distanceBudgetInMeters = distanceBudgetInMeters;
        return this;
    }


}
