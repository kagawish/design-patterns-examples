package io.gawish.factorymethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void run() {
        String MONSTER_OPTION = "ZOMBIE";

        if (MONSTER_OPTION.equals("ORC")) {
            List<Orc> enemies = new ArrayList<>();
            enemies.add(new Orc());
            enemies.add(new Orc());
            Scanner scanner = new Scanner(System.in);

            while (true) {
                for (Orc enemy : enemies) {
                    enemy.collectFood();
                    enemy.attack();
                    enemy.build();
                }
                scanner.nextLine();
            }
        } else if (MONSTER_OPTION.equals("ZOMBIE")) {
            List<Zombie> enemies = new ArrayList<>();
            enemies.add(new Zombie());
            enemies.add(new Zombie());
            Scanner scanner = new Scanner(System.in);

            while (true) {
                for (Zombie enemy : enemies) {
                    enemy.collectFood();
                    enemy.attack();
                    enemy.build();
                }
                scanner.nextLine();
            }
        }
    }
}
