package chapterEight.bank;

import chapterEight.bank.exception.NullPointerException;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();
    private int totalNumberOfAccount;
    private String accountNumber;
    public Bank(String bankName){
        this.bankName = bankName;
    }
    public Bank(){

    }
    public void returnAllAccount(){
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i));
        }
    }

    public Account createAccountFor(String firstName, String lastName, String pin) {
        accountNumber = generateAccountNumber();
        name = generateAccountNameFrom(firstName,lastName);
        Account account = new Account(accountNumber,name,pin);
        totalNumberOfAccount++;
        accounts.add(account);
        return account;
    }

    private String generateAccountNameFrom(String firstName, String lastName) {
        return firstName + " "+ lastName;
    }

    private String generateAccountNumber() {
        return (accounts.size()+1)+"";
    }

    public int getTotalNumberOfAccount() {
        return totalNumberOfAccount;
    }

    public void deposit(double amount, String accountNumber) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    public double checkBalance(String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        return account.checkBalance(pin);
    }

    public Account findAccount(String accountNumber) {
//        for (Account account: accounts){
//            if (account.getAccountNumber().equals(accountNumber)){
//                return account;
//            }
//        }

        for (int i = 0; i < accounts.size(); i++) {
            if (accountNumber.equals(accounts.get(i).getAccountNumber())) return accounts.get(i);
        }
        throw new NullPointerException("Account Not found");
    }

    public void withdraw(double amount, String number, String pin) {
        accountNumber = number;
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void removeAccount(String number) {
        findAccount(number);
        accounts.remove(Integer.parseInt(number)-1);
    }

    public void transfer(double amount, String senderAccount, String receiverAccount, String pin) {
        Account accountFind = findAccount(senderAccount);
        withdraw(amount,senderAccount,pin);
        Account findAccount = findAccount(receiverAccount);
        deposit(amount, receiverAccount);
    }
    public void updatePin(String pin){
        Account account = new Account();
        account.validatePin(pin);
    }
}