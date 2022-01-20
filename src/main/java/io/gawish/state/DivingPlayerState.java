package io.gawish.state;

public class DivingPlayerState extends PlayerState {
    public void onEnter(Player player) {
        player.setCurrentImg(PlayerImg.DIVING);
    }

    @Override
    public PlayerState handleInput(String input, Player player) {
        return new DivingPlayerState();
    }
}
