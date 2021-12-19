package io.gawish.composite;

public class Runner {
    public static void run() {
        Player p1 = new Player("p1");

        p1.addInBag(new Sword());
        p1.addInBag(new Torch());
        Bag secondBag = new Bag();
        secondBag.addItem(new Sword());
        secondBag.addItem(new Torch());
        p1.addInBag(secondBag);

        System.out.println(p1.getLoad());
    }
}
