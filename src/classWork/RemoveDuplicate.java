package classWork;

import static classWork.NotDuplicatedValue.addNumberThatAreNotZero;

public class   RemoveDuplicate {
    public static int[] turnDuplicateToZero(int[] numbers){
        for (int count = 0; count < numbers.length; count++) {
            for (int i = 0; i < numbers.length; i ++) {
                if(numbers[count] == numbers[i]){
                    numbers[i] = 0;
                }
            }
        }
        int duplicateTurnedToZero = countDuplicatesTurnedToZero(numbers);
        return addNonZeroValuesToList(duplicateTurnedToZero, numbers);
    }
    public static int countDuplicatesTurnedToZero(int[] numbers){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0){
                counter++;
            }
        }
        return counter;
    }
    public static int[] addNonZeroValuesToList( int length, int[] numbers){
        int[] newList =  new int[length];
        int counter = 0;
        for (int count = 0; count < numbers.length; count++) {
            if(numbers[count] != 0){
               newList[counter] = numbers[count];
               counter++;
            }
        }
        return newList;
    }




}
