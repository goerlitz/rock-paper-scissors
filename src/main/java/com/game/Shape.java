package com.game;

/**
 * Definition of all playable shapes.
 */
public enum Shape {
    ROCK, PAPER, SCISSORS;

    private Shape beats;

    static {
        ROCK.beats = SCISSORS;
        PAPER.beats = ROCK;
        SCISSORS.beats = PAPER;
    }

    /**
     * @param other the shape to beat.
     * @return true if this shape beats the other shape.
     */
    public boolean beats(Shape other) {
        return this.beats == other;
    }

}
