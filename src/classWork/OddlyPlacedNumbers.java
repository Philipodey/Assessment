package classWork;

import ClassTask.MinMax;

import static ClassTask.MinMax.*;
//import static classWork.RemoveDuplicate.addNonZeroValuesToList;
import static classWork.RemoveDuplicate.countDuplicatesTurnedToZero;

public class OddlyPlacedNumbers {

    public static int[] oddPosition(int [] number){
        int [] oddHolder = new int[(number.length)/2];
        int counter = 0;

        if (number.length % 2 == 0) {
            for (int count = 1; count < number.length; count += 2) {
                oddHolder[counter] = number[count];
                counter++;
            }
        }
        else{
            for (int count = 1; count < number.length; count+= 2) {
                oddHolder[counter]= number[count+1];
                counter++;
            }
        }
        return oddHolder;
    }
    public static int[] shuffledElement(int[] elements) {
        int[] newArray = new int[elements.length];

        for (int count = 0; count < elements.length; ) {
            int counter;
            for (counter = count+1; counter < elements.length; counter++) {
                if (elements[count] > elements[counter]) break;
            }
            if (counter == elements.length){
                newArray[count] = elements[count];
                count++;
            }
            else{
                int hold = elements[counter];
                elements[counter] = elements[count];
                elements[count] = hold;
            }
        }
        return newArray;

    }

    public static int[] multiplyShuffledElement(int[] numbers){
        int[] multipliedElement = shuffledElement(numbers);
        for (int count = 0; count < multipliedElement.length; count++) {
            multipliedElement[count] *= multipliedElement[count];
        }
        return multipliedElement;
    }

    public static char[]  VOWELS = {'a','e','i','o','u','A','E','I','O','U'};
    public static Integer constant(char word,int index){
        for (int count = 0; count < VOWELS.length; count++) {
            if (word == VOWELS[count]){
                return index;
            }
        }
        return null;
    }

    public static String noVowelWords(String letter){
        String word = "";
        for (int count = 0; count < letter.length(); count++) {
            if (constant(letter.charAt(count), count) == null){
                word += letter.charAt(count);
            }
        }
        return word;
    }
    public static String numbersInAString(String word){
        String noSpaceNumber = "";
        for (int count = 0; count < word.length(); count++) {
            if (!(word.charAt(count) == ' ')){
                noSpaceNumber += word.charAt(count);
            }
        }
        return noSpaceNumber;
    }

    public static int[] largestSmallestNumberInAString(String word){
       String numbersInAString = numbersInAString(word);
       int[] numbers = new int[word.length()];
       int counter = 0;
           for (int count = 0; count < numbersInAString.length(); count++) {
               if (word.charAt(count) == '1' ||
                       numbersInAString.charAt(count) == '2' ||
                       numbersInAString.charAt(count) == '3' ||
                       numbersInAString.charAt(count) == '4' ||
                       numbersInAString.charAt(count) == '5' ||
                       numbersInAString.charAt(count) == '6' ||
                       numbersInAString.charAt(count) == '7' ||
                       numbersInAString.charAt(count) == '8' ||
                       numbersInAString.charAt(count) == '9' ||
                       numbersInAString.charAt(count) == '0') {
                   numbers[counter] = Integer.parseInt(String.valueOf(numbersInAString.charAt(count)));
                   counter++;

               }
//               return numbers;
           }
       return numbers;
    }
    public static int[] addNonZeroValuesToList( int length, int[] numbers){
        int[] newList =  new int[length];
        int counter = 0;
        for (int count = 0; count < numbers.length; count++) {
                newList[counter] = numbers[count];
                counter++;
        }
        return newList;
    }
    public static int[] minMaxNumbers(String word){

        int[] numbers = largestSmallestNumberInAString(word);
        int zeros = countDuplicatesTurnedToZero(numbers);
        int[] nonZeroValues = addNonZeroValuesToList(zeros,numbers);
//        int[] minMax = new int[2];
        int min = min(numbers);
        int max = max(numbers);
        return new int[]{min, max};


    }
}
