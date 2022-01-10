package io.gawish.observer;

import java.util.Scanner;

public class Runner {
    public static void run() {
        Player p1 = new Player("P1");
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(p1);
            String pressed = input.nextLine();
            System.out.println("Pressed: ".concat(pressed));

            if (pressed.compareTo("d") == 0) {
                p1.stepX();
            }

            PhysicsSystem.getInstance().update(p1);
        }
    }
}
