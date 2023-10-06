package chapterFour.main;

import java.util.Scanner;

public class TabularOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N\tN2\tN3\tN4\t");
            for (int count = 1; count <= 4; count++) {
                System.out.printf("%d\t%d\t%d\n%d\t",count,count*count,count*count*count,count*count*count*count);
            }
//            System.out.print("\n");
        }
    }
