package test;

import tdd.SalesCommission;

import java.util.Scanner;

public class SalesCommissionTest {
    public static void main(String[] args) {
        SalesCommission point = new SalesCommission(0.09, 200, 5000.00, 650);
//        double item = input("Enter the item price? ");

        double totalItem = input("Enter item price: ");

        point.setSalesCommission(200, 0.09, totalItem);
        System.out.printf("The earning of the the salesperson is %.2f", point.getSalesCommission());

    }
    public static double input(String prompt){

        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        double item = scanner.nextDouble();

        int count = 0;
        double totalItem = 0;
        while (item != 0){
            totalItem += item;
            System.out.println(prompt);
            item = scanner.nextDouble();
            count ++;
        }
        return totalItem;
    }
}

