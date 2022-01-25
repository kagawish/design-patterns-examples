package io.gawish.templatemethod;

public class Orc extends Entity {
    @Override
    public void collectFood() {
        System.out.println("Orc is collecting berries");
    }

    @Override
    public void build() {
        System.out.println("Orc is digging underground tunnel");
    }
}
