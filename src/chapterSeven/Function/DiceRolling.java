package chapterSeven.Function;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRolling {
    private static final  SecureRandom secureRandom = new SecureRandom();
    public static int simulateDiceRoll() {
        return secureRandom.nextInt(1, 7);
    }
    public static int diceOutcomeSum(){
        int firstDice = secureRandom.nextInt(1, 7);
        int secondDice = secureRandom.nextInt(1, 7);
        return firstDice + secondDice;
    }
    public static int[] diceOutcome(){
        int[] diceRollBoard = new int[13];
        for (int i = 0; i < 1_000_000; i++) {
            int sum = diceOutcomeSum();
            ++diceRollBoard[sum];
        }
        return diceRollBoard;
    }

    public static void displayBoard(int[] diceRoll){
        for (int i = 1; i < diceRoll.length; i++) {
            System.out.println(diceRoll[i]);
        }
    }

}
