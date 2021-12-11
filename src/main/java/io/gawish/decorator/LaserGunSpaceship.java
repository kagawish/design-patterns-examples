package io.gawish.decorator;

public class LaserGunSpaceship extends Spaceship {
    @Override
    public void attack() {
        System.out.println("Spaceship fires the Laser gun");
        super.attack();
    }
}
