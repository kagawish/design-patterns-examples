package io.gawish.bridge;

public class DefensiveFightingStyle extends FightingStyle {
    public DefensiveFightingStyle(Companion companion) {
        super(companion);
    }

    @Override
    public void attack() {
        this.companion.attack();
        this.companion.hide();
    }

    @Override
    public void charge() {

    }

    @Override
    public void hide() {
        this.companion.hide();
    }

    @Override
    public void heal() {
        this.companion.hide();
        this.companion.heal();
    }
}
