package io.gawish.singleton;

public class SpacebaseBuilder {
    private Spacebase spacebase;

    public SpacebaseBuilder() {
        this.spacebase = new Spacebase();
        Logger.getInstance().Log("Creating space builder");
    }

    public void reset() {
        Logger.getInstance().Log("Resetting space builder");
        this.spacebase = new Spacebase();
    }

    public void addElectricityGenerator(float generationRate) {
        Logger.getInstance().Log("Adding electricity generator to spacebase");
        ElectricityGenerator el = new ElectricityGenerator(generationRate);
        this.spacebase.addElectricityGenerator(el);
    }

    public void addWaterPlan(float extractionRate) {
        Logger.getInstance().Log("Adding water plant to spacebase");
        WaterPlant wp = new WaterPlant(extractionRate);
        wp.setElectricityGenerator(this.spacebase.getElectricityGenerators().get(0));
        this.spacebase.addWaterPlant(wp);
    }

    public void addHouse(int nbResidents) {
        Logger.getInstance().Log("Adding house to spacebase");
        House house = new House(nbResidents);
        house.setWaterPlant(this.spacebase.getWaterPlants().get(0));
        house.setElectricityGenerator(this.spacebase.getElectricityGenerators().get(0));
        this.spacebase.addHouse(house);
    }

    public Spacebase getSpacebase() {
        Logger.getInstance().Log("Getting spacebase");
        return spacebase;
    }
}
