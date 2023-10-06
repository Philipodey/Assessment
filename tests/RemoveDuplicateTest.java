import classWork.RemoveDuplicate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicateTest {
    @Test
    void canRemoveDuplicates(){
//        Given
        int[] numbers = {4,9,4,4,7,9,1,7};
//        When
        int[] uniqueValues = RemoveDuplicate.turnDuplicateToZero(numbers);
//        Assert
        int[] result = {4,9,7,1};
        assertEquals(result,numbers);
    }
}
