package io.gawish.composite;

public class Player {
    private String name;
    private Carriable bag;

    public Player(String name) {
        this.name = name;
        this.bag = new Bag();
    }

    public void addInBag(Carriable carriable) throws NoCarriableInsideItemException {
        this.bag.addCarriable(carriable);
    }

    public int getLoad() {
        return this.bag.getWeight();
    }
}
