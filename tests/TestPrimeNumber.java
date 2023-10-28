import ClassTask.HighestCommonFactor;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPrimeNumber {
    @Test
    public void testPrimeNumber(){
        int number = 50;
        int[] result = { 2, 5, 5};
        int[] expected = HighestCommonFactor.palindromes(number);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, result);
    }
    @Test
    public void testGreatestDivisor(){
        int[] numbers = {6, 9};
        int[] result = {3};
        int[] expected = HighestCommonFactor.highestCommonFactor(numbers);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(result, expected);
    }
}
