package tdd;

import org.junit.Test;
import test.MathsFunction;

import static org.junit.Assert.assertEquals;

public class MathsFunctionTest {
    @Test
    public void testThatANumberIsAnEvenNumber() {
        boolean oddEven = MathsFunction.evenOdd(6);
        assertEquals(true, oddEven);
    }
    @Test
    public void testThatANumberHasAPrimeNumber(){
        boolean primeNumber = MathsFunction.primeNumber(7);
        assertEquals(true, primeNumber);
    }
    @Test
    public void testThatNumberCanSubtract(){
        int subtract = MathsFunction.positiveDifference(4, 2);
        assertEquals(2, subtract);
    }
    @Test
    public void testThatNumberCanBeDividedAndNumberDivideByZeroWillGiveZero(){
        double divide = MathsFunction.divide(9, 0);
        assertEquals(0, divide, 0.05);
    }
    @Test
    public void testThatANumberHasFactor(){
        int factor = MathsFunction.factor();
    }
}
