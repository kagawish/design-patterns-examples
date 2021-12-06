package io.gawish.factorymethod;

public class Runner
{
    public static void run()
    {
        Player p = new MeleePlayer();
        p.run();
        p.attack();

        Player p2 = new WitchPlayer();
        p2.run();
        p2.attack();
    }
}
