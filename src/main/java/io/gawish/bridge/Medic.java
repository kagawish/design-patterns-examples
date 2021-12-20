package io.gawish.bridge;

public abstract class Medic implements Companion {
    public void shootPistol() {
        System.out.println("Medic shoots his pistol");
    }

    public void healFully() {
        System.out.println("Medic uses medicine pack to recover fully");
    }

    public void findHidingSpot() {
        System.out.println("Medic finds hiding spot");
    }
}
