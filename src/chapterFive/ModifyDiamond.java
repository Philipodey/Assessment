package chapterFive;

import java.util.Scanner;

public class ModifyDiamond {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the preferred number: ");
        int number = check.nextInt();

        for (int row = 0; row < number; row++) {
            if(row < 20 && row % 2 == 1) {
                for (int firstSpace = number - row; firstSpace >= 0; firstSpace--) {
                    System.out.print(" ");
                }
                for (int firstStar = 0; firstStar < row; firstStar++) {
                    System.out.print(row);
                }
                for (int secondStar = 0; secondStar <= row; secondStar++) {
                    System.out.print(row);
                }
                System.out.println();
            }
        }
        for (int anotherRow = 0; anotherRow < number; anotherRow++) {
            if(anotherRow < 20 && anotherRow % 2 == 1) {
                for (int firstSpac = 0; firstSpac <= anotherRow; firstSpac++) {
                    System.out.print(" ");
                }
                for (int firstStar = number - anotherRow; firstStar >= 0; firstStar--) {
                    System.out.print(anotherRow);
                }
                for (int secondStar = number - anotherRow; secondStar > 0; secondStar--) {
                    System.out.print(anotherRow);
                }
                System.out.println();
            }
        }
    }
}
