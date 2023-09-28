package task;

import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int even = 0;
        double average = 0;
        int count;
        for (count = 1; count < 11; count++) {
            if (count % 2 == 0) {
                even = even + count;
            }
        }
        average = (double)even / count;
        System.out.println(count);
        System.out.print(average);
        System.out.printf("\nThe sum of the even number is %d", even);

    }
}