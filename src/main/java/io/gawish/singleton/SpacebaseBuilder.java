package io.gawish.singleton;

public class SpacebaseBuilder {
    private Logger logger;
    private Spacebase spacebase;

    public SpacebaseBuilder(Logger logger) {
        this.logger = logger;
        this.spacebase = new Spacebase(this.logger);
        this.logger.Log("Creating space builder");
    }

    public void reset() {
        this.logger.Log("Resetting space builder");
        this.spacebase = new Spacebase(this.logger);
    }

    public void addElectricityGenerator(float generationRate) {
        this.logger.Log("Adding electricity generator to spacebase");
        ElectricityGenerator el = new ElectricityGenerator(this.logger, generationRate);
        this.spacebase.addElectricityGenerator(el);
    }

    public void addWaterPlan(float extractionRate) {
        this.logger.Log("Adding water plant to spacebase");
        WaterPlant wp = new WaterPlant(this.logger, extractionRate);
        wp.setElectricityGenerator(this.spacebase.getElectricityGenerators().get(0));
        this.spacebase.addWaterPlant(wp);
    }

    public void addHouse(int nbResidents) {
        this.logger.Log("Adding house to spacebase");
        House house = new House(this.logger, nbResidents);
        house.setWaterPlant(this.spacebase.getWaterPlants().get(0));
        house.setElectricityGenerator(this.spacebase.getElectricityGenerators().get(0));
        this.spacebase.addHouse(house);
    }

    public Spacebase getSpacebase() {
        this.logger.Log("Getting spacebase");
        return spacebase;
    }
}
