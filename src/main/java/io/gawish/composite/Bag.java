package io.gawish.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag extends Carriable {
    private List<Carriable> carriables = new ArrayList<>();
    private int weight;

    public void addCarriable(Carriable carriable) {
        if (this.carriables.size() < 5) {
            carriable.setParent(this);
            this.carriables.add(carriable);
            this.recalculateWeight();
        } else {
            System.out.println("The bag is full");
        }
    }

    private void recalculateWeight() {
        int totalWeight = 0;
        for (Carriable carriable : this.carriables) {
            totalWeight += carriable.getWeight();
        }
        this.weight = totalWeight;
        if (this.parent != null) {
            this.parent.recalculateWeight();
        }
    }

    @Override
    public void removeCarriable(Carriable carriable) {
        this.carriables.remove(carriable);
        this.recalculateWeight();
    }

    public int getWeight() {
        return this.weight;
    }
}
