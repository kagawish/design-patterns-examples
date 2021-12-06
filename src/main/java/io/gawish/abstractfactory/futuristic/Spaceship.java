package io.gawish.abstractfactory.futuristic;

import io.gawish.abstractfactory.Transport;

public class Spaceship implements Transport {
    @Override
    public void visit() {
        System.out.println("Climbing on the spaceship. Traveling to another planet...");
    }

    @Override
    public void travel() {
        System.out.println("Climbing on the spaceship. Traveling to another galaxy...");
    }
}
