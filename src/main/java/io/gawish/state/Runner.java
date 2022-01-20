package io.gawish.state;

import java.util.Scanner;

public class Runner {
    public static void run() {
        PlayerState.DUCKING_STATE = new DuckingPlayerState();
        PlayerState.JUMPING_STATE = new JumpingPlayerState();
        PlayerState.DIVING_STATE = new DivingPlayerState();
        PlayerState.STANDING_STATE = new StandingPlayerState();

        Player celeste = new Player("Celeste");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(celeste);

            String input = scanner.nextLine();

            celeste.handleInput(input);
        }
    }
}
