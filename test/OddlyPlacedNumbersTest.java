import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static classWork.OddlyPlacedNumbers.*;
import static org.junit.jupiter.api.Assertions.*;

public class OddlyPlacedNumbersTest {
    @Test
    public void OddlyPlacedNumbersInTheArrayTest() {
        int[] numbers = {1,2,3,4,5,6};
        int[] result = {2,4,6};
        assertArrayEquals(result, oddPosition(numbers));
    }

    @Test
    public void shuffleElementMultiplyTest(){
        int[] numbers = {1,2,3,4,5,6};
        int[] result = {1,4,9,16,25,36};
        assertArrayEquals(result, multiplyShuffledElement(numbers));
    }
    @Test
    public void vowelLettersTest(){
        String word = "baby";
        String result = "bby";
        assertEquals(result, noVowelWords(word));
    }
    @Test
    public void removeSpaceTest(){
        String word = "1 2 3";
        String noStringWord = "123";
        System.out.println(numbersInAString(word));
        assertEquals(noStringWord, numbersInAString(word));
    }
    @Test
    public void arrayOfNumberTest(){
        String word = "123";
        int[] result = {1,2,3};
        System.out.println(Arrays.toString(largestSmallestNumberInAString(word)));
        assertArrayEquals(result, largestSmallestNumberInAString(word));
    }
    @Test
    public void largestSmallestNumberInAStringOfNumberTest(){
        String word = "1 2 0 5";
        int[] result = {1,5};
        assertArrayEquals(result, minMaxNumbers(word));
    }

}
