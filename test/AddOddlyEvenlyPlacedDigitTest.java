import org.junit.jupiter.api.Test;

import static classWork.AddOddlyEvenlyPlacedDigit.*;
//import static leetCode.MergeTwoStringsAlternatively.turnArrayToString;
import static org.junit.jupiter.api.Assertions.*;

public class AddOddlyEvenlyPlacedDigitTest {
    @Test
    public void addOddlyEvenlyPlacedDigitInAnArrayOfEvenLengthTest(){
        int[] array = {2,3, 5, 6, 7, 2,1};
        int[] output = {5, 11, 9,1};
        assertArrayEquals(output, addOddlyEvenlyPlacedDigit(array));
    }
    @Test
    public void addOddlyEvenlyPlacedDigitInAnArrayOfOddLengthTest(){
        int[] array = {3,4,5,1,5};
        int[] output = {7, 6,5};
        assertArrayEquals(output, addOddlyEvenlyPlacedDigit(array));
    }
    @Test
    public void turnArrayToStringTest(){
        int[] array = {3,4,5,1,5,2};
        String output = "345152";
        assertEquals(output, convertArrayToString(array));
    }

}
