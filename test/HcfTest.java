import org.junit.jupiter.api.Test;

import static ClassTask.HighestCommonFactor.highestCommonFactor;
import static classWork.HighestCommonDivisor.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HcfTest {
    @Test
    public void highestCommonDivisibleTest(){
        int[] input = {8,4,12,2};
        int[] output = {2};
        assertArrayEquals(output, highestCommonFactor(input));
    }
    @Test
    public void highestCommonDivisible2Test(){
        int[] input = {9,18, 9};
        int[] output = {3,3};
        assertArrayEquals(output, highestCommonFactor(input));
    }
}
