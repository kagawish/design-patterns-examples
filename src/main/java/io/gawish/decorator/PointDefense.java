package io.gawish.decorator;

public class PointDefense implements TechSystem {
    private TechSystem tech;

    public PointDefense(TechSystem tech) {
        this.tech = tech;
    }

    @Override
    public void attack() {
        this.tech.attack();
    }

    @Override
    public void defend() {
        System.out.println("[DEFENSE] Point defense system activated");
        this.tech.defend();
    }

    public TechSystem getTech() {
        return this.tech;
    }
}
