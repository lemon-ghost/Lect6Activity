package main;

import main.lib.Checker;
import main.model.Player;

public class App {

    // assume 1 is rock, 2 is paper, 3 is scissors

    public App() {
    }

    public int oneRound(int playerMove, int computerMove) {
        int value = -1;
        Player newPlayer = new Player(playerMove);
        Player computer = new Player(computerMove);

        boolean moveOnToRound = Checker.checkMove(newPlayer);

        if (moveOnToRound) {

            int batobatoPix = Checker.checkPlay(newPlayer, computer);

            switch (batobatoPix) {
                case 0:
                    System.out.println("Computer Wins");
                    value = 0;
                    break;

                case 1:
                    System.out.println("Player Wins");
                    value = 1;
                    break;

                case 2:
                    System.out.println("Draw");
                    value = 2;
                    break;

                default:
                    break;
            }

        } else {
            System.out.println("Invalid Move");
            value = 3;
        }

        return value;
    }

}
