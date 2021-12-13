package io.gawish.adapter;

public class Player {
    private Weapon weapon;

    public void attack() {
        this.weapon.attack();
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
