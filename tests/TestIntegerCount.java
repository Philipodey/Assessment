import org.junit.Test;
import classWork.IntegerCountFromArrayOfStrings;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntegerCount {
    @Test
    public void testCountDigitsInString(){
        String[]array = {"ABC21F","103CPZ","A1L"};
        int result = 6;
        int expected = IntegerCountFromArrayOfStrings.countNumbers(array);
        assertEquals(expected,result);
    }
}
