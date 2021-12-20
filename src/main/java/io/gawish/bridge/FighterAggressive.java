package io.gawish.bridge;

public class FighterAggressive extends Fighter {
    @Override
    public void attack() {
        this.chargeTheEnemy();
        this.swordAttack();
    }

    @Override
    public void hide() {
        this.swordAttack();
        this.attemptToHide();
    }

    @Override
    public void heal() {
        this.swordAttack();
        this.healWithHerbs();
    }

    @Override
    public void charge() {
        this.chargeTheEnemy();
        this.chargeTheEnemy();
    }
}
