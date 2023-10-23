package test;

import main.SwapElements;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapElementsTest {
    @Test
    public void testSwapElements(){
        int[] numbers = {23, 45, 3, 5, 7, 2};
        int[] result = {23, 45, 7, 5, 3, 2};
        assertArrayEquals(result,SwapElements.elementSwap(numbers,2,3));


    }
}
