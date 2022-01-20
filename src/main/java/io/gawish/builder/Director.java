package io.gawish.builder;

public class Director {
    private SpacebaseBuilder spacebaseBuilder;

    public Director(SpacebaseBuilder sb) {
        this.spacebaseBuilder = sb;
    }

    public Spacebase makeWaterSpacebase() {
        return this.spacebaseBuilder
            .addElectricityGenerator(5)
            .addWaterPlan(50)
            .addWaterPlan(50)
            .addWaterPlan(50)
            .addWaterPlan(50)
            .addHouse(10)
            .getSpacebase();
    }
}
