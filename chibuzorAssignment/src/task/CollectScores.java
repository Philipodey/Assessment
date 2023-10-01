package task;

import java.util.Scanner;

public class CollectScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of scores to collect: ");
        int size = scanner.nextInt();
        int [] student = new int[size];
        int score = student[0];
        int total = student[0];
        int average = student[0];
        int minimum = student[0];
        int maximum = student[0];

        for (int count = 0; count < student.length; count++) {
            System.out.println("Enter the score: ");
            student[score] = scanner.nextInt();
            total += student[score];
            average = total / student.length;
            if(student[score] > maximum){
                maximum = student[score];
            }else{
                minimum = student[score];
            }

        }
        System.out.println("The total of the score is "+total);
        System.out.println("The average of the score is "+average);
        System.out.println("The maximum of the score is "+maximum);
        System.out.println("The minimum of the score is "+minimum);

    }
}
