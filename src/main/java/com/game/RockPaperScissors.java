package com.game;

import java.util.List;
import java.util.Scanner;

/**
 * An implementation of Rock-Paper-Scissors with computer opponent.
 */
public class RockPaperScissors {

    private static final List<String> options = List.of("r", "p", "s", "e");

    public static void main(String[] args) {

        Game game = new Game();
        Scanner scanner = new Scanner(System.in);
        boolean playing = true;

        System.out.println("Welcome to Rock-Paper-Scissors!");

        while (playing) {
            System.out.println("\nPlease choose (R)ock, (P)aper, or (S)cissors. (E) will end the game.");

            String s = scanner.next();
            if (options.contains(s.toLowerCase())) {

                if ("E".equalsIgnoreCase(s)) {

                    playing = false;

                } else {

                    game.play(s);

                }

            } else {
                System.out.println("Unknown option. Try again!");
            }

        }

    }
}
