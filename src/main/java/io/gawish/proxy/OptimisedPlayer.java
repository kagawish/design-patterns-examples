package io.gawish.proxy;

public class OptimisedPlayer implements Entity  {
    private Player player;
    private boolean mustRereender = true;

    public OptimisedPlayer(String name) {
        this.player = new Player(name);
    }

    @Override
    public void goRight() {
        this.player.goRight();
        this.mustRereender = true;
    }

    @Override
    public void goLeft() {
        this.player.goLeft();;
        this.mustRereender = true;
    }

    @Override
    public void goUp() {
        this.player.goUp();
        this.mustRereender = true;
    }

    @Override
    public void goDown() {
        this.player.goDown();
        this.mustRereender = true;
    }

    @Override
    public void render() {
        if (this.mustRereender) {
            this.player.render();
            this.mustRereender = false;
        } else {
            System.out.println("Skipping rendering player " + this.player.getName());
        }
    }
}
