package io.gawish.singleton;

public class WaterPlant {
    private float extractionRate;

    private ElectricityGenerator electricityGenerator;

    public WaterPlant(float extractionRate) {
        this.extractionRate = extractionRate;
    }

    public void setElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerator = electricityGenerator;
    }
}
