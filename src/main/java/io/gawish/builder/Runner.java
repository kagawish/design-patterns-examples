package io.gawish.builder;

public class Runner
{
    public static void run()
    {
        SpacebaseBuilder sb = new SpacebaseBuilder();

        // Adding Base #1 (2 El, 2 WP, 2 H)
        sb.addElectricityGenerator(5);
        sb.addElectricityGenerator(3);
        sb.addWaterPlan(10);
        sb.addWaterPlan(50);
        sb.addHouse(10);
        sb.addHouse(15);
        Spacebase base1 = sb.getSpacebase();
        sb.reset();

        // Adding Base #2 (1 El, 1 WP, 2 H)
        sb.addElectricityGenerator(5);
        sb.addWaterPlan(10);
        sb.addHouse(10);
        sb.addHouse(15);
        Spacebase base2 = sb.getSpacebase();
        sb.reset();

        // Adding Base #3 (1 El, 2 WP, 4 H)
        sb.addElectricityGenerator(20);
        sb.addWaterPlan(10);
        sb.addWaterPlan(10);
        sb.addHouse(10);
        sb.addHouse(5);
        sb.addHouse(10);
        sb.addHouse(10);
        Spacebase base3 = sb.getSpacebase();
    }
}
