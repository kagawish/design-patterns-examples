package io.gawish.bridge;

public class HackerDefensive extends Hacker {
    @Override
    public void attack() {
        this.hackIntoEnemySystems();
        this.launchInvisibilityTech();
    }

    @Override
    public void charge() {
    }

    @Override
    public void hide() {
        this.launchInvisibilityTech();
    }

    @Override
    public void heal() {
    }
}
