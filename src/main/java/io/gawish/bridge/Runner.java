package io.gawish.bridge;

public class Runner {
    public static void run() {
        Player p1 = new Player();

        p1.addCompanion(new AggressiveFightingStyle(new Fighter()));
        p1.addCompanion(new DefensiveFightingStyle(new Medic()));

        p1.attack();
        p1.guard();
    }
}
