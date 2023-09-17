package femiAssignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int continuous = nonNegativeNumber("Enter any number: ");
        double constantE = euler("\n\nEnter any number: ");
        double constantExponential = eulerExponential("\n\nEnter any number: ");

    }
    public static int nonNegativeNumber(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int number = scanner.nextInt();
        int count = 1;
        int factorial = 1;
        while (count <= number) {

            factorial = factorial * count;
            count ++;
        }
        System.out.printf("The factorial of non negative integer %d is %d", number, factorial);

        return factorial;
    }
    public static double euler(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int number = scanner.nextInt();
        int count = 1;
        int factorial = 1;
        double constant = 1;
        while (count <= number){
         constant = (constant) / (count);
         count ++;
        }
        System.out.printf("The euler constant of %d is %.10f",number, constant);

         return constant;
    }
    public static double eulerExponential(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int number = scanner.nextInt();
        int count = 1;
        int factorial = 1;
        double constantExponential = 1;
        while (count <= number){
            constantExponential = constantExponential * number * count / (count);
            count ++;
        }
        System.out.printf("The euler constant exponential of %d is %.10f",number, constantExponential);

        return constantExponential;
    }



}
