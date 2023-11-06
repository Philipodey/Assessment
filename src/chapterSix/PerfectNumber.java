package chapterSix;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = check.nextInt();
        boolean perfectNumber = isPerfect(number);
        System.out.println(perfectNumber);
        for (int i = 1; i < 1000; i++) {
            if(isPerfect(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfect(int number) {
        int factors = 0;
//        int counter = 1;
        int count = 1;
        for (; count < number; ) {
            if (number % count == 0) {
                factors += count;
          }
            count++;

        }
        return factors == number;
    }
}
