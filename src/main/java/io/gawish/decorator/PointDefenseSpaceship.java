package io.gawish.decorator;

public class PointDefenseSpaceship extends Spaceship {
    @Override
    public void defend() {
        System.out.println("[DEFENSE] Point defense system activated");
        super.defend();
    }
}
