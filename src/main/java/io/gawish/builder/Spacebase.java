package io.gawish.builder;

import java.util.ArrayList;

public class Spacebase {
    private ArrayList<ElectricityGenerator> electricityGenerators = new ArrayList<>();
    private ArrayList<WaterPlant> waterPlants = new ArrayList<>();
    private ArrayList<House> houses = new ArrayList<>();

    public void addElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerators.add(electricityGenerator);
    }

    public void addWaterPlant(WaterPlant waterPlant) {
        this.waterPlants.add(waterPlant);
    }

    public void addHouse(House house) {
        this.houses.add(house);
    }
}
