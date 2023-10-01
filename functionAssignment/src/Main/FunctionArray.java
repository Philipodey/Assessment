package Main;

import static java.util.Collections.addAll;

public class FunctionArray {

    public static int largest(int []number) {
        int largest = number[0];
        for (int count = 0; count < number.length; count++) {
            if (number[count] > largest) {
                largest = number[count];
            }
        }
           return largest;
    }
    public static int[] reverse(int [] number){
        int turnNumber = number.length-1;
        int [] reverse = new int [number.length];
        int num = 0;
        int count;
        for (count = turnNumber ; count >= 0; count--) {
            reverse[num] = number[count];
            num++;
        }
        return reverse;

    }
    public static  boolean elementExit(int [] number, int integer){
        boolean exit = true;
        for (int count = 0; count < number.length; count++){
            if(count == integer){
                return exit;
            }
        }

        return exit;
    }
    public static int[] elementOnOddPositions(int [] number){
        int oddPositionsElement = number[0];
        int count;
        int [] array = new int[number.length/2];
        int counter = 0;
        for (count = 1; count < number.length; count = count+2) {
            array[counter] =  number[count];
            counter++;
        }
        return array;

    }


    public static int[] elementOnEvenPosition(int[] number) {
        int evenPositionElement = number[0];
        int[] array;
        if(number.length % 2 == 1) {
            array = new int[number.length / 2 + 1];
        }else{
            array = new int [number.length / 2];
        }
        int counter = 0;
        for (int count = 0; count < number.length; count = count+2) {
                array[counter] = number[count];
                counter++;
            }
        return array;
    }
    public static int commutesTotalOfAllElement(int[] number){
        int total = 0;
        for (int count = 0; count < number.length; count++) {
            total +=number[count];
        }
        return total;
    }

    public static boolean stringIsPalindrome(String letter) {
        StringBuilder reverse = new StringBuilder();
        int length = letter.length()-1;
        for (int count = length; count >= 0 ; count--) {
            reverse.append(letter.charAt(count));
        }
        return letter.contentEquals(reverse);
    }
    public static String[] concatenateTwoList(String[] list, String [] secondList){
        int listTwo = secondList.length;
        String [] newList = new String[list.length+secondList.length];
        for (int count = 0; count < newList.length; count++) {
            for (int counter = 0; counter < list.length; counter++) {
                if (count == counter){
                    newList[count] = list[counter];
                }

            }
        }
        for (int count = 0; count < secondList.length ; count++) {
            newList[listTwo] = secondList[count];
            listTwo++;

        }
        return newList;
    }
    public static int sumOfNumberInAList(int [] number){
        int sum = 0;
        for (int count = 0; count < number.length; count++) {
            sum += number[count];
        }
        return sum;
    }
}

