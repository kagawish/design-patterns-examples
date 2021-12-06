package io.gawish.factorymethod;

public class WitchPlayer extends Player {
    @Override
    public Weapon getWeapon() {
        return new Spell();
    }
}
