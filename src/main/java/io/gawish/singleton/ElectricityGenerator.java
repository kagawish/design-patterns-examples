package io.gawish.singleton;

public class ElectricityGenerator {
    private Logger logger;
    private float generationRate;

    public ElectricityGenerator(Logger logger, float generationRate) {
        this.logger = logger;
        this.generationRate = generationRate;
        this.logger.Log("Creating Electricity generator with rate ".concat(String.valueOf(this.generationRate)));
    }
}
