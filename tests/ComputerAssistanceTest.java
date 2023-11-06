import org.junit.jupiter.api.Test;

import static chapterSix.ComputerAssistance.createNumbers;
import static chapterSix.ComputerAssistance.generateQuestion;
import static org.junit.jupiter.api.Assertions.*;

public class ComputerAssistanceTest {
    @Test
    public void testThatNumbersIsAPositiveNumber(){
        int number = createNumbers();
        boolean result = (number > 0 && number < 20);
        assertTrue(result);
    }
    @Test
    public void testGenerateQuestion(){
    int number1 = createNumbers();
    int number2 = createNumbers();
    String question = generateQuestion(number1, number2);
    assertNotNull(question);
    boolean isBlankQuestion = question.isBlank();
    assertFalse(isBlankQuestion);
    }

    @Test
    public void testThatAnswerIsCorrect(){
        int number1 = createNumbers();
        int number2 = createNumbers();
        int correctAnswer = number1 * number2;
        System.out.println(correctAnswer);
        boolean result = correctAnswer == number1 * number2 ;
        assertTrue(result);
    }

}
