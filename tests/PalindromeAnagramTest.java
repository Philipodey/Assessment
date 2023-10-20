import org.junit.Test;
import ClassTask.PalindromeAnagram;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeAnagramTest {
    @Test
    public void testIsPalindrome(){
        String word = "aba";
        String secondWord = "aba";
        boolean expected = PalindromeAnagram.isAnagram(word, secondWord);
        assertTrue(expected);

    }
    @Test
    public void testIsAnagram(){
        String word = "aba";
    }
}
