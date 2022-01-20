package io.gawish.singleton;

import java.util.ArrayList;

public class Spacebase {
    private ArrayList<ElectricityGenerator> electricityGenerators = new ArrayList<>();
    private ArrayList<WaterPlant> waterPlants = new ArrayList<>();
    private ArrayList<House> houses = new ArrayList<>();

    public Spacebase() {
        Logger.getInstance().Log("Creating spacebase");
        Sound.getInstance().play("spacebase_deployed.wav");
    }

    public void addElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerators.add(electricityGenerator);
        Logger.getInstance().Log("Adding Electricity generator");
    }

    public void addWaterPlant(WaterPlant waterPlant) {
        this.waterPlants.add(waterPlant);
        Logger.getInstance().Log("Adding water plant");
    }

    public void addHouse(House house) {
        this.houses.add(house);
        Logger.getInstance().Log("Adding house");
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
