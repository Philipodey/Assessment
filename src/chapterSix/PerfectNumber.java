package chapterSix;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = check.nextInt();
        boolean perfectNumber = isPerfect(number);
        System.out.println(perfectNumber);
    }
    public static boolean isPerfect(int number){
        int factors = 0;
//        int counter = 1;
        int count = 1;
        for (;count < number;) {
            if (number % count == 0){
                factors += count;
                System.out.printf("%d\t",count);
            }
//            else {
//                counter++;
//            }
            count++;

        }
        return factors == number;
    }
}
