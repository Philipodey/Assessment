package task;

import java.util.Scanner;

public class AverageSumMinimumMaximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        int minimum = 0;
        int maximum = 0;
        for (int count = 1; count <= 3; count++) {
            System.out.println("Enter score: ");
            int score = input.nextInt();
            sum += score;
            average = sum / count;
            if (score > maximum) {
                maximum = score;
            }
            else{
                minimum = score;
            }
        }
        System.out.println("The sum of the score is "+ sum);
        System.out.println("The average of the score is "+average);
        System.out.println("The maximum of the number is "+maximum);
        System.out.println("The minimum of the number is "+minimum);
    }
}
