package io.gawish.proxy;

public class OptimisedPlayer implements Entity  {
    private Player player;
    private boolean mustRender = true;
    private int cachedRank;

    public OptimisedPlayer(String name) {
        this.player = new Player(name);
    }

    @Override
    public void goRight() {
        this.player.goRight();
        this.mustRender = true;
    }

    @Override
    public void goLeft() {
        this.player.goLeft();;
        this.mustRender = true;
    }

    @Override
    public void goUp() {
        this.player.goUp();
        this.mustRender = true;
    }

    @Override
    public void goDown() {
        this.player.goDown();
        this.mustRender = true;
    }

    @Override
    public int calculateRank() {
        System.out.println("Must rerender: " + this.mustRender);
        if (this.mustRender) {
            this.cachedRank = this.player.calculateRank();
        }
        return this.cachedRank;
    }

    @Override
    public void render() {
        if (this.mustRender) {
            this.player.render();
            this.mustRender = false;
        } else {
            System.out.println("Skipping rendering player " + this.player.getName());
        }
    }
}
