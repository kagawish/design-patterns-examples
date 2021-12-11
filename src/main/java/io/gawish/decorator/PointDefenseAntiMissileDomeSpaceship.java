package io.gawish.decorator;

public class PointDefenseAntiMissileDomeSpaceship extends Spaceship {
    @Override
    public void defend() {
        System.out.println("Point defense system activated");
        System.out.println("Anti missile dome activate. You are protected from missile attacks.");
        super.defend();
    }
}
