package io.gawish.abstractfactory;

import io.gawish.abstractfactory.medieval.Sword;

public abstract class Environment {
    public abstract Transport getTransport();

    public Weapon getWeapon() {
        return new Sword();
    }
}
