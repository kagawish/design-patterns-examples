package io.gawish.abstractfactory.modern;

import io.gawish.abstractfactory.Environment;
import io.gawish.abstractfactory.Transport;
import io.gawish.abstractfactory.Weapon;

public class ModernEnvironment extends Environment {
    @Override
    public Transport getTransport() {
        return new Car();
    }

    @Override
    public Weapon getWeapon() {
        return new MachineGun();
    }
}
