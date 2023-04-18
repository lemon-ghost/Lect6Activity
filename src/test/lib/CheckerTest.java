package test.lib;

import static org.junit.Assert.*;

import org.junit.Test;

import main.lib.Checker;
import main.model.Player;

public class CheckerTest {

    @Test
    public void invalidBecausePlayerMakesInvalidMove() {
        Player One = new Player(5);
        boolean play = Checker.checkMove(One);
        assertFalse(play);
    }

    @Test
    public void ValidBecausePlayerMakesValidMove() {
        Player One = new Player(1);
        boolean play = Checker.checkMove(One);
        assertTrue(play);
    }
}
