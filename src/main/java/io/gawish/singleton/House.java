package io.gawish.singleton;

public class House {
    private int nbResidents;

    private WaterPlant waterPlant;
    private ElectricityGenerator electricityGenerator;

    public House(int nbResidents) {
        this.nbResidents = nbResidents;
        Logger.getInstance().Log("Creating house with nb residents ".concat(String.valueOf(this.nbResidents)));
        Sound.getInstance().play("building_created.wav");
    }

    public void setWaterPlant(WaterPlant waterPlant) {
        this.waterPlant = waterPlant;
        Logger.getInstance().Log("Setting house water plant");
    }

    public void setElectricityGenerator(ElectricityGenerator electricityGenerator) {
        this.electricityGenerator = electricityGenerator;
        Logger.getInstance().Log("Setting house electricity generator");
    }
}
