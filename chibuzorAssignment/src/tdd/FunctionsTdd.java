package tdd;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsTdd {
    @Test
    public void testThatDispatchRiderCanDeliverPackagesLessThan50Percentage(){
        int expected = Fuctions.backToSender(45,160,5000);
        assertEquals(12200, expected);
    }
    @Test
    public void testThatDispatchRiderCanDeliverPackagesGreaterThan50Percentage(){
        int expected = Fuctions.backToSender(55,200,5000);
        assertEquals(16000, expected);
    }
    @Test
    public void testThatDispatchRiderCanDeliverPackagesGreaterThan60Percentage(){
        int expected = Fuctions.backToSender(65,250,5000);
        assertEquals(21250, expected);
    }
    @Test
    public void testThatDispatchRiderCanDeliverPackagesGreaterThan70Percentage(){
        int expected = Fuctions.backToSender(75,500,5000);
        assertEquals(42500, expected);
    }

}
