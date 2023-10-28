package chapterFive;

import java.util.Scanner;

public class PrintStar {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the number of stat: ");
        int starNumbers = check.nextInt();
        for (int count = 0; count < starNumbers; count++) {
            for (int firstSpace = 0; firstSpace < count; firstSpace++) {
                System.out.print(" ");
            }
            for (int secondSpace = starNumbers - count; secondSpace > 0 ; secondSpace--) {
                System.out.print(" ");
            }
            for (int thirdSpace = starNumbers - count; thirdSpace > 0 ; thirdSpace--) {
                System.out.print(" ");
            }
            for (int firstStar = 0; firstStar < count; firstStar++) {
                System.out.print("*");
            }
            for (int secondStar = 0; secondStar < count; secondStar++) {
                System.out.print("*");
            }
//            for (int i = 0; i < ; i++) {
//
//            }

            System.out.println();
        }
    }
}
