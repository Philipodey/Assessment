package practise;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any amount of number and enter -1 to stop the count: ");
        int number = scanner.nextInt();
        int count = 1;
        int largest = number;
        for(count = 1; number != -1; count++){
            System.out.println("Enter any amount of number and enter -1 to stop the count: ");
            number = scanner.nextInt();
            if(number > largest && number != -1){
                largest = number;

            }
        }
        System.out.printf("The largest number is %d", largest);
    }
}
