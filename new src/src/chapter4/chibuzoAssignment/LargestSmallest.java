package chibuzoAssignment;

import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number and enter -5 to stop the count: ");
        int number = scanner.nextInt();
         int largest = number;
         int smallest = number;
         int count = 1;
         int stopper = -5;
        for (count = 1; number != -5 ; count++) {
            System.out.println("Enter number any number and enter -5 to stop the count: ");
            number = scanner.nextInt();
            if(number > largest && number != -5){
                largest = number;
            }
            if(number < smallest && number != -5){
                smallest = number;
            }
        }
        System.out.println("The largest number is "+largest);
        System.out.println("The smallest number is "+smallest);

    }
}
