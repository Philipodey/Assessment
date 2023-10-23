import classWork.DataExtraction;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataExtractionTest {
    @Test
     public void canExtractDataFromDataSetByRow(){
        DataExtraction dataExtraction = new DataExtraction();
        int [][] dataSet = {
                {40,23,85,62},
                {24,60,99,37},
                {44,20,12,45},
                {14,64,35,90}
        };
        int row = 2;
        int startPosition = 2;
        int endPosition = 4;
//        when
        int[] result = dataExtraction.extractByRow(dataSet,row, startPosition, endPosition);

//        Assert
        assertEquals(60, result[0]);
        assertEquals(99, result[1]);
        assertEquals(37, result[2]);

        assertEquals(3,result.length);
    }
    @Test
    public void canExtractByColumn(){
        DataExtraction dataExtraction = new DataExtraction();
        int [][] dataSet ={
                {40,23,85,62},
                {24,60,99,37},
                {44,20,12,45},
                {14,64,35,90}
        };
        int row = 2;
        int startPosition = 2;
        int endPosition = 4;
        int column = 3;
        int[] result = dataExtraction.extractByColumn(dataSet,column, startPosition, endPosition);
        int [] expected = {37, 45, 90};
        assertArrayEquals(result, expected);
    }
}
