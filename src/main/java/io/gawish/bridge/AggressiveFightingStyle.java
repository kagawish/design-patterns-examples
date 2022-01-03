package io.gawish.bridge;

public class AggressiveFightingStyle extends FightingStyle {
    public AggressiveFightingStyle(Companion companion) {
        super(companion);
    }

    @Override
    public void attack() {
        this.companion.attack();
        this.companion.attack();
    }

    @Override
    public void charge() {
        this.companion.charge();
        this.companion.charge();
    }

    @Override
    public void hide() {
        this.companion.hide();
    }

    @Override
    public void heal() {
        this.companion.attack();
        this.companion.heal();
    }
}
