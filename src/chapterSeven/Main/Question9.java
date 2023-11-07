package chapterSeven.Main;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        int[][] t = new int[2][3];
        System.out.println(Arrays.deepToString(t));
//        Arrays starts it indices counting from zero
//        t has 2 rows [[row0 column0, row0 column1, row0 column2],[row1 column0, row1 column1, row1 column2]]
//        t has 3 columns [[row0 column0, row0 column1, row0 column2],[row1 column0, row1 column1, row1 column2]]
//        t has 6 elements [[0, 0, 0],[0, 0, 0]]
//        single statement that sets the elements
        t[0][1] = 1;
        System.out.println(Arrays.deepToString(t));
        t[0][0] = 1;
        t[0][1] = 1;
        t[0][2] = 1;
        t[1][0] = 1;
        t[1][1] = 1;
        t[1][2] = 1;
        System.out.println(Arrays.deepToString(t));

        for (int counter = 0; counter < t.length; counter++) {
            for (int count = 0; count < t[counter].length; count++) {
                t[counter][count] = 2;
            }
        }
        System.out.println(Arrays.deepToString(t));

        int smallest = t[0][0];
        for (int count = 0; count < t.length; count++) {
            for (int counts = 0; counts < t[count].length; counts++) {
                System.out.println("Enter the scores: ");
                t[count][counts] = check.nextInt();
            }
        }

        for (int row = 0; row < t.length; row++) {
            for (int column = 0; column < t[row].length; column++) {
                if (row == 0){
                    System.out.printf("%s\t", t[row][column]);
                }
            }
        }

        for (int count = 0; count < t.length; count++) {
            for (int counted = 0; counted < t[count].length; counted++) {
                if (counted == 2){
                    System.out.printf("%n%s\t",t[count][counted]);
                }
            }
        }
        int totalColumn = t[0][2] + t[1][2];
        System.out.printf("%n%d\t",totalColumn);
        System.out.println();

        int smallest1 = t[0][0];
        for (int[] row:t) {
            for (int counted: row) {
                if (smallest1 > counted){
                    smallest1 = counted;
                }
            }
        }
        System.out.printf("%-10s","");
        for (int rowHeading = 0; rowHeading <= 2; rowHeading++) {
            System.out.printf("%-6s\t","Course" + (rowHeading +1));
        }
        System.out.println();
        for (int columnHeading = 0; columnHeading < t.length; columnHeading++) {
            System.out.printf("%2s\t","Student" + (columnHeading + 1));
            for (int scores = 0; scores < t[columnHeading].length; scores++) {
                System.out.printf("%-10s",t[columnHeading][scores]);
            }
            System.out.println();
        }

//        for (int row = 0; row < t.length; row++) {
//            for (int column = 0; column < t[row].length; column++) {
//                System.out.printf("%-6s",t[row][column]);
//            }
//            System.out.println();
//        }
        


//        System.out.println(Arrays.deepToString(t));
//        System.out.printf("%nThe smallest is %d", smallest);
//        System.out.printf("The second smallest is %d", smallest1);

    }
}
