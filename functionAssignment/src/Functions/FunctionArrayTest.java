package Functions;

import Main.FunctionArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionArrayTest {
    @Test
    public void testThatANumberInAListIsTheLargest(){
        int [] evenNumber = {45,67,98,100};
        int largest = 100;
        int result = FunctionArray.largest(evenNumber);
        assertEquals(result, largest);
    }
    @Test
    public void testThatElementInAListCanReverse(){
        int [] number = {54,67,78,34};
        int [] result = FunctionArray.reverse(number);
        int [] reverse = {34,78,67,54};
        assertArrayEquals(result,reverse);
    }
    @Test
    public void testThatElementExitInAnArray(){
        int [] number = {54,76,23,12};
        int integer = 76;
        boolean result = FunctionArray.elementExit(number,76);
        assertTrue(result);
    }
    @Test
    public void testThatElementsInOddPositionsCanBePrinted(){
        int [] number = {45,67,34,23,1,2,34};
        int[] result = FunctionArray.elementOnOddPositions(number);
        int[] oddPositions = {67,23,2};
        assertArrayEquals(result, oddPositions);
    }
    @Test
    public void testThatElementInEvenPositionsCanBePrinted(){
        int [] number = {34,56,34,12,78,12,23};
        int [] result = FunctionArray.elementOnEvenPosition(number);
        int [] evenPositions = {34,34,78,23};
        assertArrayEquals(result, evenPositions);
    }
    @Test
    public void testThatComputesTheSumOfNumbersInAList(){
        int [] number = {2,5,10};
        int result = FunctionArray.commutesTotalOfAllElement(number);
        int total = 17;
        assertEquals(result,total);
    }
    @Test
    public void testThatStringIsAPalindrome(){
        String letter = "dad";
        boolean result = FunctionArray.stringIsPalindrome(letter);
        assertTrue(result);
    }
    @Test
    public void testThatTwoLIstCanConcatenate(){
        String []list1 = {"4","5","4"};
        String []secondList = {"r","a","t"};
        String [] result = FunctionArray.concatenateTwoList(list1,secondList);
        String [] product = {"4","5","4","r","a","t"};
        assertArrayEquals(result,product);

    }
    @Test
    public void testThatNumbersElementsCanBeSummedForLoop(){
        int [] numbers = {45,65,34,12,4,5};
        int total = 165;
        int result = FunctionArray.sumOfNumberInAList(numbers);
        assertEquals(total,result);

    }
    @Test
    public void testThatNumbersElementsCanBeSummedWhileLoop(){
        int [] numbers = {45,65,34,12,4,5};
        int total = 165;
        int result = FunctionArray.sumOfNumberInAListWhileLoop(numbers);
        assertEquals(total,result);

    }
    @Test
    public void testThatNumbersElementsCanBeSummedDoWhileLoop(){
        int [] numbers = {45,65,34,12,4,5};
        int total = 165;
        int result = FunctionArray.sumOfNumberInAListDoWhileLoop( numbers);
        assertEquals(total,result);

    }




    }

