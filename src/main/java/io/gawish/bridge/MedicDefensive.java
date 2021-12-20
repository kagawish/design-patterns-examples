package io.gawish.bridge;

public class MedicDefensive extends Medic {
    @Override
    public void attack() {
        this.shootPistol();
        this.findHidingSpot();
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
        this.findHidingSpot();
        this.healFully();
    }
}
