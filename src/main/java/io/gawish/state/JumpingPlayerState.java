package io.gawish.state;

public class JumpingPlayerState extends PlayerState {
    public void onEnter(Player player) {
        player.setCurrentImg(PlayerImg.JUMPING);
    }

    @Override
    public PlayerState handleInput(String input, Player player) {
        if (input.compareTo("s") == 0) {
            return new DivingPlayerState();
        }
        return new JumpingPlayerState();
    }
}
