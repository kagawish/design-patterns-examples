package io.gawish.decorator;

public class Runner {
    public static void run()
    {
        LaserGunSpaceship attackingSpaceship = new LaserGunSpaceship();
        attackingSpaceship.attack();

        System.out.println("------------");

        PointDefenseAntiMissileDomeSpaceship defensiveSpaceship = new PointDefenseAntiMissileDomeSpaceship();
        defensiveSpaceship.defend();
    }
}
