package task;

import java.util.Scanner;

public class SumOfTenValidEvenScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even = 0;
        for (int count  = 1; count  <= 10 ; count ++) {
            System.out.println("Enter score: ");
            int scores = scanner.nextInt();
            if(scores % 2 == 0){
                even += count;
            }
        }
        System.out.printf("The sum of the even number is %d", even);
    }
}
