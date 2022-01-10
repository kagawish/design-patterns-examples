package io.gawish.state;

public class Player {
    private String name;
    private boolean isJumping = false;
    private boolean isDucking = false;

    private PlayerImg currentImg = PlayerImg.STANDING;

    public Player(String name) {
        this.name = name;
    }

    public void handleInput(String input) {
        // JUMP
        if (input.compareTo("w") == 0)
        {
            if (!this.isJumping && !this.isDucking)
            {
                this.isJumping = true;
                this.currentImg = PlayerImg.JUMPING;
            }
        }
        // PRESS DOWN
        else if (input.compareTo("s") == 0)
        {
            if (!this.isJumping)
            {
                this.isDucking = true;
                this.currentImg = PlayerImg.DUCKING;
            }
            else
            {
                this.isJumping = false;
                this.currentImg = PlayerImg.DIVING;
            }
        }
        // RELEASE DOWN
        else if (input.compareTo("x") == 0)
        {
            if (this.isDucking)
            {
                this.currentImg = PlayerImg.STANDING;
            }
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", isJumping=" + isJumping +
                ", isDucking=" + isDucking +
                ", currentImg=" + currentImg +
                '}';
    }
}
