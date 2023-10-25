import ClassTask.BeautifyingStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeautifyingStringsTest {
    @Test
    public void testThatFullStopCanBeAddedToAString(){
        String word = "Mechanic";
        String result = "Mechanic.";
        String expected = BeautifyingStrings.addFullStopToTheTheEndOfAWord(word);
        assertEquals(result, expected);
    }
    @Test
    public void testThatFullStopWillNotBeAddedIfAlreadyHas(){
        String word = "Mechanic.";
        String result = "Mechanic.";
        String expected = BeautifyingStrings.addFullStopToTheTheEndOfAWord(word);
        assertEquals(result, expected);
    }
    @Test
    public void testThatFirstCharacterCanBeCapitalized(){
        String word = "mechanic.";
        String result = "Mechanic.";
        String expected = BeautifyingStrings.capitalizeFirstLetterInAWord(word);
        assertEquals(result, expected);
    }
    @Test
    public void testBeautifyingStrings(){
        String word = "mechanic is a boy.";
        String result = "Mechanic is a boy.";
        String expected = BeautifyingStrings.capitalizeFirstLetterInAWord(word);
        assertEquals(result, expected);
    }

}
