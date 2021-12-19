package io.gawish.composite;

public class Runner {
    public static void run() {
        Player p1 = new Player("p1");

        p1.addInBag(new Sword());
        p1.addInBag(new Sword());
        p1.addInBag(new Torch());
        p1.addInBag(new Torch());

        System.out.println(p1.getLoad());
    }
}
