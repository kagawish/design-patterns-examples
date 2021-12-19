package io.gawish.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag extends Carriable {
    private List<Carriable> carriables = new ArrayList<>();

    public void addCarriable(Carriable carriable) {
        if (this.carriables.size() < 5) {
            carriable.setParent(this);
            this.carriables.add(carriable);
        } else {
            System.out.println("The bag is full");
        }
    }

    @Override
    public void removeCarriable(Carriable carriable) {
        this.carriables.remove(carriable);
    }

    public int getWeight() {
        int totalWeight = 0;
        for (Carriable carriable : this.carriables) {
            totalWeight += carriable.getWeight();
        }
        return totalWeight;
    }
}
