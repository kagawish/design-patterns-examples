package io.gawish.decorator;

public class FlakGunSpaceship extends Spaceship {
    @Override
    public void attack() {
        System.out.println("Flak gun fires a lot of bullets");
        super.attack();
    }
}
