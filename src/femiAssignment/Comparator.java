package femiAssignment;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        int number = input("Enter a number: ");
    }
    public static int input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        int number = scanner.nextInt();
        int greater = number;
        int equal = number;
        int count = 1;
        while (number != -1) {
            if (number > greater) {
                number = greater;
                System.out.println(1);
            } else if (number == equal) {
                System.out.println(0);
            }
            System.out.println(prompt);
            number = scanner.nextInt();
            if (number > greater) {
                number = greater;
                System.out.println(1);
            } else if (number < equal) {
                System.out.println(-1);
            }
            else {
                System.out.println(0);
            }
            count ++;
        }
        return count;
    }
}
