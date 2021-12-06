package io.gawish.abstractfactory;

import io.gawish.abstractfactory.futuristic.FuturisticEnvironment;
import io.gawish.abstractfactory.medieval.MedievalEnvironment;
import io.gawish.abstractfactory.modern.ModernEnvironment;

public class Runner
{
    public static String environmentSetting = "futuristic";
    public static Environment environment;

    public static void run()
    {
        if (Runner.environmentSetting.compareTo("medieval") == 0) {
            environment = new MedievalEnvironment();
        } else if (Runner.environmentSetting.compareTo("futuristic") == 0) {
            environment = new FuturisticEnvironment();
        } else if (Runner.environmentSetting.compareTo("modern") == 0) {
            environment = new ModernEnvironment();
        }

        Player p = new Player();

        p.travel();
        p.visit();
        p.attack();
    }
}
