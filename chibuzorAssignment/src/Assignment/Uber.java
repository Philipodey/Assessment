package Assignment;

import java.util.Scanner;

public class Uber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of score to collect: ");
        int size = scanner.nextInt();
        int [] array = new int[size];
        int max = array[0];
        int score = array[0];

        for (int count = 1; count <= size; count++) {
            System.out.println("Enter the score: ");
            array[score] = scanner.nextInt();
            if (array[score] > max) max = array[score];

        }
        System.out.printf("The largest of the number is %d",max);

    }
}
