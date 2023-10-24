import Assignment.CaeserCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaeserCipherTest {
    @Test
    public void testEncryptingALetter(){
        String word = "In this life try make money";
        String position = "4";
        String result = "mr3xlmw3pmji3xv13qeoi3qsri1";
        String expected = CaeserCipher.encryptingData(word,position);
        assertEquals(result,expected);
    }
    @Test
    public void testDecryptingALetter(){
        String word = "mr3xlmw3pmji3xv13qeoi3qsri1";
        String position = "4";
        String result = "in this life try make money";
        String expected = CaeserCipher.decryptingData(word,position);
        assertEquals(result, expected);
    }
}
