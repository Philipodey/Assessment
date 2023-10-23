package chapterFive;

import java.util.Scanner;

public class PrintDiamond {
    private static int row;

    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the number of stars: ");
        int stars = check.nextInt();
        for (int count = 0; count < stars; count++) {
            for (int firstSpace = stars-count; firstSpace > 0; firstSpace--) {
                System.out.print(" ");
            }
            for (int firstTriangle = 0; firstTriangle < count; firstTriangle++) {
                System.out.print("*");
            }
            for (int secondTriangle = 0; secondTriangle <= count; secondTriangle++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 0; row < stars; row++) {
            for (int secondFirstSpace = 0; secondFirstSpace <= row; secondFirstSpace++) {
                System.out.print(" ");
            }
            for (int secondFirstTriangle = stars - row; secondFirstTriangle > 0; secondFirstTriangle--) {
                System.out.print("*");
            }
            for (int secondSecondTriangle = stars - row; secondSecondTriangle > 0; secondSecondTriangle--) {
                System.out.print("*");
            }
            for (int secondSpace = 0; secondSpace < row; secondSpace++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
