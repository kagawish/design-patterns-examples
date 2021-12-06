package io.gawish.factorymethod;

public class Player {
    private Sword sword;

    public Player() {
        this.sword = new Sword();
    }

    public void attack() {
        this.sword.attack();
    }
}
