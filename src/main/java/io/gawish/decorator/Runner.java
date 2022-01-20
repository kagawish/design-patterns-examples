package io.gawish.decorator;

public class Runner {
    public static void run()
    {
        Player p1 = new Player();

        p1.launchAttack();
        p1.defendAttack();

        System.out.println("------------------------");

        p1.upgradeAttack();
        p1.upgradeAttack();

        p1.launchAttack();
        p1.defendAttack();

        System.out.println("------------------------");

        p1.upgradeDefense();

        p1.launchAttack();
        p1.defendAttack();

        System.out.println("------------------------");

        p1.downgrade();

        p1.launchAttack();
        p1.defendAttack();

        System.out.println("------------------------");
    }
}
