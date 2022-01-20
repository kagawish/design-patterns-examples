package io.gawish.state;

public class JumpingPlayerState extends PlayerState {
    @Override
    public PlayerState handleInput(String input, Player player) {
        if (input.compareTo("s") == 0) {
            player.setCurrentImg(PlayerImg.DIVING);
            return new DivingPlayerState();
        }
        player.setCurrentImg(PlayerImg.JUMPING);
        return new JumpingPlayerState();
    }
}
