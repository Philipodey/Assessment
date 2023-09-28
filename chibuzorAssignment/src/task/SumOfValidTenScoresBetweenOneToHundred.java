package task;

import java.util.Scanner;

public class SumOfValidTenScoresBetweenOneToHundred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumScores = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter score: ");
            int scores = scanner.nextInt();
            while(scores > 0 && scores <= 100) {
                count++;
                System.out.println("Enter score: ");
                scores = scanner.nextInt();
                sumScores += scores;
            }
            {
//                System.out.println("Enter scores: ");
//                scores = scanner.nextInt();
            }
        }
        System.out.printf("The sum of the scores is %d", sumScores);
    }
}