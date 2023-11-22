import ClassTask.MinMax;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxTest {
    @Test
    public void testMInMax(){
        int[] numbers = new int[]{2, 3, 4, 1, 5};
        int[] expected = MinMax.minMax(numbers);
        int[] result = {14, 10};
        assertArrayEquals(result,expected);
    }

}
