package io.gawish.observer;

public class PhysicsSystem {
    private static PhysicsSystem instance = null;

    private PlayerFallEvent playerFallEvent = new PlayerFallEvent();

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
            this.playerFallEvent.notify();
        }
    }

    public PlayerFallEvent playerFall() {
        return playerFallEvent;
    }
}

