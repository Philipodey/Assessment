package chapterFour.main;

import java.util.Scanner;

public class RightAngledTriangle {
    public void rightAngledTriangle(int length){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of base: ");

        for (int counter = 1; counter < length; counter++) {
            for (int index = 0; index <= counter-1; index++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
