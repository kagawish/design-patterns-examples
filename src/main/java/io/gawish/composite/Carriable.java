package io.gawish.composite;

public abstract class Carriable {
    private Carriable parent;

    public abstract void addCarriable(Carriable carriable) throws CannotAddCarriableInItem;
    public abstract void removeCarriable(Carriable carriable) throws CannotRemoveCarriableFromItem;
    public abstract int getWeight();

    public void drop() throws CannotRemoveCarriableFromItem {
        this.parent.removeCarriable(this);
    }

    public void setParent(Carriable parent) {
        this.parent = parent;
    }
}
