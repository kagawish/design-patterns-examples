package io.gawish.bridge;

public class HackerAggressive extends Hacker {
    @Override
    public void attack() {
        this.hackIntoEnemySystems();
        this.hackIntoEnemySystems();
    }

    @Override
    public void charge() {
    }

    @Override
    public void hide() {
        this.hackIntoEnemySystems();
        this.launchInvisibilityTech();
    }

    @Override
    public void heal() {
    }
}
