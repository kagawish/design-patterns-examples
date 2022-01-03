package io.gawish.bridge;

public class Medic implements Companion {
    public void shootPistol() {
        System.out.println("Medic shoots his pistol");
    }

    public void healFully() {
        System.out.println("Medic uses medicine pack to recover fully");
    }

    public void findHidingSpot() {
        System.out.println("Medic finds hiding spot");
    }

    @Override
    public void attack() {
        this.shootPistol();
    }

    @Override
    public void charge() {
    }

    @Override
    public void hide() {
        this.findHidingSpot();
    }

    @Override
    public void heal() {
        this.healFully();
    }
}
