package ClassTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ClassTask.ArrayTask.*;

public class HighestCommonFactor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(highestCommonFactor(9, 27)));
    }
    public static int[] highestCommonFactors(int[] numbers){
//        int factorSave = []
        int[] newNumber = new int [numbers.length];
          int lowest = numbers[0];
        for (int count = 0; count < numbers.length; count++) {
                if(count % numbers[count] == 0){
                    newNumber = new int[]{count};
                    System.out.println(Arrays.toString(newNumber));
                }
        }
        return newNumber;
    }
    public static int[] palindromes(int number){
        StringBuilder primes = new StringBuilder();
        int counter = 2;
        while (number != 1) {
            if (number % counter == 0) {
                number /= counter;
                primes.append(counter);
                counter = 2;
            }
            else
            counter++;
        }
        return  convertStringToArray(primes);

    }
    public static int[] convertStringToArray(StringBuilder primes){
        int[] values = new int[primes.length()];
        for(int count = 0; count < primes.length(); count++) {
            values[count] = primes.charAt(count);
        }
        return  values;
    }
    public static int calculateLcmOf(int number){
        ArrayList<Integer> results = new ArrayList<>();
        int divisor = 2;
        while(number > 1){
            if(number % divisor == 0){
                results.add(divisor);
                number = number / divisor;
                divisor = 2;
            }
            else{
                divisor++;
            }
        }
         int[] multiples = convertToArray(results);
        return largestOf(multiples);
    }

    static int[] convertToArray(ArrayList<Integer> results) {
        int[] result = new int[results.size()];
        for (int count = 0; count < results.size(); count++) {
            result[count] = results.get(count);
        }
        return result;
    }
    public static int[] highestCommonFactor(int... numbers){
        ArrayList<Integer> highestCommonFactor = new ArrayList<>();
        int counter = 0;
        int max = largestOf(numbers);
        for (int count = 2; count < max;) {
            for (int number: numbers) {
                if (number % count == 0) {
                    counter++;
                }
            }
                if (counter == numbers.length) {
                    highestCommonFactor.add(count);
                    counter = 0;
                    divideNumberBaseOnCount(numbers, count);
                }else {
                    count++;
                    counter = 0;
                }
        }
        return convertToArray(highestCommonFactor);
    }

    private static void divideNumberBaseOnCount(int[] numbers, int count) {
        for (int number = 0; number < numbers.length; number++){
            numbers[number] /= count;
        }
    }


    public static int largestOf(int[] array){
        int max = array[0];
        for (int count = 0; count < array.length; count++) {
            if (array[count] > max){
                max = array[count];
            }
        }
        return max;
    }


}


