package io.gawish.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (this.items.size() < 5) {
            this.items.add(item);
        } else {
            System.out.println("The bag is full");
        }
    }

    public int getWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
}
