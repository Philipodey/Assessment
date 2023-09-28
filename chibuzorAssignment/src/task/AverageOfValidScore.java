package task;

import java.util.Scanner;

public class AverageOfValidScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double average = 0;
        int count = 1 ;
        while (count <= 10) {
            System.out.println("Enter score: ");
            int score = input.nextInt();

            if(score > 0 && score <= 100){
                count ++;
                sum += score;
                average = (double)sum / count;;
            }
            else{
                sum += 0;
            }
        }
        System.out.printf("The sum of valid score is %d", sum);
        System.out.printf("\nThe average of score is %.2f", average);

    }
}
