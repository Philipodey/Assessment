package classWork;

import static classWork.RemoveDuplicate.addNonZeroValuesToList;
import static classWork.RemoveDuplicate.countDuplicatesTurnedToZero;

public class LowestDuplicate {
    public static int lowestDuplicateNumber(int[] firstInput, int[] secondInput){
        int[] mergeArray = mergeArray(firstInput, secondInput);
        int[] duplicatedElements = removeDuplicate(mergeArray);
        int duplicateCount = countDuplicatesTurnedToZero(duplicatedElements);
        int[] duplicateValues = addNonZeroValuesToList(duplicateCount, duplicatedElements);
        return minimum(duplicateValues);
    }

    public static int minimum(int[] numbers) {
        int min =  numbers[0];
        for (int index = 0; index < numbers.length; index++) {
            if (min > numbers[index]) min = numbers[index];
        }
        return min;
    }

    public static int[] removeDuplicate(int[] mergeArray) {
        int[] duplicate = new int[mergeArray.length];
        int count = 0;
        for (int index = 0; index < mergeArray.length; index++) {
            for (int index2 = index+1; index2 < mergeArray.length; index2++) {
                if (mergeArray[index] == mergeArray[index2]){
                    duplicate[count++] = mergeArray[index2];
                }
            }

        }

        return duplicate;
    }

    public static int[] mergeArray(int[] firstInput, int[] secondInput) {
        int[] mergeArray = new int[firstInput.length + secondInput.length];
        int count = 0;
        int counter = 0;
        for (int firstArrayIndex = 0; firstArrayIndex < firstInput.length; firstArrayIndex++) {
            if(count == mergeArray.length) break;
            mergeArray[count++] = firstInput[firstArrayIndex];
            int secondArrayIndex;
            if (counter != secondInput.length) {
                for (secondArrayIndex = 0; secondArrayIndex < secondInput.length; secondArrayIndex++) {
                    if (count <= secondInput.length) {
                        mergeArray[count++] = secondInput[secondArrayIndex];
                        counter++;
                    }
                }
            }

        }

        return mergeArray;
    }
}
