package io.gawish.decorator;

public class Player {
    private TechSystem spaceship;

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
        this.spaceship = new LaserGun(this.spaceship);
    }

    public void upgradeDefense() {
        this.spaceship = new PointDefense(this.spaceship);
    }
}
