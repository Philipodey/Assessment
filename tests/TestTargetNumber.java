import classWork.FunctionThatTakesANumberAndTwoIndices;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestTargetNumber {
    @Test
    public void testTargetNumber(){
        String number = "12345";
        int index1 = 2;
        int index2 = 3;
        int target = 4;
        boolean result = FunctionThatTakesANumberAndTwoIndices.number(number, (char) index1, (char) index2,target);
        assertTrue(result);
    }
}
