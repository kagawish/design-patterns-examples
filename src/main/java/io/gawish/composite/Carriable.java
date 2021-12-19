package io.gawish.composite;

public interface Carriable {
    public abstract void addCarriable(Carriable carriable) throws CannotAddCarriableInItem;
    public abstract int getWeight();
}
