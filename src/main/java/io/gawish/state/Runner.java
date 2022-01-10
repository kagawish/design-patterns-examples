package io.gawish.state;

import java.util.Scanner;

public class Runner {
    public static void run() {
        Player celeste = new Player("Celeste");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(celeste);

            String input = scanner.nextLine();

            celeste.handleInput(input);
        }
    }
}
