package chapterSix;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = check.nextInt();
        boolean leapYear = isLeapYear(year);
        System.out.println(leapYear);
    }
    public static boolean isLeapYear(int year){
        return year % 4 == 0;
    }
}
