package chapterEight.bank.serverClass;

import chapterEight.bank.exception.InsufficientFundsException;
import chapterEight.bank.exception.InvalidAmountException;
import chapterEight.bank.exception.InvalidPinException;

public class Account {
    private double balance;
    private String pin;
    private String accountNumber;
    private String accountName;

    public Account(){

    }
    public Account(double balance){
        this();
        this.balance = balance;
    }
    public Account(double balance, String pin){
        this(balance);
        this.pin = pin;
    }
    public Account (String accountNumber, String accountName, String pin){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.pin = pin;
    }
    public void deposit(double depositAmount) {
        validateAmount(depositAmount);
        balance += depositAmount;
    }

    private void validateAmount(double depositAmount) {
        if (depositAmount < 0) throw new InvalidAmountException("Invalid Amount/nPlease Input a valid greater than 0");

    }

    public double checkBalance(String pin) {
        validatePin(pin);
        return balance;
    }

    public void withdraw(double withdrawalAmount, String userPin) {
        validatePin(userPin);
        validateAmount(withdrawalAmount);
        validateInsufficient(withdrawalAmount);
        balance -= withdrawalAmount;
    }

    private void validateInsufficient(double withdrawalAmount) {
        if (withdrawalAmount > balance) throw new InsufficientFundsException("Insufficient funds please enter a valid amount ");
    }

    public void validatePin(String userPin) {
        if (!userPin.equals(pin)){ throw new InvalidPinException("Invalid pin input Please input valid pin");}
    }


    public String getAccountNumber() {
        return this.accountNumber;
    }
    @Override
    public String toString(){
        return String.format("""
                %s
                The name of the account is %s
                The account number is %s
                The balance is %s
                The pin is your father
                %s
                """, "=".repeat(25),accountName,accountNumber, balance,"=".repeat(25));
    }
}
