package io.gawish.bridge;

public class MedicAggressive extends Medic {
    @Override
    public void attack() {
        this.shootPistol();
        this.shootPistol();
    }

    @Override
    public void charge() {
    }

    @Override
    public void hide() {
        this.findHidingSpot();
    }

    @Override
    public void heal() {
        this.shootPistol();
        this.healFully();
    }
}
