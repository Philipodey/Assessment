import org.junit.jupiter.api.Test;

import static classWork.PlusOne.plusOne;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {
    @Test
    public void plusOneTest(){
        int[] input = {1,2,3};
        int[] output = {1,2,4};
        assertArrayEquals(output, plusOne(input));
    }
    @Test
    public void plusOneIfTheLastNumberInTheArrayIs9Test(){
        int[] input = {9};
        int[] output = {1,0};
        assertArrayEquals(output, plusOne(input));
    }

    @Test
    public void plusOneTest1(){
        int[] input = {4,3,2,1};
        int[] output = {4,3,2,2};
        assertArrayEquals(output, plusOne(input));
    }
}
