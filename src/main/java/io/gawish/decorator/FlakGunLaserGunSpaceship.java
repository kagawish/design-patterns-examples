package io.gawish.decorator;

public class FlakGunLaserGunSpaceship extends Spaceship {
    @Override
    public void attack() {
        System.out.println("Spaceship fires the Laser gun");
        System.out.println("Flak gun fires a lot of bullets");
        super.attack();
    }
}
