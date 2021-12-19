package io.gawish.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag {
    private int total = 0;
    private List<Item> items = new ArrayList<>();
    private List<Bag> bags = new ArrayList<>();

    public void addItem(Item item) {
        if (this.total < 5) {
            this.items.add(item);
            this.total++;
        } else {
            System.out.println("The bag is full");
        }
    }

    public void addBag(Bag bag) {
        if (this.total < 5) {
            this.bags.add(bag);
            this.total++;
        } else {
            System.out.println("The bag is full");
        }
    }

    public int getWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        for (Bag bag : this.bags) {
            totalWeight += bag.getWeight();
        }
        return totalWeight;
    }
}
