package chapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the range of number to input: ");
        int range = check.nextInt();
        int max = 0;
        int min = 0;
        for (int count = 0; count < range; count++) {
            System.out.println("Enter five numbers: ");
            int numbers = check.nextInt();
            if (numbers > max){
                max = numbers;
            }
            else{
                min = numbers;
            }

        }
        int extremeTotal = min + max;
        System.out.println("The sum of the two extreme is "+extremeTotal);
    }
}
