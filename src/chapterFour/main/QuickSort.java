package chapterFour.main;

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = check.nextInt();
         System.out.println("Enter second number: ");
        int secondNumber = check.nextInt();
         System.out.println("Enter third number: ");
        int thirdNumber = check.nextInt();

        if (secondNumber >= firstNumber && secondNumber <= thirdNumber){
            System.out.printf("%d %d %d", firstNumber, secondNumber, thirdNumber);
        } else if(secondNumber <= firstNumber && secondNumber >= thirdNumber){
            System.out.printf("%d %d %d", thirdNumber, secondNumber, firstNumber);
        } else if(thirdNumber >= firstNumber && secondNumber <= firstNumber){
            System.out.printf("%d %d %d", secondNumber, firstNumber, thirdNumber);
        } else if(thirdNumber <= secondNumber && firstNumber <= thirdNumber) {
            System.out.printf("%d %d %d", firstNumber, thirdNumber, secondNumber);
        } else {
            System.out.printf("%d %d %d", thirdNumber, firstNumber, secondNumber);
        }

    }
}
