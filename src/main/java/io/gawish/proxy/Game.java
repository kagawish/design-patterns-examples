package io.gawish.proxy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Entity> players = new ArrayList<>();

    public void addPlayer(Entity player) {
        this.players.add(player);
    }

    public List<Entity> getPlayers() {
        return this.players;
    }

    public void render() {
        System.out.println("Rendering frame");
        for (Entity p : this.players) {
            p.render();
        }
    }
}
