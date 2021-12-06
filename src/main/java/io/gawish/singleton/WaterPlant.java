package io.gawish.singleton;

public class WaterPlant {
    private Logger logger;
    private float extractionRate;

    private ElectricityGenerator electricityGenerator;

    public WaterPlant(Logger logger, float extractionRate) {
        this.logger = logger;
        this.extractionRate = extractionRate;
        this.logger.Log("Creating water plant with extraction rate ".concat(String.valueOf(this.extractionRate)));
    }

    public void setElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerator = electricityGenerator;
        this.logger.Log("Setting water plant electricity generator");
    }
}
