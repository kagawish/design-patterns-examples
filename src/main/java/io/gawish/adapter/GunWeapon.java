package io.gawish.adapter;

public class GunWeapon extends Gun implements Weapon {
    @Override
    public void attack() {
        this.fire();
    }
}
