package io.gawish.bridge;

public class Hacker implements Companion {
    protected void hackIntoEnemySystems() {
        System.out.println("Hacker attempting to hack into enemy systems to damage it...");
    }

    protected void launchInvisibilityTech() {
        System.out.println("Hacker's invisible electronic cloack activated");
    }

    @Override
    public void attack() {
        this.hackIntoEnemySystems();
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
