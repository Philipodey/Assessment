
import arrayAssignments.CreditCardValidator;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditCardValidatorTest {
    @Test
    public void testThatTheNumberIsBetween13And16(){
        String cardNumber = "3788576018403354334554433";
        String expected = CreditCardValidator.creditCardNumber(cardNumber);
        String result = "American Express Card";
        assertEquals(expected, result);
    }
    @Test
    public void testThatTheCardNumberValidity(){
        String cardNumber = "4388576018402626";
        String expected = CreditCardValidator.calculateCardValidate(cardNumber);
        String result = "Invalid";
        assertEquals(expected,result);
    }
}
