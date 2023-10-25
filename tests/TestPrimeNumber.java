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
        int[] expected = HighestCommonFactor.primeNumber(number);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, result);
    }
}
