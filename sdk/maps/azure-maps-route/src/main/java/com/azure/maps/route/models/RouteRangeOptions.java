package com.azure.maps.route.models;

import java.util.List;

public class RouteRangeOptions extends BaseRouteOptions<RouteRangeOptions> {
    private List<Double> query;
    private Double fuelBudgetInLiters;
    private Double energyBudgetInKwH;
    private Double timeBudgetInSec;
    private Double distanceBudgetInMeters;

    public RouteRangeOptions() {}

    public List<Double> getQuery() {
        return this.query;
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

    public RouteRangeOptions query(List<Double> query) {
        this.query = query;
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
