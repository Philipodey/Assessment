package chibuzoAssignment;

import java.util.Scanner;

public class PositiveNegativeAndZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any amount of number and input 10000001 to stop the count: ");
        int number = scanner.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int count = 1; number != 10000001; count++) {
            System.out.println("Enter any amount of number and input 10000001 to stop the count: ");
             number = scanner.nextInt();

             if(number > 0) {
                 positive++;
             }
             if(number < 0){
                 negative++;
             }
             if(number == 0){
                 zero++;
             }


        }
        System.out.printf("The positive number are %d", positive);
        System.out.println("\nThe negative number are "+negative);
        System.out.println("The zero numbers are "+zero);
    }
}