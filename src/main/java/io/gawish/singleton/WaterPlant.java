package io.gawish.singleton;

public class WaterPlant {
    private Logger logger;
    private float extractionRate;

    private ElectricityGenerator electricityGenerator;

    public WaterPlant(float extractionRate) {
        this.extractionRate = extractionRate;
        Logger.getInstance().Log("Creating water plant with extraction rate ".concat(String.valueOf(this.extractionRate)));
        Sound.getInstance().play("water_flowing.wav");
    }

    public void setElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerator = electricityGenerator;
        Logger.getInstance().Log("Setting water plant electricity generator");
    }
}
