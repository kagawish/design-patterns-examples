package io.gawish.factorymethod;

public class Spell implements Weapon {
    @Override
    public void attack() {
        System.out.println("Emits spell");
    }
}
