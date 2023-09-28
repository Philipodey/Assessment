package test;

import org.junit.jupiter.api.Test;
import tdd.Main.SumOfDigit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitTest {
    @Test
    public void testThatTwoDigitNumberCanBeAdd() {
        int twoDigit = SumOfDigit.sumDigits(123);
        assertEquals(twoDigit, 6);
    }
    @Test
    public void testThatThreeDigitNumbersCanBeAdded(){
        int threeDigits = SumOfDigit.sumDigits(2345);
        assertEquals(threeDigits,14);
    }
    @Test
    public void testThatNegativeNumberCanBeMultiPlied(){
        int negativeDigits = SumOfDigit.sumDigits(-2+3+5);
        assertEquals(negativeDigits, 6);
    }
}
