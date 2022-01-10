package io.gawish.templatemethod;

public class Monster implements Entity {
    public void takeTurn() {
        this.collectApples();
        this.attackNearestPlayer();
    }

    private void collectApples() {
        System.out.println("Monster is collecting apples");
    }

    private void attackNearestPlayer() {
        System.out.println("Monster attempts to attack nearest player");
    }
}
