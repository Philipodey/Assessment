package classWork;

import java.util.Arrays;
import java.util.Scanner;

public class DataExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.println("Enter the number of column: ");
        int column = sc.nextInt();
        int[][] dataset = new int[row][column];
        for (int i = 0; i < dataset.length; i++) {
            for (int j = 0; j < dataset[i].length; j++) {
                System.out.println("Enter element into the data set: ");
                int data = sc.nextInt();
                dataset[i][j] = data;
            }
        }
        System.out.println(Arrays.deepToString(dataset));
        System.out.println("Enter the start position: ");
        int startPosition = sc.nextInt();
        System.out.println("Enter the end position: ");
        int endPosition = sc.nextInt();
        System.out.println("Enter the row you desired: ");
        int rows = sc.nextInt();
        System.out.println(Arrays.toString(extractByRow(dataset, rows, startPosition, endPosition)));
    }

    public static int[] extractByRow(int[][] dataSet,int row, int startPosition, int endPosition) {
        int[] rowData = dataSet[row - 1];
        int[] extractedData = new int[(endPosition - startPosition) + 1];
        int count = 0;
        for (int i = startPosition-1; i < endPosition; i++) {
                extractedData[count] = rowData[i];
                count ++;

        }
        return extractedData;
    }

    public int[] extractByColumn(int[][] dataSet, int column,int row, int startPosition, int endPosition) {
        int[] extractedData = new int [(endPosition - startPosition) + 1];

//        int[] columns = dataSet(row - 1)][column - 1];



        return extractedData;
    }
}
