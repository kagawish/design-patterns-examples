package io.gawish.singleton;

import java.util.ArrayList;

public class Spacebase {
    private ArrayList<ElectricityGenerator> electricityGenerators = new ArrayList<>();
    private ArrayList<WaterPlant> waterPlants = new ArrayList<>();
    private ArrayList<House> houses = new ArrayList<>();
    private Logger logger;

    public Spacebase(Logger logger) {
        this.logger = logger;
        this.logger.Log("Creating spacebase");
    }

    public void addElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerators.add(electricityGenerator);
        this.logger.Log("Adding Electricity generator");
    }

    public void addWaterPlant(WaterPlant waterPlant) {
        this.waterPlants.add(waterPlant);
        this.logger.Log("Adding water plant");
    }

    public void addHouse(House house) {
        this.houses.add(house);
        this.logger.Log("Adding house");
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public ArrayList<ElectricityGenerator> getElectricityGenerators() {
        return electricityGenerators;
    }

    public ArrayList<WaterPlant> getWaterPlants() {
        return waterPlants;
    }
}
