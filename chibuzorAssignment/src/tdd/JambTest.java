package tdd;


import org.junit.jupiter.api.Test;
import test.Jamb;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JambTest {
    @Test
    public void testThatCopiesBetweenOneAndFour(){
        int copies = Jamb.numberOfCopies(3, 2000);
        assertEquals(6000, copies);
    }
    @Test
    public void testThatCopiesBetweenFiveAndNine() {
        int copies = Jamb.numberOfCopies(8, 1800);
        assertEquals(14400, copies);
    }
    @Test
    public void testThatCopiesBetweenTenAndTwentyNine() {
        int copies = Jamb.numberOfCopies(28, 1600);
        assertEquals(44800, copies);
    }
    @Test
    public void testThatCopiesBetweenThirtyAndFortyNine() {
        int copies = Jamb.numberOfCopies(48, 1500);
        assertEquals(72000, copies);
    }
    @Test
    public void testThatCopiesBetweenFiftyAndNinetyNine() {
        int copies = Jamb.numberOfCopies(88, 1300);
        assertEquals(114400, copies);
    }
    @Test
    public void testThatCopiesBetweenOneHundredAndOneHundredAndNinetyNine() {
        int copies = Jamb.numberOfCopies(180, 1200);
        assertEquals(216000, copies);
    }
    @Test
    public void testThatCopiesBetweenTwoHundredAndFourHundredAndNinetyNine() {
        int copies = Jamb.numberOfCopies(450, 1100);
        assertEquals(495000, copies);
    }
    @Test
    public void testThatCopiesBetweenFiveHundredAndAbove() {
        int copies = Jamb.numberOfCopies(600, 1000);
        assertEquals(600000, copies);
    }
}
