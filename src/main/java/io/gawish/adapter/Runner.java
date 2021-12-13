package io.gawish.adapter;

public class Runner {
    public static void run()
    {
        Player p1 = new Player();
        p1.setWeapon(new Sword());

        p1.attack();
    }
}
