package io.gawish.composite;

public class Runner {
    public static void run() {
        Player p1 = new Player("p1");

        Sword sword1 = new Sword();
        Torch torch1 = new Torch();
        p1.addInBag(sword1);
        p1.addInBag(torch1);

        Bag secondBag = new Bag();
        p1.addInBag(secondBag);

        Sword sword2 = new Sword();
        Torch torch2 = new Torch();
        secondBag.addItem(sword2);
        secondBag.addItem(torch2);

        System.out.println(p1.getLoad());
    }
}
