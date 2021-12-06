package io.gawish.singleton;

public class House {
    private Logger logger;
    private int nbResidents;

    private WaterPlant waterPlant;
    private ElectricityGenerator electricityGenerator;

    public House(Logger logger, int nbResidents) {
        this.logger = logger;
        this.nbResidents = nbResidents;
        this.logger.Log("Creating house with nb residents ".concat(String.valueOf(this.nbResidents)));
    }

    public void setWaterPlant(WaterPlant waterPlant) {
        this.waterPlant = waterPlant;
        this.logger.Log("Setting house water plant");
    }

    public void setElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerator = electricityGenerator;
        this.logger.Log("Setting house electricity generator");
    }
}
