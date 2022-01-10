package io.gawish.templatemethod;

public class Orc implements Entity {
    public void takeTurn() {
        this.collectBerries();
        this.attackNearestPlayer();
        this.digUndergroundTunnel();
    }

    private void collectBerries() {
        System.out.println("Orc is collecting berries");
    }

    private void attackNearestPlayer() {
        System.out.println("Orc attempts to attack nearest player");
    }

    private void digUndergroundTunnel() {
        System.out.println("Digging underground tunnel");
    }
}
