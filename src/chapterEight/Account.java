package chapterEight;

public class Account {
    private double balance;
    private String pin;
    private String number;
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
        number = accountNumber;
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

    private void validatePin(String userPin) {
        if (!userPin.equals(pin)){ throw new InvalidPinException("Invalid pin input Please input valid pin");}
    }


    public String getAccountNumber() {
        return number;
    }
}
