import chapterSix.ParkingCharges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestParkingCharges {
    @Test
    public void testParkingCharges(){
        int parkingHours = 24;
        double result = 10.00;
        double expected = ParkingCharges.calculateCharges(parkingHours);
        assertEquals(result, expected);
    }
}
