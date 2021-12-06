package io.gawish.abstractfactory.medieval;

import io.gawish.abstractfactory.Weapon;

public class Sword implements Weapon {
    @Override
    public void attack() {
        System.out.println("Sword swings");
    }
}
