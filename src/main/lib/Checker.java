package main.lib;

import main.model.Player;

public class Checker {

    // assume 1 is rock, 2 is paper, 3 is scissors

    public static boolean checkMove(Player one) {
        boolean valid;
        if (one.getPlay() <= 3 && one.getPlay() >= 1) {
            valid = true;
        } else {
            valid = false;
        }
        return valid;
    }

    public static int checkPlay(Player one, Player two) {
        int value;

        switch (one.getPlay()) {
            case 1:
                if (two.getPlay() == 3) {
                    value = 1;
                } else if (two.getPlay() == 1) {
                    value = 2;
                } else {
                    value = 0;
                }
                break;

            case 2:
                if (two.getPlay() == 1) {
                    value = 1;
                } else if (two.getPlay() == 2) {
                    value = 2;
                } else {
                    value = 0;
                }

                break;

            case 3:
                if (two.getPlay() == 2) {
                    value = 1;
                } else if (two.getPlay() == 3) {
                    value = 2;
                } else {
                    value = 0;
                }
                break;

            default:
                value = 3;
                break;
        }

        return value;
    }
}
