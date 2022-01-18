package io.gawish.abstractfactory.prehistoric;

import io.gawish.abstractfactory.Transport;

public class Walk implements Transport {
    @Override
    public void visit() {
        System.out.println("Walking...");
    }

    @Override
    public void travel() {
        System.out.println("Walking...");
    }
}
