package task;

import java.util.Scanner;

public class CollectValidScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfValidScore = 0;
        for (int count = 1; count <= 10; count++) {
            System.out.println("Enter score: ");
            int score = scanner.nextInt();
            if(score > 0 && score <= 100){
                sumOfValidScore += score;
            }
            else{
                sumOfValidScore += 0;
            }
        }
        System.out.printf("The sum of the valid score is %d", sumOfValidScore);
    }
}
