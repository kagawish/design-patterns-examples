package io.gawish.decorator;

public class LaserGunPointDefenseSpaceship extends Spaceship {
    @Override
    public void attack() {
        System.out.println("[ATTACK] Spaceship fires the Laser gun");
        super.attack();
    }

    @Override
    public void defend() {
        System.out.println("[DEFENSE] Point defense system activated");
        super.defend();
    }
}
