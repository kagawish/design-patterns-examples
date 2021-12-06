package io.gawish.singleton;

public class ElectricityGenerator {
    private float generationRate;

    public ElectricityGenerator(float generationRate) {
        this.generationRate = generationRate;
        Logger.getInstance().Log("Creating Electricity generator with rate ".concat(String.valueOf(this.generationRate)));
    }
}
