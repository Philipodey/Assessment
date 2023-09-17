package femiAssignment;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int greater = number;

        int count = 1;

            System.out.println("Enter a number: ");
            number = scanner.nextInt();
            if (greater < number) {
                System.out.println(-1);
            } else if (number == greater) {
                System.out.println(0);
            } else{
                System.out.println(1);

            }
        }
    }

