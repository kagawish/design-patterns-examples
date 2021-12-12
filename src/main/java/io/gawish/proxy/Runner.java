package io.gawish.proxy;

import java.util.Scanner;

public class Runner {
    public static void run()
    {
        Game game = new Game();
        game.addPlayer(new OptimisedPlayer("P1"));
        game.addPlayer(new OptimisedPlayer("P2"));
        game.addPlayer(new OptimisedPlayer("P3"));
        game.addPlayer(new OptimisedPlayer("P4"));

        System.out.println("Press a to move left");
        System.out.println("Press s to move down");
        System.out.println("Press d to move right");
        System.out.println("Press w to move up");
        System.out.println("Press anything else to skip moving");

        while (true) {
            System.out.println("Press move Player 1");
            Scanner sc = new Scanner(System.in);
            String inputKey = sc.next();
            System.out.println(inputKey);
            switch (inputKey) {
                case "a": game.getPlayers().get(0).goLeft(); break;
                case "s": game.getPlayers().get(0).goDown(); break;
                case "d": game.getPlayers().get(0).goRight(); break;
                case "w": game.getPlayers().get(0).goUp(); break;
            }

            System.out.println("Score p1 : " + game.getPlayers().get(0).calculateRank());

            game.render();
        }

    }
}
