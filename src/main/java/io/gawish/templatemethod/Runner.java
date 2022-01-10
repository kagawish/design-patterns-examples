package io.gawish.templatemethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void run() {
        List<Entity> enemies = new ArrayList<>();
        enemies.add(new Orc());
        enemies.add(new Monster());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            for (Entity enemy: enemies){
                enemy.takeTurn();
            }
            scanner.nextLine();
        }
    }
}
