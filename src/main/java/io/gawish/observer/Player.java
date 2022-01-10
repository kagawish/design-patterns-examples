package io.gawish.observer;

public class Player {
    private String name;
    private int posX;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void stepX() {
        this.posX += 1;
    }

    public int getPosX() {
        return posX;
    }


    @Override
    public String toString() {
        return "\nPlayer{" +
                "name='" + name + '\'' +
                ", posX=" + posX +
                '}';
    }
}
