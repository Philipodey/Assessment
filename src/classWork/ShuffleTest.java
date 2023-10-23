package classWork;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuffleTest {
    @Test
    public void testShuffle(){
        String [] characters = {"A","M","C","W","I","T"};
        String [] strings = {"A","W","M","I","C","T"};
        String[] result = (Shuffle.shuffleOne(characters));
        assertArrayEquals(result, strings);

    }
}
