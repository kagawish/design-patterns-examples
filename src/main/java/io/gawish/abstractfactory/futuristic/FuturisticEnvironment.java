package io.gawish.abstractfactory.futuristic;

import io.gawish.abstractfactory.Environment;
import io.gawish.abstractfactory.Transport;
import io.gawish.abstractfactory.Weapon;

public class FuturisticEnvironment extends Environment {
    @Override
    public Transport getTransport() {
        return new Spaceship();
    }

    @Override
    public Weapon getWeapon() {
        return new LaserSabre();
    }
}
