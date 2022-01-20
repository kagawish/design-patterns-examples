package io.gawish.builder;

public class Runner
{
    public static void run()
    {
        // Adding Base #1 (2 El, 2 WP, 2 H)
        Spacebase base1 = (new SpacebaseBuilder())
            .addElectricityGenerator(5)
            .addElectricityGenerator(3)
            .addWaterPlan(10)
            .addWaterPlan(50)
            .addHouse(10)
            .addHouse(15)
            .getSpacebase();

        // Adding Base #2 (1 El, 1 WP, 2 H)
        Spacebase base2 = (new SpacebaseBuilder())
            .addElectricityGenerator(5)
            .addWaterPlan(10)
            .addHouse(10)
            .addHouse(15)
            .getSpacebase();

        // Adding Base #3 (1 El, 2 WP, 4 H)
        Spacebase base3 = (new SpacebaseBuilder())
            .addElectricityGenerator(20)
            .addWaterPlan(10)
            .addWaterPlan(10)
            .addHouse(10)
            .addHouse(5)
            .addHouse(10)
            .addHouse(10)
            .getSpacebase();
    }
}
