
import ClassTask.PalindromeAnagram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeAnagramTest {
    @Test
    public void testIsPalindrome(){
        String word = "lol";
        boolean expected = PalindromeAnagram.isPalindrome(word);
        assertTrue(expected);

    }
    @Test
    public void testIsAnagram(){
        String word = "live";
        String secondWord = "evis";
        boolean expected = PalindromeAnagram.isAnagram(word,secondWord);
        assertTrue(expected);


    }
}
