
import classWork.SwapElements;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class TestSwapElements {
    @Test
    public void swapElements(){
        int[] element = {42, 18,41,22,15,12};
        int[] result  = {18, 42, 22, 41,12, 15};
        int[] expected = SwapElements.swapElements(element);
        assertArrayEquals(expected, result);
    }
    @Test
    public void swapOddElements(){
        int[] element = {42, 18, 41, 22, 15};
        int[] result = {18, 42, 22, 41, 15};
        int[] expected = SwapElements.swapElements(element);
        assertArrayEquals(expected, result);
    }
    @Test
    public void swapAnotherElements(){
        int[] element = {42, 15, 18, 12, 13, 3};
        int[] result = {42, 15, 12, 18, 3, 13};
        int[] expected = SwapElements.swapElement2(element);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, result);
    }
    @Test
    public void swapAnotherEvenElements(){
        int[] element = {42, 15, 18, 12, 13};
        int[] result = {42, 15, 12, 18, 13};
        int[] expected = SwapElements.swapElement2(element);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, result);
    }

}
