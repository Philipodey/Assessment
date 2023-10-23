package chapterFour.tdd;

import chapterFour.main.SalesCommission;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesCommissionCalculatorTest {
    @Test
    public void testGrossPercentage(){
        SalesCommission point = new SalesCommission(9,200, 5000, 650.00);
        assertNotNull(point);
        point.setGrossPercentage(9);
        assertEquals(9, point.getGrossPercentage(), 0.01);

    }

    @Test
    public void testSalesBonus(){
        SalesCommission pay = new SalesCommission(9,200, 5000, 650.00);
        assertNotNull(pay);
        pay.setSalesBonus(200);
        assertEquals(200, pay.getSalesBonus(), 0.01);
    }
    @Test
    public void testTotalSales(){
        SalesCommission dream = new SalesCommission(9, 200, 5000, 650.00);
        assertNotNull(dream);
        dream.setTotalSales(5000);
        assertEquals(5000.00, dream.getTotalSales(), 0.01);
    }
    @Test
    public void testSalesCommission(){
        SalesCommission pay = new SalesCommission(0.09, 200, 5000, 650.00);
        assertNotNull(pay);
        pay.setSalesCommission(200,0.09,820.58);
        assertEquals(273.85, pay.getSalesCommission(), 0.01);
    }

}
