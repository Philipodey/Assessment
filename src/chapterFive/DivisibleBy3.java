package chapterFive;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        for (int i = 3; i <= 30; i += 3) {
            System.out.print(i+" ");
        }
    }
}
