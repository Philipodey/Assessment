package chapterFour.main;

import java.util.Scanner;

public class AnotherDanglingElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        System.out.println("Enter y: ");
        int y = sc.nextInt();
        if (x < 10) {
            if (y > 10) {
                System.out.println("*****");
            }
        }
        else {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}

