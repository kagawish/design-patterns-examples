package io.gawish.state;

public class StandingPlayerState extends PlayerState {
    public void onEnter(Player player) {
        player.setCurrentImg(PlayerImg.STANDING);
    }

    @Override
    public PlayerState handleInput(String input, Player player) {
        if (input.compareTo("w") == 0) {
            return PlayerState.JUMPING_STATE;
        }
        if (input.compareTo("s") == 0) {
            return PlayerState.DUCKING_STATE;
        }
        return PlayerState.STANDING_STATE;
    }
}
