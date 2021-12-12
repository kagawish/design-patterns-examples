package io.gawish.proxy;

import java.util.Random;

public class Player implements Entity {
    private String name;
    private int posX, posY;

    public Player(String name) {
        this.name = name;

        Random r = new Random();
        this.posX = r.nextInt(10);
        this.posY = r.nextInt(10);
    }

    public String getName() {
        return this.name;
    }

    public void goRight() {
        System.out.println(this.name + " moving right");
        this.posX += 1;
    }

    public void goLeft() {
        System.out.println(this.name + " moving left");
        this.posX -= 1;
    }

    public void goUp() {
        System.out.println(this.name + " moving up");
        this.posY += 1;
    }

    public void goDown() {
        System.out.println(this.name + " moving down");
        this.posY -= 1;
    }

    public int calculateRank() {
        Random r = new Random();
        return r.nextInt(100);
    }

    public void render() {
        try {
            System.out.println("Rendering player: " + this.name);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
