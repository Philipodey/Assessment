package chapterFour.main;

public class CreditLimitCalculator {
    private int creditLimit;
    private int balance;
    private int newBalance;
    private int charges;
    private int creditGiven;


    public int accountNumber(int accountNumber) {
        //        Determine whether any of the service departmental store has exceeded its limit
        //        input and save account number
        //        input and save balance
        //        input and save balance
        //
        //        input total of item charged by the customer this month
        //        input and save item charged by the customer
        return accountNumber;
    }

    public int balance(int balance) {
        this.balance = balance;
        return balance;
    }


    public int charges(int charges) {
        this.charges = charges;
        return charges;
    }

    public int creditApplied(int creditGiven) {
        this.creditGiven = creditGiven;
        return creditGiven;
    }

    public int creditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
        return creditLimit;
    }


    public void setNewBalance(int balance, int charges, int creditGiven) {
        newBalance = (balance + charges) - creditGiven;

    }

    public int getNewBalance(){
        if(newBalance < creditLimit){
//            System.out.printf("The new balance is %d", newBalance);
           return newBalance;
        }
        else {
            System.out.println("Credit limit exceeded");
        }

        return newBalance;
    }
}