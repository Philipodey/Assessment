package chapterFour.main;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N\tN2\tN3\tN4\t");
        for (int count = 1; count <= 5; count+=1) {
            for (int i = 1; i <= 4; i++) {
                System.out.print(count+"\t");
            }
            System.out.print("\n");
        }
    }
}
