package chapterSeven.test;

import chapterSeven.Main.RemoveDuplicates;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static chapterSeven.Main.RemoveDuplicates.numberNotIn;
import static chapterSeven.Main.RemoveDuplicates.trimmedArray;
import static org.junit.jupiter.api.Assertions.*;

public class TestRemoveDuplicates {
    @Test
    public void testRemoveDuplicate(){
        int[] numbers = {4, 5, 4, 6, 3 , 6, 1, 2, 4 ,7, 7};
        int[] result = {4, 5, 6, 3, 1, 2, 7};
        int[] expected = RemoveDuplicates.removeDuplicate(numbers);
        System.out.println(Arrays.toString(expected));
        assertArrayEquals(result, expected);
    }
    @Test
    public void testNumberFoundIn(){
        int[] numbers = {4, 5, 4, 6, 3 , 6, 1, 2, 4 ,7, 7};
        assertTrue(numberNotIn(numbers, 10));
        assertFalse(numberNotIn(numbers, 2));
    }
    @Test
    public void testTrimmedArray(){
        int[] numbers = {4, 5, 4, 6, 3 , 0, 0, 0 ,0, 0};
        int[] result = {4, 5, 4, 6 ,3};
        int[] expected = trimmedArray(numbers, 5);
        assertArrayEquals(expected, result);
    }


}
