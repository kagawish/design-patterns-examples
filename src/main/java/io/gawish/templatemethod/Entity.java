package io.gawish.templatemethod;

public abstract class Entity {
    final public void takeTurn() {
        this.collectFood();
        this.attack();
        this.build();
    }

    public abstract void collectFood();
    public void attack() {
        System.out.println("Attempts to attack nearest player");
    };
    public abstract void build();
}
