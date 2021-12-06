package io.gawish.factorymethod;

public class MeleePlayer extends Player {
    @Override
    public Weapon getWeapon() {
        return new Sword();
    }
}
