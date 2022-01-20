package io.gawish.observer;

import java.util.ArrayList;
import java.util.List;

public class PlayerFallEvent implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void sendNotifications() {
        for (Observer o : this.observers) {
            o.onNotify("PLAYER_FALL");
        }
    }
}
