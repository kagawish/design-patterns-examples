package io.gawish.bridge;

public abstract class FightingStyle {
    protected Companion companion;

    public FightingStyle(Companion companion) {
        this.companion = companion;
    }

    public abstract void attack();
    public abstract void charge();
    public abstract void hide();
    public abstract void heal();
}
