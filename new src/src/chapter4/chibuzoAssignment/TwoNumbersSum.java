package chibuzoAssignment;

import java.util.Scanner;

public class TwoNumbersSum {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        int sum = 0;
        do{
            sum = secondNumber + firstNumber;
            System.out.println("The sum of the numbers is "+sum);
//            sum = sum + secondNumber;
            sum++;
        }while (sum <= 7);

    }
}
