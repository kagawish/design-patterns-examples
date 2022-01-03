package io.gawish.bridge;

public class Fighter implements Companion {
    protected void swordAttack() {
        System.out.println("Fighter attacks with his sword");
    }

    protected void attemptToHide() {
        System.out.println("Fighter searches for a place to hide");
    }

    protected void healWithHerbs() {
        System.out.println("Fighter using medicinal herbs to heal: +5 HP");
    }

    protected void chargeTheEnemy() {
        System.out.println("Fighter charging the enemy head-on");
    }

    @Override
    public void attack() {
        this.swordAttack();
    }

    @Override
    public void charge() {
        this.chargeTheEnemy();
    }

    @Override
    public void hide() {
        this.attemptToHide();
    }

    @Override
    public void heal() {
        this.healWithHerbs();
    }
}
