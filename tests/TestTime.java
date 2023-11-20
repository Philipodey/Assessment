import chapterEight.Time;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestTime {
    @Test
    public void testCreateTime(){
        int hour = 22;
        int minutes = 45;
        int seconds = 55;
        Time casio = new Time(hour, minutes, seconds);
        int getHour = casio.getHour();
        int getMinutes = casio.getMinute();
        int getSeconds = casio.getSeconds();
//        assertEquals(casio);

    }
    @Test
    public void createTimeWithInvalidHourTest(){
        assertThrows(IllegalArgumentException.class, ()-> new Time(26, 67, 78));

    }
}
