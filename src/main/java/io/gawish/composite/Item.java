package io.gawish.composite;

public abstract class Item {
    private int weight;

    protected Item(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
