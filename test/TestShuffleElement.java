import ClassTask.ShuffleElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestShuffleElement {
    @Test
    public void shuffleElementTest(){
        int[] elements = {12,34,56,78,13,54};
        int[] result = {12, 13, 34, 54, 56, 78};
        int[] expected = ShuffleElement.shuffleElement(elements);
        assertArrayEquals(result, expected);
    }
}
