package io.gawish.adapter;

public class GunWeapon implements Weapon {
    private Gun gun;

    public GunWeapon(Gun gun) {
        this.gun = gun;
    }

    @Override
    public void attack() {
        this.gun.fire();
    }
}
