import classWork.RemoveDuplicate;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static classWork.NotDuplicatedValue.nonDuplicatedValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonDuplicatedValueTest {
    @Test
    public void nonDuplicatedValueTest(){
        int[] input = {2, 2, 1, 3, 3};
        int output = 1;
        assertEquals(output, nonDuplicatedValue(input));
    }
    @Test
    public void nonDuplicateTest1(){
        int[] input = {4, 3, 2, 1, 1, 2, 2, 3};
        int output = 4;
        assertEquals(output, nonDuplicatedValue(input));
    }
}
