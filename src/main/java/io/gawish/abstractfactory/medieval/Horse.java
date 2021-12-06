package io.gawish.abstractfactory.medieval;

import io.gawish.abstractfactory.Transport;

public class Horse implements Transport {
    @Override
    public void visit() {
        System.out.println("Mounting on the horse. Visiting a friend house...");
    }

    @Override
    public void travel() {
        System.out.println("Mounting on the horse. Traveling to another city...");
    }
}
