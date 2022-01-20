package io.gawish.state;

public class Player {
    private String name;
    private PlayerState state;

    private PlayerImg currentImg = PlayerImg.STANDING;

    public Player(String name) {
        this.name = name;
        this.state = PlayerState.STANDING_STATE;
    }

    public void handleInput(String input) {
        this.state = this.state.handleInput(input, this);
    }

    public void setCurrentImg(PlayerImg newImg) {
        this.currentImg = newImg;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", currentImg=" + currentImg +
                '}';
    }
}
