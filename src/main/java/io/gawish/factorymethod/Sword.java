package io.gawish.factorymethod;

import io.gawish.abstractfactory.Weapon;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("Sword swings");
    }
}
