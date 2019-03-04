package com.game;

import org.junit.Test;

import static org.junit.Assert.*;

import static com.game.Shape.*;

public class ShapeTest {

    @Test
    public void beats() {
        assertTrue(ROCK.beats(SCISSORS));
        assertFalse(ROCK.beats(PAPER));
        assertFalse(ROCK.beats(ROCK));

        assertTrue(PAPER.beats(ROCK));
        assertFalse(PAPER.beats(SCISSORS));
        assertFalse(PAPER.beats(PAPER));

        assertTrue(SCISSORS.beats(PAPER));
        assertFalse(SCISSORS.beats(ROCK));
        assertFalse(SCISSORS.beats(SCISSORS));
    }
}
