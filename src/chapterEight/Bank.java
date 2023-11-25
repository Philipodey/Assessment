package chapterEight;

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

    public Account createAccountFor(String firstName, String lastName, String pin) {
        totalNumberOfAccount++;
        String accountNumber = generateAccountNumber();
        name = generateAccountNameFrom(firstName,lastName);
        Account account = new Account(accountNumber,name,pin);
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
        for (Account account: accounts){
            if (account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        throw new NullPointerException("Account Not found");
    }

    public void withdraw(double amount, String accountNumber, String pin) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount, pin);
    }

    public void removeAccount(String accountNumber) {
        ArrayList <Account> remove = new ArrayList<>();
        Account findAccount = findAccount(accountNumber);
        remove.add(findAccount);
    }

    public void transfer(double amount, String senderAccount, String receiverAccount, String pin) {
        Account accountFind = findAccount(senderAccount);
        withdraw(amount,senderAccount,pin);
        Account findAccount = findAccount(receiverAccount);
        deposit(amount, receiverAccount);
    }
//    @Override
    public String toString(){
        return String.format("""
                The name of the account is %s
                The account number is %s
                The password is your father 
                """, name,accountNumber);
    }
}