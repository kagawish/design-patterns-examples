package io.gawish.factorymethod;

public class OrcCreator extends Creator {
    @Override
    public Monster createMonster() {
        return new Orc();
    }
}
