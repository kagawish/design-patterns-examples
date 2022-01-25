package io.gawish.factorymethod;

public class ZombieCreator extends Creator {
    @Override
    public Monster createMonster() {
        return new Zombie();
    }
}
