package io.gawish.composite;

public interface Carriable {
    public abstract void addCarriable(Carriable carriable) throws NoCarriableInsideItemException;
    public abstract int getWeight();
}
