package chapterFour.tdd;

import chapterFour.main.TaxCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TaxCalculatorTdd{
    @Test
    public void testTotalTaxOfEarningLesThan30000(){
        TaxCalculator lagos = new TaxCalculator();
        int expected = lagos.setTotalTax(25000);
        assertEquals(expected, 3750);
    }

    @Test
    public void testTotalTaxOfEarningGreaterThan30000(){
        TaxCalculator lagos = new TaxCalculator();
        int expected = lagos.setTotalTax(40000);
        assertEquals(expected, 8000);
    }
}
