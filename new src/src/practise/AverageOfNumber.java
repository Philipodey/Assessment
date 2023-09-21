package practise;

import java.util.Scanner;

public class AverageOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        int total = 0;
        int average = 0;
        for (count = 1; count <= 10; count++) {
            System.out.println("Enter score:");
            int score = input.nextInt();
            total = total + score;
            if (count == 10) {
                average = total / 10;
            }
        }
        System.out.println("The total score is "+total);
        System.out.println("The average of the score is "+average);
    }
}