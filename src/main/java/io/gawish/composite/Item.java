package io.gawish.composite;

public abstract class Item extends Carriable {
    private int weight;

    protected Item(int weight) {
        this.weight = weight;
    }

    public void addCarriable(Carriable carriable) throws CannotAddCarriableInItem {
        throw new CannotAddCarriableInItem();
    }

    public void removeCarriable(Carriable carriable) throws CannotRemoveCarriableFromItem {
        throw new CannotRemoveCarriableFromItem();
    }

    @Override
    public int getWeight() {
        return weight;
    }
}
