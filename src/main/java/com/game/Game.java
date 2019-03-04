package com.game;

import java.util.Random;

/**
 * Game logic for Rock-Paper-Scissors.
 */
public class Game {

    private final Random rand = new Random();

    /**
     * Plays a round of Rock-Paper-Scissors with the given shape.
     * @param s a String which represents the chosen shape.
     */
    public void play(String s) {

        Shape userShape = getShape(s);
        Shape compShape = getOpponentShape();

        System.out.println("Your choice: " + userShape + ", Computer: " + compShape);

        if (userShape.beats(compShape))
            System.out.println("You win!");
        else
            if (compShape.beats(userShape))
                System.out.println("You loose!");
            else
                System.out.println("Draw!");
    }

    /**
     * @param s a String which represents the chosen shape.
     * @return the shape.
     */
    Shape getShape(String s) {
        switch (s.toLowerCase()) {
            case "r":
                return Shape.ROCK;
            case "p":
                return Shape.PAPER;
            case "s":
                return Shape.SCISSORS;
            default:
                throw new IllegalArgumentException("unknown Shape " + s);
        }
    }

    /**
     * @return the shape selected by the opponent.
     */
    private Shape getOpponentShape() {
        return Shape.values()[rand.nextInt(3)];
    }

}
