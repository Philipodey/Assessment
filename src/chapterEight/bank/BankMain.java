package chapterEight.bank;

import chapterEight.bank.Bank;

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
        String amount = input("Enter the amount to deposit: ");
        while (!amount.matches("\\d+")) {amount = input("Enter the amount to deposit: ");}
        double monetaryAmount = Double.parseDouble(amount);
        String accountNumber = input("Enter the account number you want to deposit to: ");
        while (!accountNumber.matches("\\d+")){accountNumber = input("Enter the account number you want to deposit to: ");}
        try{bank.deposit(monetaryAmount,accountNumber);}
        catch (Exception e){System.out.println("Invalid input try again!");}
        finally {
            System.out.println("""
                    ===============================
                        DEPOSIT SUCCESSFUL
                    THANK YOU FOR BANKING WITH US !
                    ===============================
                    """);
            mainMenu();
        }
        }
    public static void withdraw() {
        String amount = input("Enter the amount to withdraw from: ");
        while (!amount.matches("\\d+")){ amount = input("Enter the amount to withdraw from: "); }
        double monetaryAmount = Double.parseDouble(amount);
        String accountNumber = input("Enter your account number: ");
        while (!accountNumber.matches("\\d+")){ accountNumber = input("Enter your account number: ") ;}
        String pin = input("Enter your pin: ");
        while (!pin.matches("\\d+")){ pin = input("Enter your pin: "); }
        try{bank.withdraw(monetaryAmount,accountNumber,pin);}
        catch (RuntimeException e){System.out.println("Invalid input try Again!");}
        finally {
            System.out.println("""
                    =====================================
                        WITHDRAW SUCCESSFUL !
                        THANK YOU FOR BANKING WITH US
                    =====================================
                    """);
            mainMenu();
        }
    }
    public static void mainMenu(){
        display();
        String mainDisplay = input("Choose an option: ");
        while (!mainDisplay.matches("\\d")){
            System.out.println("Invalid input try Again!");
            mainDisplay = input("Choose an option: ");
        }
        int bankCustomerCare = Integer.parseInt(mainDisplay);
        switch (bankCustomerCare){
            case 1 -> createAccount();
            case 2 -> deposit();
            case 3 -> withdraw();
            case 4 -> transfer();
            case 5 ->checkBalance();
            case 6 -> removeAccount();
            case 7 -> bank.returnAllAccount();
            default -> endApplication();
        }
    }
    private static void removeAccount() {
        String number = input("Enter the account number to remove: ");
        while (!number.matches("\\d+")){ number = input("Enter the account number to remove: ");}
        try{ bank.removeAccount(number);}
        catch (Exception e){System.out.println("Invalid Account number!");}
        finally {
            System.out.println("""
                    ================================
                        ACCOUNT REMOVE SUCCESSFUL
                    THANK YOU FOR BANKING WITH US !
                    ================================
                    """);
            mainMenu(); } }

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
                8. Press 8 to Exit
                %s
                ""","=".repeat(25),"=".repeat(25),"=".repeat(25));
    }

    private static void endApplication() {
        System.out.println("""
                ===============================
                THANK YOU FOR BANKING WITH US !
                ===============================
                """);
        System.exit(8); }

    public static void checkBalance() {
        String accountNumber = input("Enter your account number: ");
        while (!accountNumber.matches("\\d+")){ accountNumber = input("Enter your account number: "); }
        String pin = input("Enter your pin: ");
        while (!accountNumber.matches("\\d+")){ pin = input("Enter your pin: ");}
        try { bank.checkBalance(accountNumber, pin);
            System.out.println(bank.findAccount(accountNumber)); }
        catch (Exception e){ System.out.println("Invalid input try Again! ");}
        finally {
            System.out.println("""
                    ===============================
                    CHECK BALANCE SUCCESSFUL
                    THANK YOU FOR BANKING WITH US
                    ===============================
                    """);
            mainMenu(); }

    }

    private static void transfer() {
        String amount = input("Enter the amount you wish to transfer: ");
        while (!amount.matches("\\d+")){amount = input("Enter the amount you wish to transfer: ");}
        double monetaryAmount = Double.parseDouble(amount);
        String recipientAccount = input("Enter the recipient account number: ");
        while (!recipientAccount.matches("\\d+")){recipientAccount = input("Enter the recipient account number: ");}
        String sendersAccount = input("Enter the sender's account number: ");
        while (!sendersAccount.matches("\\d+")){ sendersAccount = input("Enter the sender's account number: ");}
        String pin = input("Enter your pin: ");
        while (!pin.matches("\\d+")){  pin = input("Enter your pin: ");}
        try{bank.transfer(monetaryAmount, sendersAccount, recipientAccount, pin);}
        catch (RuntimeException e){System.out.println("Invalid Amount input try Again! ");}
        finally {
            System.out.println("""
                    ================================
                        TRANSFER SUCCESSFUL
                    THANK YOU FOR BANKING WITH US !
                    ================================
                    """);
            mainMenu(); }
    }

    private static void createAccount() {
        String firstName = input("Enter your first name: ");
        while (!firstName.matches("[A-Z]*[a-z]*")){ firstName = input("Enter your first name: "); }
        String lastName = input("Enter your last name: ");
        while (!lastName.matches("[A-z]*[a-z]*")){ lastName = input("Enter your last name: "); }
        String pin = input("Enter your pin name: ");
        while (!pin.matches("\\d+")){ pin = input("Enter your pin name: ");}
        try{ System.out.println(bank.createAccountFor(firstName, lastName, pin));
            System.out.println("""
                    ==================================
                        ACCOUNT CREATED SUCCESSFULLY
                    THANK YOU FOR BANKING WITH US !
                    =================================
                    """);
        }
        catch (Exception e){System.out.println("Account not created yet! ");}

        finally {

            mainMenu(); }

    }

}
