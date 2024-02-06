import classWork.LowestDuplicate;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static classWork.LowestDuplicate.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LowestDuplicateTest {
    @Test
    public void lowestDuplicateNumberTest(){
        int[] input = {2,3,5,6,7,8};
        int[] secondInput = {1,3,7,10,11,8};
        int output = 3;
        assertEquals(output, lowestDuplicateNumber(input, secondInput) );
    }
    @Test
    public void mergeArrayTest(){
        int[] input = {2,3,5,6,7,8};
        int[] secondInput = {1,3,7,10,11,8};
        int[] output = {2,1,3,7,10,11,8,3,5,6,7,8};
        assertArrayEquals(output, LowestDuplicate.mergeArray(input, secondInput) );
    }
    @Test
    public void removeDuplicateTest(){
        int[] input = {2,1,3,7,10,11,8,3,5,6,7,8};
        int [] output = {3,7,8,0,0,0,0,0,0,0,0,0};
        System.out.println(Arrays.toString(LowestDuplicate.removeDuplicate(input)));
        assertArrayEquals(output, removeDuplicate(input));
    }
    @Test
    public void minimumNumberTest(){
        int[] input = {3,7,8};
        int output = 3;
        assertEquals(output, minimum(input));
    }

    @Test
    public void minimumDuplicateNumber(){
        int[] input = {5,4,11,13,9};
        int[] secondInput = {9,11,15,1,14};
        int output = 9;
        assertEquals(output, lowestDuplicateNumber(input, secondInput));
    }

}
