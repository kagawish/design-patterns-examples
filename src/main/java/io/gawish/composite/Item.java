package io.gawish.composite;

public abstract class Item implements Carriable {
    private int weight;

    protected Item(int weight) {
        this.weight = weight;
    }

    @Override
    public void addCarriable(Carriable carriable) throws CannotAddCarriableInItem {
        throw new CannotAddCarriableInItem();
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
