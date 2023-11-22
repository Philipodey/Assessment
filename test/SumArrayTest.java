import classWork.SumArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArrayTest {
    @Test
    public void testSumOfNumbersEvenPositions() {

        int[] array = {12, 23, 14, 10, 11};
        int total = 37;
        int result = SumArray.sumOfNumberInEvenPosition(array);
        assertEquals(total, result);
    }
    @Test
    public void testSumOfNumbersInOddPositions(){
        int[] array = {5,4,1,0,6,7,9};
        int total = 11;
        int result = SumArray.sumOfNumberInOddPosition(array);
        assertEquals(total,result);
    }
    @Test
    public void testSumOfOddNumbers(){
        int[] numbers = {5,4,1,0,6,7,9};
        int total = 22;
        int result = SumArray.sumOfOddNumbers(numbers);
    }
    @Test
    public void testSumOfEvenNumbers(){
        int[] numbers = {5,4,1,0,6,7,9};
        int total = 10;
        int result = SumArray.sumOfEvenNumbers(numbers);

    }
}
