package io.gawish.state;

public class StandingPlayerState extends PlayerState {
    @Override
    public PlayerState handleInput(String input, Player player) {
        if (input.compareTo("w") == 0) {
            player.setCurrentImg(PlayerImg.JUMPING);
            return PlayerState.JUMPING_STATE;
        }
        if (input.compareTo("s") == 0) {
            player.setCurrentImg(PlayerImg.DUCKING);
            return PlayerState.DUCKING_STATE;
        }
        player.setCurrentImg(PlayerImg.STANDING);
        return PlayerState.STANDING_STATE;
    }
}
