package ClassTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HighestCommonFactor {
    public static void main(String[] args) {
       int[] number = primeNumber(50);
    }
    public static int[] highestCommonFactor(int[] numbers){
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
    public static int[] primeNumber(int number){
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
        return  convertString(primes);

    }
    public static int[] convertString(StringBuilder primes){
        int[] values = new int[primes.length()];
        for(int count = 0; count < primes.length(); count++) {
            char newValues = primes.charAt(count);
            values[count] = newValues;
        }
        return  values;
    }
    public static int[] calculateLcmOf(int number){
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
        return convertToArray(results);
    }

    private static int[] convertToArray(ArrayList<Integer> results) {
        int[] result = new int[results.size()];
        for (int count = 0; count < results.size(); count++) {
            result[count] = results.get(count);
        }
        return result;
    }


}


