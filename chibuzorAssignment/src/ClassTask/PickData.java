package ClassTask;

import java.util.Arrays;
import java.util.Scanner;

public class PickData {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        String numberOfRows = check.nextLine();
        while(!numberOfRows.matches("\\d+")){
            System.out.println("Invalid input!\nPlease enter a valid number of row: ");
            numberOfRows = check.nextLine();
        }
        System.out.println("Enter the number column");
        String numberOfColumns = check.nextLine();
        while (!numberOfColumns.matches("\\d+")){
            System.out.println("Invalid input!\nPlease Enter a positive valid number: ");
            numberOfColumns = check.nextLine();
        }


        int newRows = Integer.parseInt(numberOfRows);
        int newColumn = Integer.parseInt(numberOfColumns);
        String [][] dataSet = new String[newRows][newColumn];
        int [][] newDataSet = new int [newRows][newColumn];
        for (int row = 0; row < dataSet.length; row++) {
            for (int column = 0; column < dataSet[row].length; column++) {
                System.out.println("Enter the elements in the set "+row + column + ":");
                dataSet[row][column] = check.nextLine();
                while(!dataSet[row][column].matches("\\d+")){
                    System.out.println("Invalid input!\nEnter positive valid input greater than one: ");
                    dataSet[row][column] = check.nextLine();
                }
                newDataSet[row][column] = Integer.parseInt(dataSet[row][column]);
            }

        }
        System.out.println("Enter the start number: ");
        String startNumber = check.nextLine();
        while(!startNumber.matches("\\d+")){
            System.out.println("Invalid input!\nPlease Enter a positive number");
            startNumber = check.nextLine();
        }
        while(Integer.parseInt(startNumber) < 0 || Integer.parseInt(startNumber) > dataSet.length){
            System.out.println("Invalid input!\nPlease enter a positive valid input: ");
            startNumber = check.nextLine();
        }
        System.out.println("Enter the end point: ");
        String endNumber = check.nextLine();
        while(!endNumber.matches("\\d+")){
            System.out.println("Invalid input!\nPlease Enter a valid positive end number");
            endNumber = check.nextLine();
        }
        while(Integer.parseInt(endNumber) < 0 || Integer.parseInt(endNumber) > dataSet.length) {
            System.out.println("Invalid input!\nPlease enter a positive valid input: ");
            endNumber = check.nextLine();
        }
        int newEnd = Integer.parseInt(endNumber);
        int newStart = Integer.parseInt(startNumber);
        int[] extractedData = new int [(newEnd - newStart) + 1];
        System.out.println("Enter the row you desire : ");
        String rows = check.nextLine();
        while(Integer.parseInt(rows ) < 0|| Integer.parseInt(rows) > extractedData.length){
            System.out.println("Invalid input!\nEnter a positive valid input within the range of the number of rows entered: ");
            rows = check.nextLine();
        }
        while(!rows.matches("\\d+")){
            System.out.println("Invalid input!\nplease enter a valid positive number: ");
            rows = check.nextLine();
        }
        System.out.printf("%-15s","");
        for (int index1 = 0; index1 < newColumn; index1++) {
            System.out.printf("%-16s","goods");
        }
        System.out.println();
        for (int index2 = 0; index2 < dataSet.length; index2++) {
            System.out.printf("%-15s","customers"+index2);
            for (int index3 = 0; index3 < dataSet[index2].length; index3++) {
                System.out.printf("%-16s",newDataSet[index2][index3]);
            }
            System.out.println();
        }
//
        int newRow = Integer.parseInt(rows);
        int[] rowData = newDataSet[newRow-1];
        int counter = 0;
        for (int count = newStart-1; count < newEnd; count++) {
            extractedData[counter] = rowData[count];
            counter++;
        }
        System.out.printf(Arrays.toString(extractedData));

    }
}
