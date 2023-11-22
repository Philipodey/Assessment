import ClassTask.ArrayTask;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestElementsAndString {
    @Test
    public void testPutElementCountGreaterThanTwoIbAnotherList(){
        int[] element = {1,2,3,3,2,4,5,6, 2};
        int[] countGreaterThanTwo = {2,3};
        int[] result = ArrayTask.returnDuplicateInAnArray(element);
        assertArrayEquals(result,countGreaterThanTwo);
    }
    @Test
    public void testIsPalindrome(){
        String string = "Grace";
        boolean expected = ArrayTask.palindrome(string);
        assertTrue(expected);
    }
    @Test
    public void testDominantNumbers(){
        int[] numbers = {9, 3, 10, 7, 4};
        int[] result = {9,10,7};
        int[] expected = ArrayTask.dominantElement(numbers);
        assertArrayEquals(result, expected);
    }
    @Test
    public void testThatNumberIsPalindrome() {
        String string = "Anna";
        boolean expected = ArrayTask.palindrome(string);
        assertTrue(expected);
    }
    @Test
    public void testTurnDuplicateToZero() {
        int[] element = {1, 1, 1, 1, 2, 2, 3, 1, 5};
//        int[] countGreaterThanTwo = {1, 0,0,0,0,0,0,0,0,0,2};
        int[] countGreaterThanTwo = {1,2};
        int[] result = ArrayTask.returnDuplicateInAnArray(element);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(result, countGreaterThanTwo);
    }
}
