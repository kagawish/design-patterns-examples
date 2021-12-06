package io.gawish.builder;

public class House {
    private int nbResidents;

    private WaterPlant waterPlant;
    private ElectricityGenerator electricityGenerator;

    public House(int nbResidents) {
        this.nbResidents = nbResidents;
    }

    public void setWaterPlant(WaterPlant waterPlant) {
        this.waterPlant = waterPlant;
    }

    public void setElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerator = electricityGenerator;
    }
}
