package io.gawish.observer;

public class PhysicsSystem {
    private static PhysicsSystem instance = null;

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
            AudioSystem.getInstance().playFallingSound();
            AchievementsSystem.getInstance().unlockFellIntoOblivion();
        }
    }
}
