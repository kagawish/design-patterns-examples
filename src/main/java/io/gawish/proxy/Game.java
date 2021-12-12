package io.gawish.proxy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players = new ArrayList<>();

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public List<Player> getPlayers() {
        return this.players;
    }

    public void render() {
        System.out.println("Rendering frame");
        for (Player p : this.players) {
            p.render();
        }
    }
}
