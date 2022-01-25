package io.gawish.factorymethod;

public class Orc implements Monster {
    @Override
    public void collectFood() {
        System.out.println("Orc is collecting berries");
    }

    @Override
    public void attack() {
        System.out.println("Orc attempts to attack nearest player");
    }

    @Override
    public void build() {
        System.out.println("Orc is digging underground tunnel");
    }
}