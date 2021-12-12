package io.gawish.proxy;

public interface Entity {
    public void goRight();
    public void goLeft();
    public void goUp();
    public void goDown();

    public int calculateRank();
    public void render();
}
