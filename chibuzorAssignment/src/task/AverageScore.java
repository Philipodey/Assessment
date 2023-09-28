package task;

import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter the score: ");
            int scores = keyboardInput.nextInt();
            sum += scores;
            average = (double)sum / count;
        }
//        System.out.printf("The sum of the scores is %d", sum);
        System.out.printf("The average of the scores is %.2f", average);
    }
}
