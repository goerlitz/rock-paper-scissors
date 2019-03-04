package com.game;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void getShape() {

        Game game = new Game();

        assertEquals(game.getShape("r"), Shape.ROCK);
        assertEquals(game.getShape("p"), Shape.PAPER);
        assertEquals(game.getShape("s"), Shape.SCISSORS);
    }


}