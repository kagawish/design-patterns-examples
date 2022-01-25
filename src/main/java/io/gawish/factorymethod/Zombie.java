package io.gawish.factorymethod;

public class Zombie {
    public void collectFood() {
        System.out.println("Zombie is collecting brains");
    }

    public void attack() {
        System.out.println("Zombie attempts to attack nearest human");
    }

    public void build() {
        System.out.println("Zombie is digging a cemetery");
    }
}
