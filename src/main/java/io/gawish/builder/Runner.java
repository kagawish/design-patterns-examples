package io.gawish.builder;

public class Runner
{
    public static void run()
    {
        // Adding Base #1 (2 El, 2 WP, 2 H)
        Spacebase base1 = new Spacebase();

        ElectricityGenerator el11 = new ElectricityGenerator(5);
        ElectricityGenerator el12 = new ElectricityGenerator(3);

        WaterPlant wp11 = new WaterPlant(10);
        wp11.setElectricityGenerator(el11);
        WaterPlant wp12 = new WaterPlant(50);
        wp12.setElectricityGenerator(el12);

        House h11 = new House(10);
        h11.setElectricityGenerator(el11);
        h11.setWaterPlant(wp11);
        House h12 = new House(15);
        h12.setElectricityGenerator(el12);
        h12.setWaterPlant(wp12);

        base1.addElectricityGenerator(el11);
        base1.addElectricityGenerator(el12);
        base1.addWaterPlant(wp11);
        base1.addWaterPlant(wp12);
        base1.addHouse(h11);
        base1.addHouse(h12);


        // Adding Base #2 (1 El, 1 WP, 2 H)
        Spacebase base2 = new Spacebase();

        ElectricityGenerator el21 = new ElectricityGenerator(5);

        WaterPlant wp21 = new WaterPlant(10);
        wp12.setElectricityGenerator(el21);

        House h21 = new House(10);
        h21.setElectricityGenerator(el21);
        h21.setWaterPlant(wp21);
        House h22 = new House(15);
        h22.setElectricityGenerator(el12);
        h22.setWaterPlant(wp12);

        base2.addElectricityGenerator(el21);
        base2.addWaterPlant(wp21);
        base2.addHouse(h21);
        base2.addHouse(h22);


        // Adding Base #3 (1 El, 2 WP, 4 H)
        Spacebase base3 = new Spacebase();

        ElectricityGenerator el31 = new ElectricityGenerator(20);

        WaterPlant wp31 = new WaterPlant(10);
        wp31.setElectricityGenerator(el31);
        WaterPlant wp32 = new WaterPlant(10);
        wp32.setElectricityGenerator(el31);

        House h31 = new House(10);
        h31.setElectricityGenerator(el31);
        h31.setWaterPlant(wp31);
        House h32 = new House(5);
        h32.setElectricityGenerator(el31);
        h32.setWaterPlant(wp31);
        House h33 = new House(10);
        h33.setElectricityGenerator(el31);
        h33.setWaterPlant(wp32);
        House h34 = new House(10);
        h34.setElectricityGenerator(el31);
        h34.setWaterPlant(wp32);

        base3.addElectricityGenerator(el31);
        base3.addWaterPlant(wp31);
        base3.addWaterPlant(wp32);
        base3.addHouse(h31);
        base3.addHouse(h32);
        base3.addHouse(h33);
        base3.addHouse(h34);
    }
}
