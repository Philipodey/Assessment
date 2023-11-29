package chapterEight.main;

import chapterEight.Account;
import chapterEight.Bank;
import chapterEight.InsufficientFundsException;

import java.util.Scanner;

public class BankMain {
private static Bank bank = new Bank();
    public static void main(String[] args) {
    mainMenu();

    }
    public static String input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();
    }
    public static void deposit(){
        double amount = Double.parseDouble(input("Enter the amount to deposit: "));
        String accountNumber = input("Enter the account number you want to deposit to: ");
        try{bank.deposit(amount,accountNumber);}
        catch (Exception e){System.out.println("Invalid input try again!");} mainMenu();}
    public static void withdraw() {
        double amount = Double.parseDouble(input("Enter the amount to withdraw from: "));
        String accountNumber = input("Enter your account number: ");
        String pin = input("Enter your pin: ");
        try{bank.withdraw(amount,accountNumber,pin);}
        catch (RuntimeException e){System.out.println("Invalid input try Again!");}mainMenu();
    }
    public static void mainMenu(){
        display();
        int bankCustomerCare = Integer.parseInt(input("Choose an option: "));
        switch (bankCustomerCare){
            case 1 -> createAccount();
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> transfer();
            case 5 ->checkBalance();
            case 6 -> removeAccount();
            case 7 -> bank.returnAllAccount();
            case 8 -> accountDetails();
            default -> endApplication();
        }



    }

    private static void accountDetails() {
        String b = bank.toString();
        mainMenu();
    }


    private static void removeAccount() {
        String number = input("Enter the account number to remove: ");
        try{bank.removeAccount(number);}
        catch (Exception e){System.out.println("Invalid Account number!");} mainMenu();
    }

    private static void display() {
        System.out.printf("""
                %s
                First Bank for Niggas(FBN)
                %s
                1. Create Account
                2. Deposit
                3. Withdraw
                4. Transfer
                5. Check balance
                6. Remove Account
                7. Return Account
                8. Account Details
                9. Press 8 to Exit
                %s
                ""","=".repeat(25),"=".repeat(25),"=".repeat(25));
    }

    private static void endApplication() {
        System.exit(9);
    }

    public static void checkBalance() {

        String accountNumber = input("Enter your account number: ");
        String pin = input("Enter your pin: ");
        try {
            bank.checkBalance(accountNumber, pin);
            System.out.println(bank.findAccount(accountNumber));
        }
        catch (Exception e){ System.out.println("Invalid input try Again! ");}
        finally {
            mainMenu();
        }

    }

    private static void transfer() {
        double amount = Integer.parseInt(input("Enter the amount you wish to transfer: "));
        String recipientAccount = input("Enter the recipient account number: ");
        String sendersAccount = input("Enter the sender's account number: ");
        String pin = input("Enter your pin: ");
        try{bank.transfer(amount, sendersAccount, recipientAccount, pin);}
        catch (RuntimeException e){System.out.println("Invalid input try Again! ");}mainMenu();
    }

    private static void createAccount() {
        String firstName = input("Enter your first name: ");
        String lastName = input("Enter your last name: ");
        String pin = input("Enter your pin name: ");
        try{
            System.out.println(bank.createAccountFor(firstName, lastName, pin));
        }
        catch (Exception e){System.out.println("Account not created yet! ");}mainMenu();
    }

}
