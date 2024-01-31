package classWork;

import java.util.ArrayList;
import java.util.List;

import static ClassTask.HighestCommonFactor.convertToArray;

public class HighestCommonDivisor {
    public static int[] highestCommonDivisorInArray(int[] array){
        ArrayList<Integer> highestCommonDivisor = new ArrayList<Integer>();
        int index = 0;
        for (int counter = 0; counter < array.length; counter++) {

            for (int count = 0; count < array.length; count++) {
                if (array[count] % 2 == 0) {
                    index++;
                }
            }
            if (index == array.length){
                highestCommonDivisor.add(array[counter]);
            }
            else {
                counter++;
            }
            index = 0;
        }
        return convertToArray(highestCommonDivisor);
    }
}
