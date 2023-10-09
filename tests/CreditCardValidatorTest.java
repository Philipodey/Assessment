
import arrayAssignments.CreditCardValidator;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditCardValidatorTest {
    @Test
    public void testThatTheNumberIsBetween13And16(){
        String [] cardNumber = {"4","3","8","8","5","7","6","0","1","8","4","0","3","3"};
        String expected = CreditCardValidator.creditCardNumber(cardNumber);
        String result = "The card is a Visa card";
        assertEquals(expected, result);
    }
    @Test
    public void testThatTheCardNumberValidity(){
        String[] cardNumber = {"4","3","8","8","5","7","6","0","1","8","4","0","2","6","2","6"};
        String expected = CreditCardValidator.calculateCardValidate(cardNumber);
        String result = "valid";
        assertEquals(expected,result);
    }
}
