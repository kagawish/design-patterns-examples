package io.gawish.factorymethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void run() {
        String MONSTER_OPTION = "ZOMBIE";
        Creator creator = null;

        if (MONSTER_OPTION.equals("ORC")) {
            creator = new OrcCreator();
        } else if (MONSTER_OPTION.equals("ZOMBIE")) {
            creator = new ZombieCreator();
        }

        List<Monster> enemies = new ArrayList<>();
        enemies.add(creator.createMonster());
        enemies.add(creator.createMonster());
        Scanner scanner = new Scanner(System.in);

        while (true) {
            for (Monster enemy : enemies) {
                enemy.collectFood();
                enemy.attack();
                enemy.build();
            }
            scanner.nextLine();
        }
    }
}
