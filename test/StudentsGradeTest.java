import org.junit.jupiter.api.Test;
import Main.StudentGradeApp;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StudentsGradeTest {
    @Test
    public void testNumberOfRowsAndColumn(){
        int numberOfStudent = 3;
        int numberOfSubjects = 3;
        int [][] result = {{0, 0, 0},{0, 0, 0},{0, 0, 0}};
        int[][] expected = StudentGradeApp.numberOfRowsAndColumns(3,3);
        assertArrayEquals(expected, result);
    }
    @Test
    public void testElementInTheArray(){
        int[][] array = StudentGradeApp.numberOfRowsAndColumns(2,2);


    }
}