package io.gawish.abstractfactory.modern;

import io.gawish.abstractfactory.Weapon;

public class MachineGun implements Weapon {
    @Override
    public void attack() {
        System.out.println("Machine gun fires bullets round");
    }
}
