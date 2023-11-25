package chapterEight.main;

import chapterEight.Account;
import chapterEight.Bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {


    }
    public static String input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static void deposit(){
        double amount = Double.parseDouble(input("Enter the amount to deposit: "));
        String accountNumber = input("Enter the account number you want to deposit to: ");
        Bank bank = new Bank();
       bank.deposit(amount,accountNumber);
    }
    public static void withdraw(){
       double amount = Double.parseDouble(input("Enter the amount to withdraw from: "));
        String accountNumber = input("Enter your account number: ");
        String pin = input("Enter your pin: ");
        Bank bank = new Bank();
        bank.withdraw(amount,accountNumber,pin);
    }
    public static void mainMenu(){
        createAccountFor();
        deposit();


    }

    private static void createAccountFor() {
    }

}
