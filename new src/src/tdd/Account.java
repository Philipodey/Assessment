package tdd;

public class Account {


    private int balance;


    public Account(int balance) {
        this.balance = balance;
    }
    public int deposit(int amount) {
        if(amount <= 0){
            System.out.println("The amount is inappropriate");
        }
        balance = balance + amount;
        return balance;
 }

    public int checkBalance(){
       return balance;
    }
    public int withdraw(int withdrawalAmount) {
        balance = balance - withdrawalAmount;

        if(balance < withdrawalAmount) {
            System.out.println("Insufficient balance");
            return balance;
        }
        return balance;
    }
    public int secondWithdraw(int secondWithdrawal){
        if (balance < secondWithdrawal){
            return balance;
        }
        return balance;
    }

}
