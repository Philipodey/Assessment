import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static chapterSevenExercises.SwitchArrayIndex.switchArrayIndex;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SwitchArrayIndexTest {
    @Test
    public void switchArrayIndexTest(){
        int[][] numbers = {{23,45},{12,54}};
        int[][] result = {{23,12},{45,54}};
        System.out.println(Arrays.deepToString(switchArrayIndex(numbers)));
        assertArrayEquals(result, switchArrayIndex(numbers));

    }
}
