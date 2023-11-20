package chapterSeven.test;

import org.junit.jupiter.api.Test;

import java.util.Enumeration;

import static chapterSeven.Function.DiceRolling.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDiceRolling{
    @Test
    public void testSimulateDiceRoll(){
        int number = simulateDiceRoll();
        System.out.println(number);
        boolean value = number > 0 && number < 7;
        assertTrue(value);
    }
    @Test
    public void testSumOfDice(){
        int sum = diceOutcomeSum();
        System.out.println(sum);
        boolean value = sum > 1 && sum <= 12;
        assertTrue(value);
    }
    @Test
    public void testShowArray(){
        int[] diceOutcome = diceOutcome();
        displayBoard(diceOutcome);
    }
}
