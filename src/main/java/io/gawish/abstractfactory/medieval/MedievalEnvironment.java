package io.gawish.abstractfactory.medieval;

import io.gawish.abstractfactory.Environment;
import io.gawish.abstractfactory.Transport;
import io.gawish.abstractfactory.Weapon;

public class MedievalEnvironment extends Environment {
    @Override
    public Transport getTransport() {
       return new Horse();
    }

    @Override
    public Weapon getWeapon() {
        return new Sword();
    }
}
