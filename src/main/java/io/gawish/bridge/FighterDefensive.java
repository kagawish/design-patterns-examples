package io.gawish.bridge;

public class FighterDefensive extends Fighter {
    @Override
    public void attack() {
        this.swordAttack();
        this.attemptToHide();
    }

    @Override
    public void hide() {
        this.attemptToHide();
    }

    @Override
    public void heal() {
        this.healWithHerbs();
        this.healWithHerbs();
    }

    @Override
    public void charge() {
    }
}
