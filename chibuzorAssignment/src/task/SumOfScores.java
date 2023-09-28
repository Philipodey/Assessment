package task;

import java.util.Scanner;

public class SumOfScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for (int count = 1; count <= 10; count++) {
//            System.out.println("Enter the score: ");
//            int scores = input.nextInt();
            sum += count;
        }
        System.out.printf("The sum of the scores is %d", sum);
    }
}
