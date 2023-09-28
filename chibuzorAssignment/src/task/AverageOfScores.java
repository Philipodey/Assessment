package task;

import java.util.Scanner;

public class AverageOfScores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter the score: ");
            int scores = sc.nextInt();
            sum += scores;
            average = (double) sum / count;
//            System.out.printf("The sum of the scores is %d", sum);
            System.out.printf("\nThe average of the scores is %.2f", average);
        }
    }

}
