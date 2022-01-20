package io.gawish.state;

public class DivingPlayerState extends PlayerState {
    @Override
    public PlayerState handleInput(String input, Player player) {
        player.setCurrentImg(PlayerImg.DIVING);
        return new DivingPlayerState();
    }
}
