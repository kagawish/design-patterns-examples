package io.gawish.composite;

public abstract class Item implements Carriable {
    private int weight;

    protected Item(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
