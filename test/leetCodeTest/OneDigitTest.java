package leetCodeTest;

import org.junit.jupiter.api.Test;

import static leetCode.OneDigit.addDigitUntilOneDigitLeft;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OneDigitTest {
    @Test
    public void continuallyAddTwoDigitNumberUntilOneDigitLeft(){
        int number = 38;
        int output = 2;
        System.out.println(addDigitUntilOneDigitLeft(number));
        assertEquals(output, addDigitUntilOneDigitLeft(number));
    }
    @Test
    public void continuallyAddThreeDigitNumberUntilOneDigitLeft(){
        int number = 999;
        int output = 9;
        assertEquals(output, addDigitUntilOneDigitLeft(number));
    }
    @Test
    public void continuallyAddFourDigitNumberUntilOneDigitLeft(){
        int number = 1234;
        int output = 1;
        System.out.println(addDigitUntilOneDigitLeft(number));
        assertEquals(output, addDigitUntilOneDigitLeft(number));
    }
    @Test
    public void continuallyAddFiveDigitNumberUntilOneDigitLeft(){
        int number = 38;
        int output = 2;
        System.out.println(addDigitUntilOneDigitLeft(number));
        assertEquals(output, addDigitUntilOneDigitLeft(number));
    }

}
