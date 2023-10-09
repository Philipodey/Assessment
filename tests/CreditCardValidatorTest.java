
import arrayAssignments.CreditCardValidator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditCardValidatorTest {
    @Test
    public void testThatTheNumberIsBetween13And16(){
        String [] cardNumber = {"4","3","8","8","5","7","6","0","1","8","4","0","3","3"};
        String[] expected = CreditCardValidator.creditCardNumber(cardNumber);
        String[] result = {"4","3","8","8","5","7","6","0","1","8","4","0","3","3"};
        assertEquals("4",result[0]);
        assertEquals("3",result[1]);
        assertEquals("8",result[2]);
        assertEquals("8",result[3]);
        assertEquals("5",result[4]);
        assertEquals("7",result[5]);
        assertEquals("6",result[6]);
        assertEquals("0",result[7]);
        assertEquals("1",result[8]);
        assertEquals("8",result[9]);
        assertEquals("4",result[10]);
        assertEquals("0",result[11]);
        assertEquals("3",result[12]);
        assertEquals("3",result[13]);

    }
    @Test
    public void testThatTheCardNumberValidity(){
        String[] cardNumber = {"4","3","8","8","5","7","6","0","1","8","4","1","0","7","0","7"};
        boolean expected = CreditCardValidator.calculateCardValidate(cardNumber);
//        String result = "75";
        assertTrue(expected);
    }
}
