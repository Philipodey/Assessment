import org.junit.jupiter.api.Test;
import Assignment.DecimalToBinaryFunction;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecimalToBinaryTest {
    @Test
    public void testDecimalToBinary(){
        int number = 278;
        DecimalToBinaryFunction.decimalToBinary(number);
    }
    @Test
    public void testBinaryToDecimal(){
        int number = 100010110;
        int result = 278;
        int decimal = DecimalToBinaryFunction.binaryToDecimal(number);
        assertEquals(decimal, result);
    }
}
