package chibuzoAssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int number = scanner.nextInt();
        int factorial = 1;
        for (int count = 1; count <= number; count++) {
            factorial = factorial* count;
        }
        System.out.printf("The factorial of %d is %d ", number ,factorial);
    }
}
