import ClassTask.ShuffleElement;
import org.junit.jupiter.api.Test;

import static ClassTask.ShuffleElement.shuffleElement;
import static org.junit.jupiter.api.Assertions.*;

public class TestShuffleElement {
    @Test
    public void shuffleElementTest(){
        int[] elements = {12,34,56,78,13,54};
        int[] result = {12, 13, 34, 54, 56, 78};
        int[] expected = shuffleElement(elements);
        assertArrayEquals(result, expected);
    }
    @Test
    public void shuffleNumberTest(){
        int[] elements = {1,3,2,5,4};
        int[] result = {1,2,3,4,5};
        assertArrayEquals(result, shuffleElement(elements));

    }
}
