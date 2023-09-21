package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationTest {
    @Test
    public void testThatTwoNumbersAreLessThanZero(){
        int product = Multiplication.multiply(-10, -5);
        assertEquals(50, product);
    }
    @Test
    public void testThatFirstNumberIsLessThanZero(){
        int product = Multiplication.multiply(-4,6);
        assertEquals(-24, product);
    }
    @Test
    public void testThatSecondNumberIsLessThanZero(){
        int product = Multiplication.multiply(5, -4);
        assertEquals(-20, product);
    }
}
