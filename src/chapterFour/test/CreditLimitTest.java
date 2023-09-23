package chapterFour.test;

import chapterFour.main.CreditLimitCalculator;

import java.util.Scanner;

public class CreditLimitTest {
public static void main(String[] args){
    CreditLimitCalculator shopRite = new CreditLimitCalculator();
    int accountNumber = input("Enter account number: ");
    int monthlyBalance = input("Enter balance at the begining of the month: ");
    int charges = input("Enter total of the items charged: ");
    int totalMonthlyCredit = input("Enter total of credit applied to customer's account this month: ");
    int creditLimit = input("Enter the allowed credit limit: ");
    shopRite.setNewBalance(monthlyBalance, charges, totalMonthlyCredit);
    System.out.printf("The new balance of the customer is %d", shopRite.getNewBalance());

}
public static int input(String prompt){
    Scanner scanner = new Scanner(System.in);
    System.out.println(prompt);
    return scanner.nextInt();
}
}
