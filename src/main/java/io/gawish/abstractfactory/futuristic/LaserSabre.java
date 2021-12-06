package io.gawish.abstractfactory.futuristic;

import io.gawish.abstractfactory.Weapon;

public class LaserSabre implements Weapon {
    @Override
    public void attack() {
        System.out.println("Laser sabre beams");
    }
}
