package io.gawish.decorator;

public class LaserGun implements TechSystem {
    private TechSystem tech;

    public LaserGun(TechSystem tech) {
        this.tech = tech;
    }

    @Override
    public void attack() {
        System.out.println("[ATTACK] Spaceship fires the Laser gun");
        this.tech.attack();
    }

    @Override
    public void defend() {
        this.tech.defend();
    }

    public TechSystem getTech() {
        return this.tech;
    }
}
