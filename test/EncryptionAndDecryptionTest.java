import chapterFour.main.EncryptionAndDecryption;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptionAndDecryptionTest {
    @Test
    public  void testDataEncryption(){
         String fourDigitNumber = "5697";
         String result = "6423";
         String expected = EncryptionAndDecryption.encryption(fourDigitNumber);
         assertEquals(result, expected);
    }
    @Test
    public void testDataDecryption(){
        String fourDigitNumber = "6423";
        String result = "5697";
        String expected = EncryptionAndDecryption.decryption(fourDigitNumber);
        assertEquals(result, expected);
    }
}
