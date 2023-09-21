package practise;

import java.util.Scanner;

public class AverageOfScore {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int total = 0;
        int score = 1;
        int average = 0;
        while(score <= 10){
            System.out.println("Enter grade: ");
            score = keyboardInput.nextInt();
            total = total + score;
            score ++;
            if(score == 10){
                average = total / 10;
            }
        }
        System.out.println("The total is "+total);
        System.out.println("The average is "+average);
    }
}
