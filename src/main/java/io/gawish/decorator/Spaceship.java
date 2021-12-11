package io.gawish.decorator;

public class Spaceship implements TechSystem {
    private int health = 100;

    public void attack() {
        System.out.println("[ATTACK] Spaceship launches gun attack");
    }

    public void defend() {
        System.out.println("[DEFENSE] Spaceship defends using basic shield");
    }
}
