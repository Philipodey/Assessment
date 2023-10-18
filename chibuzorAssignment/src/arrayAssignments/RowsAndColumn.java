package arrayAssignments;

import java.util.Scanner;

public class RowsAndColumn {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);

//        int[][] inventoryBook = new int[4][3];

        System.out.println("Enter the number of customer: ");
        String customer = check.nextLine();
        while(!customer.matches("\\d+")){
            System.out.println("Invalid input\nEnter a valid input: ");
            customer = check.nextLine();
        }
         int customerNumber = Integer.parseInt(customer);

        System.out.println("Enter the number of item: ");
        String item = check.nextLine();
        while(!item.matches("\\d+")) {
            System.out.println("Invalid input\nEnter a valid input: ");
            item = check.nextLine();
        }
        int itemNumber = Integer.parseInt(item);
        String[][] salesBook = new String[customerNumber][itemNumber];
        int[][] inventoryBook = new int[customerNumber][itemNumber];
        for (int row = 0; row < customerNumber; row++) {
            System.out.println("customer " + (row + 1) + " price of item bought: " + "\n");
            for (int column = 0; column < itemNumber; column++) {
                System.out.print("item " + (column + 1) + ":  ");
                salesBook[row][column] = check.nextLine();
                while (!salesBook[row][column].matches("\\d+")) {
                    System.out.println("Invalid input\nEnter a valid input: ");
                    salesBook[row][column] = check.nextLine();
                }
                inventoryBook[row][column] = Integer.parseInt(salesBook[row][column]);
            }
        }
            System.out.printf("%-15s","");
            for (int spaces = 0; spaces < itemNumber; spaces++) {
                System.out.printf("%-16s","item"+(spaces + 1));
            }
            System.out.println();

          for (int rows = 0; rows < salesBook.length; rows++){
              System.out.printf("%-16s","customer"+(rows + 1));
              for (int columns = 0; columns < salesBook[rows].length; columns++) {
                  System.out.printf("%-15s",(inventoryBook[rows][columns]));
              }
              System.out.println();
          }

    }
}
