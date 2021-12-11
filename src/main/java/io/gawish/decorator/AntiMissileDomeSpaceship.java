package io.gawish.decorator;

public class AntiMissileDomeSpaceship extends Spaceship {
    @Override
    public void defend() {
        System.out.println("Anti missile dome activate. You are protected from missile attacks.");
        super.defend();
    }
}
