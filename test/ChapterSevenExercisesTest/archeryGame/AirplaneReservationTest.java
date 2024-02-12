package ChapterSevenExercisesTest.archeryGame;

import chapterSevenExercises.AirplaneReservation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirplaneReservationTest {
    @Test
    public void passengerCanChooseBetweenFirstClassAndEconomyTest(){
        AirplaneReservation reservation = new AirplaneReservation();

        reservation.assignSeatNumber(reservation.getAirplaneClass());
//        assertTrue(seatNumber >= 0 && seatNumber < 5);
    }
}
