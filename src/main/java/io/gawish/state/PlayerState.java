package io.gawish.state;

public abstract class PlayerState {
    public static JumpingPlayerState JUMPING_STATE;
    public static StandingPlayerState STANDING_STATE;
    public static DuckingPlayerState DUCKING_STATE;
    public static DivingPlayerState DIVING_STATE;

    public abstract PlayerState handleInput(String input, Player player);

    public abstract void onEnter(Player player);
}
