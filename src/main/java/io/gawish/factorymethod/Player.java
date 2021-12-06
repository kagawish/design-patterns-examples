package io.gawish.factorymethod;

public abstract class Player {
    public abstract Weapon getWeapon();

    public void attack() {
        this.getWeapon().attack();
    }

    public void run() {
        System.out.println("Player running");
    }

    public void stand() {
        System.out.println("Player standing ground");
    }
}
