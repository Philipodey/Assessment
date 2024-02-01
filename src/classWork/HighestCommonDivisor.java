package classWork;

import java.util.ArrayList;
import java.util.List;

import static ClassTask.HighestCommonFactor.convertToArray;

public class HighestCommonDivisor {
    public static int[] highestCommonDivisorInArray(int[] array){
        ArrayList<Integer> highestCommonDivisor = new ArrayList<Integer>();
        int index = 0;
        int maximum = maximumOf(array);
        for (int counter = 2; counter < maximum; ) {

            for (int count = 0; count < array.length; count++) {
                if (array[count] % counter == 0) {
                    index++;
                }
            }
            if (index == array.length){
                highestCommonDivisor.add(counter);
                index = 0;
                numberDivisibleByAll(array, counter);
            }
            else {
                counter++;
                index=0;
            }

        }
        return convertToArray(highestCommonDivisor);
    }

    private static void numberDivisibleByAll(int[] array, int counter) {
        for (int count = 0; count < array.length; count++) {
            array[count] /= counter;
        }
    }

    private static int maximumOf(int[] array) {
        int largest = array[0];
        for (int count = 0; count < array.length; count++) {
            if (count > largest) largest = count;
        }
        return largest;
    }
}
