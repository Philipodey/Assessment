package chapterFour.test;

import java.util.Scanner;

public class TaxCalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalTax = 0;
        int count = 0;
        while (count <= 2) {
            count++;
            String citizen = scanner.nextLine();
            System.out.println("\nEnter the name of citizen: ");
            citizen = scanner.nextLine();
//            int yearlyEarning = scanner.nextInt();
            System.out.println("Enter yearly earning: ");
            int yearlyEarning = scanner.nextInt();
            if (yearlyEarning >= 0 && yearlyEarning <= 30000 ){
                totalTax = (yearlyEarning * 15 )/ 100;
                System.out.printf("The total tax of %s is %d",citizen, totalTax);
            }
            else {
                totalTax = (yearlyEarning * 20) / 100;
                System.out.printf("The total tax of %s is %d ", citizen, totalTax);
            }
        }
    }
}
