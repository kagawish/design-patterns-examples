package io.gawish.composite;

public class Runner {
    public static void run() {
        Player p1 = new Player("p1");

        try {
            Sword sword1 = new Sword();
            Torch torch1 = new Torch();
            p1.addInBag(sword1);

            p1.addInBag(torch1);

            Bag secondBag = new Bag();
            p1.addInBag(secondBag);

            Sword sword2 = new Sword();
            Torch torch2 = new Torch();
            secondBag.addCarriable(sword2);
            secondBag.addCarriable(torch2);

            System.out.println(p1.getLoad());

            sword1.addCarriable(sword2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
