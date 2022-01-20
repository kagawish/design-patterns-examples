package io.gawish.observer;

import java.util.ArrayList;
import java.util.List;

public class PhysicsSystem implements Subject {
    private static PhysicsSystem instance = null;
    private List<Observer> observers = new ArrayList<>();

    private PhysicsSystem() {}

    public static PhysicsSystem getInstance() {
        if (instance == null) {
            instance = new PhysicsSystem();
        }
        return instance;
    }

    public void update(Player p) {
        if (p.getPosX() > 3) {
            System.out.println("Player " + p.getName() + " falls");
            this.sendNotifications();
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void sendNotifications() {
        for (Observer o : this.observers) {
            o.onNotify("PLAYER_FALL");
        }
    }

}

