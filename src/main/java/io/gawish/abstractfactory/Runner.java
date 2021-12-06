package io.gawish.abstractfactory;

public class Runner
{
    public static String environmentSetting = "modern";

    public static void run()
    {
        Player p = new Player();

        p.travel();
        p.visit();
        p.attack();
    }
}
