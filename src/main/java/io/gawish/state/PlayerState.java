package io.gawish.state;

public abstract class PlayerState {
    public abstract PlayerState handleInput(String input, Player player);
}
