import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static classWork.MostFrequent.mostFrequentlyOccurredNumber;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostFrequentTest {
    @Test
    public void mostFrequentlyOccurredNumberTest() {
        int[] input = {2, 1, 1, 2, 2};
        int output = 2;
        System.out.println(mostFrequentlyOccurredNumber(input));
        assertEquals(output, mostFrequentlyOccurredNumber(input));
    }


}
