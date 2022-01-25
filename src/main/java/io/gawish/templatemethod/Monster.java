package io.gawish.templatemethod;

public class Monster extends Entity {
    @Override
    public void collectFood() {
        System.out.println("Monster is collecting apples");
    }

    @Override
    public void build() {
    }
}
