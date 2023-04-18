package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.App;

public class AppTest {
    // assume 1 is rock, 2 is paper, 3 is scissors
    @Test
    public void playerRockcomputerScissors() {
        App app = new App();
        int outcome = app.oneRound(1, 3);

        assertEquals(1, outcome);
    }

    @Test
    public void playerScissorscomputerRock() {
        App app = new App();
        int outcome = app.oneRound(3, 1);

        assertEquals(0, outcome);
    }

    @Test
    public void playerPapercomputerPaper() {
        App app = new App();
        int outcome = app.oneRound(2, 2);

        assertEquals(2, outcome);
    }

    @Test
    public void playerInvalidMove() {
        App app = new App();
        int outcome = app.oneRound(5, 2);

        assertEquals(3, outcome);
    }

}
