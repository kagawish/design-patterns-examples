package io.gawish.abstractfactory;

import io.gawish.abstractfactory.futuristic.FuturisticEnvironment;
import io.gawish.abstractfactory.medieval.MedievalEnvironment;
import io.gawish.abstractfactory.modern.ModernEnvironment;
import io.gawish.abstractfactory.prehistoric.PrehistoricEnvironment;

public class Runner
{
    public static String environmentSetting = "prehistoric";
    public static Environment environment;

    public static void run()
    {
        if (Runner.environmentSetting.compareTo("medieval") == 0) {
            environment = new MedievalEnvironment();
        } else if (Runner.environmentSetting.compareTo("futuristic") == 0) {
            environment = new FuturisticEnvironment();
        } else if (Runner.environmentSetting.compareTo("modern") == 0) {
            environment = new ModernEnvironment();
        } else if (Runner.environmentSetting.compareTo("prehistoric") == 0) {
            environment = new PrehistoricEnvironment();
        }

        Player p = new Player();

        p.travel();
        p.visit();
        p.attack();
    }
}
