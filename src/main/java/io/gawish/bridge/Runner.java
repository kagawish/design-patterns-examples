package io.gawish.bridge;

public class Runner {
    public static void run() {
        Player p1 = new Player();

        p1.addCompanion(new FighterAggressive());
        p1.addCompanion(new HackerDefensive());
        p1.addCompanion(new MedicDefensive());

        p1.attack();
        p1.guard();
    }
}
