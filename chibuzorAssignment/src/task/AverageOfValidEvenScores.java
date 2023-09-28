package task;

import java.util.Scanner;

public class AverageOfValidEvenScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        double average = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter score: ");
            int scores = scanner.nextInt();
            if (scores % 2 == 0) {
                even += count;
            }
                average = (double)even / count;
        }
        System.out.printf("The sum of the even scores is %d", even);
        System.out.printf("The average of the even scores is %.2f", average);
    }
}