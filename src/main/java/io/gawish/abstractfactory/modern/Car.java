package io.gawish.abstractfactory.modern;

import io.gawish.abstractfactory.Transport;

public class Car implements Transport {
    @Override
    public void visit() {
        System.out.println("Driving the car. Visiting a friend...");
    }

    @Override
    public void travel() {
        System.out.println("Driving the car. Travelling to another country...");
    }
}
