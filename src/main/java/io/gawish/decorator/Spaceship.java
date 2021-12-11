package io.gawish.decorator;

public class Spaceship {
    private int health = 100;

    public void attack() {
        System.out.println("Spaceship launches gun attack");
    }

    public void defend() {
        System.out.println("Spaceship defends using basic shield");
    }
}
