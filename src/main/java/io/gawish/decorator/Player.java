package io.gawish.decorator;

public class Player {
    private Spaceship spaceship;

    public Player() {
        this.spaceship = new Spaceship();
    }

    public void launchAttack() {
        this.spaceship.attack();
    }

    public void defendAttack() {
        this.spaceship.defend();
    }

    public void upgradeAttack() {
        if (this.spaceship.getClass().getName().equals("io.gawish.decorator.PointDefenseSpaceship")) {
            this.spaceship = new LaserGunPointDefenseSpaceship();
        } else {
            this.spaceship = new LaserGunSpaceship();
        }
    }

    public void upgradeDefense() {
        if (this.spaceship.getClass().getName().equals("io.gawish.decorator.LaserGunSpaceship")) {
            this.spaceship = new LaserGunPointDefenseSpaceship();
        } else {
            this.spaceship = new PointDefenseSpaceship();
        }
    }
}
