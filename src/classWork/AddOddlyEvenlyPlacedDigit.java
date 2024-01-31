package classWork;

public class AddOddlyEvenlyPlacedDigit {
    public static int[] addOddlyEvenlyPlacedDigit(int[] number){
        String addedNumber = "";
        int[] numberAdded = new int[number.length / 2];
        int index = 0;
        if (number.length % 2 == 0) {

            for (int count = 0; count < number.length; count += 2) {
                numberAdded[index] += number[count];
                numberAdded[index++] += number[count+1];
            }
        }
        else {
            numberAdded = new int[number.length /2 + 1];
            for (int count = 0; count < number.length; count+=2) {
                if (count == number.length -1){
                    numberAdded[index--] = number[count];
                }
                else {
                    numberAdded[index] += number[count];
                    numberAdded[index++] += number[count+1];
                }
            }
        }
        return numberAdded;
    }

    public static String convertArrayToString(int[] array){
        String number = "";
        for (int count = 0; count < array.length; count++) {
            number += array[count];
        }
        return number;
    }

}
