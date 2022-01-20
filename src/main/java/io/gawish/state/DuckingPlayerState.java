package io.gawish.state;

public class DuckingPlayerState extends PlayerState {
    @Override
    public PlayerState handleInput(String input, Player player) {
        if (input.compareTo("w") == 0) {
            player.setCurrentImg(PlayerImg.STANDING);
            return new StandingPlayerState();
        }
        player.setCurrentImg(PlayerImg.DUCKING);
        return new DuckingPlayerState();
    }
}
