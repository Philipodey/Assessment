package chapterFour.main;

import java.util.Scanner;

public class SumUntilSpecifiedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (sum < firstNumber){
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            sum += number;
        }
        System.out.printf("The number is %d and the sum is %d", firstNumber,sum);
    }
}