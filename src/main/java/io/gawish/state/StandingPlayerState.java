package io.gawish.state;

public class StandingPlayerState extends PlayerState {
    @Override
    public PlayerState handleInput(String input, Player player) {
        if (input.compareTo("w") == 0) {
            player.setCurrentImg(PlayerImg.JUMPING);
            return new JumpingPlayerState();
        }
        if (input.compareTo("s") == 0) {
            player.setCurrentImg(PlayerImg.DUCKING);
            return new DuckingPlayerState();
        }
        player.setCurrentImg(PlayerImg.STANDING);
        return new StandingPlayerState();
    }
}
