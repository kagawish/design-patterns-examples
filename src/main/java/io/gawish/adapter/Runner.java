package io.gawish.adapter;

public class Runner {
    public static void run()
    {
        Player p1 = new Player();
        p1.setWeapon(new GunWeapon(new Gun()));

        p1.attack();
    }
}
