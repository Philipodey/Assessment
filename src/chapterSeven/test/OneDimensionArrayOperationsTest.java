package chapterSeven.test;


import chapterSeven.Main.OneDimensionArrayOperations;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class OneDimensionArrayOperationsTest {
    @Test
    public void testTurnElementsBetweenIndex10And20ToZero(){
        int[] integers = {1 ,2 ,3, 4 ,5 , 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int[] result = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,0};
        int[] expected = OneDimensionArrayOperations.turnElementBetweenIndex10And20ToZero(integers);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testMultiplyElementsBy2(){
        int[] integers = {1 ,2 ,3, 4 ,5 , 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        int[] result = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42};
        int[] expected = OneDimensionArrayOperations.multiplyEachOfTheElementBy2(integers);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(expected, result);
    }
    @Test
    public void displayValuesOfInteger(){
        int[] integers = {1 ,2 ,3, 4 ,5 , 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21};
        OneDimensionArrayOperations.displayIntegerArray(integers);
    }
}
