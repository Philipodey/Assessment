package ClassTask;

import java.util.ArrayList;

import static ClassTask.HighestCommonFactor.convertToArray;

public class ArrayTask {
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static int[] returnDuplicateInAnArray(int[] number) {
        ArrayList<Integer> elements = new ArrayList<>();
        for (int index = 0; index < number.length; index++) {
            for (int count = index + 1; count < number.length; count++) {
                if (number[index] == number[count]) {
                    elements.add(number[index]);
                }
            }

        }
        int[] turnDuplicateToZero = changeDuplicateToZero(convertToArray(elements));
        int numberOfZero = countNumberOfZero(turnDuplicateToZero);
        return arrangeNonDuplicateValueInAnArray(numberOfZero,turnDuplicateToZero);
    }

    public static int[] arrangeNonDuplicateValueInAnArray(int countOfZero, int[] numbers) {
        int[] nonZeroValues = new int [countOfZero];
        int counter = 0;
        for (int count = 0; count < numbers.length; count++) {
           if (numbers[count] != 0){
               nonZeroValues[counter] = numbers[count];
               counter++;
           }
        }
        return nonZeroValues;
    }

    public static boolean palindrome(String word) {
        word = word.toLowerCase();
        int forward = 0;
        int backward = word.length() - 1;
        while (forward < backward) {
            if (word.charAt(forward) != word.charAt(backward)) {
                return false;
            }
            forward++;
            backward--;
        }
        return true;
    }
    public static int[] changeDuplicateToZero(int[] numbers){
        for (int count = 0; count < numbers.length; count++) {
            for (int i = count + 1; i < numbers.length; i++) {
                if (numbers[count] == numbers[i]){
                    numbers[i] = 0;
                }
            }
        }
        return numbers;
    }
    public static int countNumberOfZero(int[] numbers){
        int counter = 0;
        for (int number : numbers) {
            if (number != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] dominantElement(int[] numbers) {
        ArrayList<Integer> newNumbers = new ArrayList<>();
        int[] duplicate = new int[numbers.length];
        for (int count = 0; count < numbers.length; count++) {
            for (int index = count + 1; index < numbers.length; index++) {
                if (numbers[count] > numbers[index]) break;
                if (index == numbers.length-1) duplicate[count] = numbers[count];

                count++;
            }
        }
        return duplicate;
    }
//    private static int countNumberOfZero(int[] numbers){
//        int count = 0;
//        for (int number:numbers) if (number != 0) count++;
//
//        int result =
//    }


//    public static boolean numberIsAPalindrome(int number) {
//        int count = 0;

//        int newNumber = Integer.parseInt(number);
//        int digit;
//        int turnDigit = 0;
//        while(newNumber != 0){
//           digit = newNumber % 10;
//           turnDigit += digit * 10;
//           newNumber /= 10;
//        }
//        if (newNumber != turnDigit){
//            System.out.println("It is not a palindrome");
//            return false;
//        }
//        System.out.println("It is a palindrome");
//        return true;
//    }


//    }
}

